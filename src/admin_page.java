import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.mysql.cj.result.LocalDateTimeValueFactory;
import com.mysql.cj.x.protobuf.MysqlxCursor.Open.OneOfMessage;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.sql.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class admin_page extends JFrame {

	private JPanel contentPane;
	JPanel panel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	String fs,f1,f2;
	Connection con;
	ResultSet rs,rs1;
	Statement  sta;
	PreparedStatement stmt;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	JComboBox comboBox_2;
	 JComboBox comboBox_1;
	 JLabel lblNewLabel_9;
	 JLabel lblNewLabel_10;
	 private JTextField textField_14;
	 private JTextField textField_15;
	 long amount,sum;
	 long tot,sum1;
	 int ac;
	 private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_page frame = new admin_page();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */	
	
	
	public admin_page() {
		
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.RED);
		tabbedPane.setBounds(10, 29, 986, 493);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Employee Section", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane_1.setBackground(Color.WHITE);
		tabbedPane_1.setBounds(0, 0, 971, 476);
		panel.add(tabbedPane_1);
		 
		 JPanel panel_4 = new JPanel();
		 panel_4.setBackground(new Color(216, 191, 216));
		 panel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 tabbedPane_1.addTab("New employee", null, panel_4, null);
		 panel_4.setLayout(null);
		 
		 JLabel lblNewLabel = new JLabel("Full Name :");
		 lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel.setBounds(10, 26, 88, 20);
		 panel_4.add(lblNewLabel);
		 
		 JLabel lblNewLabel_1 = new JLabel("Gender :");
		 lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_1.setBounds(10, 84, 69, 20);
		 panel_4.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_2 = new JLabel("Post :");
		 lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_2.setToolTipText("Post");
		 lblNewLabel_2.setBounds(10, 150, 69, 20);
		 panel_4.add(lblNewLabel_2);
		 
		 JLabel lblNewLabel_3 = new JLabel("Salary :");
		 lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_3.setBounds(10, 205, 62, 20);
		 panel_4.add(lblNewLabel_3);
		 
		 JLabel lblNewLabel_4 = new JLabel("Mobile Number :");
		 lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_4.setBounds(10, 269, 126, 20);
		 panel_4.add(lblNewLabel_4);
		 
		 JLabel lblNewLabel_5 = new JLabel("Email :");
		 lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_5.setBounds(10, 323, 69, 20);
		 panel_4.add(lblNewLabel_5);
		 
		 JLabel lblNewLabel_6 = new JLabel("Address :");
		 lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_6.setBounds(10, 384, 69, 20);
		 panel_4.add(lblNewLabel_6);
		 
		 JLabel lblNewLabel_7 = new JLabel("UserName :");
		 lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_7.setBounds(353, 26, 100, 20);
		 panel_4.add(lblNewLabel_7);
		 
		 textField = new JTextField();
		 textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 textField.setToolTipText("Enter Your Full Name");
		 textField.setBounds(110, 26, 176, 20);
		 panel_4.add(textField);
		 textField.setColumns(10);
		 
		 JComboBox comboBox = new JComboBox();
		 comboBox.setToolTipText("Please Select Gender");
		 comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 comboBox.setModel(new DefaultComboBoxModel(new String[] {"<-select Gender->", "Male", "Female", "Other"}));
		 comboBox.setBounds(110, 86, 164, 21);
		 panel_4.add(comboBox);
		 
		  comboBox_1 = new JComboBox();
		  comboBox_1.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		if(comboBox_1.getSelectedIndex()==3)
				{
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
					textField_3.enable(false);	
					passwordField.enable(false);
					passwordField_1.enable(false);
				}		 		
		 		
		 	
		 		else if(comboBox_1.getSelectedIndex()==4)
				{
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
					textField_3.enable(false);	
					passwordField.enable(false);
					passwordField_1.enable(false);
				}		 		
		 		
		 		else if(comboBox_1.getSelectedIndex()==5)
				{
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
					textField_3.enable(false);	
					passwordField.enable(false);
					passwordField_1.enable(false);
				}		
		 		
		 		else {
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
		 			textField_3.enable(true);	
					passwordField.enable(true);
					passwordField_1.enable(true);

				}
		  	}
		  });
		 comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<-select post->", "Cashier", "Assistant Cashier", "Cleark", "Peon", "Security Guard"}));
		 comboBox_1.setBounds(110, 152, 164, 21);
		 panel_4.add(comboBox_1);	 
		 textField_1 = new JTextField();
		
		
		 textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 textField_1.setToolTipText("Enter Mobile Number");
		 textField_1.setBounds(132, 269, 154, 20);
		 panel_4.add(textField_1);
		 textField_1.setColumns(10);
		 
		 textField_2 = new JTextField();
		 textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 textField_2.setToolTipText("Enter Email Id");
		 textField_2.setBounds(132, 323, 154, 19);
		 panel_4.add(textField_2);
		 textField_2.setColumns(10);
		 
		 JTextArea textArea = new JTextArea();
		 textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		 textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		 textArea.setBounds(132, 369, 164, 66);
		 panel_4.add(textArea);
		 
		 textField_3 = new JTextField();
		 textField_3.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		
		 		if(comboBox_1.getSelectedIndex()==3)
				{
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
					textField_3.enable(false);	
					passwordField.enable(false);
					passwordField_1.enable(false);
				}		 		
		 		
		 	
		 		else if(comboBox_1.getSelectedIndex()==4)
				{
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
					textField_3.enable(false);	
					passwordField.enable(false);
					passwordField_1.enable(false);
				}		 		
		 		
		 		else if(comboBox_1.getSelectedIndex()==5)
				{
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
					textField_3.enable(false);	
					passwordField.enable(false);
					passwordField_1.enable(false);
				}		
		 		
		 		else {
		 			
		 			textField_3.setText("");
		 			passwordField.setText("");
		 			passwordField_1.setText("");
		 			textField_3.enable(true);	
					passwordField.enable(true);
					passwordField_1.enable(true);

				}
		 		
		 		
		 	}
		 });
		 textField_3.setToolTipText("Please Enter username");
		 textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 textField_3.setBounds(473, 29, 147, 20);
		 panel_4.add(textField_3);
		 textField_3.setColumns(10);
		 
		 JLabel lblNewLabel_8 = new JLabel("Password :");
		 lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_8.setBounds(353, 84, 88, 20);
		 panel_4.add(lblNewLabel_8);
		 
		 JButton btnNewButton = new JButton("Create Account");
		 
		
		 btnNewButton.addActionListener(new ActionListener() {
		 	@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
		 		
		 		if(textField.getText().isBlank())
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please enter name !","Warning",JOptionPane.WARNING_MESSAGE);
		 			textField.requestFocusInWindow();
		 			return;
		 		}
		 		
		 		if(comboBox.getSelectedIndex()==0)
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please select gender !","Warning",JOptionPane.WARNING_MESSAGE);
		 			comboBox.requestFocusInWindow();
		 			return;
		 		}
		 		
		 		if(comboBox_1.getSelectedIndex()==0)
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please select Post !","Warning",JOptionPane.WARNING_MESSAGE);
		 			comboBox_1.requestFocusInWindow();
		 			return;
		 		}
		 		
		 		if(textField_1.getText().isBlank())
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please enter salary !","Warning",JOptionPane.WARNING_MESSAGE);
		 			textField_1.requestFocusInWindow();
		 			return;
		 		}
		 	
		 		if(textField_5.getText().isBlank())
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please enter mobile Number !","Warning",JOptionPane.WARNING_MESSAGE);
		 			textField_5.requestFocusInWindow();
		 			return;
		 		}
		 		
		 		
		 		if(textField_2.getText().isBlank())
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please enter email id !","Warning",JOptionPane.WARNING_MESSAGE);
		 			textField_2.requestFocusInWindow();
		 			return;
		 		}
		 		
		 		if(textArea.getText().isBlank())
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please enter address !","Warning",JOptionPane.WARNING_MESSAGE);
		 			textArea.requestFocusInWindow();
		 			return;
		 		}
		 		
		 		if(textField_15.getText().isBlank())
		 		{
		 			JOptionPane.showInternalMessageDialog(null,"Please enter acount number !","Warning",JOptionPane.WARNING_MESSAGE);
		 			textField_15.requestFocusInWindow();
		 			return;
		 		}
		 	
		 		
		 
		 		
			if(comboBox_1.getSelectedIndex()==1||comboBox_1.getSelectedIndex()==2)
		 		{
		 			if(textField_3.getText().isBlank())
		 			{
		 				JOptionPane.showMessageDialog(null,"please Enter the username !","Warning",JOptionPane.WARNING_MESSAGE);
		 				return;
		 			}
		 			
		 			if(passwordField.getText().isBlank())
			 		{
			 			JOptionPane.showInternalMessageDialog(null,"Please enter password !","Warning",JOptionPane.WARNING_MESSAGE);
			 			passwordField.requestFocusInWindow();
			 			return;
			 		}
		 		}
		 		
		 	
		 		
		 		if(passwordField.getText().trim().equals( passwordField_1.getText().toString()))
		 		{
		 			
		 			try {
		 				
		 				con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
		 				stmt=con.prepareStatement("insert into emp_details (emp_username,emp_password,emp_name,emp_gender,emp_post,emp_mobile,emp_salary,emp_acnumber,emp_mail,address,photo,adhar_photo,join_date) values( ?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 				
		 				stmt.setString(1,textField_3.getText().trim());
		 				stmt.setString(2, passwordField_1.getText());
		 				stmt.setString(3,textField.getText().trim());
		 				stmt.setString(4, comboBox.getSelectedItem().toString());
		 				stmt.setString(5, comboBox_1.getSelectedItem().toString());
		 				stmt.setString(6,textField_1.getText().trim());
		 				stmt.setLong(7,Long.parseLong(textField_5.getText().trim()));
		 				stmt.setLong(8, Long.parseLong(textField_15.getText().trim()));
		 				stmt.setString(9, textField_2.getText().trim());
		 				stmt.setString(10, textArea.getText().trim());
		 			   FileInputStream fin=new FileInputStream(new File(fs)); 
						stmt.setBinaryStream(11,fin,fin.available()); 
		 				
						   FileInputStream fin1=new FileInputStream(new File(f1)); 
							stmt.setBinaryStream(12,fin1,fin1.available()); 
		 				LocalDateTime dTim =LocalDateTime.now();
		 				stmt.setString(13,dTim.toString());
		 				
		 				 sta=con.createStatement();   
		 				 rs=sta.executeQuery("select * from cus_details where ac_number="+Long.parseLong(textField_15.getText().trim())+"");
		 				if(rs.next())
		 				{
		 					
		 				}
		 				
		 				else {
		 					JOptionPane.showInternalMessageDialog(null,"Account number not found !","Warning",JOptionPane.WARNING_MESSAGE);
				 			textField_15.requestFocusInWindow();
				 			return;
							
						}
		 				
		 				
		 				int xx=stmt.executeUpdate();
		 				if(xx>=1)
		 				{
		 					JOptionPane.showMessageDialog(null,"New Emloyee Added !","Information",JOptionPane.INFORMATION_MESSAGE);
		 					textField.setText("");
		 					textField_1.setText("");
		 					textField_2.setText("");
		 					textField_3.setText("");
		 					textField_5.setText("");
		 					passwordField.setText("");
		 					passwordField_1.setText("");
		 					textArea.setText("");
		 					lblNewLabel_9.setText("");
		 					lblNewLabel_10.setText("");
		 					textField_15.setText("");
		 					lblNewLabel_10.setIcon(null);	
		 					lblNewLabel_9.setIcon(null);	
		 				
		 				}
		 				
		 				
		 				con.close();
		 				
						
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showInternalMessageDialog(null,"Something went wrong !","Error",JOptionPane.WARNING_MESSAGE);
						 e2.printStackTrace();		
					}		 			
		 			
		 		}
		 		
		 		else {
		 			JOptionPane.showInternalMessageDialog(null,"inconnect password !","Warning",JOptionPane.WARNING_MESSAGE);
		 			passwordField_1.requestFocusInWindow();
		 			return;
				}
		 			
		 				 		
		 	}
		 });
		 btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		 btnNewButton.setToolTipText("Clicl Button");
		 btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		 btnNewButton.setBounds(385, 375, 176, 38);
		 panel_4.add(btnNewButton);
		 
		 textField_5 = new JTextField();
		
		
		 textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 textField_5.setBounds(132, 208, 154, 19);
		 panel_4.add(textField_5);
		 textField_5.setColumns(10);
		 
		  lblNewLabel_9 = new JLabel("");
		 lblNewLabel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 lblNewLabel_9.setBounds(731, 10, 176, 141);
		 panel_4.add(lblNewLabel_9);
		 
		  lblNewLabel_10 = new JLabel("");
		 lblNewLabel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 lblNewLabel_10.setBounds(737, 245, 170, 133);
		 panel_4.add(lblNewLabel_10);
		 
		 JLabel lblNewLabel_11 = new JLabel("Photo");
		 lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_11.setBounds(624, 297, 69, 30);
		 panel_4.add(lblNewLabel_11);
		 
		 JButton btnNewButton_1 = new JButton("Browse");
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		JFileChooser chooser=new JFileChooser() ;
				chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter =new FileNameExtensionFilter("*.IMAGE", "jpg","jepg","png");
				chooser.addChoosableFileFilter(filter);
				chooser.showOpenDialog(null);
				File file= chooser.getSelectedFile();
			String filename=file.getAbsolutePath();
		
				fs=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_10.getWidth(),lblNewLabel_10.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_10.setIcon(ic);		 		
		 	}
		 });
		 btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 btnNewButton_1.setBounds(763, 399, 109, 21);
		 panel_4.add(btnNewButton_1);
		 
		 JLabel lblNewLabel_12 = new JLabel("Adhar card");
		 lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_12.setBounds(763, 167, 109, 19);
		 panel_4.add(lblNewLabel_12);
		 
		 JButton btnNewButton_2 = new JButton("Browse");
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		
		 		JFileChooser chooser=new JFileChooser() ;
				chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter =new FileNameExtensionFilter("*.IMAGE", "jpg","jepg","png");
				chooser.addChoosableFileFilter(filter);
				chooser.showOpenDialog(null);
				File file= chooser.getSelectedFile();
			String filename=file.getAbsolutePath();
			//	pass.setText(filename);
			//	image .getAbsoulatePath=null;
				f1=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_9.getWidth(),lblNewLabel_9.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_9.setIcon(ic);
				
		 		
		 		
		 		
		 		
		 	}
		 });
		 btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 btnNewButton_2.setBounds(773, 204, 99, 21);
		 panel_4.add(btnNewButton_2);
		 
		 JLabel lblNewLabel_13 = new JLabel("Conform Password");
		 lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_13.setBounds(296, 150, 147, 20);
		 panel_4.add(lblNewLabel_13);
		 
		 passwordField = new JPasswordField();
		 passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 passwordField.setBounds(473, 87, 147, 19);
		 panel_4.add(passwordField);
		 
		 passwordField_1 = new JPasswordField();
		 passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 passwordField_1.setBounds(473, 153, 147, 19);
		 panel_4.add(passwordField_1);
		 
		 JLabel lblNewLabel_28 = new JLabel("Account Number :");
		 lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 lblNewLabel_28.setBounds(319, 208, 134, 21);
		 panel_4.add(lblNewLabel_28);
		 
		 textField_15 = new JTextField();
		 textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 textField_15.setBounds(473, 208, 147, 19);
		 panel_4.add(textField_15);
		 textField_15.setColumns(10);
		
		 panel_2 = new JPanel();
		 panel_2.setBackground(new Color(60, 179, 113));
		 panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 tabbedPane_1.addTab("Employee list", null, panel_2, null);
		 panel_2.setLayout(null);
		 
		 JButton btnNewButton_3 = new JButton("Show List");
		 btnNewButton_3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		DefaultTableModel dt1 =(DefaultTableModel)table.getModel();
				while (dt1.getRowCount()>0)
				{
		           dt1.removeRow(0);
					
				} 				
		 		
		 	try {
		 		con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
		 		 sta=con.createStatement();   															
		 	rs=	sta.executeQuery("select emp_id,emp_username,emp_name,emp_gender,emp_post,emp_mobile,emp_salary,emp_mail,address,join_date from emp_details");
		 		while (rs.next()) {
		 			
		 		String idn= String.valueOf(rs.getLong(1));
		 		String userpname = rs.getString(2);
		 		String  name=rs.getString(3);
		 		String gender= rs.getString(4);
		 		String post= rs.getString(5);
		 		String mobile=rs.getString(6);
		 		String salary = String.valueOf(rs.getLong(7));
		 		String mail= rs.getString(8);
		 		String address= rs.getString(9);
		 		String date= rs.getString(10);
		 		String data[]= {idn,userpname , name, gender,post,mobile,salary ,mail,address,date};
				DefaultTableModel dt3 =(DefaultTableModel)table.getModel();
				dt3.addRow(data);
		 		
				}
		 		
		 	con.close();	
			}
		 	
		 	catch (Exception e2) {
			
		 		 e2.printStackTrace();
				 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
				
				
			}		 				 				 		
		 	}
		 });
		 btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		 btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		 btnNewButton_3.setBounds(324, 397, 115, 24);
		 panel_2.add(btnNewButton_3);
		 
		 JButton btnNewButton_4 = new JButton("Clear List");
		 btnNewButton_4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		DefaultTableModel dt1 =(DefaultTableModel)table.getModel();
				while (dt1.getRowCount()>0)
				{
		           dt1.removeRow(0);
					
				} 
				
		 		
		 		
		 		
		 		
		 	}	 	
		 });
		 btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		 btnNewButton_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		 btnNewButton_4.setBounds(472, 397, 115, 24);
		 panel_2.add(btnNewButton_4);
		 
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setBounds(31, 32, 909, 334);
		 panel_2.add(scrollPane);
		 
		 table = new JTable();
		 scrollPane.setViewportView(table);
		 table.setModel(new DefaultTableModel(
		 	new Object[][] {
		 	},
		 	new String[] {
		 		"Id", "username", "Name", "Gender", "Post", "Mobile Number", "Salary", "Mail Id", "Address", "Join Date"
		 	}
		 ) {
		 	boolean[] columnEditables = new boolean[] {
		 		false, false, false, false, false, false, false, false, false, false
		 	};
		 	public boolean isCellEditable(int row, int column) {
		 		return columnEditables[column];
		 	}
		 });
		 table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane_1.addTab("make salary", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Make Salary");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_12.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please Enter account number !","warning",JOptionPane.WARNING_MESSAGE);
					textField_12.requestFocusInWindow();
					return;
				}
				
				if(textField_13.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please Enter Salary !","warning",JOptionPane.WARNING_MESSAGE);
					textField_13.requestFocusInWindow();
					return;
				}
				
				try {
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
					 sta=con.createStatement();   															
					
	 				 rs=sta.executeQuery("select * from emp_details where emp_acnumber="+Long.parseLong(textField_12.getText().trim())+"");
	 				if(rs.next())
	 				{
	 					
	 					 rs=sta.executeQuery("select total_amount from transcation where ac_number="+Long.parseLong(textField_12.getText().trim())+"");
	 	 				 
	 					while (rs.next()) {
							
							 amount=rs.getLong(1);
							 
						}
	 					
	 					sum=amount+Long.parseLong(textField_13.getText().trim());
	 					
	 					stmt=con.prepareStatement("insert into transcation (ac_number,credit_amount,credit_date,total_amount) values(?,?,?,?)");
	 					
	 					stmt.setInt(1, Integer.parseInt(textField_12.getText().trim()));
	 					stmt.setFloat(2, Float.parseFloat(textField_13.getText().trim()));
	 					LocalDateTime dTime=LocalDateTime.now();
	 					stmt.setString(3, dTime.toString());
	 					stmt.setLong(4, sum);
	 					
	 					int xx=stmt.executeUpdate();
	 					if(xx>=1)
	 					{
	 						JOptionPane.showInternalMessageDialog(null,"Payment sucessfull !","information",JOptionPane.INFORMATION_MESSAGE);
	 						textField_12.setText("");
	 						textField_13.setText("");
				 			
	 					}
	 					con.close();
	 				}
	 				
	 				
	 				else {
	 					JOptionPane.showInternalMessageDialog(null,"Account number not found !","Warning",JOptionPane.WARNING_MESSAGE);
			 			textField_12.requestFocusInWindow();
			 			return;
	 				}
											
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					 
				}
					
			}
		});
		btnNewButton_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_5.setBounds(567, 353, 162, 31);
		panel_3.add(btnNewButton_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBounds(40, 65, 332, 264);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Select Employee :");
		lblNewLabel_14.setBounds(10, 26, 128, 23);
		panel_6.add(lblNewLabel_14);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		 comboBox_2 = new JComboBox();
	
		comboBox_2.setBounds(148, 28, 162, 21);
		panel_6.add(comboBox_2);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<-Select Post->", "Cashier", "Assistant Cashier", "Cleark", "Peon", "Security Guard"}));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				DefaultTableModel dt1 =(DefaultTableModel)table_1.getModel();
				while (dt1.getRowCount()>0)
				{
		           dt1.removeRow(0);
					
				} 
		 		
		 		try {
		 			con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
		 			sta=con.createStatement();
		 			rs=sta.executeQuery("select emp_id,emp_salary,emp_acnumber from emp_details where emp_post='"+comboBox_2.getSelectedItem().toString()+"'");
		 			if(rs.next())
		 			{
		 				
		 			}
		 			
		 			else {
						
		 				 JOptionPane.showMessageDialog(null,"employee not found !","warning",JOptionPane.WARNING_MESSAGE);	
		 				 return;
					}
		 			while (rs.next()) {
						String id= String.valueOf(  rs.getInt(1));
						String salary= String.valueOf(rs.getInt(2));
						String ac= String.valueOf(rs.getInt(3));
					
						 String data[]= { id,salary,ac};
							DefaultTableModel dt =(DefaultTableModel)table_1.getModel();
							dt.addRow(data);
						
					}
		 			
		 			con.close();
		 			
		 			
				} catch (Exception e2) {
		
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);				 
				
				}
				
				
				
			}
		});
		scrollPane_1.setBounds(10, 69, 300, 185);
		panel_6.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Employee Id", "Salary", "Account Number"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JLabel lblNewLabel_23 = new JLabel("By Post");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_23.setBounds(54, 32, 69, 22);
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Employee Id");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_24.setBounds(445, 32, 105, 22);
		panel_3.add(lblNewLabel_24);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBounds(455, 65, 383, 264);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_25 = new JLabel("Employee Account Number :");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_25.setBounds(10, 28, 212, 28);
		panel_8.add(lblNewLabel_25);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setBounds(129, 75, 178, 28);
		panel_8.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Enter Salary :");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_26.setBounds(20, 137, 99, 28);
		panel_8.add(lblNewLabel_26);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setBounds(129, 141, 178, 26);
		panel_8.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(238, 130, 238));
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane_1.addTab("update  Information", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(154, 205, 50)));
		panel_5.setBounds(187, 26, 543, 377);
		panel_7.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Full Name :");
		lblNewLabel_16.setBounds(31, 52, 87, 33);
		panel_5.add(lblNewLabel_16);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_6 = new JTextField();
		textField_6.setBounds(169, 58, 189, 19);
		panel_5.add(textField_6);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(169, 94, 189, 19);
		panel_5.add(textField_7);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Gender :");
		lblNewLabel_17.setBounds(50, 94, 68, 20);
		panel_5.add(lblNewLabel_17);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_18 = new JLabel("Post :");
		lblNewLabel_18.setBounds(50, 139, 68, 20);
		panel_5.add(lblNewLabel_18);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_8 = new JTextField();
		textField_8.setBounds(169, 140, 189, 19);
		panel_5.add(textField_8);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Salary :");
		lblNewLabel_19.setBounds(50, 182, 62, 20);
		panel_5.add(lblNewLabel_19);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setBounds(169, 185, 189, 19);
		panel_5.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(169, 229, 189, 19);
		panel_5.add(textField_10);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Mobile Number :");
		lblNewLabel_20.setBounds(8, 229, 126, 20);
		panel_5.add(lblNewLabel_20);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_11 = new JTextField();
		textField_11.setBounds(169, 269, 189, 19);
		panel_5.add(textField_11);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Email Id :");
		lblNewLabel_21.setBounds(31, 269, 82, 20);
		panel_5.add(lblNewLabel_21);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea_1.setBounds(169, 318, 189, 49);
		panel_5.add(textArea_1);
		
		JLabel lblNewLabel_22 = new JLabel("Address :");
		lblNewLabel_22.setBounds(38, 328, 80, 20);
		panel_5.add(lblNewLabel_22);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_27 = new JLabel("Enter employee id:");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_27.setBounds(8, 10, 145, 24);
		panel_5.add(lblNewLabel_27);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setBounds(169, 15, 189, 19);
		panel_5.add(textField_14);
		textField_14.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Show");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(textField_14.getText().isBlank())
			{
				JOptionPane.showMessageDialog(null,"Please Enter Employee Id !","Warning",JOptionPane.WARNING_MESSAGE);
				textField_14.requestFocusInWindow();
				return;
			}
				
				
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
			 sta=con.createStatement();   															
			 	rs=	sta.executeQuery("select emp_name,emp_gender,emp_post,emp_mobile,emp_salary,emp_mail,address from emp_details where emp_id="+Long.parseLong(textField_14.getText().trim())+"");
			 	
			 	while (rs.next()) 
			 		{
			 			
			 			textField_6.setText(rs.getString(1));
			 			textField_7.setText(rs.getString(2));
			 			textField_8.setText(rs.getString(3));
			 			textField_10.setText(rs.getString(4));
			 			textField_9.setText(rs.getString(5));
			 			textField_11.setText(rs.getString(6));
			 			textArea_1.setText(rs.getString(7));
			 		}
			 			con.close();
			
		} catch (Exception e2) {
			// TODO: handle exception

	 		 e2.printStackTrace();
			 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
			 
		}
				
			} 		
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_6.setBounds(785, 142, 118, 42);
		panel_7.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Update");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_14.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please Enter Employee Id !","Warning",JOptionPane.WARNING_MESSAGE);
					textField_14.requestFocusInWindow();
					return;
				}
				
				try {
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
					stmt=con.prepareStatement("update emp_details set emp_name=?,emp_gender=?,emp_post=?,emp_mobile=?,emp_salary=?,emp_mail=?,address=? where emp_id=?");
				
					stmt.setString(1, textField_6.getText().trim());
					stmt.setString(2,textField_7.getText().trim());
					stmt.setString(3, textField_8.getText().trim());
					stmt.setString(4, textField_10.getText().trim());
					stmt.setLong(5,Long.parseLong(textField_9.getText().trim()));
					stmt.setString(6, textField_11.getText().trim());
					stmt.setString(7,textArea_1.getText().trim());
					stmt.setLong(8,Long.parseLong(textField_14.getText().trim()));
			     	int xxx=	stmt.executeUpdate();
			     	con.close();
			     	if(xxx>=1)
			     	{
			     		JOptionPane.showMessageDialog(null,"Information Updated !","Information",JOptionPane.INFORMATION_MESSAGE);
			     		 textField_6.setText("");		
			     		textField_7.setText("");
			     		 textField_10.setText("");
			     		textField_9.setText("");
			     		textField_11.setText("");
			     		textArea_1.setText("");
			     		textField_14.setText("");
			     		textField_14.setText("");
			     		textField_8.setText("");
			     	}
			     		     	
			     	else {
			     		JOptionPane.showMessageDialog(null,"Please enter corret id !","Warning",JOptionPane.WARNING_MESSAGE);
			     		textField_14.requestFocusInWindow();
			     		return;
					}
				} 
				
				catch (Exception e2) {
					// TODO: handle exception

			 		 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					 
				}
				
				
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_7.setBounds(789, 214, 114, 42);
		panel_7.add(btnNewButton_7);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Customer Section", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 971, 478);
		tabbedPane_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(tabbedPane_2);
		
		
	}
}
