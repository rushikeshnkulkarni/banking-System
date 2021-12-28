import java.sql.*;
import java.util.Date;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.time.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class homepage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JLabel lblNewLabel_27;
	/**
	 * Launch the application.
	 */
	final String ifccode="RSDB0007272";
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
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTable table;
	JLabel lblNewLabel_25;
	JLabel lblNewLabel_29;
	JComboBox comboBox_1 ;
	JScrollPane scrollPane_1;
	String fs,fs2;
	float tot;
	Connection con;
	Statement stmt;
	ResultSet rs;
	private JTextField textField_17;
	private JTable table_1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setTitle("homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 0, 204), new Color(255, 102, 0), new Color(255, 0, 102), new Color(255, 51, 0)), null));
		tabbedPane.setBounds(10, 34, 986, 488);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("New Account", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 21, 71, 34);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(130, 21, 230, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 80, 71, 34);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<-select gender->", "Male ", "Female", "other"}));
		comboBox.setBounds(130, 83, 173, 29);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 140, 124, 29);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(130, 140, 212, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Birth date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 242, 90, 27);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(130, 242, 144, 25);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Aadhar Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 293, 124, 26);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(130, 294, 173, 25);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(12, 357, 108, 29);
		panel.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textArea.setBounds(130, 347, 153, 76);
		panel.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("Photo");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(439, 21, 101, 34);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_7.setBounds(609, 21, 190, 154);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_8.setBounds(609, 232, 190, 154);
		panel.add(lblNewLabel_8);
		
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
			//	pass.setText(filename);
			//	image .getAbsoulatePath=null;
				fs=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_7.getWidth(),lblNewLabel_7.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_7.setIcon(ic);
				
								
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(419, 105, 121, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Upload  adhar ");
		btnNewButton_1.addActionListener(new ActionListener() {
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
				fs2=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_8.getWidth(),lblNewLabel_8.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_8.setIcon(ic);
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(419, 286, 131, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(textField.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter full name !","warning",JOptionPane.WARNING_MESSAGE);
		             textField.requestFocusInWindow();
		             return;
				}
				
				if(textField_1.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Mobile Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_1.requestFocusInWindow();
		             return;
				}
				
				if(comboBox.getSelectedIndex()==0)
				{
					JOptionPane.showMessageDialog(null,"Please choose the gender !","warning",JOptionPane.WARNING_MESSAGE);
		             comboBox.requestFocusInWindow();
		             return;
				}
				
				
				if(comboBox_1.getSelectedIndex()==0)
				{
					JOptionPane.showMessageDialog(null,"Please choose the Account type !","warning",JOptionPane.WARNING_MESSAGE);
		            comboBox_1.requestFocusInWindow();
		             return;
				}
				

				if(textField_2.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter date of birth !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_2.requestFocusInWindow();
		             return;
				}
				

				if(textField_3.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Adhar Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_3.requestFocusInWindow();
		             return;
				}
				
				
				if(textArea.getText().trim().isBlank())
				{
					
					JOptionPane.showMessageDialog(null,"Please enter Address !","warning",JOptionPane.WARNING_MESSAGE);
		             textArea.requestFocusInWindow();
		             return;		
				}
				
				
				try {
					
					con =  DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
					PreparedStatement ps=con.prepareStatement("insert into cus_details (ifccode,fullname,gender,mobile_number,accountType,birthdate,addhar_number,address,photo,addhar_photo,createdBy,created_date) values(?,?,?,?,?,?,?,?,?,?,?,?)"); 
				   ps.setString(1, ifccode);
				   ps.setString(2,textField.getText().trim() );
				   ps.setString(3,comboBox.getSelectedItem().toString());
				   ps.setString(4, textField_1.getText().trim());
				   ps.setString(5, comboBox_1.getSelectedItem().toString());
				   ps.setString(6,textField_2.getText().trim());
				   ps.setString(7,textField_3.getText().trim());
				   ps.setString(8, textArea.getText().trim());
				   
				   FileInputStream fin=new FileInputStream(new File(fs)); 
					ps.setBinaryStream(9,fin,fin.available()); 
				   
				  FileInputStream fin1=new FileInputStream(new File(fs2)); 
				  ps.setBinaryStream(10,fin1,fin1.available());
				  
				 
				 ps.setString(11, lblNewLabel_27.getText()); 
				 
	
				    LocalDateTime date=LocalDateTime.now();  // load the current date and time
				 ps.setString(12, date.toString());            
				 
				 int xx=ps.executeUpdate();
				 
					if(xx>=1)
					{
						JOptionPane.showMessageDialog(null, "Account Created Successfully...! ","informarion",JOptionPane.INFORMATION_MESSAGE);
						
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textArea.setText("");
						lblNewLabel_7.setIcon(null);
						lblNewLabel_8.setIcon(null);
					}
					
					con.close();
					
						  
				} catch (Exception e2) {
				
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);

				}
	
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_2.setBounds(369, 378, 124, 57);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Account Type");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(10, 192, 110, 26);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("Addhar Card");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(419, 242, 121, 22);
		panel.add(lblNewLabel_12);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<- select account Type->", "Saving ", "Current"}));
		comboBox_1.setBounds(130, 192, 173, 26);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Cradit ammount", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Enter Account Number");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(175, 132, 183, 35);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Enter ammount");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(217, 204, 128, 35);
		panel_1.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(416, 136, 199, 27);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(416, 210, 199, 27);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Credit ammount");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField_4.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_4.requestFocusInWindow();
		             return;
				}
				
				if(textField_5.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Amount !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_5.requestFocusInWindow();
		             return;
				}
				
			
				
		        try {
		    
		        	
		       	 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
				 stmt=con.createStatement();
				 rs=stmt.executeQuery("select ac_number from cus_details where ac_number="+Long.parseLong(textField_4.getText().trim())+"");
		   
				 if(rs.next())
				 {
					 JOptionPane.showMessageDialog(null,"correct account number !","information",JOptionPane.INFORMATION_MESSAGE);
					
				 }
				 else {
					 JOptionPane.showMessageDialog(null,"please enter correct account number !","warning",JOptionPane.WARNING_MESSAGE);
					 return;
				}
				 rs=stmt.executeQuery("select total_amount from transcation where ac_number="+Integer.parseInt(textField_4.getText().trim())+"");
			
				 while (rs.next())
	    	    	 {				
					   tot=rs.getFloat("total_amount");
					}
							
					float dd=Float.parseFloat(textField_5.getText().trim());
					   float ee= tot+dd;
					   PreparedStatement stm=con.prepareStatement("insert into transcation (ac_number,credit_amount,credit_date,total_amount) values(?,?,?,?)");
					Integer ii=Integer.parseInt(textField_4.getText().trim());
					stm.setInt(1,ii);
				stm.setFloat(2, Float.parseFloat(textField_5.getText()));	
		
					LocalDateTime dt=LocalDateTime.now();
					stm.setString(3, dt.toString());
			
					   stm.setFloat(4, ee);
					   int xx=stm.executeUpdate();
					   if(xx>=1)
					   {
							 JOptionPane.showMessageDialog(null,"Amount credited !","warning",JOptionPane.INFORMATION_MESSAGE);
							 textField_4.setText("");
							 textField_5.setText("");
						
					   }
					  	 
					
				 else
				 {
					 JOptionPane.showMessageDialog(null,"ammount not credited !","warning",JOptionPane.INFORMATION_MESSAGE);
					 return;	 
		       	}
					   
					   con.close();
					   
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);

				}
				
				
				
			}
		});
		btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_3.setBounds(367, 325, 166, 35);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 204, 255)));
		tabbedPane.addTab("Debit Ammount", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(488, 6, 1, 1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Enter Account Number");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_1.setBounds(212, 130, 152, 35);
		panel_1_1.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Enter ammount");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11_1.setBounds(217, 204, 128, 35);
		panel_1_1.add(lblNewLabel_11_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(416, 136, 199, 27);
		panel_1_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(416, 210, 199, 27);
		panel_1_1.add(textField_7);
		
		JButton btnNewButton_3_1 = new JButton("Credit ammount");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_3_1.setBounds(367, 325, 166, 35);
		panel_1_1.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_13 = new JLabel("Enter Account Number");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(114, 109, 174, 16);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Enter Ammount");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(156, 201, 174, 32);
		panel_2.add(lblNewLabel_14);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setBounds(368, 106, 174, 23);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setBounds(368, 210, 174, 23);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Debit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_8.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_8.requestFocusInWindow();
		             return;
				}
				
				if(textField_9.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Amount !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_9.requestFocusInWindow();
		             return;
				}
				
				
				try {
					
				 	 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select ac_number from cus_details where ac_number="+Long.parseLong(textField_8.getText().trim())+"");
			   
					 if(rs.next())
					 {
						 JOptionPane.showMessageDialog(null,"correct account number !","information",JOptionPane.INFORMATION_MESSAGE);
						
					 }
					 else {
						 JOptionPane.showMessageDialog(null,"please enter correct account number !","warning",JOptionPane.WARNING_MESSAGE);
						 return;
					}
					 
					 
					 rs=stmt.executeQuery("select total_amount from transcation where ac_number="+Integer.parseInt(textField_8.getText().trim())+"");
						
					 while (rs.next()) {
							// tot=rs.getInt("total_amount");
						   tot=rs.getFloat("total_amount");
						}
					 
						float dd=Float.parseFloat(textField_9.getText().trim());
						   float ee= tot-dd;

						   if(ee<100) {
							   
							   JOptionPane.showMessageDialog(null,"You have required to put minimun 100 rupees balance in your account to continue your Account !","warning",JOptionPane.WARNING_MESSAGE);
							   textField_9.requestFocusInWindow();
							   return;
						   }
					 
						   PreparedStatement stm=con.prepareStatement("insert into transcation (ac_number,debit_amount,debit_date,total_amount) values(?,?,?,?)");
							Integer ii=Integer.parseInt(textField_8.getText().trim());
							stm.setInt(1,ii);
						stm.setFloat(2, Float.parseFloat(textField_9.getText().trim()));	
				
							LocalDateTime dt=LocalDateTime.now();
							stm.setString(3, dt.toString());
					
							   stm.setFloat(4, ee);
							   int xx=stm.executeUpdate();  
							   if(xx>=1)
							   {
									 JOptionPane.showMessageDialog(null,"Amount debited !","Information",JOptionPane.INFORMATION_MESSAGE);
									 textField_8.setText("");
									 textField_9.setText("");
									 lblNewLabel_29.setText("");
								
							   }
							  else {
								  JOptionPane.showMessageDialog(null,"Amount not debited !","Warning",JOptionPane.WARNING_MESSAGE);
									 textField_8.setText("");
									 textField_9.setText("");
									 
								return;
							}
							   con.close();
					
							   
				} catch (Exception e2) {
					// TODO: handle exception
					
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);

				}		
				
			}
		});
		btnNewButton_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_4.setBounds(220, 338, 116, 41);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Check balance");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(textField_8.getText().trim().isBlank())
					{
						JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
			             textField_8.requestFocusInWindow();
			             return;
					}  
			        	 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
						 stmt=con.createStatement();
						 rs=stmt.executeQuery("select ac_number from cus_details where ac_number="+Long.parseLong(textField_8.getText().trim())+"");
				   
						 if(rs.next())
						 {
							 JOptionPane.showMessageDialog(null,"correct account number !","information",JOptionPane.INFORMATION_MESSAGE);
							
						 }
						 else {
							 JOptionPane.showMessageDialog(null,"please enter correct account number !","warning",JOptionPane.WARNING_MESSAGE);
							 return;
						}
						
						 rs=stmt.executeQuery("select total_amount from transcation where ac_number="+Integer.parseInt(textField_8.getText().trim())+"");
							
						 while (rs.next()) {
								// tot=rs.getInt("total_amount");
							   tot=rs.getFloat("total_amount");
							}
						 
						con.close();
						 lblNewLabel_29.setText("Balance is "+tot+"");
								
					
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);

				}
				
				
				
			}
			
		});
		btnNewButton_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_5.setBounds(461, 338, 162, 41);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_28 = new JLabel("You have required to put minimun 100 rupees balance in your account to continue your Account");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_28.setForeground(Color.RED);
		lblNewLabel_28.setBounds(73, 415, 806, 16);
		panel_2.add(lblNewLabel_28);
		
		 lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_29.setBounds(701, 296, 233, 25);
		panel_2.add(lblNewLabel_29);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Accounts List", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("show list");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dt1 =(DefaultTableModel)table.getModel();
				while (dt1.getRowCount()>0)
				{
		           dt1.removeRow(0);
					
				} 
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select ac_number,ifccode,fullname,gender,mobile_number,accountType,birthdate,addhar_number,address,created_date from cus_details");
					 
					 while (rs.next()) {
					
						 String account_number=String.valueOf(rs.getInt(1));
						 String ifccode=rs.getString(2);
						 String fullname=rs.getString(3); 
						 String gender=rs.getString(4);
						 String mobile_number=rs.getString(5);
						 String accountType=rs.getString(6);
						 String birthdate=rs.getString(7);
						 String addhar_number=rs.getString(8);
						 String address=rs.getString(9);
						 String created_date=rs.getString(10);
						 String data[]= { account_number, ifccode,fullname,gender,mobile_number,accountType,birthdate,addhar_number,address,created_date};
							DefaultTableModel dt =(DefaultTableModel)table.getModel();
							dt.addRow(data);
					}
					
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					
				}
				
				
			}
		});
		btnNewButton_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_9.setBounds(396, 409, 125, 38);
		panel_4.add(btnNewButton_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(10, 10, 957, 389);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					 "Account Number", "IFC Code","Full Name", "Gender","Mobile Number","Account Type","Birth Date",    "Adhar Number",  "Address","Created Date"
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
		
		JButton btnNewButton_12 = new JButton("Clear");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dt1 =(DefaultTableModel)table.getModel();
				while (dt1.getRowCount()>0)
				{
		           dt1.removeRow(0);
					
				} 
				
			}
		});
		btnNewButton_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_12.setBounds(581, 409, 102, 38);
		panel_4.add(btnNewButton_12);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Transcation Statement", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_30 = new JLabel("Enter Account Number");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_30.setBounds(142, 36, 191, 19);
		panel_5.add(lblNewLabel_30);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setBounds(354, 35, 149, 19);
		panel_5.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton_11 = new JButton("Show");
		btnNewButton_11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				if(textField_17.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_17.requestFocusInWindow();
		             return;
				}
				
				
				scrollPane_1.setVisible(true);
				
				DefaultTableModel dt2 =(DefaultTableModel)table_1.getModel();
				while (dt2.getRowCount()>0)
				{
		           dt2.removeRow(0);
					
				} 
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select ac_number,credit_amount,credit_date,debit_amount,debit_date,total_amount from transcation where ac_number="+Integer.parseInt(textField_17.getText().trim())+"");
					 
					 if(rs.next())
					 {
						 int a=rs.getInt(1);
							JOptionPane.showMessageDialog(null,"Correct Account Number !","Information",JOptionPane.INFORMATION_MESSAGE);
				             textField_16.requestFocusInWindow();
				             
					 }
					 
					 else {
						 JOptionPane.showMessageDialog(null,"Please Enter Correct Account Number !","Warning",JOptionPane.WARNING_MESSAGE);
			             textField_17.requestFocusInWindow();
						return;
					}
					 
					 while (rs.next()) {
					
						
					
					String account_no=String.valueOf(rs.getInt(1));
					String credit_amount=String.valueOf(rs.getInt(2));
					String credit_date=rs.getString(3);
					String debit_amount=String.valueOf(rs.getInt(4));
					String debit_date=rs.getString(5);
					String total=String.valueOf(rs.getInt(6));
					
					 String data[]= { account_no,credit_amount,credit_date,debit_amount,debit_date, total };
						DefaultTableModel dt3 =(DefaultTableModel)table_1.getModel();
						dt3.addRow(data);
					 }
					
					 con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					
				}
				
				
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_11.setBounds(596, 30, 106, 31);
		panel_5.add(btnNewButton_11);
		
		 scrollPane_1 = new JScrollPane();
		scrollPane_1.setVisible(false);
		scrollPane_1.setBounds(52, 102, 878, 345);
		panel_5.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Account Number", "Credit Amount", "Credit Date", "Debit Amount", "Debit Date", "Total Amount"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		tabbedPane.addTab("Edit Account Details", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Name");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(28, 73, 83, 13);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Gender");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(27, 113, 66, 20);
		panel_3.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Mobile Number");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(4, 158, 107, 20);
		panel_3.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Account Type");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(4, 201, 107, 20);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Birth Date");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(10, 252, 83, 25);
		panel_3.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Adhar Number");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_20.setBounds(10, 305, 121, 20);
		panel_3.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Address");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_21.setBounds(10, 350, 103, 25);
		panel_3.add(lblNewLabel_21);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setBounds(171, 66, 160, 25);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setBounds(171, 110, 160, 25);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setBounds(171, 157, 160, 22);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setBounds(171, 201, 160, 22);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setBounds(171, 252, 160, 24);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setBounds(171, 305, 160, 22);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textArea_1.setBounds(171, 359, 135, 88);
		panel_3.add(textArea_1);
		
		JLabel lblNewLabel_22 = new JLabel("Enter Account Number");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_22.setBounds(4, 26, 179, 20);
		panel_3.add(lblNewLabel_22);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setBounds(171, 26, 170, 25);
		panel_3.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("Photo");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_23.setBounds(480, 32, 78, 19);
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Adhar card");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_24.setBounds(460, 217, 98, 30);
		panel_3.add(lblNewLabel_24);
		
		JButton btnNewButton_6 = new JButton("Update Photo");
		btnNewButton_6.addActionListener(new ActionListener() {
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
				fs=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_25.getWidth(),lblNewLabel_25.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_25.setIcon(ic);	
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(460, 128, 121, 30);
		panel_3.add(btnNewButton_6);
		
		 lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_25.setBounds(644, 10, 179, 168);
		panel_3.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_26.setBounds(644, 207, 177, 168);
		panel_3.add(lblNewLabel_26);
		
		JButton btnNewButton_7 = new JButton("Upload adhar");
		btnNewButton_7.addActionListener(new ActionListener() {
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
				fs2=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_26.getWidth(),lblNewLabel_26.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_26.setIcon(ic);
				
								
				
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(445, 305, 136, 30);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("show");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField_16.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_16.requestFocusInWindow();
		             return;
				}
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select fullname,gender,mobile_number,accountType,birthdate,addhar_number,address,photo,addhar_photo from cus_details where ac_number="+Integer.parseInt(textField_16.getText().trim())+"");
		     	  
					
					 
					 while (rs.next()) {
						
						 textField_10.setText(rs.getString(1));
						 textField_11.setText(rs.getString(2));
						 textField_12.setText(rs.getString(3));
						 textField_13.setText(rs.getString(4));
						 textField_14.setText(rs.getString(5));
						 textField_15.setText(rs.getString(6));
						 textArea_1.setText(rs.getString(7));
						 
						 byte[] img=rs.getBytes(8);
							ImageIcon image =new ImageIcon(img);
							Image in=image.getImage();
							Image myImage =in.getScaledInstance(lblNewLabel_25.getWidth(),lblNewLabel_25.getHeight(),Image.SCALE_SMOOTH);
							ImageIcon newimage=new ImageIcon(myImage);
							lblNewLabel_25.setIcon(newimage);
							
							byte[] img1=rs.getBytes(9);
							ImageIcon image1 =new ImageIcon(img1);
							Image in1=image1.getImage();
							Image myImage1 =in1.getScaledInstance(lblNewLabel_26.getWidth(),lblNewLabel_26.getHeight(),Image.SCALE_SMOOTH);
							ImageIcon newimage1=new ImageIcon(myImage1);
							lblNewLabel_26.setIcon(newimage1);
							
							
					}
					 con.close();
					
			
				}
				
				catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					
				}
				
				
				
				
			}
		});
		btnNewButton_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_8.setBounds(397, 402, 144, 45);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("Update");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root",""); 
					
					PreparedStatement stmt=con.prepareStatement("update cus_details set fullname=?,gender=?,mobile_number=?,accountType=?,birthdate=?,addhar_number=?,address=?,photo=?,addhar_photo=? where ac_number=?");	 
					
					stmt.setString(1, textField_10.getText().trim());
					stmt.setString(2, textField_11.getText().trim());
					stmt.setString(3, textField_12.getText().trim());
					stmt.setString(4, textField_13.getText().trim());
					stmt.setString(5, textField_14.getText().trim());
					stmt.setString(6, textField_15.getText().trim());
					stmt.setString(7, textArea_1.getText().trim());
					
					  FileInputStream fin=new FileInputStream(new File(fs)); 
						stmt.setBinaryStream(8,fin,fin.available()); 
					   
					  FileInputStream fin1=new FileInputStream(new File(fs2)); 
					  stmt.setBinaryStream(9,fin1,fin1.available());
					  stmt.setInt(10, Integer.parseInt(textField_16.getText().trim()));
					  
					int xxx=stmt.executeUpdate();
					
					if(xxx>=1)
					{
					
						JOptionPane.showMessageDialog(null,"Information updated !","Information",JOptionPane.INFORMATION_MESSAGE);
			             
					}
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);
					
				}
				
				
				
				
				
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_10.setBounds(565, 403, 128, 44);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_13 = new JButton("Log out");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new login_page().setVisible(true);
				dispose();
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_13.setBounds(898, 4, 98, 27);
		contentPane.add(btnNewButton_13);
		
	 lblNewLabel_27 = new JLabel("");
	 lblNewLabel_27.setBounds(823, 0, 65, 31);
	 contentPane.add(lblNewLabel_27);
	}
}
