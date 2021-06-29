package Assignment3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldPhoneNo;
	private JTextField textField;
	private JTextField textFieldEmail;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration Form");
		lblRegistration.setForeground(Color.WHITE);
		lblRegistration.setFont(new Font("Lucida Calligraphy", Font.BOLD, 26));
		lblRegistration.setBounds(38, 11, 306, 42);
		contentPane.add(lblRegistration);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(84, 64, 46, 31);
		contentPane.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textFieldName.setBounds(195, 70, 222, 27);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGender.setBounds(72, 119, 58, 27);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnMale.setBounds(195, 124, 76, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnFemale.setBounds(335, 124, 82, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblBirthDate = new JLabel("Birth Date");
		lblBirthDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBirthDate.setBounds(48, 170, 82, 27);
		contentPane.add(lblBirthDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dateChooser.setBounds(195, 172, 222, 27);
		contentPane.add(dateChooser);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhoneNo.setBounds(48, 219, 82, 31);
		contentPane.add(lblPhoneNo);
		
		textFieldPhoneNo = new JTextField();
		textFieldPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textFieldPhoneNo.setColumns(10);
		textFieldPhoneNo.setBounds(195, 223, 222, 27);
		contentPane.add(textFieldPhoneNo);
		
		JLabel lblAdress = new JLabel("Address");
		lblAdress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAdress.setBounds(64, 269, 66, 31);
		contentPane.add(lblAdress);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(195, 273, 420, 27);
		contentPane.add(textField);
		
		JLabel lblPhoneNo_1 = new JLabel("Email");
		lblPhoneNo_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPhoneNo_1.setBounds(84, 324, 58, 31);
		contentPane.add(lblPhoneNo_1);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(195, 328, 222, 27);
		contentPane.add(textFieldEmail);

		JCheckBox chckbxTNC = new JCheckBox("I accept terms and condition");
		chckbxTNC.setBackground(SystemColor.activeCaption);
		chckbxTNC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		chckbxTNC.setBounds(48, 382, 203, 23);
		contentPane.add(chckbxTNC);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(116, 428, 467, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUsername.setBounds(46, 11, 61, 31);
		panel.add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(180, 15, 222, 20);
		panel.add(textFieldUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPassword.setBounds(46, 53, 61, 31);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		passwordField.setBounds(180, 59, 222, 20);
		panel.add(passwordField);
		
		JCheckBox chckxShowPassword = new JCheckBox("Show Password");
		chckxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckxShowPassword.isSelected()){
		            passwordField.setEchoChar((char)0);
		        }else{
		            passwordField.setEchoChar('`');
		        }
			}
		});
		chckxShowPassword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		chckxShowPassword.setBounds(180, 86, 110, 23);
		panel.add(chckxShowPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(chckbxTNC.isSelected()) {
					JOptionPane.showMessageDialog(frame, "Register Successful !", "Success!", 
						JOptionPane.INFORMATION_MESSAGE);
					CustomerLogin login = new CustomerLogin();
					login.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null,"Please Agree Terms and Conditions!","Register Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.setBounds(193, 576, 110, 31);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to cancel", "Cancellation", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home mainPage = new Home();
					mainPage.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCancel.setBounds(359, 576, 110, 31);
		contentPane.add(btnCancel);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(-11, -241, 892, 892);
		contentPane.add(lblBackground);
		ImageIcon icon = new ImageIcon("C:\\Users\\OOI SHI KOON\\Desktop\\Programming 2-Individual Assignment 3 (16 June)\\image\\Registration background.jpg");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblBackground.setIcon(scaledIcon);
			
	}
}