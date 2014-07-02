
public class Bike {
	
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	/**Kontrollerar och sorterar data som har matats in utifrån color och size. Om datan går igenom läggs en cykel till*/
	public Bike(String color, int size){
		this.color = color;
		this.size = size;
		nbrOfBikes++;
	}
	/**Kontrollerar och sorterar data som har matats in utifrån color, size och price. Om datan går igenom läggs en cykel till*/
	public Bike(String color, int size, int price){
		this.color = Constants.checkColor(color);
		this.size = Constants.checkSize(size);
		this.price = Constants.checkPrice(price);
		nbrOfBikes++;
	}
	/**Metod för att returnera färgen(color) på cyklarna*/
	public String getColor(){
		return color;
	}
	/**Metod för att returnera storleken(size) på cyklarna*/
	public int getSize(){
		return size;
	}
	/**Metod för att returnera priset(price) på cyklarna*/
	public int getPrice(){
		return price;
	}
	/**Metod för att bestämma priset(price) på cyklarna*/
	public int setPrice(int price){
		return price;
	}
	/**Metod för att ange antalet inmatade cyklar*/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
	}
	
}
