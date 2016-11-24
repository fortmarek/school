/**
 * Created by marekfort on 24/11/2016.
 */

import static java.lang.System.out;

public class nestedArray {
    public static void main(String[] args) {
        int[][] nested = new int[][] {{1,2},{3,4},{5,6}};

        int rowIndex = 0;

        String row = "";

        for (int[] nest : nested) {
            for (int number : nest) {

                if (rowIndex == 0) {
                    row += String.format("%s", number);
                }
                else {
                    row += ", " + number;
                }
                if (rowIndex == 2) {
                    rowIndex = 0;
                    out.println(row);
                    row = "";
                    continue;
                }

                rowIndex++;
            }
        }
    }
}
