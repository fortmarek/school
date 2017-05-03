package match_game;

import java.awt.Point;


public interface IHrac extends gjk.zapalky.IHrac {


    //Souradnice pokladane zapalky jsou predavany pomoci objektu Point, kde Y je z rozsahu 0..N*2
    //a X je z rozsahu 0..N-1 pro sude radky, 0..N pro liche radky viz schema N=2:

    //     0 1 2
    // 0    - -
    // 1   | | |
    // 2    - -
    // 3   | | |
    // 4    - -


    public String Jmeno(); //Vraci vase jmeno
    public void Inicializace(int N); //nastavi hraci pole. N = pocet ctvercu v jednom radku / sloupci
    public void TahProtpihrace(Point souradnice) throws Exception; //Tahne protihrac. Hodi vyjimku, pokud se protihrac pokousi provest neplatny tah - tedy polozit zapalku mimo hraci plochu nebo na obsazene misto
    public Point MujTah(); //Provede tah a vrati jeho souradnici
}



