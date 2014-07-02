/**Importerar ArrayList:en "availBikes" fr�n Main.java*/
import java.util.ArrayList;


public class BikeStore {
	
	
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	/**getAllBikes l�mnar ut en str�ng med f�rgen/priset/storleken p� alla cyklar i ArrayList:en bikes*/
	public String getAllBikes(){
		String s = "";
		for(Bike bike:bikes){
			s = s + "Color: " + bike.getColor() + " Price: " + bike.getPrice() + " Size: " + bike.getSize() + "\n";
		}
		return s;
	}
	/**addBike l�gger till nya cyklar till ArrayList:en bikes s�vida de uppfyller imparametrarna(String, int, int) */
	public void addBike(String color, int size, int price){
		bikes.add(new Bike(color, size, price));
	}
	}
