/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

class Zasobnik<T extends Polozka> {
    private ArrayList<T> elements = new ArrayList<>();
	void add(T element){
        elements.add(0, element);
	}
	void remove(){
        T e = elements.get(elements.size() - 1);
        e.printout();
        elements.remove(elements.size() - 1);
	}
	void printout(){
        for(T e: elements){
            e.printout();
        }
	}
}