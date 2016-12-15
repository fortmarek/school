package Shapes;

/**
 * Created by marekfort on 12/14/16.
 */

import java.util.Scanner;
import static java.lang.System.out;


public class Triangle extends Shape{

    private double a = 0;
    private double b = 0;
    private double c = 0;

    @Override
    public void settings() {

        Scanner scanner = new Scanner(System.in);

        out.println("Strana a: ");
        a = scanner.nextDouble();

        out.println("Strana b: ");
        b = scanner.nextDouble();

        out.println("Strana c: ");
        c = scanner.nextDouble();


    }

    private void checkTriangle() {
        if (!(a + b > c) || !(a + c > b) || !(b + c > a)) {
            out.println("Redefinovat stranu c:");
            Scanner scanner = new Scanner(System.in);
            c = scanner.nextDouble();
            checkTriangle();
        }
    }

    @Override
    public Double area() {
        double area = (a + b + c) / 2;
        out.println(area);
        return area;
    }
}
