import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Bike> availBikes = new ArrayList<Bike>(); 
		
		Bike b1 = new Bike("Black", 20, 2500);
		Bike b2 = new Bike("Green", 16, 500);
		Bike b3 = new Bike("Blue", 14, 5000);
		Bike b4 = new Bike("Orange", 20, 15000);
		Bike b5 = new Bike("Yellow", 28, 6000);
		Bike b6 = new Bike("Grey", 24, 500);
		Bike b7 = new Bike("Indigo", 18, 9999);
		Bike b8 = new Bike("Red", 24, 3999);
		Bike b9 = new Bike("Black", 26, 2500);
		Bike b10 = new Bike("Blue", 12, 2000);
		
		availBikes.add(b1);
		availBikes.add(b2);
		availBikes.add(b3);
		availBikes.add(b4);
		availBikes.add(b5);
		availBikes.add(b6);
		availBikes.add(b7);
		availBikes.add(b8);
		availBikes.add(b9);
		availBikes.add(b10);
		
		for(int i = 0; i < availBikes.size(); i++){
			if (availBikes.get(i) != null){
			System.out.println(availBikes.get(i).getColor() + " " + availBikes.get(i).getSize() + " " + availBikes.get(i).getPrice());
			}
		}
	}

}
