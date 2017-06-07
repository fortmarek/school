
public class DataStructures {
	public static void main(String [] args)
	{
		//Fronta<Polozka> zasobnik = new Fronta<>();
		Zasobnik<Polozka> zasobnik = new Zasobnik<>();
		zasobnik.add(new Polozka("Marek",20));
		zasobnik.add(new Polozka("Ladislav",90));
		zasobnik.add(new Polozka("Karel ",10));
		zasobnik.printout();
		zasobnik.remove();
		zasobnik.printout();
	}
}

