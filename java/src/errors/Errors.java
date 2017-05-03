/**
 * Created by marekfort on 5/3/17.
 */

import java.text.NumberFormat;
import java.util.*;

public class Errors {
    public static void main(String args[]) {
        runError();
    }

    private static void runError() {
        String hmotnost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hmotnost: ");

        hmotnost = sc.nextLine();
        String jmeno = null;

        try {
            int m = Integer.parseInt(hmotnost);
            System.out.println("Hmotnost je " + m + " kg");
            //System.out.println(jmeno.toUpperCase());
        }
        catch (NumberFormatException e) {
            System.err.println("Chybné zadání");
            runError();
        }
        catch (NullPointerException e) {

        }
    }
}
