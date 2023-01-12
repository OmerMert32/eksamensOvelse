import java.util.ArrayList;
import java.util.Scanner;

public class Keyword {
    String word;
    String definition;
    ArrayList<String> seeAlso;

    public Keyword(String word, String definition, ArrayList<String> seeAlso){
        this.word = word;
        this.definition = definition;
        this.seeAlso = seeAlso;
    }
    Scanner input = new Scanner(System.in);
    String søgeord = input.next();

    public static boolean matches(String søgeord, Keyword keyword){
        if (søgeord.equals(keyword.word)) {
            return true;
        }
        return false;
    }
}