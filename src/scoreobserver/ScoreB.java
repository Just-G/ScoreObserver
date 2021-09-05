package scoreobserver;

public class ScoreB implements MyObserver {
    @Override
    public void update(Source obj) {
        System.out.println("live scoreB is: "+((HeadQuater)obj).getScore());
    }
}
