package scoreobserver;

import java.util.Scanner;

public class ScoreMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score: ");
        HeadQuater hq = new HeadQuater();
        ScoreA s1 = new ScoreA();
        ScoreB s2 = new ScoreB();

        hq.register(s1);
        hq.register(s2);

        String data = input.nextLine();
        while (true) {
            System.out.print("Enter score: ");
            String aData = input.nextLine();
            if(aData.equalsIgnoreCase("")) {
                System.out.println("Exit...");
                return;
            }
            hq.setScore(data);
        }
    }

}