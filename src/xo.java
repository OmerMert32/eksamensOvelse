import java.util.ArrayList;
import java.util.Scanner;

public class xo {
    // kryds og bolle, copy paste alt under i main
/*    ArrayList<Character> ox = new ArrayList<Character>();
        for (int i = 0; i < 9;i++){
            ox.add(' ');
        }
        int count = 0;

        krydsBolle(ox, count);
    }
    public static void krydsBolle(ArrayList<Character> ox, int count){
        Scanner input = new Scanner(System.in);
        char xo = 'o';
        int plads;
        int tal = 0;
        for (int i = 0; i < 9;i++){
            ox.add(' ');
        }
        tjek(ox);
        do {
            System.out.print("      |");
            System.out.print("      |");
            System.out.println("       ");
            System.out.print("   " + ox.get(0) + "  |");
            System.out.print("   " + ox.get(1) + "  |");
            System.out.println("   " + ox.get(2) + "   ");
            System.out.print("      |");
            System.out.print("      |");
            System.out.println("       ");

            System.out.println("----------------------");

            System.out.print("      |");
            System.out.print("      |");
            System.out.println("       ");
            System.out.print("   " + ox.get(3) + "  |");
            System.out.print("   " + ox.get(4) + "  |");
            System.out.println("   " + ox.get(5) + "   ");
            System.out.print("      |");
            System.out.print("      |");
            System.out.println("       ");

            System.out.println("----------------------");

            System.out.print("      |");
            System.out.print("      |");
            System.out.println("       ");
            System.out.print("   " + ox.get(6) + "  |");
            System.out.print("   " + ox.get(7) + "  |");
            System.out.println("   " + ox.get(8) + "   ");
            System.out.print("      |");
            System.out.print("      |");
            System.out.println("       ");



            plads = input.nextInt();
            if (ox.get(plads - 1).equals(' ')) {
                count++;
                xo = 'o';
                if (count %2 != 0){
                    xo = 'x';
                }
                ox.set(plads - 1, xo);
            }
            else { for (int i = 0; i < 20; i++){
                System.out.println();
            }
                krydsBolle(ox, count);
            }
            for (int i = 0; i < 20; i++){
                System.out.println();
            }
            if (!tjek(ox)){
                tal = 1;
            }
        }
        while(tal != 0);
    }
    public static boolean tjek(ArrayList<Character> ox){
        if ((ox.get(0).equals('o') && ox.get(1).equals('o') && ox.get(2).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(3).equals('o') && ox.get(4).equals('o') && ox.get(5).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(6).equals('o') && ox.get(7).equals('o') && ox.get(8).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(0).equals('o') && ox.get(3).equals('o') && ox.get(6).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(1).equals('o') && ox.get(4).equals('o') && ox.get(7).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(2).equals('o') && ox.get(5).equals('o') && ox.get(8).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(0).equals('o') && ox.get(4).equals('o') && ox.get(8).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }
        if ((ox.get(2).equals('o') && ox.get(4).equals('o') && ox.get(6).equals('o'))){
            System.out.println("o har vundet");
            return true;
        }

        if ((ox.get(0).equals('x') && ox.get(1).equals('x') && ox.get(2).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(3).equals('x') && ox.get(4).equals('x') && ox.get(5).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(6).equals('x') && ox.get(7).equals('x') && ox.get(8).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(0).equals('x') && ox.get(3).equals('x') && ox.get(6).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(1).equals('x') && ox.get(4).equals('x') && ox.get(7).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(2).equals('x') && ox.get(5).equals('x') && ox.get(8).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(0).equals('x') && ox.get(4).equals('x') && ox.get(8).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        if ((ox.get(2).equals('x') && ox.get(4).equals('x') && ox.get(6).equals('x'))){
            System.out.println("x har vundet");
            return true;
        }
        return false;
 */
}
