package Assignment3;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 620);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to HWS Clothing Rental");
		welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		welcomeLabel.setBounds(121, 10, 524, 107);
		contentPane.add(welcomeLabel);
		
		JLabel clothingLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("clothes.png")).getImage();
		clothingLabel.setIcon(new ImageIcon(img));
		clothingLabel.setBounds(89, 75, 630, 388);
		contentPane.add(clothingLabel);
		
		JLabel loginLabel = new JLabel("Login:");
		loginLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		loginLabel.setBounds(66, 488, 151, 31);
		contentPane.add(loginLabel);
	
		JButton cusButton = new JButton("Customer");
		cusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin cLogin = new CustomerLogin();
				cLogin.setVisible(true);
				setVisible(false);
			}
		});
		cusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cusButton.setBounds(175, 484, 158, 42);
		contentPane.add(cusButton);
		
		JButton admButton = new JButton("Admin");
		admButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin aLogin = new AdminLogin();
				aLogin.setVisible(true);
				setVisible(false);
			}
		});
		admButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		admButton.setBounds(363, 484, 158, 42);
		contentPane.add(admButton);
		
		JButton infoButton = new JButton("Our Info");
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClothingRentalService oInfo = new ClothingRentalService();
				oInfo.setVisible(true);
			}
		});
		infoButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		infoButton.setBounds(598, 484, 158, 42);
		contentPane.add(infoButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "You sure want to exit?", "Close program",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		exitButton.setBounds(673, 10, 98, 42);
		contentPane.add(exitButton);
	}
}
