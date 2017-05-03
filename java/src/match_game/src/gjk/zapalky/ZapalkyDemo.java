package gjk.zapalky;

import gjk.zapalky.*;

/**
 *
 * @author belohradsky
 */
public class ZapalkyDemo {
    public static void main(String[] args) {
        ZapalkyGameController hra = new ZapalkyGameController(new HloupyHrac(), new matches(), 5);
        hra.PlayGameVisualized();
    }

}