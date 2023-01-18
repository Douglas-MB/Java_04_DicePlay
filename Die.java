public class Die {
    private int rollCnt;


    void rollsInfo(){
        System.out.println(getRollCnt());
    }
    public int getRollCnt() {
        return rollCnt;
    }

    public void setRollCnt(int rollCnt) {
        this.rollCnt = rollCnt;
    }

    int rollCnt(){
        return rollCnt++;
   }
    int rollDie(){
        return MyTools.rng(6)+1;
    }
    void showDieFace(){
        System.out.println("Here is your roll:  "+ rollDie());
    }
}
