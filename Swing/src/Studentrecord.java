import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Studentrecord {

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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;
	Double t,avg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentrecord window = new Studentrecord();
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
	public Studentrecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(10, 11, 421, 302);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentid.setBounds(10, 26, 93, 30);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(85, 31, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstname.setBounds(10, 67, 63, 26);
		panel.add(lblFirstname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 70, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurname.setBounds(10, 104, 63, 27);
		panel.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 107, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourseCode.setBounds(10, 142, 93, 24);
		panel.add(lblCourseCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"10101", "10102", "10103", "10104", "10105", "10106"}));
		comboBox.setBounds(85, 144, 86, 20);
		panel.add(comboBox);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalScore.setBounds(10, 203, 75, 14);
		panel.add(lblTotalScore);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 200, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(10, 242, 63, 14);
		panel.add(lblAverage);
		
		textField_4 = new JTextField();
		textField_4.setBounds(85, 239, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRanking.setBounds(10, 277, 63, 14);
		panel.add(lblRanking);
		
		textField_5 = new JTextField();
		textField_5.setBounds(85, 274, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaths.setBounds(199, 34, 46, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnglish.setBounds(199, 73, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBiology.setBounds(199, 110, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComputer.setBounds(199, 142, 63, 19);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChemistry.setBounds(199, 172, 63, 28);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhysics.setBounds(199, 211, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamil.setBounds(199, 246, 46, 14);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMalayalam.setBounds(199, 277, 63, 14);
		panel.add(lblMalayalam);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 177, 160, 2);
		panel.add(separator);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
					
				
			}
		});
		textField_6.setBounds(270, 31, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_7.setBounds(270, 67, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_8.setBounds(270, 104, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_9.setBounds(270, 141, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_10.setBounds(272, 274, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_11.setBounds(270, 243, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_12.setBounds(270, 212, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
					||
					(num==KeyEvent.VK_BACK_SPACE)
					||(num==KeyEvent.VK_DELETE)){
			evt.consume();
		}
			}
		});
		textField_13.setBounds(270, 177, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(186, 85, 211));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(441, 21, 533, 326);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 24, 513, 254);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(null);
			}
		});
		btnClear.setBounds(227, 289, 89, 23);
		panel_1.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 385, 964, 101);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
				{"Student ID", "Course name", "Maths", "English", "Biology", "Computer","Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
				
			},
			new String[] {
				"Student ID", "Course name", "Maths", "English", "Biology", "Computer","Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"
			}
		));
		table.setBounds(10, 11, 944, 89);
		panel_2.add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t=Double.parseDouble(textField_6.getText())+Double.parseDouble(textField_7.getText())+Double.parseDouble(textField_8.getText())+Double.parseDouble(textField_9.getText())+Double.parseDouble(textField_10.getText())+Double.parseDouble(textField_11.getText())+Double.parseDouble(textField_12.getText())+Double.parseDouble(textField_13.getText());
				textField_3.setText(String.format("%.2f", t));
				avg=t/8;
				textField_4.setText(String.format("%.2f",avg));
				if(avg>=90)
				{
					textField_5.setText("1");	
				}
				else if(avg>=70&&avg<=89)
				{
					textField_5.setText("2");
				}
				else if(avg>=60&&avg<=79)
				{
					textField_5.setText("3");
				}
				else if(avg>=50&&avg<=69)
				{
					textField_5.setText("4");
				}
				else
				{
					textField_5.setText("Fail");
				}
				
			DefaultTableModel model=(DefaultTableModel) table.getModel();
			model.addRow(new String[]
					{
			textField.getText(),
			(String) comboBox.getSelectedItem(),
			textField_6.getText(),
			textField_7.getText(),
			textField_8.getText(),
			textField_9.getText(),
			textField_13.getText(),
            textField_12.getText(),
			textField_11.getText(),
			textField_10.getText(),
			textField_3.getText(),
			textField_4.getText(),
			textField_5.getText(),
			
					
		});
	}
		});
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setForeground(new Color(0, 255, 0));
		btnAddReport.setBounds(176, 528, 103, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton button = new JButton("Delete");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				//model.removeRow(row);
				try
				{
					int rownum=table.getSelectedRow();
					model.removeRow(rownum);
				}
				catch(Exception msg)
				{
					JOptionPane.showMessageDialog(null,"Please Show the Particular row");
				}
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(297, 528, 103, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Show Report");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			textArea.append("Student Record\n"
					+"Student name:\t\t"+textField.getText()+" "+textField_1.getText()+"\n"
					+"====================================\n"
					+"Maths:\t\t"+textField_6.getText()+"\n"
					+"English:\t\t"+textField_7.getText()+"\n"
					+"Biology:\t\t"+textField_8.getText()+"\n"
					+"Computer:\t\t"+textField_9.getText()+"\n"
					+"Chemistry:\t\t"+textField_10.getText()+"\n"
					+"Physics:\t\t"+textField_11.getText()+"\n"
					+"Tamil:\t\t"+textField_12.getText()+"\n"
					+"Malayalam:\t\t"+textField_13.getText()+"\n"
					
					);	
			
			
			textArea.append("====================================\n"
			+"Total Score:\t\t"+textField_3.getText()+"\n"
			+"Average:\t\t"+textField_4.getText()+"\n"
			+"Ranking:\t\t"+textField_5.getText()+"\n"
			);
			}
		});
		button_1.setForeground(new Color(128, 0, 128));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(418, 528, 107, 23);
		frame.getContentPane().add(button_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(JOptionPane.showConfirmDialog(frame,"confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
			{
				System.exit(0);
			}
			}
		});
		btnNewButton.setBounds(549, 528, 75, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_3 = new JButton("Reset");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_13.setText(null);
	            textField_12.setText(null);
				textField_11.setText(null);
				textField_10.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textArea.setText(null);
				
			}
		});
		button_3.setForeground(new Color(106, 90, 205));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBounds(646, 528, 75, 23);
		frame.getContentPane().add(button_3);
	}
}
