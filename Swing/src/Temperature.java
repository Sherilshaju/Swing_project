import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperature {

	private JFrame frame;
	private JTextField textField;
	double n1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature window = new Temperature();
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
	public Temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDegrees.setBounds(67, 24, 81, 41);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(158, 36, 173, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JLabel label = new JLabel("");
		label.setBounds(140, 102, 92, 20);
		frame.getContentPane().add(label);
		
		JButton btnToCelcius = new JButton("To Celcius");
		btnToCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1=Double.parseDouble(textField.getText());
				double res=(n1-32)*5/9;
				String ans=String.format("%.2f",res);
				label.setText(ans);
}
		});
		btnToCelcius.setBounds(71, 155, 115, 31);
		frame.getContentPane().add(btnToCelcius);
		
		JButton btnNewButton = new JButton("To Fahrenheit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1=Double.parseDouble(textField.getText());
				double res=(n1*9/5) + 32;
				String ans=String.format("%.2f",res);
				label.setText(ans);

			}
		});
		btnNewButton.setBounds(257, 155, 121, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblResult = new JLabel("Result=");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResult.setBounds(67, 102, 81, 20);
		frame.getContentPane().add(lblResult);
		
		
	}

}
