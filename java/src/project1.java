/**
 * Created by marekfort on 19/10/2016.
 */


import java.util.*;
import static java.lang.System.out;

public class project1 {

    public static void main(String[] args) {

        System.out.println("Zadej svůj věk: ");

        List<Integer> integersList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            int age = scanner.nextInt();

            if (age == 0 && !integersList.isEmpty()) {
                Collections.sort(integersList);
                out.println("Nejmenší číslo: ");
                out.println(integersList.get(0));
                out.println("Největší číslo: ");
                out.println(integersList.get(integersList.size() - 1));
                out.println("Aritmetický průměr: ");
                printArithmetic(integersList);
                out.println("Seřazený list: ");
                out.println(integersList);
                break;
            }
            else {
                integersList.add(age);
            }

            out.println(integersList);
        }

    }

    private static void printArithmetic(List<Integer> integersList) {
        double total_sum = 0;
        for (int i : integersList) {
            total_sum += i;
        }
        double arithmetic = total_sum / integersList.size();
        out.println(arithmetic);
    }

}
