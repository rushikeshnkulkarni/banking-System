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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
	String b, n;
	int otp;
	Long bb;
	public String usname;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_1;

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
	void timeC() {
		LocalDate dt = LocalDate.now();
		// lblNewLabel_2.setText(dt.toString());
	}

	public login_page() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Exit", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);

				if (result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\acer\\Downloads\\bank-icon (1).png"));
		setBackground(new Color(255, 255, 255));

		setTitle("Login Page");
		setBounds(100, 100, 942, 636);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter password");
		passwordField.setText("Enter password");
		passwordField.setForeground(Color.GRAY);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setText("");
				passwordField.setForeground(Color.black);

			}
		});

		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(635, 259, 216, 41);
		contentPane.add(passwordField);

		txtEnterUsername = new JTextField();
		txtEnterUsername.setForeground(Color.GRAY);
		txtEnterUsername.setText("Enter username");
		txtEnterUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				txtEnterUsername.setText("");
				txtEnterUsername.setForeground(Color.black);
			}
		});

		txtEnterUsername.setToolTipText("Enter username");
		txtEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterUsername.setBounds(635, 175, 216, 41);
		contentPane.add(txtEnterUsername);
		txtEnterUsername.setColumns(10);

		btnNewButton = new JButton("Employee Login");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBorder(new MatteBorder(10, 8, 2, 2, (Color) new Color(0, 0, 0)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtEnterUsername.getText().trim().isBlank()
						|| txtEnterUsername.getText().equals("Enter username")) {
					JOptionPane.showMessageDialog(null, "please enter username !", "warning",
							JOptionPane.WARNING_MESSAGE);
					txtEnterUsername.requestFocusInWindow();
					return;
				}

				if (passwordField.getText().trim().isBlank()) {
					JOptionPane.showMessageDialog(null, "please enter passwod !", "warning",
							JOptionPane.WARNING_MESSAGE);
					passwordField.requestFocusInWindow();

					return;
				}

				else {

					try {

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "system");
						stmt = con.createStatement();
						rs = stmt.executeQuery("select emp_username,emp_password from emp_details where emp_username='"
								+ txtEnterUsername.getText().trim() + "' and emp_password=md5('"
								+ passwordField.getText().trim() + "')");

						while (rs.next()) {
							a = rs.getString(1);
							b = rs.getString(2);

						}
						con.close();

						String us = txtEnterUsername.getText().trim();
						// String pass=passwordField.getText().trim();
						if (us.equals(a)) {
							// JOptionPane.showMessageDialog(null, "login
							// success","info",JOptionPane.INFORMATION_MESSAGE);
							homepage hp = new homepage();
							hp.lblNewLabel_27.setText(txtEnterUsername.getText());
							hp.setVisible(true);
							dispose();

						} else {
							JOptionPane.showMessageDialog(null, "please enter correct password !", "warning",
									JOptionPane.WARNING_MESSAGE);
						}

					} catch (Exception e2) {

						e2.printStackTrace();
						JOptionPane.showMessageDialog(null, "something went wrong !", "error ",
								JOptionPane.ERROR_MESSAGE);

					}

				}
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 23));
		btnNewButton.setBounds(511, 375, 183, 48);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBorder(new MatteBorder(10, 7, 2, 2, (Color) new Color(0, 0, 0)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtEnterUsername.getText().trim().isBlank()
						|| txtEnterUsername.getText().equals("Enter username")) {
					JOptionPane.showMessageDialog(null, "please enter username !", "warning",
							JOptionPane.WARNING_MESSAGE);
					txtEnterUsername.requestFocusInWindow();
					return;
				}

				if (passwordField.getText().trim().isBlank()) {
					JOptionPane.showMessageDialog(null, "please enter passwod !", "warning",
							JOptionPane.WARNING_MESSAGE);
					passwordField.requestFocusInWindow();

					return;
				}

				else {

					try {

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "system");
						stmt = con.createStatement();
						rs = stmt.executeQuery(
								"select 	admin_username,admin_password from admin_details where admin_username='"
										+ txtEnterUsername.getText().trim() + "' and admin_password=md5('"
										+ passwordField.getText().trim() + "')");

						while (rs.next()) {
							a = rs.getString(1);
							b = rs.getString(2);

						}
						con.close();

						String us = txtEnterUsername.getText().trim();
						// String pass=passwordField.getText().trim();
						if (us.equals(a)) {
							// JOptionPane.showMessageDialog(null, "login
							// success","info",JOptionPane.INFORMATION_MESSAGE);

							admin_page ad = new admin_page();
							ad.lblNewLabel_29.setText(us);
							ad.setVisible(true);
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "please enter correct password !", "warning",
									JOptionPane.WARNING_MESSAGE);
						}

					} catch (Exception e2) {

						e2.printStackTrace();
						JOptionPane.showMessageDialog(null, "something went wrong !", "error ",
								JOptionPane.ERROR_MESSAGE);

					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 23));
		btnNewButton_1.setBounds(724, 375, 151, 48);
		contentPane.add(btnNewButton_1);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\Users-Administrator-icon (1).png"));
		lblNewLabel_3.setBounds(535, 164, 63, 67);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\unlock-icon.png"));
		lblNewLabel_4.setBounds(534, 259, 69, 41);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\bank-icon (1).png"));
		lblNewLabel.setBounds(10, 20, 48, 51);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("BANKING  SYSTEM");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 33));
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(68, 20, 349, 48);
		contentPane.add(lblNewLabel_2);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		textArea.setBackground(new Color(173, 216, 230));
		textArea.setBounds(427, 10, 488, 581);
		contentPane.add(textArea);

		lblNewLabel_6 = new JLabel("Welcome to");
		lblNewLabel_6.setFont(new Font("Nirmala UI", Font.PLAIN, 32));
		lblNewLabel_6.setBackground(new Color(255, 255, 224));
		lblNewLabel_6.setForeground(new Color(255, 255, 224));
		lblNewLabel_6.setBounds(43, 104, 181, 51);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_1 = new JLabel("UniBank");
		lblNewLabel_1.setForeground(new Color(255, 255, 240));
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 32));
		lblNewLabel_1.setBounds(234, 112, 145, 34);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBackground(new Color(255, 255, 240));
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\acer\\Pictures\\gggh.jpg"));
		lblNewLabel_5.setBounds(10, 10, 407, 581);
		contentPane.add(lblNewLabel_5);

	}
}
