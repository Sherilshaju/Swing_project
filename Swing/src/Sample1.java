import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Sample1 {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample1 window = new Sample1();
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
	public Sample1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login page");
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtUsername.setBounds(159, 11, 86, 33);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUserName = new JLabel("   user name   ");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblUserName.setBounds(29, 10, 92, 33);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel(" password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblPassword.setBounds(39, 59, 92, 23);
		frame.getContentPane().add(lblPassword);
		
		JLabel label = new JLabel("");
		label.setBounds(172, 148, 46, 14);
		frame.getContentPane().add(label);
		
		JCheckBox chckbxReminder = new JCheckBox("Reminder");
		chckbxReminder.setBounds(92, 105, 97, 23);
		frame.getContentPane().add(chckbxReminder);
		
		JButton btnSignIn = new JButton("  SIGN IN");
		btnSignIn.setBackground(Color.GREEN);
		btnSignIn.setBounds(39, 175, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignOut = new JButton(" SIGN OUT");
		btnSignOut.setBackground(Color.RED);
		btnSignOut.setBounds(156, 175, 89, 23);
		frame.getContentPane().add(btnSignOut);
		
		JButton btnNewButton = new JButton(new ImageIcon("C://Users/USER/Downloads/JERRY.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(269, 11, 155, 240);
		frame.getContentPane().add(btnNewButton);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPassword.setBounds(159, 55, 86, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
	}
}
