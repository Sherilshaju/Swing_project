import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
public class Scientific {

	private JFrame frame;
	private JTextField textField;
	double a;
	double b;
	double result;
	String op,ans;
	private JTextField textField_1;
	double united=302.96;
	double china=100.68;
	double russia=11.52;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific window = new Scientific();
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
	public Scientific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 780, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 132, 483, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_5.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_5.setBounds(10, 225, 43, 20);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+btnNewButton_6.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_6.setBounds(63, 225, 43, 20);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_7.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_7.setBounds(112, 225, 47, 20);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		btnNewButton_8.setBounds(165, 225, 43, 20);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("%");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";

			}
		});
		btnNewButton_9.setBounds(218, 225, 52, 20);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 194, 43, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CE");
		btnNewButton_1.setBounds(63, 194, 46, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.setBounds(119, 194, 43, 20);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+-");
		btnNewButton_3.setBounds(165, 191, 43, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sqrt");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
	             a=Math.sqrt(a);
	             textField.setText(String.valueOf(a));

				
			}
		});
		btnNewButton_4.setBounds(218, 191, 52, 20);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_10 = new JButton("L..");
		btnNewButton_10.setBounds(285, 193, 52, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("sin");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Double.parseDouble(textField.getText());
				a=Math.sin(a);
	            textField.setText(String.valueOf(a));
	            }
				
			
		});
		btnNewButton_11.setBounds(347, 191, 47, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("sinh");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 a=Double.parseDouble(textField.getText());
	             a=Math.sinh(a);
	             textField.setText(String.valueOf(a));
	            }
			
		});
		btnNewButton_12.setBounds(400, 191, 52, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("pi");
		btnNewButton_15.setBounds(281, 225, 43, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("cos");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 a=Double.parseDouble(textField.getText());
	             a=Math.sin(a);
	             textField.setText(String.valueOf(a));
	 
			}
		});
		btnNewButton_16.setBounds(341, 225, 59, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("cosh");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 a=Double.parseDouble(textField.getText());
	             a=Math.sin(a);
	             textField.setText(String.valueOf(a));
	 
			}
		});
		btnNewButton_17.setBounds(412, 225, 43, 20);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("lnx");
		btnNewButton_18.setBounds(466, 225, 52, 20);
		frame.getContentPane().add(btnNewButton_18);
		
		JPanel panel = new JPanel();
		panel.setBounds(528, 137, 199, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("CURRENCY CONVERTER");
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCurrencyConverter.setBounds(26, 22, 163, 14);
		panel.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"POUNDS", "USD", "EUR"}));
		comboBox.setBounds(52, 52, 85, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 91, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(60, 133, 77, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_19 = new JButton("Convert");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("POUNDS"))
				{
					String c=String.format("Rs %.2f",bp*china);
					lblNewLabel.setText(c);
					
				}
				if(comboBox.getSelectedItem().equals("USD"))
				{
					String c=String.format("Rs %.2f",bp*united);
					lblNewLabel.setText(c);
					
				}
				if(comboBox.getSelectedItem().equals("EUR"))
				{
					String c=String.format("Rs %.2f",bp*russia);
					lblNewLabel.setText(c);
					
				}


			}
		});
		btnNewButton_19.setBounds(10, 171, 89, 23);
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_29 = new JButton("Clear");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_29.setBounds(110, 171, 89, 23);
		panel.add(btnNewButton_29);
		
		
		
		JButton btnNewButton_20 = new JButton("4");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_20.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_20.setBounds(10, 256, 43, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("5");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_21.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_21.setBounds(63, 259, 43, 20);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("6");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_22.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_22.setBounds(116, 259, 43, 20);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("*");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_23.setBounds(165, 256, 43, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("1/x");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				a=1/a;
	            textField.setText(String.valueOf(a));

			}
		});
		btnNewButton_24.setBounds(211, 272, 59, 20);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("x^y");
		btnNewButton_25.setBounds(272, 300, 52, 23);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("tan");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=Double.parseDouble(textField.getText());
	             a=Math.sin(a);
	             textField.setText(String.valueOf(a));
	
			}
		});
		btnNewButton_26.setBounds(273, 272, 51, 20);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("tanh");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=Double.parseDouble(textField.getText());
	             a=Math.sin(a);
	             textField.setText(String.valueOf(a));
	 
			}
		});
		btnNewButton_27.setBounds(334, 272, 66, 20);
		frame.getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("C");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_28.setBounds(466, 269, 52, 23);
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_30 = new JButton("=");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=a+b;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="-")
				{
					result=a-b;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="*")
				{
					result=a*b;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="/")
				{
					result=a/b;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="%")
				{
					result=a%b;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}





			}
		});
		btnNewButton_30.setBounds(211, 301, 52, 63);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("1");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+btnNewButton_31.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_31.setBounds(10, 290, 43, 23);
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("2");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+btnNewButton_32.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_32.setBounds(63, 293, 43, 20);
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("3");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+btnNewButton_33.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_33.setBounds(119, 293, 40, 20);
		frame.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("-");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton_34.setBounds(165, 293, 43, 20);
		frame.getContentPane().add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("0");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+btnNewButton_35.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_35.setBounds(10, 324, 89, 40);
		frame.getContentPane().add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton(".");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							}
		});
		btnNewButton_36.setBounds(112, 332, 43, 32);
		frame.getContentPane().add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton("+");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_37.setBounds(165, 329, 43, 32);
		frame.getContentPane().add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("x^2");
		btnNewButton_38.setBounds(334, 303, 55, 20);
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("Cbr");
		btnNewButton_39.setBounds(410, 269, 43, 23);
		frame.getContentPane().add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("Rund");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
	             a=Math.round(a);
	             textField.setText(String.valueOf(a));

			}
		});
		btnNewButton_40.setBounds(405, 303, 52, 20);
		frame.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("2*pi");
		btnNewButton_41.setBounds(466, 303, 52, 20);
		frame.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_43 = new JButton("x^3");
		btnNewButton_43.setBounds(266, 330, 58, 32);
		frame.getContentPane().add(btnNewButton_43);
		
		JButton btnNewButton_44 = new JButton("Bin");
		btnNewButton_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnNewButton_44.setBounds(333, 329, 57, 32);
		frame.getContentPane().add(btnNewButton_44);
		
		JButton btnNewButton_46 = new JButton("Hex");
		btnNewButton_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnNewButton_46.setBounds(400, 329, 66, 32);
		frame.getContentPane().add(btnNewButton_46);
		
		JButton btnNewButton_47 = new JButton("Oc");
		btnNewButton_47.setBounds(467, 329, 51, 32);
		frame.getContentPane().add(btnNewButton_47);
		
		JButton btnNewButton_14 = new JButton("mod");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_14.setBounds(466, 194, 52, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 739, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("standard\r\n\r\n\r\n");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 252, 488);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 252, 488);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("unit conversion");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 252, 488);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);

			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnNewMenu.add(menuItem);
	}
}