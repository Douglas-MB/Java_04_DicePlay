import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyTools.clean();
        Scanner scan = MyTools.scan();
        String answer;

        Player testP = new Player(" ",1,new Die());
        testP.getPlayerInfo();
        testP.playerToRoll();
        Casino testC = new Casino(testP);
        testC.casinoToRoll();
        testC.showResult();

        System.out.println("Do you want to roll again?");
        answer =  scan.nextLine().toLowerCase();
        while (answer.equals("y")||answer.equals("yes")){
            testP.playerToRoll();
            testC.auxPlayer(testP);
            testC.casinoToRoll();
            testC.showResult();

            System.out.println("Again?");
            answer =  scan.nextLine().toLowerCase();
            if (answer.equals("n")||answer.equals("no")){
                if(testC.getAuxMoney()<0){
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("PAY THE DEBT! >:( PAY THE DEBT! >:( PAY THE DEBT! >:(PAY THE DEBT! >:( PAY THE DEBT! >:(");
                    }
                }
                break;
            }
        }

        testC.showPlayerInfo();

    }
}