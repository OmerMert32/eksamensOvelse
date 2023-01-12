import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class User {
    String fullName;
    String userID;

    public User(String fullName, String userID){
        this.fullName = fullName;
        this.userID = userID;
    }

    public static boolean validUserID(User user){
        String kode = user.userID;
        int tjek = 0;
        for (int i = 0; i < 4; i++){
            if (Character.isLowerCase(kode.charAt(i))){
                tjek++;
            }
        }
        for (int i = 0; i < 4 ; i++){
            if (Character.isDigit(kode.charAt(i+4))){
                tjek++;
            }
        }
        if (tjek == 8){
            return true;
        }
        return false;
    }

    public static String createUserID(User user){
        ArrayList<String> navn = new ArrayList<>();

        String fuldenavn = user.fullName.toLowerCase(Locale.ROOT);
        for (String s : fuldenavn.split(" ")){
            navn.add(s);
        }
        String kode = "";
        String fornavn = navn.get(0).charAt(0) + "" + navn.get(0).charAt(1);
        String efternavn = navn.get(1).charAt(0) + "" + navn.get(1).charAt(1);

        Random rand = new Random();

        int et = rand.nextInt(10);
        int to = rand.nextInt(10);
        int tre = rand.nextInt(10);
        int fire = rand.nextInt(10);
        kode = fornavn + efternavn + et + to + tre + fire;
        System.out.println(kode);
        return kode;
    }
    @Override
    public String toString(){
        return "Full Name: " + fullName +
                "\nUser ID: " + userID;
    }
}
