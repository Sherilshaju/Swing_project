import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Double n1;
	Double n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel window = new Panel();
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
	public Panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Body Mass Index");
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(0, 0, 434, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setForeground(new Color(0, 0, 139));
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBodyMassIndex.setBounds(138, 29, 211, 42);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 100, 0));
		panel_1.setBounds(0, 109, 434, 271);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setBounds(45, 46, 76, 24);
		lblHeightm.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("      Weight(kg):");
		lblWeightkg.setBounds(21, 91, 107, 71);
		lblWeightkg.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblWeightkg);
		
		textField = new JTextField();
		textField.setBounds(198, 50, 120, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 118, 120, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("  BMI");
		lblBmi.setBounds(45, 173, 55, 31);
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblBmi);
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 255, 0));
		label.setBounds(110, 173, 89, 24);
		panel_1.add(label);
		JLabel label_1 = new JLabel("");
		label_1.setBounds(264, 160, 134, 37);
		panel_1.add(label_1);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(94, 226, 89, 23);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField_1.getText());
				double res=(n1/n2/n2)*10000;
				String ans=String.format("%.2f",res);
				label.setText(ans);
				if(res<18.5)
				{
					label_1.setText("Under weight");
				}
				else if(res>=18.5&&res<24.9)
				{
					label_1.setText("Normal weight");
				}
				else if(res>=25&&res<29.9)
				{
					label_1.setText("Over weight");
				}
				else
				{
					label_1.setText("Obese");
				}
				
			}
		});
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(201, 226, 89, 23);
		panel_1.add(btnClear);
	
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		textField.setText(null);
		textField_1.setText(null);
		label.setText(null);
		label_1.setText(null);
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(309, 226, 89, 23);
		panel_1.add(btnExit);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 100, 0));
		panel_2.setBounds(0, 391, 434, 180);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C://Users/USER/Downloads/2.jpg"));
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setBounds(10, 11, 414, 158);
		panel_2.add(lblNewLabel);
	}
}
