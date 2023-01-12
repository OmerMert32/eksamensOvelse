import java.io.*;
import java.util.*;
public class Raflebærger {
    int antal;

    public Raflebærger(int antal) {
        this.antal = antal;
    }
    public static int ryst(int antal) throws IOException {
        Random rand = new Random();
        FileWriter fw = new FileWriter("terning.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        int øjne = 0;
        for (int i = 0; i < antal; i++){
            int tal = rand.nextInt(6 ) + 1;
            bf.write(tal + " ");
            øjne = tal + øjne;
        }
        bf.close();

        return øjne;
    }
    public static ArrayList<String> se() throws IOException{
        Scanner scan = new Scanner(new File("terning.txt"));
        ArrayList<String> ternigner = new ArrayList<>();
        String tal = scan.nextLine();

        for (String s : tal.split(" ")){
            ternigner.add(s);
        }
        System.out.println(ternigner);
        return ternigner;
    }
}

