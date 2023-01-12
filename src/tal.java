import java.util.ArrayList;
// finder den sum der er tættest på tal

public class tal {
    int talEt;
    int talTo;
    int tæthed;

    public tal(int talEt, int talTo, int tæthed){
        this.talEt = talEt;
        this.talTo = talTo;
        this.tæthed = tæthed;
    }
}
/*
    ArrayList<tal> liste = new ArrayList<>();
    ArrayList<Integer> liste1 = new ArrayList<>();
    ArrayList<Integer> liste2 = new ArrayList<>();

    tal fundet = new tal(1, 1, 100000);
    int mål = 50;
    int talEt = 0;
    int talTo = 0;
    int tæthed = 0;

        for (int i = 0; i < 5; i++) {
        liste1.add(talEt = (int) (Math.random() * 100));
        liste2.add(talTo = (int) (Math.random() * 100));
        }

        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {

        if (liste1.get(i) + liste2.get(j) < mål) {
        tæthed = mål - (liste1.get(i) + liste2.get(j));
        } else {
        tæthed = liste1.get(i) + liste2.get(j) - mål;
        }
        tal sum = new tal(liste1.get(i), liste2.get(j), tæthed);
        liste.add(sum);
        }
        }

        for (int i = 0; i < liste.size(); i++){
        if (liste.get(i).tæthed < fundet.tæthed){
        fundet = liste.get(i);
        }
        }
        for (int i = 0; i < liste1.size(); i++){
        System.out.print(liste1.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < liste1.size(); i++){
        System.out.print(liste2.get(i) + " ");
        }
        System.out.println();
        System.out.println("--------------");
        System.out.println(fundet.talEt + " " + fundet.talTo + " " + fundet.tæthed + "           Mål: " + mål);

        */