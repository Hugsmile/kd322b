
public class Bike {
	
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	/**Kontrollerar och sorterar data som har matats in utifr�n color och size. Om datan g�r igenom l�ggs en cykel till*/
	public Bike(String color, int size){
		this.color = color;
		this.size = size;
		nbrOfBikes++;
	}
	/**Kontrollerar och sorterar data som har matats in utifr�n color, size och price. Om datan g�r igenom l�ggs en cykel till*/
	public Bike(String color, int size, int price){
		this.color = Constants.checkColor(color);
		this.size = Constants.checkSize(size);
		this.price = Constants.checkPrice(price);
		nbrOfBikes++;
	}
	/**Metod f�r att returnera f�rgen(color) p� cyklarna*/
	public String getColor(){
		return color;
	}
	/**Metod f�r att returnera storleken(size) p� cyklarna*/
	public int getSize(){
		return size;
	}
	/**Metod f�r att returnera priset(price) p� cyklarna*/
	public int getPrice(){
		return price;
	}
	/**Metod f�r att best�mma priset(price) p� cyklarna*/
	public int setPrice(int price){
		return price;
	}
	/**Metod f�r att ange antalet inmatade cyklar*/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
}
