import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 784, 548);
		contentPane.add(contentPane_1);
		
		JLabel lblAdminLoginPortal = new JLabel("Admin Login Portal");
		lblAdminLoginPortal.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblAdminLoginPortal.setBounds(210, 124, 353, 43);
		contentPane_1.add(lblAdminLoginPortal);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		usernameLabel.setBounds(35, 265, 151, 31);
		contentPane_1.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordLabel.setBounds(35, 327, 151, 31);
		contentPane_1.add(passwordLabel);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBounds(210, 265, 170, 43);
		contentPane_1.add(usernameField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(210, 327, 170, 43);
		contentPane_1.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usernameField.getText().equals("hws") && passwordField.getText().equals("hws@0406")) {
					JOptionPane.showMessageDialog(null, "\nAdmin " + usernameField.getText() + "\nLog In Successful!"  + "!", "HWS Clothing Rental", JOptionPane.INFORMATION_MESSAGE);	
					AdminPanel aPanel = new AdminPanel();
					aPanel.setVisible(true);
				}
				else 
					JOptionPane.showMessageDialog(null, "Wrong Login Credential. \nPlease try again!", "Error!", JOptionPane.ERROR_MESSAGE);
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginButton.setBounds(447, 266, 170, 42);
		contentPane_1.add(loginButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernameField.setText("");
				passwordField.setText("");
			}
		});
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resetButton.setBounds(447, 328, 170, 42);
		contentPane_1.add(resetButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main oMenu = new Main();
				oMenu.setVisible(true);
				setVisible(false);
				}
			});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(664, 10, 98, 42);
		contentPane_1.add(backButton);
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(664, 10, 98, 42);
		contentPane_1.add(backButton);
	}

}
