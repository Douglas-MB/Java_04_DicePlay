import org.jetbrains.annotations.NotNull;

public class Casino {
    public Die casinoDie = new Die();
    public int casinoRoll;
    public int auxRollPlayer;
    private int auxMoney;
    public boolean result;
    public String auxNamePlayer;
    private int auxAge;
    int win=0;
    int lose=0;


    public void showPlayerInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Player name:\t"+getAuxNamePlayer());
        System.out.println("Player age:\t"+getAuxAge());
        System.out.println("Player profit: "+getAuxMoney());
        System.out.printf("%s, you rolled %d time(s) and you wins %d and lose %d :)%n", getAuxNamePlayer(),casinoDie.getRollCnt(),win,lose);
    }

    public void checkAge(){
        if(getAuxAge()<18){
            System.out.println("Sorry, you can not play here :/ Only of legal age here");
        }
    }
    public void showResult(){

        winOrLose();

        if(result){
            lose++;
            setAuxMoney(getAuxMoney()-10);
            System.out.println("Yur current money is "+getAuxMoney());
        } else{
            win++;
            setAuxMoney(getAuxMoney()+ getAuxMoney()/2);
            System.out.println("Yur current money is "+getAuxMoney());
        }
    }


    public void winOrLose(){
        if(getCasinoRoll()!= getAuxRollPlayer()){
            result = true;
            System.out.println("HOUSE WINS!");
        }else{
            result = false;
            System.out.printf("%s WINS!",getAuxNamePlayer());
        }
    }
    public void casinoToRoll(){
        setCasinoRoll(casinoDie.rollDie());
        System.out.println("House roll is "+getCasinoRoll());
    }

    public void setAuxNamePlayer(String auxNamePlayer) {
        this.auxNamePlayer = auxNamePlayer;
    }

    public void setAuxAge(int auxAge) {
        this.auxAge = auxAge;
    }

    public Casino(@NotNull Player player) {

        player.setMoney(100);
        setAuxNamePlayer(player.getName());
        setAuxAge(player.getAge());

        this.auxNamePlayer = getAuxNamePlayer();
        this.auxAge =  getAuxAge();
        this.auxMoney = player.getMoney();
        this.auxRollPlayer = player.getRollPlayer();


    }

    public int getAuxAge() {
        return auxAge;
    }
    public String getAuxNamePlayer() {
        return auxNamePlayer;
    }
    public int getAuxMoney() {
        return auxMoney;
    }

    public void setAuxMoney(int auxMoney) {
        this.auxMoney = auxMoney;
    }
    public int getAuxRollPlayer() {
        return auxRollPlayer;
    }

    public void setAuxRollPlayer(int auxRollPlayer) {
        this.auxRollPlayer = auxRollPlayer;
    }


    public Die getCasinoDie() {
        return casinoDie;
    }

    public void setCasinoDie(Die casinoDie) {
        this.casinoDie = casinoDie;
    }

    public int getCasinoRoll() {
        return casinoRoll;
    }

    public void setCasinoRoll(int casinoRoll) {
        this.casinoRoll = casinoRoll;
    }
}
