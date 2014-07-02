package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {
	
	
	
	private JFrame frame;
	private JTextField textField;
	
	private Calculator myCalc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		myCalc = new Calculator();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 352, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(15, 16, 297, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.minus();
				
				textField.setText(""+myCalc.getOperator());
			}
		});
		btnNewButton_3.setBounds(249, 264, 63, 52);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("*");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.mult();
				
				textField.setText(""+myCalc.getOperator());
			}
		});
		btnNewButton_5.setBounds(249, 196, 63, 52);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.plus();
				
				textField.setText(""+myCalc.getOperator());
			}
		});
		btnNewButton.setBounds(249, 336, 63, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.equals();
				
				
				
				textField.setText(String.valueOf(myCalc.getResult()));
			}
		});
		btnNewButton_1.setBounds(93, 336, 141, 52);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.numberButtonPressed(9);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_2.setBounds(171, 128, 63, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(8);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_4.setBounds(93, 128, 63, 52);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(7);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_6.setBounds(15, 128, 63, 52);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(6);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_8.setBounds(171, 196, 63, 52);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(5);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_10.setBounds(93, 196, 63, 52);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("4");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(4);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_12.setBounds(15, 196, 63, 52);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(3);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_13.setBounds(171, 264, 63, 52);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_11 = new JButton("2");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(2);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_11.setBounds(93, 264, 63, 52);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalc.numberButtonPressed(1);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_9.setBounds(15, 264, 63, 52);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalc.numberButtonPressed(0);
				
				int i = myCalc.getOperand();
				
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_7.setBounds(15, 336, 63, 52);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalc.clear();
				
				textField.setText("");
			}
		});
		btnC.setBounds(249, 128, 63, 52);
		frame.getContentPane().add(btnC);
	}
}
