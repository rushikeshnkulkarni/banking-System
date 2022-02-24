import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class admin_password_change extends JFrame {

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
					admin_password_change frame = new admin_password_change();
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
	public admin_password_change() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 559, 344);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter username or password :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 46, 221, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(295, 46, 188, 26);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(295, 129, 188, 26);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Conform username or password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 129, 243, 26);
		contentPane.add(lblNewLabel_1);
		
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
				PreparedStatement stmt=con.prepareStatement("update admin_details set admin_username= ? where 	admin_id= ?");
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
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(71, 223, 173, 40);
		contentPane.add(btnNewButton_1);
		
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
				PreparedStatement stmt=con.prepareStatement("update admin_details  set admin_password= md5(?) where admin_id= ?");
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(295, 223, 173, 40);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setBounds(116, 20, 45, 13);
		contentPane.add(lblNewLabel_2);
	}
}
