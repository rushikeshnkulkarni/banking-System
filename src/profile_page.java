import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class profile_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JTextArea textArea ;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	String mm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile_page frame = new profile_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void profile(String ss) {
			
		 try {
						
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
			Statement  sta=con.createStatement();  
			ResultSet rs=sta.executeQuery("select emp_id,emp_name,emp_gender,emp_post,emp_mobile,emp_mail,address,photo from emp_details where emp_username='"+ss+"'");
			
			while (rs.next()) 
			{
				textField.setText(String.valueOf(rs.getInt(1)));
				textField_2.setText(rs.getString(2));
				textField_1.setText(rs.getString(3));
				textField_4.setText(rs.getString(4));
				textField_3.setText(rs.getString(5));
				textField_5.setText(rs.getString(6));
				textArea.setText(rs.getString(7));
				
				 byte[] img=rs.getBytes(8);
					ImageIcon image =new ImageIcon(img);
					Image in=image.getImage();
					Image myImage =in.getScaledInstance(lblNewLabel_7.getWidth(),lblNewLabel_7.getHeight(),Image.SCALE_SMOOTH);
					ImageIcon newimage=new ImageIcon(myImage);
					lblNewLabel_7.setIcon(newimage);
				
		}
			con.close();
			
			 
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showInternalMessageDialog(null,"Something went wrong !","Error",JOptionPane.WARNING_MESSAGE);
			 e.printStackTrace();		
			 return;

		}		 
	}   
	/**
	 * Create the frame.
	 */
	public profile_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(171, 145, 33, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(23, 201, 56, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(299, 201, 74, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Post :\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(289, 258, 45, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(23, 258, 67, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mail :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(289, 314, 45, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(23, 313, 82, 23);
		contentPane.add(lblNewLabel_6);
		
		 lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(187, 10, 130, 118);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setEditable(false);
		textField.setForeground(SystemColor.textText);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(221, 145, 122, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setBounds(383, 201, 146, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(null);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setBounds(89, 201, 200, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBorder(null);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setBounds(100, 261, 163, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		 textArea = new JTextArea();
		 textArea.setBackground(SystemColor.menu);
		 textArea.setBorder(null);
		 textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		textArea.setBounds(115, 312, 152, 34);
		contentPane.add(textArea);
		
		textField_4 = new JTextField();
		textField_4.setBorder(null);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setBounds(357, 261, 172, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBorder(null);
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setBounds(344, 314, 248, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setBounds(420, 63, 74, 41);
		contentPane.add(lblNewLabel_8);
		mm=lblNewLabel_8.getText();

	}
}