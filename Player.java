
public class Player {
    private String name;
    private int age;
    private int money;
    private Die die;


    void rollDie(){
        this.die.rollCnt();
        this.die.setRollCnt(die.getRollCnt());
        this.die.showDieFace();
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
        Casino moneyPlayer = new Casino();

        this.name = name;
        this.age = age;
        this.money = moneyPlayer.cashPlayer;
        this.die = die;
        setDie(new Die());

    }
}
