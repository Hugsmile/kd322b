package House;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class HouseGUI {

	private JFrame frame;
	private House[] myHouses;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI window = new HouseGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HouseGUI() {
		House hus1 = new House(1991,90);
		House hus2 = new House(1131,9);
		House hus3 = new House(2015,900);
		myHouses = new House[10];
		myHouses[1] = hus1;
		myHouses[2] = hus2;
		myHouses[3] = hus3;
//		for(int i=0; i<myHouses.length; i++){
//			if(myHouses[i] != null){
//				int size = myHouses[i].getSize();
//				int year = myHouses[i].getYear();
//			}
//		}
		
		JTextArea HouseList = new JTextArea();
		HouseList.setBounds(0, 0, 543, 283);
		for(int i = 0; i < myHouses.length; i++){
			if(myHouses[i] != null){
				HouseList.append("Ett hus byggt " + myHouses[i].getYear() + " som är " + myHouses[i].getSize() + " kvm stort.\n");
			}
		}
		HouseList.append("Det finns totalt: " + House.getNbrHouses() + " stycken hus.");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(HouseList);

	}
}
	
