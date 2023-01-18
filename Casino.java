import java.util.Scanner;

public class Casino {
    int cashPlayer=100;
    Player newPlayer = new Player();

    void intro() throws InterruptedException {
        String[] msg = new String[]{"\t\t\tWELCOME ", "TO ", "\n\t\t\t\tDMB's CASINO\n\n"};
        for (int i = 0; i < msg.length; i++) {
            Thread.sleep(150);
            System.out.print(msg[i]);
        }
    }
    void generatePlayerInfo(){
        //getPlayerInfo();
        MyTools.clean();
        showPlayerInfo();
    }


    void getPlayerInfo(){
        Scanner playerInfo=MyTools.scan();

        System.out.print("Please, insert ur name here:\t");
        newPlayer.setName(playerInfo.nextLine());

        System.out.print("Please, insert ur age here:\t");
        newPlayer.setAge(playerInfo.nextInt());
    }

    void showPlayerInfo(){
        System.out.println("Player name:  "+newPlayer.getName());
        System.out.println("Player age:  "+newPlayer.getAge());
        System.out.println("Player cash: "+newPlayer.getMoney());
    }
}
