
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
		
		JLabel clothingLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("clothes.png")).getImage();
		clothingLabel.setIcon(new ImageIcon(img));
		clothingLabel.setBounds(96, 10, 617, 583);
		contentPane.add(clothingLabel);
	
		JButton cusButton = new JButton("Customer");
		cusButton.setForeground(Color.WHITE);
		cusButton.setBackground(Color.BLACK);
		cusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin cLogin = new CustomerLogin();
				cLogin.setVisible(true);
				setVisible(false);
			}
		});
		cusButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		cusButton.setBounds(10, 531, 158, 42);
		contentPane.add(cusButton);
		
		JButton admButton = new JButton("Admin");
		admButton.setForeground(Color.WHITE);
		admButton.setBackground(Color.BLACK);
		admButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin aLogin = new AdminLogin();
				aLogin.setVisible(true);
				setVisible(false);
			}
		});
		admButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		admButton.setBounds(215, 531, 158, 42);
		contentPane.add(admButton);
		
		JButton infoButton = new JButton("Our Info");
		infoButton.setForeground(Color.WHITE);
		infoButton.setBackground(Color.BLACK);
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClothingRentalService oInfo = new ClothingRentalService();
				oInfo.setVisible(true);
				setVisible(false);
			}
		});
		infoButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		infoButton.setBounds(426, 531, 158, 42);
		contentPane.add(infoButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.setForeground(Color.WHITE);
		exitButton.setBackground(Color.BLACK);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "You sure want to exit?", "Close program",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitButton.setBounds(638, 531, 158, 42);
		contentPane.add(exitButton);

		JLabel backgroundLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("welcome2.png")).getImage();
	    backgroundLabel.setIcon(new ImageIcon(img1));
		backgroundLabel.setBounds(106, -123, 568, 359);
		contentPane.add(backgroundLabel);
	
	
	}
}
