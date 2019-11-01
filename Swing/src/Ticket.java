import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTable table_1;
	double t;
	double tkt=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setBounds(280, 11, 136, 39);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblTicketBooking);
		
		JPanel panel = new JPanel();
		panel.setBounds(315, 61, 364, 338);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(10, 28, 65, 34);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(81, 28, 102, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(10, 89, 46, 14);
		panel.add(lblFrom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 87, 102, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(10, 130, 46, 14);
		panel.add(lblTo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 128, 102, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(10, 169, 46, 14);
		panel.add(lblDate);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 167, 102, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(10, 207, 46, 14);
		panel.add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(81, 205, 102, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicketNo.setBounds(254, 72, 65, 14);
		panel.add(lblTicketNo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(245, 87, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(254, 118, 46, 26);
		panel.add(lblPrice);
		
		textField_6 = new JTextField();
		textField_6.setBounds(245, 144, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoute.setBounds(254, 175, 46, 14);
		panel.add(lblRoute);
		
		textField_7 = new JTextField();
		textField_7.setBounds(245, 200, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		JRadioButton ac = new JRadioButton("AC");
		ac.setBounds(96, 152, 54, 23);
		frame.getContentPane().add(ac);
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(221, 182, 84, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(152, 152, 95, 23);
		frame.getContentPane().add(rdbtnSleeper);
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tx;
				
				if(ac.isSelected()&& rdbtnSleeper.isSelected())
				{
					tx="AC/Sleeper";
				}
				else if(ac.isSelected()&& !rdbtnSleeper.isSelected())
				{
					tx="AC/Seater";
				}
				else if(!ac.isSelected()&& rdbtnSleeper.isSelected())
				{
					tx="Non AC/Sleeper";
				}
				else 
				{
					tx="Non AC/Seater";
				}
				DefaultTableModel model=(DefaultTableModel)table_1.getModel();
				model.addRow(new String[]
				{
				textField.getText(),
				//(String) comboBox.getSelectedItem(),
				textField_5.getText(),
				textField_1.getText(),
				textField_2.getText(),
				(String) comboBox_2.getSelectedItem(),
				textField_4.getText(),
				textField_3.getText(),
				//ac.getText(),
				tx,
				//radioButton_sleeper.getText();
				textField_6.getText(),



				});

			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirm.setBounds(147, 275, 89, 23);
		panel.add(btnConfirm);
		
		JLabel label = new JLabel("Name");
		label.setBounds(10, 61, 65, 34);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(label);
		
		textField_8 = new JTextField();
		textField_8.setBounds(103, 66, 102, 28);
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 106, 295, 2);
		separator.setBackground(Color.BLACK);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(6, 126, 76, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleText = new JRadioButton("Single Ticket");
		rdbtnSingleText.setBounds(96, 126, 109, 23);
		frame.getContentPane().add(rdbtnSingleText);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(219, 126, 76, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First class");
		rdbtnFirstClass.setBounds(6, 152, 84, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		
		
		
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(249, 152, 60, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 182, 96, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arunachal Pradesh", "Gujarat", "Rajastan", "Kerala", "Tamilnadu", "Karnataka", "Andra pradesh", "Goa"}));
		frame.getContentPane().add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 227, 295, 2);
		separator_1.setBackground(Color.BLACK);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 243, 46, 14);
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblTax);
		
		textField_9 = new JTextField();
		textField_9.setBounds(145, 241, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 284, 65, 14);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblSubTotal);
		
		textField_10 = new JTextField();
		textField_10.setBounds(145, 282, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 326, 46, 14);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblTotal);
		
		textField_11 = new JTextField();
		textField_11.setBounds(145, 323, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		frame.getContentPane().add(comboBox_2);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(121, 182, 84, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Arunachal Pradesh", "Gujarat", "Rajastan", "Kerala", "Tamilnadu", "Karnataka", "Andra pradesh", "Goa"}));
		frame.getContentPane().add(comboBox_1);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				textField_4.setText(tTime.format(timer.getTime()));
				SimpleDateFormat tDate=new SimpleDateFormat("dd:MMM:yyyy");
				textField_3.setText(tDate.format(timer.getTime()));
			    String va=comboBox_2.getSelectedItem().toString();
				double value=Double.parseDouble(va);
				
				double tax;
				double subtotal;
				if(ac.isSelected())
				{
					tax=400;
					textField_9.setText(String.format("%.0f",tax));
				}
				else
				{
					tax=200;
					textField_9.setText(String.format("%.0f",tax));
				}
				if(rdbtnSingleText.isSelected()&&rdbtnSleeper.isSelected()&&ac.isSelected())
				{
					subtotal=3400*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else if(!rdbtnSingleText.isSelected()&&rdbtnSleeper.isSelected()&&ac.isSelected())
				{
					subtotal=4000*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else if(rdbtnSingleText.isSelected()&&rdbtnSleeper.isSelected()&&!ac.isSelected())
				{
					subtotal=3000*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else if(!rdbtnSingleText.isSelected()&&rdbtnSleeper.isSelected()&&!ac.isSelected())
				{
					subtotal=3400*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else if(rdbtnSingleText.isSelected()&&!rdbtnSleeper.isSelected()&&ac.isSelected()) 
				{
					subtotal=3200*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else if(!rdbtnSingleText.isSelected()&&!rdbtnSleeper.isSelected()&&ac.isSelected())
				{
					subtotal=3800*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else if(rdbtnSingleText.isSelected()&&!rdbtnSleeper.isSelected()&&!ac.isSelected())
				{
					subtotal=2800*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				else
				{
					subtotal=3200*value;
					textField_10.setText(String.format("%.0f",subtotal));
				}
				t=Double.parseDouble(textField_9.getText())+Double.parseDouble(textField_10.getText());
				textField_11.setText(String.format("%.2f", t));
				textField.setText(textField_8.getText());
				String k=textField_11.getText();
				textField_6.setText(k);
				String m=(String)comboBox.getSelectedItem();
				textField_1.setText(m);
				String p=(String)comboBox_1.getSelectedItem();
				textField_2.setText(p);
				textField_5.setText(String.format("%.0f", tkt));
				tkt=tkt+1;
				textField_7.setText("Any");
			}
		});
		btnTotal.setBounds(10, 366, 89, 23);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				rdbtnStandard.setSelected(false);
				rdbtnSingleText.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				ac.setSelected(false);
				rdbtnSleeper.setSelected(false);
				rdbtnChild.setSelected(false);
				
				
			}
			
		});
		btnReset.setBounds(116, 366, 89, 23);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(216, 366, 89, 23);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(frame,"confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 351, 295, 5);
		separator_2.setBackground(Color.BLACK);
		frame.getContentPane().add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 410, 669, 79);
		panel_1.setBackground(Color.BLUE);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		//table = new JTable();
		
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking no", "From", "To", "No of Seats", "Time", "Date", "AC/Non AC", "Price"},
				
			},
			new String[] {
				"Name", "Booking no", "From", "To", "No of Seats", "Time", "Date", "AC/Non AC", "Price"
			}
		));
		//table.setBounds(10, 54, 623, -42);
		//panel_1.add(table);
		table_1.setBounds(10, 11, 649, 57);
	    panel_1.add(table_1);
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(221, 11, 238, 39);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(304, 106, 1, 2);
		frame.getContentPane().add(separator_3);
	}
}
