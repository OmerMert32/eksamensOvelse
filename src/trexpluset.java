import java.util.Scanner;

public class trexpluset {

    double tal;


    public trexpluset(double tal){
        this.tal = tal;
    }


    public void metode(){
        while (tal != 1){

            if (tal % 2 == 0 ){
                tal = tal / 2;
            }
            else if (tal % 2 != 0) {
                tal = tal * 3 + 1;
            }
            System.out.println(tal);
        }
    }

    @Override
    public String toString() {
        return "" + tal;
    }
}
