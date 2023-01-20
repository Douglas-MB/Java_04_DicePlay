public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyTools.clean();

        Player testP = new Player(" ",1,new Die());
        testP.getPlayerInfo();
        testP.playerToRoll();
        Casino testC = new Casino(testP);

        testC.casinoToRoll();
        testC.showResult();
        testC.showPlayerInfo();

    }
}