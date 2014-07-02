package com.whatever;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DetaljVy {

	private JFrame frame;
	private JTextField txtHerman;
	private JTextField txtKarlsson;
	private JTextField textField;
	private JTextField txtHermanthemanhotmailcom;
	private JTextField txtHemmavgen;
	private JTextField textField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetaljVy window = new DetaljVy();
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
	public DetaljVy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 719, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.DARK_GRAY));
		panel.setBounds(0, 0, 697, 486);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEfternamn = new JLabel("Efternamn:");
		lblEfternamn.setBounds(15, 287, 79, 20);
		panel.add(lblEfternamn);
		
		JLabel lblFrnamn = new JLabel("F\u00F6rnamn:");
		lblFrnamn.setBounds(15, 251, 69, 20);
		panel.add(lblFrnamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer:");
		lblPersonnummer.setBounds(15, 327, 114, 20);
		panel.add(lblPersonnummer);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(15, 363, 69, 20);
		panel.add(lblAdress);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(15, 435, 69, 20);
		panel.add(lblTelefon);
		
		JLabel lblEpost = new JLabel("E-post:");
		lblEpost.setBounds(15, 399, 69, 20);
		panel.add(lblEpost);
		
		txtHerman = new JTextField();
		txtHerman.setText("Herman");
		txtHerman.setBounds(136, 248, 276, 26);
		panel.add(txtHerman);
		txtHerman.setColumns(10);
		
		txtKarlsson = new JTextField();
		txtKarlsson.setText("Karlsson");
		txtKarlsson.setBounds(136, 284, 276, 26);
		panel.add(txtKarlsson);
		txtKarlsson.setColumns(10);
		
		textField = new JTextField();
		textField.setText("19370108-1572");
		textField.setBounds(136, 324, 276, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		txtHermanthemanhotmailcom = new JTextField();
		txtHermanthemanhotmailcom.setText("herman_the_man47@hotmail.com");
		txtHermanthemanhotmailcom.setBounds(136, 396, 276, 26);
		panel.add(txtHermanthemanhotmailcom);
		txtHermanthemanhotmailcom.setColumns(10);
		
		txtHemmavgen = new JTextField();
		txtHemmavgen.setText("Hemmav\u00E4gen 37");
		txtHemmavgen.setBounds(136, 360, 276, 26);
		panel.add(txtHemmavgen);
		txtHemmavgen.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("072-10 60 599");
		textField_1.setBounds(136, 432, 276, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DetaljVy.class.getResource("/Images/hermanp.jpg")));
		lblNewLabel.setBounds(136, 16, 276, 216);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut...");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem...");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
	}
}
