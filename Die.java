public class Die {
    static private  int rollCnt;



    public int getRollCnt() {
        return rollCnt;
    }

    public void setRollCnt(int rollCnt) {
        this.rollCnt = rollCnt;
    }

    void rollCnt(){
        setRollCnt(++rollCnt);
   }
    public int rollDie(){
        return MyTools.rng(6)+1;
    }

}
