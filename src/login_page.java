import java.sql.*;
import java.time.LocalDate;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import javax.swing.border.MatteBorder;

public class login_page extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	public JTextField txtEnterUsername;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	Connection con;
	Statement stmt;
	ResultSet rs;
	  String a;
	  String b,n;
	  int otp;
	  Long bb;
	public  String usname;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page frame = new login_page();
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
	void timeC()
	{
	LocalDate dt=LocalDate.now();
	lblNewLabel_2.setText(dt.toString());
	}
	
	public login_page() {
	
		setTitle("Login Page");
		setBounds(100, 100, 490, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
     	JLabel lblNewLabel = new JLabel("username :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(55, 69, 98, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password :");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(55, 153, 98, 37);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(183, 157, 190, 30);
		contentPane.add(passwordField);
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterUsername.setBounds(183, 79, 190, 30);
		contentPane.add(txtEnterUsername);
		txtEnterUsername.setColumns(10);
	
		btnNewButton = new JButton("Employee Login");
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(txtEnterUsername.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"please enter username !","warning",JOptionPane.WARNING_MESSAGE);
					txtEnterUsername.requestFocusInWindow();
					return;
				}
				
				if(passwordField.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"please enter passwod !","warning",JOptionPane.WARNING_MESSAGE);
					passwordField.requestFocusInWindow();
				
					return;
				}
				
				else {
					
					try {
						
						 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");  
						 stmt=con.createStatement();  
						  rs=stmt.executeQuery("select emp_username,emp_password from emp_details where emp_username='"+txtEnterUsername.getText().trim()+"' and emp_password=md5('"+passwordField.getText().trim()+"')");
						
						  while(rs.next())
							{
								 a=rs.getString(1);
								 b=rs.getString(2);
							
							}
							con.close();	
					
						  String us=txtEnterUsername.getText().trim();
					//	  String pass=passwordField.getText().trim();
							if(us.equals(a))
							{
								JOptionPane.showMessageDialog(null, "login success","info",JOptionPane.INFORMATION_MESSAGE);							 
							    homepage hp=new homepage();
							    hp.lblNewLabel_27.setText(txtEnterUsername.getText());
								   hp.setVisible(true);
							    dispose();
						 
							}
							else {
									JOptionPane.showMessageDialog(null, "please enter correct password !","warning",JOptionPane.WARNING_MESSAGE);
							}
						
					} catch (Exception e2) {
					
						 e2.printStackTrace();
							JOptionPane.showMessageDialog(null, "something went wrong !","error ",JOptionPane.ERROR_MESSAGE);
							
					}
										
				}				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(55, 243, 150, 40);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtEnterUsername.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"please enter username !","warning",JOptionPane.WARNING_MESSAGE);
					txtEnterUsername.requestFocusInWindow();
					return;
				}
				
				if(passwordField.getText().trim().isBlank())
				{
					JOptionPane.showMessageDialog(null,"please enter passwod !","warning",JOptionPane.WARNING_MESSAGE);
					passwordField.requestFocusInWindow();
				
					return;
				}
				
				else {
					
					try {
						
						 con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");  
						 stmt=con.createStatement();  
						  rs=stmt.executeQuery("select 	admin_username,admin_password from admin_details where admin_username='"+txtEnterUsername.getText().trim()+"' and admin_password=md5('"+passwordField.getText().trim()+"')");
						
						  while(rs.next())
							{
								 a=rs.getString(1);
								 b=rs.getString(2);
							
							}
							con.close();	
					
						  String us=txtEnterUsername.getText().trim();
					//	  String pass=passwordField.getText().trim();
							if(us.equals(a))
							{
								JOptionPane.showMessageDialog(null, "login success","info",JOptionPane.INFORMATION_MESSAGE);
							
								admin_page ad= new admin_page();
								ad.lblNewLabel_29.setText(us);
								ad.setVisible(true);
								dispose();		
							}
							else {
									JOptionPane.showMessageDialog(null, "please enter correct password !","warning",JOptionPane.WARNING_MESSAGE);
							}
						
					} catch (Exception e2) {
					
						 e2.printStackTrace();
							JOptionPane.showMessageDialog(null, "something went wrong !","error ",JOptionPane.ERROR_MESSAGE);
							
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(267, 243, 136, 40);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(363, 10, 103, 13);
		contentPane.add(lblNewLabel_2);
			
	}	
	}

