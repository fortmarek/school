/**
 * Created by marekfort on 5/10/17.
 */

import java.awt.Point;
import java.util.*;

public class Dames {

    private static int [][] plan;
    private static List<Point> list = new ArrayList<>();

    public static void main(String args[]) {
        initPlan(9);
        for (int [] k: plan) {
            String row = "";
            for (int x: k) {
                row += row + String.format(" %s", x);
                System.out.println(x);
            }
            System.out.println(row);
            row = "";
        }

    }

    private static void initPlan(int n){
        plan = new int[n][]; {
            for (int i = 0; i < n; i++)
                plan[i] = new int[i+1];
        }

    }

    public static void checkFormerRow() {

    }


}
