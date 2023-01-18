public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyTools.clean();

        Player testP = new Player("", 0, null);
        testP.rollDie();
        Casino testC = new Casino();
        testC.rollDie();
        testC.showVictory();

    }
}