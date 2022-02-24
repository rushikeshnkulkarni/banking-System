import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class new_admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	JComboBox comboBox ;
	JTextArea textArea;
	Connection con;
	String fs,fs1;
	JLabel lblNewLabel_12 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_admin frame = new new_admin();
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
	public new_admin() {
		setTitle("New admin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 971, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBackground(new Color(245, 255, 250));
		lblNewLabel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_10.setBounds(492, 252, 126, 134);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_11.setBounds(711, 252, 131, 134);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 40, 60, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 97, 71, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile Number :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 150, 126, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Salary :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 207, 93, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Account Number :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 266, 137, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mail :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(10, 337, 65, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 398, 100, 38);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Username :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(483, 40, 93, 20);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Password :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(492, 99, 93, 20);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Conform Password :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(427, 162, 158, 20);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Upload photo");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(486, 415, 132, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Upload adhar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser=new JFileChooser() ;
				chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter =new FileNameExtensionFilter("*.IMAGE", "jpg","jepg","png");
				chooser.addChoosableFileFilter(filter);
				chooser.showOpenDialog(null);
				File file= chooser.getSelectedFile();
			String filename=file.getAbsolutePath();
		
				fs1=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_11.getWidth(),lblNewLabel_11.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_11.setIcon(ic);			
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(711, 415, 131, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter name !","warning",JOptionPane.WARNING_MESSAGE);
					textField.requestFocusInWindow();
					return;
				}
				
				if(comboBox.getSelectedIndex()==0)
				{
					JOptionPane.showMessageDialog(null, "please select gender !","warning",JOptionPane.WARNING_MESSAGE);
					comboBox.requestFocusInWindow();
					return;
				}
				
				if(textField_1.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter mobile number !","warning",JOptionPane.WARNING_MESSAGE);
					textField_1.requestFocusInWindow();
					return;
				}
											
				if(textField_2.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter salary !","warning",JOptionPane.WARNING_MESSAGE);
					textField_2.requestFocusInWindow();
					return;
				}
				
				if(textField_3.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter account number !","warning",JOptionPane.WARNING_MESSAGE);
					textField_3.requestFocusInWindow();
					return;
				}
				if(textField_4.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter mail id !","warning",JOptionPane.WARNING_MESSAGE);
					textField_4.requestFocusInWindow();
					return;
				}
				if(textArea.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter Address !","warning",JOptionPane.WARNING_MESSAGE);
					textArea.requestFocusInWindow();
					return;
				}
				
				if(textField_5.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter username !","warning",JOptionPane.WARNING_MESSAGE);
					textField_5.requestFocusInWindow();
					return;
				}
				
				if(passwordField.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter password !","warning",JOptionPane.WARNING_MESSAGE);
					passwordField.requestFocusInWindow();
					return;
				}
				if(passwordField_1.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter password !","warning",JOptionPane.WARNING_MESSAGE);
					passwordField_1.requestFocusInWindow();
					return;
				}
				
				if(passwordField.getText().trim().equals(passwordField_1.getText().trim()))
				{
					
					try {
						con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
					PreparedStatement stmt=con.prepareStatement("insert into admin_details (admin_username,admin_password,admin_name,admin_gender,admin_mobile,admin_salary,admin_acnumber,admin_mail,	admin_address,	photo,	adhar_photo,join_date,	joined_by) values(?,md5(?),?,?,?,?,?,?,?,?,?,?,?)");
						
						stmt.setString(1, textField_5.getText().trim());
						stmt.setString(2, passwordField_1.getText().trim());
						stmt.setString(3, textField.getText().trim());
						stmt.setString(4, comboBox.getSelectedItem().toString());
						stmt.setString(5, textField_1.getText().trim());
						stmt.setLong(6,Long.parseLong(textField_2.getText().trim()));
						stmt.setLong(7, Long.parseLong(textField_3.getText().trim()));
						stmt.setString(8,textField_4.getText().trim() );
						stmt.setString(9,textArea.getText().trim());
						   
				   	   FileInputStream fin=new FileInputStream(new File(fs)); 
			    		stmt.setBinaryStream(10,fin,fin.available()); 
						   
					  FileInputStream fin1=new FileInputStream(new File(fs1)); 
					  stmt.setBinaryStream(11,fin1,fin1.available());
					  
					  LocalDate dt=LocalDate.now();
					  stmt.setString(12, dt.toString());
					  
					  admin_page ad= new admin_page();
				
					  stmt.setString(13, ad.lblNewLabel_29.getText() );
					  
					int xx=  stmt.executeUpdate();
					  if(xx>=1)
					  {
						  JOptionPane.showMessageDialog(null, "New Admin Added!","Information",JOptionPane.INFORMATION_MESSAGE);
						  textArea.setText("");
						  textField.setText("");
						  textField_1.setText("");
						  textField_2.setText("");
						  textField_3.setText("");
						  textField_4.setText("");
						  textField_5.setText("");
						  passwordField.setText("");
						 passwordField_1.setText("");
						 lblNewLabel_10.setIcon(null);
						 lblNewLabel_11.setIcon(null);
					  }
					} 
					
					catch (Exception e2) {
						
						e2.printStackTrace();
			        	JOptionPane.showMessageDialog(null, "something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(354, 494, 151, 48);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(164, 35, 186, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<- select gender ->", "Male", "Female", "Other"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(168, 87, 182, 37);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(164, 151, 186, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(164, 208, 186, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBounds(164, 267, 186, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(164, 326, 186, 31);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		 textArea = new JTextArea();
		textArea.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textArea.setBounds(164, 388, 186, 85);
		contentPane.add(textArea);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setBounds(651, 35, 191, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(651, 94, 191, 31);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField_1.setBounds(651, 163, 191, 31);
		contentPane.add(passwordField_1);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(338, 24, 45, 13);
		contentPane.add(lblNewLabel_12);
	}
}
