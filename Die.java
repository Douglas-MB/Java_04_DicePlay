public class Die {

    int getDieFace(){
        return MyTools.rng(6)+1;
    }

    void showDieFace(){
        System.out.println("Here is your roll:  "+getDieFace());
    }

}
