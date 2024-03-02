import java.sql.*;
import java.text.MessageFormat;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class homepage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
	 JLabel lblNewLabel_35;
	 JLabel lblNewLabel_36;
	 JLabel lblNewLabel_37;
	 JLabel lblNewLabel_38;
	JLabel lblNewLabel_33;
	JLabel lblNewLabel_32; 
	JLabel lblNewLabel_34;
	JLabel lblNewLabel_31 ;
	private JTable table;
	JLabel lblNewLabel_27;
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
	private JTextField txtEnterAccountNumber;
	JTextArea textArea_2;
	String  ifccode1,fullname,gender,accountType,birthdate,addhar_number ;
	private JTextField txtEnterAccountNumber_1;
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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
	int result=JOptionPane.showConfirmDialog(null, "Are you sure ?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				
				if(result==JOptionPane.YES_OPTION)
				{
					dispose();
				}
								
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\acer\\Downloads\\bank-icon.png"));
			
		setTitle("homepage");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1073, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 0, 204), new Color(255, 102, 0), new Color(255, 0, 102), new Color(255, 51, 0)), null));
		tabbedPane.setBounds(10, 52, 1054, 592);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("New Account", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 43, 124, 34);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(263, 47, 230, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(24, 98, 108, 34);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<-select gender->", "Male ", "Female", "other"}));
		comboBox.setBounds(263, 101, 173, 29);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(24, 165, 124, 29);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(262, 166, 212, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Birth date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(24, 276, 90, 27);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(261, 280, 144, 25);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Aadhar Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(24, 329, 124, 26);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(263, 340, 173, 25);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(24, 400, 108, 29);
		panel.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 16));
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textArea.setBounds(263, 404, 153, 76);
		panel.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("Photo");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(666, 36, 101, 34);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_7.setBounds(806, 38, 190, 154);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_8.setBounds(814, 280, 190, 154);
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
		
				fs=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_7.getWidth(),lblNewLabel_7.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_7.setIcon(ic);
				
								
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(657, 101, 121, 34);
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
		
				fs2=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_8.getWidth(),lblNewLabel_8.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_8.setIcon(ic);
								
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(656, 356, 131, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String nString=	lblNewLabel_27.getText();
			
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
					
					con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system");
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
				  			 
				 ps.setString(11,nString ); 
				 	
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
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(473, 508, 124, 43);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Account Type");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(24, 220, 110, 26);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("Addhar Card");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(659, 281, 121, 22);
		panel.add(lblNewLabel_12);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<- select account Type->", "Saving ", "Current"}));
		comboBox_1.setBounds(263, 220, 173, 26);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Cradit amount", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Enter Account Number");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(38, 135, 210, 35);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Enter amount");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(102, 239, 146, 35);
		panel_1.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(322, 146, 210, 26);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(322, 245, 210, 26);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Credit Amount");
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nString=	lblNewLabel_27.getText();
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
		    
		        	
		       	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
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
					   PreparedStatement stm=con.prepareStatement("insert into transcation (ac_number,credit_amount,credit_date,total_amount,credted_By) values(?,?,?,?,?)");
					Integer ii=Integer.parseInt(textField_4.getText().trim());
					stm.setInt(1,ii);
				stm.setFloat(2, Float.parseFloat(textField_5.getText()));	
		
					LocalDateTime dt=LocalDateTime.now();
					stm.setString(3, dt.toString());
			
					   stm.setFloat(4, ee);
					   stm.setString(5, nString);
					   int xx=stm.executeUpdate();
					   if(xx>=1)
					   {
							 JOptionPane.showMessageDialog(null,"Amount credited !","warning",JOptionPane.INFORMATION_MESSAGE);
							 textField_4.setText("");
							 textField_5.setText("");
							 lblNewLabel_33.setText("");
							 lblNewLabel_34.setText("");					
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
		btnNewButton_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(186, 347, 192, 51);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_18 = new JButton("Check");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_4.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_4.requestFocusInWindow();
		             return ;
				}
				
		    	try {
					

			       	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select fullname,addhar_number from cus_details where ac_number="+Long.parseLong(textField_4.getText().trim())+"");
			   
		    		if(rs.next())
		    		{
		    			lblNewLabel_31.setVisible(true);
		    			lblNewLabel_32.setVisible(true);
		    			lblNewLabel_33.setVisible(true);
		    			lblNewLabel_34.setVisible(true);
		    			lblNewLabel_33.setText(rs.getString(1));
		    			lblNewLabel_34.setText(rs.getString(2));
		    			
		    			
		    		}
		    		
		    		else {
						
		    			JOptionPane.showMessageDialog(null,"Please enter correct Account Number !","warning",JOptionPane.WARNING_MESSAGE);
			             textField_4.requestFocusInWindow();
			             return ;
			             
					}
		    		
		    		
		    		
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);

				}
				
				
				
				
				
			
				
			}
		});
		btnNewButton_18.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_18.setBounds(473, 347, 120, 51);
		panel_1.add(btnNewButton_18);
		
		lblNewLabel_31 = new JLabel("Name:");
		lblNewLabel_31.setVisible(false);
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_31.setBounds(633, 144, 75, 26);
		panel_1.add(lblNewLabel_31);
		
		 lblNewLabel_32 = new JLabel("Adhar Number:");
		lblNewLabel_32.setVisible(false);
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_32.setBounds(591, 243, 146, 26);
		panel_1.add(lblNewLabel_32);
		
		lblNewLabel_33 = new JLabel("");
		lblNewLabel_33.setVisible(false);
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_33.setBounds(756, 148, 247, 26);
		panel_1.add(lblNewLabel_33);
		
		lblNewLabel_34 = new JLabel("");
		lblNewLabel_34.setVisible(false);
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_34.setBounds(756, 242, 247, 28);
		panel_1.add(lblNewLabel_34);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBorder(new LineBorder(new Color(0, 204, 255)));
		tabbedPane.addTab("Debit Amount", null, panel_2, null);
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
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(39, 109, 216, 51);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Enter Ammount");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_14.setBounds(93, 202, 162, 51);
		panel_2.add(lblNewLabel_14);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setBounds(314, 123, 190, 25);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setBounds(314, 216, 190, 25);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Debit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nString=	lblNewLabel_27.getText();
				
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
					
				 	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
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
						
						   tot=rs.getFloat("total_amount");
						}
					 
						float dd=Float.parseFloat(textField_9.getText().trim());
						   float ee= tot-dd;

						   if(ee<100) {
							   
							   JOptionPane.showMessageDialog(null,"You have required to put minimun 100 rupees balance in your account to continue your Account !","warning",JOptionPane.WARNING_MESSAGE);
							   textField_9.requestFocusInWindow();
							   return;
						   }
					 
						   PreparedStatement stm=con.prepareStatement("insert into transcation (ac_number,debit_amount,debit_date,total_amount,debited_By) values(?,?,?,?,?)");
							Integer ii=Integer.parseInt(textField_8.getText().trim());
							stm.setInt(1,ii);
						stm.setFloat(2, Float.parseFloat(textField_9.getText().trim()));	
				
							LocalDateTime dt=LocalDateTime.now();
							stm.setString(3, dt.toString());
					
							   stm.setFloat(4, ee);
							   stm.setString(5, nString);
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
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(166, 320, 116, 41);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Check balance");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_8.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_8.requestFocusInWindow();
		             return;
				}
				try {
					

			       	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select fullname,addhar_number from cus_details where ac_number="+Long.parseLong(textField_8.getText().trim())+"");
			   
		    		if(rs.next())
		    		{
		    			lblNewLabel_37.setVisible(true);
		    			lblNewLabel_38.setVisible(true);
		    			lblNewLabel_35.setVisible(true);
		    			lblNewLabel_36.setVisible(true);
		    			lblNewLabel_37.setText(rs.getString(1));
		    			lblNewLabel_38.setText(rs.getString(2));
		    			
		    			
		    		}
		    		
		    		else {
						
		    			JOptionPane.showMessageDialog(null,"Please enter correct Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		    			lblNewLabel_37.setVisible(false);
		    			lblNewLabel_38.setVisible(false);
		    			lblNewLabel_35.setVisible(false);
		    			lblNewLabel_36.setVisible(false);
			             textField_8.requestFocusInWindow();
			             return ;
			             
					}
		    		
		    		
		    		
				} catch (Exception e2) {
					// TODO: handle exception
					 e2.printStackTrace();
					 JOptionPane.showMessageDialog(null,"Something went wrong !","warning",JOptionPane.ERROR_MESSAGE);

				}	
				
				try {
					if(textField_8.getText().trim().isBlank())
					{
						JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
			             textField_8.requestFocusInWindow();
			             return;
					}  
			        	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
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
						//	  lblNewLabel_37.setText(rs.getString(2));
							//  lblNewLabel_38.setText(rs.getString(3));
							   
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
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(362, 320, 162, 41);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_28 = new JLabel("You have required to put minimun 100 rupees balance in your account to continue your Account");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_28.setForeground(Color.RED);
		lblNewLabel_28.setBounds(67, 440, 806, 16);
		panel_2.add(lblNewLabel_28);
		
		 lblNewLabel_29 = new JLabel("");
		 lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 16));
		 lblNewLabel_29.setBounds(701, 296, 233, 25);
		 panel_2.add(lblNewLabel_29);
		 
		 lblNewLabel_35 = new JLabel("Name:");
		 lblNewLabel_35.setVisible(false);
		 lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblNewLabel_35.setBounds(638, 122, 67, 25);
		 panel_2.add(lblNewLabel_35);
		 
		 lblNewLabel_36 = new JLabel("Adhar Number:");
		 lblNewLabel_36.setVisible(false);
		 lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblNewLabel_36.setBounds(574, 213, 144, 28);
		 panel_2.add(lblNewLabel_36);
		 
		  lblNewLabel_37 = new JLabel("");
		  lblNewLabel_37.setVisible(false);
		 lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_37.setBounds(740, 120, 295, 28);
		 panel_2.add(lblNewLabel_37);
		 
		  lblNewLabel_38 = new JLabel("");
		  lblNewLabel_38.setVisible(false);
		 lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_38.setBounds(740, 213, 295, 28);
		 panel_2.add(lblNewLabel_38);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("Transcation Statement", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_30 = new JLabel("Enter Account Number");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_30.setBounds(142, 36, 191, 19);
		panel_5.add(lblNewLabel_30);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setBounds(343, 35, 166, 19);
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
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
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
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 16));
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
		 
		 JButton btnNewButton_14 = new JButton("print");
		 btnNewButton_14.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\Devices-printer-icon.png"));
		 btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		 btnNewButton_14.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	
		 		try {
		 			
		 			if(	table_1.print())
		 			{
		 				JOptionPane.showMessageDialog(null,"PDF downloaded ","Information",JOptionPane.INFORMATION_MESSAGE);	 		
		 			}
		 			
		 			}
		 		catch (Exception e2)
		 			{
		 				// TODO: handle exception
		 			}			
		 	}
		 });
		 btnNewButton_14.setBounds(876, 472, 74, 19);
		 panel_5.add(btnNewButton_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("Accounts List", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("Show List");
		btnNewButton_9.setForeground(new Color(0, 0, 0));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dt1 =(DefaultTableModel)table.getModel();
				while (dt1.getRowCount()>0)
				{
		           dt1.removeRow(0);
					
				} 
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
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
		btnNewButton_9.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBounds(236, 466, 125, 38);
		panel_4.add(btnNewButton_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(28, 29, 979, 387);
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
		
		JButton btnNewButton_12 = new JButton("clear");
		btnNewButton_12.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\Actions-edit-clear-locationbar-rtl-icon.png"));
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
		btnNewButton_12.setBounds(449, 469, 89, 35);
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_17 = new JButton("print");
		btnNewButton_17.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\Devices-printer-icon.png"));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					if(	table.print())
					{
						JOptionPane.showMessageDialog(null,"PDF downloaded ","Information",JOptionPane.INFORMATION_MESSAGE);	 		
					}
					
					}
				catch (Exception e2)
					{
						// TODO: handle exception
					}			
				
				
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_17.setBounds(567, 469, 81, 35);
		panel_4.add(btnNewButton_17);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		panel_3.setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		tabbedPane.addTab("Edit Account Details", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Name");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(10, 69, 83, 20);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Gender");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(10, 113, 66, 20);
		panel_3.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Mobile Number");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(10, 158, 107, 20);
		panel_3.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Account Type");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(10, 201, 107, 20);
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
		lblNewLabel_21.setBounds(8, 376, 103, 25);
		panel_3.add(lblNewLabel_21);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setBounds(189, 66, 160, 25);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setBounds(189, 110, 160, 25);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_12.setBounds(189, 157, 160, 21);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setBounds(189, 200, 160, 21);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setBounds(189, 252, 160, 24);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setBounds(189, 301, 160, 25);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textArea_1.setBounds(189, 354, 160, 88);
		panel_3.add(textArea_1);
		
		JLabel lblNewLabel_22 = new JLabel("Enter Account Number");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_22.setBounds(4, 26, 179, 20);
		panel_3.add(lblNewLabel_22);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setBounds(189, 23, 160, 25);
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
		
				fs=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_25.getWidth(),lblNewLabel_25.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_25.setIcon(ic);	
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(437, 128, 144, 30);
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
		
				fs2=filename;
				
				ImageIcon ic= new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblNewLabel_26.getWidth(),lblNewLabel_26.getHeight(),Image.SCALE_SMOOTH));
				
				lblNewLabel_26.setIcon(ic);
								
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(437, 300, 136, 30);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Show");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField_16.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please enter Account Number !","warning",JOptionPane.WARNING_MESSAGE);
		             textField_16.requestFocusInWindow();
		             return;
				}
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
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
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_8.setBounds(265, 507, 144, 45);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("Update");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
					
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
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_10.setBounds(497, 507, 128, 44);
		panel_3.add(btnNewButton_10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("Print Passbook", null, panel_6, null);
		panel_6.setLayout(null);
		
		txtEnterAccountNumber = new JTextField();
		txtEnterAccountNumber.setForeground(Color.LIGHT_GRAY);
		txtEnterAccountNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterAccountNumber.getText().equals("Enter account number"))
				{
					txtEnterAccountNumber.setText("");
					txtEnterAccountNumber.setForeground(Color.black);
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterAccountNumber.getText().trim().equals(""))
				{
				txtEnterAccountNumber.setText("Enter account number");
				txtEnterAccountNumber.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		txtEnterAccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterAccountNumber.setText("Enter account number");	
		txtEnterAccountNumber.setBounds(25, 170, 225, 26);
		panel_6.add(txtEnterAccountNumber);
		txtEnterAccountNumber.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("View Profile");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(txtEnterAccountNumber.getText().equals("Enter account number"))
				{
					JOptionPane.showMessageDialog(null,"enter account number !","warning",JOptionPane.WARNING_MESSAGE);
					txtEnterAccountNumber.requestFocusInWindow();
					return;
				}
					
				try {

					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
					 stmt=con.createStatement();
					 rs=stmt.executeQuery("select 	ifccode, fullname,gender,accountType,birthdate,addhar_number from cus_details where ac_number="+Integer.parseInt(txtEnterAccountNumber.getText().trim())+"");
				
					 
		     	  	while (rs.next()) {
		     	         		
		     	  		ifccode1=rs.getString(1);
		     	  		fullname=rs.getString(2);
		     	  		gender=rs.getString(3);
		     	  		accountType=rs.getString(4);
		     	  		birthdate=rs.getString(5);
		     	  		addhar_number=rs.getString(6);
		     	  		
		     	  		textArea_2.setText("\t\t"+"     "+" RSD Bank \n");
						textArea_2.setText(textArea_2.getText()+"================================================================================\n\n");
						textArea_2.setText(textArea_2.getText()+"name :"+" "+""+fullname+"      \n\n");
						textArea_2.setText(textArea_2.getText()+"Account Type :"+" "+""+accountType+"    \n\n");
						textArea_2.setText(textArea_2.getText()+"Account Number :"+" "+""+txtEnterAccountNumber.getText().trim()+"     \t\t photo here\n\n");
						textArea_2.setText(textArea_2.getText()+"IFC Code :"+" "+""+ifccode+"		\n\n ");
						textArea_2.setText(textArea_2.getText()+"Birth Date :"+" "+""+birthdate+"    \n\n");
						textArea_2.setText(textArea_2.getText()+"Gender :"+" "+""+gender+"    \n\n");
						textArea_2.setText(textArea_2.getText()+"Adhar Number :"+ " "+""+addhar_number+"     \n \n");
						textArea_2.setText(textArea_2.getText()+"Bank Address : Gandhi chowk,latur-413512.      \n \n");
						textArea_2.setText(textArea_2.getText()+"\n\n\t\t\t\t singnature");
						textArea_2.setText(textArea_2.getText()+"\n\n================================================================================");
										
						
					}		
					 
		     	  	if(textArea_2.getText().isBlank())
		     	  	{
		     	  		JOptionPane.showMessageDialog(null,"please enter correct account number","warning",JOptionPane.WARNING_MESSAGE);
		     	  	}
		     	  	
		     	  	
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_15.setBounds(25, 246, 149, 40);
		panel_6.add(btnNewButton_15);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(368, 20, 667, 531);
		panel_6.add(scrollPane_2);
		
		JButton btnNewButton_16 = new JButton("print");
		btnNewButton_16.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\Devices-printer-icon.png"));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(textArea_2.print())
					{
						JOptionPane.showMessageDialog(null,"pdf download !","Information",JOptionPane.INFORMATION_MESSAGE);
		     	  	
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_16.setBounds(217, 251, 85, 35);
		panel_6.add(btnNewButton_16);
		
		textArea_2 = new JTextArea();
		textArea_2.setBounds(368, 20, 667, 531);
		panel_6.add(textArea_2);
		textArea_2.setEditable(false);
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(70, 130, 180));
		tabbedPane.addTab("Delete Account", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8.setBounds(231, 99, 534, 326);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btnNewButton_19 = new JButton("Delete");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if(txtEnterAccountNumber_1.getText().trim().isBlank())
					{
						JOptionPane.showMessageDialog(null,"Please enter the account number","Warning",JOptionPane.WARNING_MESSAGE);
						txtEnterAccountNumber_1.requestFocusInWindow();
						return;
					}
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
						
					PreparedStatement stmt=con.prepareStatement("delete from cus_details where ac_number=?");	 
						stmt.setLong(1,Long.parseLong(txtEnterAccountNumber_1.getText().trim()));
					int num =stmt.executeUpdate();
					con.close();
					if(num==1)
					{
						JOptionPane.showMessageDialog(null,"Account Successfully Deleted","Success",JOptionPane.INFORMATION_MESSAGE);
					//	txtEnterAccountNumber_1.setText("");
						
						try {
							
							 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","system"); 
								
								PreparedStatement stmt1=con.prepareStatement("delete from transcation where ac_number=?");	 
									stmt1.setLong(1,Long.parseLong(txtEnterAccountNumber_1.getText().trim()));
								int num1 =stmt1.executeUpdate();
							
								if(num1>=1)
								{
									JOptionPane.showMessageDialog(null,"transcation delted","Success",JOptionPane.INFORMATION_MESSAGE);
									txtEnterAccountNumber_1.setText("");
								}
						} catch (Exception e3) {
							// TODO: handle exception
							e3.printStackTrace();
						}
						
						
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
							
			}
		});
		btnNewButton_19.setBounds(184, 211, 112, 35);
		panel_8.add(btnNewButton_19);
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		txtEnterAccountNumber_1 = new JTextField();
		txtEnterAccountNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtEnterAccountNumber_1.setForeground(new Color(128, 128, 128));
		txtEnterAccountNumber_1.setText("Enter Account Number");
		txtEnterAccountNumber_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			if(txtEnterAccountNumber_1.getText().equals("Enter Account Number"))
			{
					txtEnterAccountNumber_1.setText("");
					txtEnterAccountNumber_1.setForeground(new Color(0, 0,0));
			}						
			}
		});
		txtEnterAccountNumber_1.setBounds(144, 112, 225, 19);
		panel_8.add(txtEnterAccountNumber_1);
		txtEnterAccountNumber_1.setColumns(10);
		
		JButton btnNewButton_13 = new JButton("logout");
		btnNewButton_13.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\Apps-session-logout-icon (1).png"));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Are you sure ?");
				if(a==JOptionPane.YES_OPTION)
				{

					new login_page().setVisible(true);
					dispose();
				}

			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_13.setBounds(976, 10, 73, 35);
		contentPane.add(btnNewButton_13);
		
		 lblNewLabel_27 = new JLabel("");
		 lblNewLabel_27.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		profile_page pgPage=new profile_page();
		 		pgPage.lblNewLabel_8.setText(lblNewLabel_27.getText());
		 			pgPage.profile(lblNewLabel_27.getText());
		 	      pgPage.setVisible(true); 		
		 		
		 		
		 		
		 	}
		 });
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_27.setBounds(877, 18, 82, 24);
		contentPane.add(lblNewLabel_27);
	}
}
