import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Color;


public class BikeStoreGUI {

	private JTextArea textArea;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private BikeStore myBikes = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI window = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 557, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(15, 108, 436, 303);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(169, 66, 126, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(15, 66, 126, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(325, 66, 126, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myBikes.addBike(textField_1.getText(), Integer.parseInt(textField.getText()), Integer.parseInt(textField_2.getText()));
				textArea.setText(myBikes.getAllBikes());
			}
		});
		btnAdd.setBounds(466, 361, 61, 50);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(15, 39, 69, 20);
		frame.getContentPane().add(lblColor);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(169, 39, 69, 20);
		frame.getContentPane().add(lblSize);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(325, 39, 69, 20);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblHermansCykel = new JLabel("Hermans Cykel & Gym!");
		lblHermansCykel.setBounds(15, 3, 176, 20);
		frame.getContentPane().add(lblHermansCykel);
	}
}
