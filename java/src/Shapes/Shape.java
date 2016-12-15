package Shapes;

/**
 * Created by marekfort on 12/14/16.
 */


import java.util.*;
import static java.lang.System.out;


public abstract class Shape {
    public abstract Double area();
    public abstract void settings();


    private static double totalArea = 0;
    private static List<Double> areaList = new ArrayList<Double>();

    private static void writeValues(double area) {
        totalArea += area;
        areaList.add(area);
    }

    public static void main(String[] args) {
        Boolean cont = true;

        while (cont) {
            out.println("SHAPES");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch(choice) {
                case 0:
                    cont = false;
                    break;
                case 1:
                    Square square = new Square();
                    square.settings();
                    writeValues(square.area());
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    rectangle.settings();
                    writeValues(rectangle.area());
                    break;
                case 3:
                    Triangle triangle = new Triangle();
                    triangle.settings();
                    writeValues(triangle.area());
                    break;
                case 4:
                    Circle circle = new Circle();
                    circle.settings();
                    writeValues(circle.area());
                    break;
                case 5:
                    out.println(totalArea);
                    break;
                case 6:
                    Collections.sort(areaList);
                    out.println(areaList);
                    break;
                default:
                    out.println("Neplatná volba");
                    break;
            }
        }
    }
}
