/**
 * Created by marekfort on 02/11/2016.
 */

import java.util.*;
import static java.lang.System.out;
import java.util.concurrent.ThreadLocalRandom;

public class numberGuess {

    private static int max_number = 0;
    private static int min_number = 1;

    public static void main(String[] args) {
        out.println("Největší číslo chci aby bylo: ");

        Scanner scanner = new Scanner(System.in);
        max_number = scanner.nextInt();

        Boolean are_numbers_same = false;

        while (!are_numbers_same) {

            try {
                int guessed_number = guess();


                String answer = get_user_answer();

                are_numbers_same = adjust_min_max(answer, guessed_number);
            }
            catch(java.lang.IllegalArgumentException e){
                out.println("YOURE LYIN");
                are_numbers_same = true;
            }



        }

    }

    private static int guess() {
        int guess = ThreadLocalRandom.current().nextInt(min_number, max_number + 1);

        String message = String.format("Je to %d?", guess);
        out.println(message);

        return guess;
    }

    private static String get_user_answer() {
        Scanner scanner = new Scanner(System.in);
        out.println("Myslíš si číslo menší, větší nebo jsem se trefil? [m/v/t]");

        return scanner.next();
    }

    private static Boolean adjust_min_max(String answer, int guess) {
        Boolean are_numbers_same = false;


        switch (answer) {
            case "m":
                if (max_number == guess - 1){
                    out.println("YOURE LYIN");
                    are_numbers_same = true;
                }
                max_number = guess - 1;
                break;
            case "v":
                min_number = guess + 1;
                if (max_number == guess + 1){
                    out.println("YOURE LYIN");
                    are_numbers_same = true;
                }
                break;
            case "t":
                out.println("COMPUTERS WILL KILL YOU");
                are_numbers_same = true;
                break;
            default:
                out.println("Odpověz pouze m/v/t");
                answer = get_user_answer();
                adjust_min_max(answer, guess);
        }

        return are_numbers_same;

    }

}
