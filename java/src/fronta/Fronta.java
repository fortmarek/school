/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;

class Fronta<T extends Polozka> {
    private ArrayList<T> elements = new ArrayList<T>();
    void add(T element){
        elements.add(element);
    }
    void remove(){
        T e = elements.get(0);
        e.printout();
        elements.remove(0);
    }
    void printout(){
        for(T e: elements){
            e.printout();
        }
    }
}