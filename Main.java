public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyTools.clean();

        Casino testC = new Casino();

        Player test = new Player("Me",26, null);
        test.rollDie();
        test.getDie().rollsInfo();
    }
}