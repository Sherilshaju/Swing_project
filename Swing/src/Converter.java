import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField1;
	double n1;
	double n2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter v.Beta 0.12.1");
		frame.setBackground(Color.BLUE);
		frame.setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(53, 12, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsMeasurement.setBounds(126, 64, 123, 27);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMetric.setBounds(283, 70, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		textField = new JTextField();
		textField.setBounds(136, 108, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(136, 156, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeight.setBounds(53, 110, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel label = new JLabel(":");
		label.setBounds(93, 111, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblWeight = new JLabel(" Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblWeight.setBounds(53, 159, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(283, 111, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(283, 159, 46, 14);
		frame.getContentPane().add(label_1);
		
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField1.getText());
				double r=n1/3.281;
				double r1=n2/2.205;
				String a=String.format("%.2f m",r);
				String a1=String.format("%.2f kg",r1);
				label_2.setText(a);
				label_1.setText(a1);
				}
		});
		btnOk.setBounds(133, 200, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel ");
		btnCancel.setBounds(249, 200, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		
		
	}
}
