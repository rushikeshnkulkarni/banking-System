import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class change_user_pass extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_user_pass frame = new change_user_pass();
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
	public change_user_pass() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter username or password :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(40, 51, 221, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Conform username or password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(18, 137, 243, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(293, 57, 188, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(293, 140, 188, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Update Password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter data !","warning",JOptionPane.WARNING_MESSAGE);
					textField.requestFocusInWindow();
					return;
				}
					
				if(textField_1.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter data !","warning",JOptionPane.WARNING_MESSAGE);
					textField_1.requestFocusInWindow();
					return;
				}
				
				 try {
						
					 if(textField.getText().trim().equals(textField_1.getText().trim()))
					 {
					 
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
				PreparedStatement stmt=con.prepareStatement("update emp_details set emp_password= md5(?) where 	emp_id= ?");
					stmt.setString(1, textField_1.getText().trim());		
					stmt.setInt(2, Integer.parseInt(lblNewLabel_2.getText()));	
					
					int xxx=stmt.executeUpdate();
					if(xxx>=1)
					{
						JOptionPane.showMessageDialog(null, "password updated !","Information",JOptionPane.INFORMATION_MESSAGE);
						textField.setText("");
						textField_1.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "password not updated !","warning",JOptionPane.WARNING_MESSAGE);
					}
					con.close();
					
					 }
					 
					 else {
						
							JOptionPane.showMessageDialog(null, "please enter correct data !","warning",JOptionPane.WARNING_MESSAGE);
							textField_1.requestFocusInWindow();
							return;
					 }
					 
				}
				 
				 catch (Exception e2) 
				 {
					JOptionPane.showInternalMessageDialog(null,"Something went wrong !","Error",JOptionPane.WARNING_MESSAGE);
					 e2.printStackTrace();		
					 return;

				}		 			
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(236, 208, 173, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update Username");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				
				if(textField.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter data !","warning",JOptionPane.WARNING_MESSAGE);
					textField.requestFocusInWindow();
					return;
				}
					
				if(textField_1.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "please enter data !","warning",JOptionPane.WARNING_MESSAGE);
					textField_1.requestFocusInWindow();
					return;
				}
				
				 try {
						
					 if(textField.getText().trim().equals(textField_1.getText().trim()))
					 {
					 
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/bank","root","");
				PreparedStatement stmt=con.prepareStatement("update emp_details set 	emp_username= ? where 	emp_id= ?");
					stmt.setString(1, textField_1.getText().trim());		
					stmt.setInt(2, Integer.parseInt(lblNewLabel_2.getText()));	
					
					int xxx=stmt.executeUpdate();
					if(xxx>=1)
					{
						JOptionPane.showMessageDialog(null, "username updated !","Information",JOptionPane.INFORMATION_MESSAGE);
						textField.setText("");
						textField_1.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "username not updated !","warning",JOptionPane.WARNING_MESSAGE);
					}
					con.close();
					
					 }
					 
					 else {
						
							JOptionPane.showMessageDialog(null, "please enter correct data !","warning",JOptionPane.WARNING_MESSAGE);
							textField_1.requestFocusInWindow();
							return;
					 }
					 
				}
				 
				 catch (Exception e2) 
				 {
					JOptionPane.showInternalMessageDialog(null,"Something went wrong !","Error",JOptionPane.WARNING_MESSAGE);
					 e2.printStackTrace();		
					 return;

				}		 
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(40, 208, 173, 21);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setBounds(73, 23, 45, 13);
		contentPane.add(lblNewLabel_2);
	}
}
