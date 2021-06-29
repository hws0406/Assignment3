import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField usernameTextField;
	private JTextField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
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
	public CustomerLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 786, 563);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		JLabel cusPortalLabel = new JLabel("Customer Login Portal");
		cusPortalLabel.setBounds(210, 124, 353, 43);
		cusPortalLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(cusPortalLabel);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		usernameLabel.setBounds(35, 265, 151, 31);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordLabel.setBounds(35, 327, 151, 31);
		contentPane.add(passwordLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setColumns(10);
		usernameTextField.setBounds(210, 265, 170, 43);
		contentPane.add(usernameTextField);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(210, 327, 170, 43);
		contentPane.add(passwordTextField);
		
        JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usernameTextField.getText().equals("Sherry") && passwordTextField.getText().equals("sherry@1314")) {
					JOptionPane.showMessageDialog(null, "Login Successfully. \nWelcome Back!", "HWS Clothing Rental", JOptionPane.INFORMATION_MESSAGE);	
					CustomerPanel cPanel = new CustomerPanel();
					cPanel.setVisible(true);
				}
				else 
					JOptionPane.showMessageDialog(null, "Wrong Login Credential. \nPlease try again!", "Error!", JOptionPane.ERROR_MESSAGE);
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginButton.setBounds(447, 266, 170, 42);
		contentPane.add(loginButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernameTextField.setText("");
				passwordTextField.setText("");
			}
		});
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resetButton.setBounds(447, 328, 170, 42);
		contentPane.add(resetButton);
		
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
		contentPane.add(backButton);
		
		JLabel registerLabel = new JLabel(">>Click here to register new account");
	    registerLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
					CustomerRegistration register = new CustomerRegistration();
					register.setVisible(true);
					setVisible(false);
			}
		});
		registerLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		registerLabel.setBounds(10, 485, 484, 31);
		contentPane.add(registerLabel);
		
	}
}
