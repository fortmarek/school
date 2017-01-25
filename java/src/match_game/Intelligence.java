package match_game;

import java.awt.*;
import static java.lang.System.out;


public class Intelligence implements IHrac {
    public String Jmeno() {
        return null;
    }

    public void Inicializace(int N) {
        out.println("HELLO");
    }

    public void TahProtihrace(Point souradnice) {
        out.println(souradnice);
    }

    public Point MujTah() {
        Point myTurn = new Point(1, 1);
        return myTurn;
    }
}
