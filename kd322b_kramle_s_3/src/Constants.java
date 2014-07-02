
public class Constants {
	/**Kontrollerar så att ram-storleken är större än 8 och mindre än 28*/
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	/**Kontrollerar så att priset är större än 0 och mindre än 30000*/
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	/**Anger de godkända färgerna*/
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
			return "Felaktig färg!!! :(";
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
