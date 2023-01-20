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
    public int rollDie(int aux){
        while(aux==0){
            aux = MyTools.rng(7);
            if(aux!=0){
                return aux;
            }
        }
        return aux;
    }

}
