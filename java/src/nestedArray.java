/**
 * Created by marekfort on 24/11/2016.
 */

import java.util.*;
import static java.lang.System.out;

public class nestedArray {
    public static void main(String[] args) {
        int[][] nested = new int[][] {{1,2},{3,4},{5,6}};
        getTable(2, nested, true);
        getTable(2, nested, false);
    }

    private static List<String> getTable(int height, int[][] nested, boolean downwards) {
        List<String> rows = new ArrayList<String>();
        rows.add("");

        int index = 0;

        for (int[] nest : nested) {
            for (int number : nest) {
                
                String row = rows.get(index);

                if (row.length() == 0) {
                    row += String.format("%s", number);
                }

                else {
                    row += ", " + number;
                }

                rows.set(index, row);

                if (index == 0 && rows.size() < height) {
                    rows.add("");
                }


                if (row.length() == height * 3 - 2 && !downwards) {
                    rows.add("");
                    index++;
                }

                if (downwards) {

                    if (index == height - 1) {
                        index = 0;
                        continue;
                    }

                    index++;
                }

            }
        }

        for (String row : rows) {
            out.println(row);
        }

        return rows;
    }
}
