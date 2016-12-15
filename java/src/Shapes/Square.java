package Shapes;

/**
 * Created by marekfort on 12/14/16.
 */


import java.util.Scanner;
import static java.lang.System.out;


public class Square extends Shape {
    public double area = 0;
    private double a = 0;

    @Override
    public void settings() {
        out.println("Strana a: ");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();

    }

    @Override
    public Double area() {
        area = a * a;
        out.println(area);
        return area;
    }
}
