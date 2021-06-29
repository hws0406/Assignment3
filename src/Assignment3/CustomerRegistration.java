package Assignment3;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField nameText;
	private JTextField hpText;
	private JTextField add2Text;
	private JTextField add1Text;
	private JTextField emailText;
	private JTextField usernameText;
	private JTextField passwordText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 726);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel registrationLabel = new JLabel("Customer Registration Portal");
		registrationLabel.setBounds(157, 46, 541, 43);
		contentPane.add(registrationLabel);
		registrationLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nameLabel.setBounds(24, 149, 151, 31);
		contentPane.add(nameLabel);
		
		JLabel genderLabel = new JLabel("Gender:");
		genderLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		genderLabel.setBounds(24, 224, 151, 31);
		contentPane.add(genderLabel);
		
		JLabel birthLabel = new JLabel("Birth Date:");
		birthLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		birthLabel.setBounds(24, 298, 151, 31);
		contentPane.add(birthLabel);
		
		JLabel hpLabel = new JLabel("No. H/P:");
		hpLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		hpLabel.setBounds(24, 371, 187, 31);
		contentPane.add(hpLabel);
		
		JLabel add1Label = new JLabel("Address 1:");
		add1Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add1Label.setBounds(24, 447, 151, 31);
		contentPane.add(add1Label);
		
		JLabel add2Label = new JLabel("Address 2:");
		add2Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add2Label.setBounds(24, 519, 151, 31);
		contentPane.add(add2Label);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		emailLabel.setBounds(398, 149, 151, 31);
		contentPane.add(emailLabel);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		usernameLabel.setBounds(398, 224, 151, 31);
		contentPane.add(usernameLabel);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordLabel.setBounds(398, 298, 151, 31);
		contentPane.add(passwordLabel);
		
		nameText = new JTextField();
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nameText.setColumns(10);
		nameText.setBounds(185, 149, 170, 43);
		contentPane.add(nameText);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(185, 224, 170, 43);
		contentPane.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateChooser.setBounds(185, 298, 170, 43);
		contentPane.add(dateChooser);
		
		hpText = new JTextField();
		hpText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		hpText.setColumns(10);
		hpText.setBounds(185, 371, 170, 43);
		contentPane.add(hpText);
		
		add2Text = new JTextField();
		add2Text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add2Text.setColumns(10);
		add2Text.setBounds(185, 519, 413, 43);
		contentPane.add(add2Text);
		
		add1Text = new JTextField();
		add1Text.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add1Text.setColumns(10);
		add1Text.setBounds(185, 447, 413, 43);
		contentPane.add(add1Text);
		
		emailText = new JTextField();
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		emailText.setColumns(10);
		emailText.setBounds(533, 149, 243, 43);
		contentPane.add(emailText);
		
		usernameText = new JTextField();
		usernameText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		usernameText.setColumns(10);
		usernameText.setBounds(533, 224, 170, 43);
		contentPane.add(usernameText);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordText.setColumns(10);
		passwordText.setBounds(533, 298, 170, 43);
		contentPane.add(passwordText);
		
		JCheckBox tncCheckBox = new JCheckBox("I accept all terms and condition**");
		tncCheckBox.setBackground(Color.WHITE);
		tncCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tncCheckBox.setBounds(487, 626, 253, 21);
		contentPane.add(tncCheckBox);
		
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(tncCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(frame, "Registration Successful!", "Welcome! " + usernameText.getText(), 
						JOptionPane.INFORMATION_MESSAGE);
					CustomerLogin login = new CustomerLogin();
					login.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null,"Please Agree Terms and Conditions!","Registration Failed!",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		registerButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		registerButton.setBounds(325, 611, 151, 42);
		contentPane.add(registerButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure to return to login page?", "Cancellation", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					CustomerLogin cLogin = new CustomerLogin();
					cLogin.setVisible(true);
					setVisible(false);
				}
			}
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(678, 10, 98, 42);
		contentPane.add(backButton);
	    	}
}
