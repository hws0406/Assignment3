import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class AdminPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 640);
		getContentPane().setLayout(null);
		
		JButton anmButton = new JButton("<html><p style=\\\"text-align:center;\\\">Advertisement<br />& Marketing</p></html>");
		anmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementandMarketing aM = new AdvertisementandMarketing();
				aM.setVisible(true);
				setVisible(false);
			}
		});
		anmButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		anmButton.setBounds(23, 75, 167, 60);
		getContentPane().add(anmButton);
		
		JButton imButton = new JButton("<html><p style=\\\"text-align:center;\\\">Inventory<br />Management</p></html>");
		imButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryManagement iM = new InventoryManagement();
				iM.setVisible(true);
				setVisible(false);
			}
		});
		imButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		imButton.setBounds(23, 174, 167, 60);
		getContentPane().add(imButton);
		
		JButton emButton = new JButton("<html><p style=\\\"text-align:center;\\\">Employee<br />Management</p></html>");
		emButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement eM = new EmployeeManagement();
				eM.setVisible(true);
				setVisible(false);
			}
		});
		emButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		emButton.setBounds(23, 272, 167, 60);
		getContentPane().add(emButton);
		
		JButton fButton = new JButton("Finance");
		fButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance fA = new Finance();
				fA.setVisible(true);
				setVisible(false);
			}
		});
		fButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fButton.setBounds(23, 359, 167, 60);
		getContentPane().add(fButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure to exit Admin Panel?", "Exit", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminLogin aLogin = new AdminLogin();
					aLogin.setVisible(true);
					setVisible(false);
				}
			}
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(23, 448, 167, 60);
		getContentPane().add(backButton);
		
		JLabel backgroundLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("matte.jpg")).getImage();
	    backgroundLabel.setIcon(new ImageIcon(img1));
		backgroundLabel.setBounds(0, 0, 885, 603);
		getContentPane().add(backgroundLabel);
	}
}
