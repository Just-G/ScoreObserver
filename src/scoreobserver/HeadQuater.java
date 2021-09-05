package scoreobserver;

import java.util.ArrayList;

public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String score;
    
    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    
    public void setScore(String data){
        score = data;
        notifyObserver();
    }
    
    public String getScore(){
        return score;
    }

    @Override
    public void register(MyObserver observer) {
        list.add(observer);   
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            (list.get(i)).update(this);
        }
    }

}
