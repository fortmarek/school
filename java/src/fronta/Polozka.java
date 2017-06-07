/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Polozka {
	private String name;
	private int age;
	private Polozka next;
	Polozka(String name, int age){
		this.name = name;
		this.age = age;
	}
	void printout(){

		System.out.println(name + ", " + age);
		if(next!=null){
			next.printout();
		}
	}
}