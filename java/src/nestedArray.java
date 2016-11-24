/**
 * Created by marekfort on 24/11/2016.
 */

import java.util.*;
import static java.lang.System.out;

public class nestedArray {
    public static void main(String[] args) {
        int[][] nested = new int[][] {{1,2},{3,4},{5,6}};

        getTable(2, nested);
    }

    private static List<String> getTable(int height, int[][] nested) {
        List<String> rows = new ArrayList<String>();
        rows.add("");

        int rowIndex = 0;

        for (int[] nest : nested) {
            for (int number : nest) {
                String row = rows.get(rowIndex);
                if (row.length() == 0) {
                    row += String.format("%s", number);
                }
                else {
                    row += ", " + number;
                }

                rows.set(rowIndex, row);

                if (rowIndex == 0 && rows.size() < height) {
                    rows.add("");
                }

                if (rowIndex == height - 1) {
                    rowIndex = 0;
                    continue;
                }

                rowIndex++;
            }
        }

        for (String row : rows) {
            out.println(row);
        }

        return rows;
    }
}
