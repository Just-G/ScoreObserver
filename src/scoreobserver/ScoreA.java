package scoreobserver;

public class ScoreA implements MyObserver {
    @Override
    public void update(Source obj) {
        System.out.println("live scoreA is : "+((HeadQuater)obj).getScore());
    }
}
