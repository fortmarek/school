/**
 * Created by marekfort on 23/11/2016.
 */

import java.util.*;
import static java.lang.System.out;

public class permutation {

    private static int n = 0;

    public static void main(String[] args) {
        out.println("Chci aby číslo n pro permutace bylo: ");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        //int factorial = factorial(n);
        //out.println(factorial);

        List<Object[]> allPermutations = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            Object[] permutation = new Object[n];

            permutation[0] = i;

            List otherCombinations = otherCombinationsForNumber(permutation, i);

            allPermutations.addAll(otherCombinations);

            //out.println(Arrays.deepToString(otherCombinations.toArray()));

        }

        out.println(Arrays.deepToString(allPermutations.toArray()));
        out.println(allPermutations.size());



    }

    private static List<Object[]> otherCombinationsForNumber(Object[] permutation, int i) {
        List<Object[]> permutations = new ArrayList<>();

        permutations.add(permutation);

        for (int combinationNumber = 1; combinationNumber <= n; combinationNumber++) {
            if (combinationNumber != i) {
                permutations = fillBlanksWithNumber(combinationNumber, permutations);
            }
        }

        return permutations;

    }

    private static List<Object[]> fillBlanksWithNumber(int combinationNumber, List<Object[]> permutations) {
        List<Object[]> newPermutations = new ArrayList<>();
        for (int permutationIndex = 0; permutationIndex < permutations.size(); permutationIndex++) {
            for (int i = 0; i < n; i++) {
                Object[] permutation = permutations.get(permutationIndex);
                if (permutation[i] == null) {
                    Object[] newPermutation = permutation.clone();
                    newPermutation[i] = combinationNumber;
                    newPermutations.add(newPermutation);
                    List<Object> list= Arrays.asList(newPermutation);
                }
            }
        }


        return newPermutations;

    }


    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }


}
