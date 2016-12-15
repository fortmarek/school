package Shapes;

/**
 * Created by marekfort on 12/14/16.
 */

import java.util.Scanner;
import static java.lang.System.out;

public class Rectangle extends Shape {
    private double a = 0;
    private double b = 0;

    @Override
    public void settings() {

        Scanner scanner = new Scanner(System.in);

        out.println("Strana a: ");
        a = scanner.nextDouble();

        out.println("Strana b: ");
        b = scanner.nextDouble();

    }

    @Override
    public Double area() {
        double area = a * b;
        out.println(area);
        return area;
    }
}
