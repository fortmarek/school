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
        try {
            T e = elements.get(elements.size() - 1);
            System.out.println("Removed:");
            e.printout();
            elements.remove(elements.size() - 1);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Zásobník je prázdný");
        }

	}
	void printout(){
        System.out.println("Zásobník:");
        for(T e: elements){
            e.printout();
        }
	}
}