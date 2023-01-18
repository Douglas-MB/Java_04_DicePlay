public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyTools.clean();

        Casino testC = new Casino();
        testC.intro();
        testC.generatePlayerInfo();

        Player test = new Player("Me",26, null);
        test.rollDie();

    }
}