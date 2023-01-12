import java.util.*;

public class Names {
    String firstName;
    ArrayList<String> middleName = new ArrayList<>();
    String lastName;

    public Names(String fullName){
        String[] heh = fullName.split(" ");
        firstName = heh[0];
        int tal = heh.length;
        if (heh.length > 2) {
                for (int i = 1; i < heh.length-1; i++) {
                    String s = heh[i];
                    middleName.add(s);
                }
            lastName = heh[heh.length-1];
        }
        else {
            lastName = heh[1];
        }
    }
    @Override
    public String toString() {
        if (middleName != null) {
            return firstName + " " + middleName + " " + lastName;
        }
        return firstName + " " + lastName;
    }
}
