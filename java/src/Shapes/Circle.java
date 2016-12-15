package Shapes;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Created by marekfort on 12/14/16.
 */
public class Circle extends Shape {

    private double r = 0;

    @Override
    public void settings() {
        out.println("Poloměr: ");

        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();

    }

    @Override
    public Double area() {
        double area = r * r * Math.PI;
        out.println(area);
        return area;
    }

}
