import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class AdminPanel extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;

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
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		}

	/**
	 * Create the frame.
	 */
	public AdminPanel() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1122, 640);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(228, 10, 870, 583);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		AdvertisementandMarketing panelAds = new AdvertisementandMarketing();
		layeredPane.add(panelAds, "name_266983109842400");
		
		InventoryManagement panelInv = new InventoryManagement();
		layeredPane.add(panelInv, "name_267021903240800");
		
		EmployeeManagement panelEmp = new EmployeeManagement();
		layeredPane.add(panelEmp, "name_267023450419000");
		
		Finance panelFin = new Finance();
		layeredPane.add(panelFin, "name_267024815719900");
		
		JButton adsButton = new JButton("<html><p style=\\\"text-align:center;\\\">Advertisement<br />& Marketing</p></html>");
		adsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelAds);
			}
		});
		adsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		adsButton.setBounds(23, 75, 167, 60);
		contentPane.add(adsButton);
		
		JButton invButton = new JButton("<html><p style=\\\"text-align:center;\\\">Inventory<br />Management</p></html>");
		invButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelInv);
			}
		});
		invButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		invButton.setBounds(23, 174, 167, 60);
		contentPane.add(invButton);
		
		JButton empButton = new JButton("<html><p style=\\\"text-align:center;\\\">Employee<br />Management</p></html>");
		empButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelEmp);
			}
		});
		empButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empButton.setBounds(23, 272, 167, 60);
		contentPane.add(empButton);
		
		JButton finButton = new JButton("Finance");
		finButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelFin);
			}
		});
		finButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		finButton.setBounds(23, 367, 167, 60);
		contentPane.add(finButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(null, "Are you sure to exit to Admin Panel?", "Exit", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminLogin aLogin = new AdminLogin();
					aLogin.setVisible(true);
					setVisible(false);
				}
			}
		});
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backButton.setBounds(23, 462, 167, 60);
		contentPane.add(backButton);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(217, 0, 1563, 1080);
		contentPane.add(backgroundLabel);
		Image img1 = new ImageIcon(this.getClass().getResource("matte.jpg")).getImage();
		backgroundLabel.setIcon(new ImageIcon(img1));
		
		JLabel backgroundLabel1 = new JLabel("");
		backgroundLabel1.setBounds(0, 0, 218, 603);
		contentPane.add(backgroundLabel1);
		Image img2 = new ImageIcon(this.getClass().getResource("mosaic2.jpg")).getImage();
		backgroundLabel1.setIcon(new ImageIcon(img2));
		

	}
}
