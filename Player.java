
public class Player {
    private String name;
    private int age;
    private int money;
    private Die die;
    private int rollPlayer;

    public int getRollPlayer() {
        return rollPlayer;
    }

    public void setRollPlayer(int rollPlayer) {
        this.rollPlayer = rollPlayer;
    }

    void rollDie(){
        setRollPlayer(die.rollDie());
        this.die.rollCnt();
        this.die.setRollCnt(die.getRollCnt());
        System.out.println("Player roll: "+getRollPlayer());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public Die getDie() {
        return die;
    }

    public void setDie(Die die) {
        this.die = die;
    }

    public Player(){}
    public Player(String name, int age, Die die) {
        Casino infoPlayer = new Casino();

        this.name = name;
        this.age = age;
        infoPlayer.generatePlayerInfo();
        this.money = getMoney();
        this.die = die;
        setDie(new Die());


    }
}
