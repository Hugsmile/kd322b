/**Importerar ArrayList:en "availBikes" från Main.java*/
import java.util.ArrayList;


public class BikeStore {
	
	
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	/**getAllBikes lämnar ut en sträng med färgen/priset/storleken på alla cyklar i ArrayList:en bikes*/
	public String getAllBikes(){
		String s = "";
		for(Bike bike:bikes){
			s = s + "Color: " + bike.getColor() + " Price: " + bike.getPrice() + " Size: " + bike.getSize() + "\n";
		}
		return s;
	}
	/**addBike lägger till nya cyklar till ArrayList:en bikes såvida de uppfyller imparametrarna(String, int, int) */
	public void addBike(String color, int size, int price){
		bikes.add(new Bike(color, size, price));
	}
	}
