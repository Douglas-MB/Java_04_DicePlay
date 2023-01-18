import java.util.Scanner;

public class Casino {
    private  Player newPlayer = new Player();
    private  Die dieCasino = new Die();

    private int rollCasino;

    public int getRollCasino() {
        return rollCasino;
    }

    public void setRollCasino(int rollCasino) {
        this.rollCasino = rollCasino;
    }

    private boolean winLose;

    boolean isWinLose() {
        if (this.newPlayer.getRollPlayer() != getRollCasino()) {
            winLose = true;
        } else {
            winLose = false;
        }
        return winLose;
    }

    void showVictory(){
        isWinLose();

        if(winLose){
            System.out.println("HOUSE WINS!! :^)");
        }else{
            System.out.printf("%s wins!", newPlayer.getName());
        }
    }

    void rollDie(){
        setRollCasino(dieCasino.rollDie());
        System.out.println("House roll: "+getRollCasino());
        this.dieCasino.rollCnt();
        this.dieCasino.setRollCnt(dieCasino.getRollCnt());
        System.out.println();
    }
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
        this.newPlayer.setMoney(100);
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
