import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Player {
    public String name;
    public int age;
    public Die diePlayer;
    public int rollPlayer;
    private int money;

    private Scanner playerInfo;

    public void getPlayerInfo(){
        System.out.print("What is your name, player?\t");
        setName(playerInfo.nextLine());
        System.out.printf("How old are you %s ?\t", getName());
        setAge(playerInfo.nextInt());
    }

    public void playerToRoll(){
        setRollPlayer(diePlayer.rollDie());
        diePlayer.rollCnt();
        System.out.printf("%s roll is %d%n", getName(), getRollPlayer());
    }

public Player(){

}
    public Player(String name, int age, @NotNull Die diePlayer) {
        this.name = name;
        this.age = age;
        this.diePlayer = diePlayer;

        playerInfo = MyTools.scan();
        setDiePlayer(new Die());

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public int getRollPlayer() {
        return rollPlayer;
    }

    public void setRollPlayer(int rollPlayer) {
        this.rollPlayer = rollPlayer;
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

    public Die getDiePlayer() {
        return diePlayer;
    }

    public void setDiePlayer(Die diePlayer) {
        this.diePlayer = diePlayer;
    }

}
