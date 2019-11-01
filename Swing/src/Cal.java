import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JList;

public class Cal {

	private JFrame frame;
	private JTextField textField;
    double num1;
    double num2;
    double result;
    String op;
    String ans;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
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
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("calculator");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 21, 364, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b1.getText();
				textField.setText(Number);
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b1.setBounds(34, 168, 40, 40);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String Number=textField.getText()+b2.getText();
					textField.setText(Number);
				}
		});
	
		b2.setBounds(121, 168, 40, 40);
		frame.getContentPane().add(b2);
		
		JButton b3= new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b3.getText();
				textField.setText(Number);
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b3.setBounds(209, 168, 40, 40);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b4.getText();
				textField.setText(Number);
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b4.setBounds(34, 239, 40, 40);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b5.getText();
				textField.setText(Number);
			}
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b5.setBounds(121, 239, 40, 40);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b6.getText();
				textField.setText(Number);
			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b6.setBounds(209, 239, 40, 40);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b7.getText();
				textField.setText(Number);
			}
		});
		b7.setBounds(34, 311, 40, 40);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b8.getText();
				textField.setText(Number);
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b8.setBounds(121, 311, 40, 40);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+b9.getText();
				textField.setText(Number);
			}
		});
		b9.setBounds(209, 311, 40, 40);
		frame.getContentPane().add(b9);
		
		JButton button_8 = new JButton("C");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_8.setForeground(Color.BLACK);
		button_8.setBackground(Color.RED);
		button_8.setBounds(156, 102, 72, 40);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_9.setBounds(291, 168, 56, 40);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("B");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_10.setBackground(Color.BLUE);
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(34, 102, 72, 40);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_11.setBounds(34, 380, 40, 40);
		frame.getContentPane().add(button_11);
		
		JButton b0 = new JButton("0");
		b0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b0.getText();
				textField.setText(Number);
			}
		});
		b0.setBounds(121, 380, 40, 40);
		frame.getContentPane().add(b0);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);		
				}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_13.setBounds(209, 380, 56, 40);
		frame.getContentPane().add(button_13);
		
		JButton button_17 = new JButton("-");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_17.setBounds(291, 239, 56, 40);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("*");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_18.setBounds(291, 311, 56, 40);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("/");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_19.setBounds(291, 380, 56, 40);
		frame.getContentPane().add(button_19);
		
		JList list = new JList();
		list.setBounds(291, 392, 1, 1);
		frame.getContentPane().add(list);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button.setBounds(291, 102, 56, 40);
		frame.getContentPane().add(button);
	}
}
