package Pulley;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frmPulleyCalculator;
	private JTextField diameter1;
	private JLabel lblNewLabel;
	private JTextField rpm1;
	private JLabel lblndPulley;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField diameter2;
	private JTextField rpm2;
	private JButton btnCalculateRpm;
	private JButton Tutorial;
	private JLabel lblDiameterInMm;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmPulleyCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPulleyCalculator = new JFrame();
		frmPulleyCalculator.setTitle("Pulley Calculator");
		frmPulleyCalculator.setBounds(100, 100, 867, 465);
		frmPulleyCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPulleyCalculator.getContentPane().setLayout(null);
		
		diameter1 = new JTextField();
		diameter1.setBounds(116, 93, 86, 20);
		frmPulleyCalculator.getContentPane().add(diameter1);
		diameter1.setColumns(10);
		
		JLabel lblDiameter = new JLabel("Diameter");
		lblDiameter.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDiameter.setBounds(33, 96, 53, 14);
		frmPulleyCalculator.getContentPane().add(lblDiameter);
		
		JLabel lblstPulley = new JLabel("1st Pulley");
		lblstPulley.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblstPulley.setBounds(120, 10, 90, 30);
		frmPulleyCalculator.getContentPane().add(lblstPulley);
		
		lblNewLabel = new JLabel("RPM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(40, 176, 46, 14);
		frmPulleyCalculator.getContentPane().add(lblNewLabel);
		
		rpm1 = new JTextField();
		rpm1.setBounds(116, 173, 86, 20);
		frmPulleyCalculator.getContentPane().add(rpm1);
		rpm1.setColumns(10);
		
		lblndPulley = new JLabel("2nd Pulley");
		lblndPulley.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblndPulley.setBounds(348, 10, 90, 30);
		frmPulleyCalculator.getContentPane().add(lblndPulley);
		
		lblNewLabel_1 = new JLabel("Diameter");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(282, 96, 63, 14);
		frmPulleyCalculator.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("RPM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(299, 176, 46, 14);
		frmPulleyCalculator.getContentPane().add(lblNewLabel_2);
		
		diameter2 = new JTextField();
		diameter2.setBounds(348, 93, 86, 20);
		frmPulleyCalculator.getContentPane().add(diameter2);
		diameter2.setColumns(10);
		
		rpm2 = new JTextField();
		rpm2.setBounds(348, 173, 86, 20);
		frmPulleyCalculator.getContentPane().add(rpm2);
		rpm2.setColumns(10);
		
		btnCalculateRpm = new JButton("Calculate RPM");
		btnCalculateRpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d1 = Integer.parseInt(diameter1.getText());
				double d2 = Integer.parseInt(diameter2.getText());
				int r1 = Integer.parseInt(rpm1.getText());
				double rat = d1/d2;
				double r2 = rat * r1;
				rpm2.setText(""+r2);
			}
		});
		btnCalculateRpm.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculateRpm.setBounds(105, 279, 115, 30);
		frmPulleyCalculator.getContentPane().add(btnCalculateRpm);
		
		Tutorial = new JButton("Tutorial");
		Tutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Welcome!!!\n\nEnter the diameter of the first and second pulley.\nAlso enter the RPMs of the first pulley in the field.\nThen press calculate.");
			}
		});
		Tutorial.setFont(new Font("Tahoma", Font.BOLD, 13));
		Tutorial.setBounds(10, 392, 89, 23);
		frmPulleyCalculator.getContentPane().add(Tutorial);
		
		lblDiameterInMm = new JLabel("mm");
		lblDiameterInMm.setBounds(212, 93, 36, 20);
		frmPulleyCalculator.getContentPane().add(lblDiameterInMm);
		
		label = new JLabel("mm");
		label.setBounds(446, 93, 36, 20);
		frmPulleyCalculator.getContentPane().add(label);
		
		JButton clear = new JButton("Clear data");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diameter1.setText(null);
				diameter2.setText(null);
				rpm1.setText(null);
				rpm2.setText(null);
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		clear.setBounds(230, 279, 115, 30);
		frmPulleyCalculator.getContentPane().add(clear);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("Tahoma", Font.BOLD, 13));
		Exit.setBounds(349, 393, 89, 23);
		frmPulleyCalculator.getContentPane().add(Exit);
	}
}
