import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClothingRentalService extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClothingRentalService frame = new ClothingRentalService();
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
	public ClothingRentalService() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 620);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("---------- ABOUT US ----------");
		lblNewLabel.setBounds(232, 251, 307, 31);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Email: hws4600@hotmail.com");
		lblNewLabel_1_1_2.setBounds(118, 428, 270, 25);
		contentPane.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact: 07-6870406");
		lblNewLabel_1_1_1.setBounds(118, 393, 189, 25);
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1 = new JLabel("Address: 8-G, Pusat Perdagangan Pontian, 82000 Pontian Johor");
		lblNewLabel_1_1.setBounds(118, 358, 568, 25);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Company Name: HWS Clothing Rental Sdn. Bhd.\r\n");
		lblNewLabel_1.setBounds(118, 323, 432, 25);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblWelcomeToHws = new JLabel("Welcome to HWS Clothing Rental");
		lblWelcomeToHws.setBounds(138, 88, 519, 43);
		contentPane.add(lblWelcomeToHws);
		lblWelcomeToHws.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Main oMenu = new Main();
			oMenu.setVisible(true);
			setVisible(false);
		    }
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(698, 10, 98, 42);
		contentPane.add(backButton);
		}
	}
		
