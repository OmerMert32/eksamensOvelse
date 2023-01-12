import java.util.ArrayList;
import java.util.HashSet;

public class Article {

    public static String getLongestWord() {
        String wordString = "Lav en klasse Article der har tre attributter heading body og author Lav test kode der sætter alle tre attributter og sørg for at body er en lang tekst feks indholdet af denne øvelsesbeskrivelse";

        String longest = "";
        for (String word: wordString.split(" ")){
            if (longest.length() <= word.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static HashSet getWords(){
        HashSet<String> ord = new HashSet<>();

        String wordString = "Lav Lav en klasse Article der har tre attributter heading body og author Lav test kode der sætter alle tre attributter og sørg for at body er en lang tekst feks indholdet af denne øvelsesbeskrivelse";
        for (String s: wordString.split(" ")){
            ord.add(s);
        }
        return ord;
    }
}





















