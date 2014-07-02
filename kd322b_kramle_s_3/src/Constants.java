
public class Constants {
	/**Kontrollerar s� att ram-storleken �r st�rre �n 8 och mindre �n 28*/
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	/**Kontrollerar s� att priset �r st�rre �n 0 och mindre �n 30000*/
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	/**Anger de godk�nda f�rgerna*/
	public static final String[] colors = {"Black","Red", "Orange", "Yellow", "Grey", "Indigo", "Blue"};
	

	public static String checkColor(String color){
		boolean sorf = false;
		for(int i = 0; i<colors.length;i++){
			if(color.equals(colors[i])){
				sorf = true;
			}
		}
		if(sorf == true){
			return color;
		}else{
			return "Felaktig f�rg!!! :(";
		}
	}
		
	public static int checkSize(int size){
		if(size >= MIN_SIZE && size <= MAX_SIZE){
			return size;
		}else{
			return 0;
		}
	}
		
	public static int checkPrice(int price){
		if(price >= MIN_PRICE && price <= MAX_PRICE){
			return price;
		}else{
			return 99999;
		}
		
	}
	
	
		
}
