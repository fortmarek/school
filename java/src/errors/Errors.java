/**
 * Created by marekfort on 5/3/17.
 */

import java.text.NumberFormat;
import java.util.*;

public class Errors {
    public static void main(String args[]) {
        checkTriangle();
    }
    private static void checkTriangle() {

        Scanner sc = new Scanner(System.in);
        double a = getSide("a");
        double b = getSide("b");
        double c = getSide("c");

        try {
            if (!isTriangle(a, b, c)) {
                throw new TriangleError();
            }
        }
        catch (TriangleError e) {
            System.err.println("Není trojúhelník");
            checkTriangle();
        }

        try {
            if (isPerpendicular(a, b, c)) {
                System.out.println("Trojúhelník je pravoúhlý");
            }
            else {
                throw new PerpendicularError();
            }
        }

        catch (PerpendicularError e) {
            System.err.println("Trojúhelník není pravoúhlý");
            checkTriangle();
        }
    }

    private static boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    private static boolean isPerpendicular(double a, double b, double c) {
        return (Math.sqrt(a*a + b*b) == Math.sqrt(c*c) || Math.sqrt(a*a + c*c) == Math.sqrt(b*b) || Math.sqrt(c*c + b*b) == Math.sqrt(a*a));
    }

    private static double getSide(String sideName) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(String.format("Zadejte stranu %s: ", sideName));
            return sc.nextDouble();
        }
        catch(InputMismatchException e) {
            System.err.println("Pouze čísla");
            getSide(sideName);
        }
        return 0;
    }
}
