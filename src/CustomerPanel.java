import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class CustomerPanel extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField quantityText;
	private JTextField daysText;
	private JTextField priceText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerPanel frame = new CustomerPanel();
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
	public CustomerPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 734);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel cusPanelLabel = new JLabel("Customer Panel");
		cusPanelLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cusPanelLabel.setBounds(10, 10, 225, 48);
		contentPane.add(cusPanelLabel);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nameLabel.setBounds(10, 78, 151, 31);
		contentPane.add(nameLabel);
		
		JLabel dateLabel = new JLabel("Date:");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		dateLabel.setBounds(10, 153, 151, 31);
		contentPane.add(dateLabel);
		
		JLabel typesLabel = new JLabel("Types:");
		typesLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		typesLabel.setBounds(10, 243, 151, 31);
		contentPane.add(typesLabel);

		JLabel daysLabel = new JLabel("Days:");
		daysLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		daysLabel.setBounds(10, 330, 151, 31);
		contentPane.add(daysLabel);
		
		JLabel quantityLabel = new JLabel("Quantities:");
		quantityLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		quantityLabel.setBounds(10, 407, 151, 31);
		contentPane.add(quantityLabel);
		
		JLabel priceLabel = new JLabel("Price: ");
		priceLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		priceLabel.setBounds(10, 483, 151, 31);
		contentPane.add(priceLabel);
		
		nameText = new JTextField();
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nameText.setColumns(10);
		nameText.setBounds(147, 72, 170, 43);
		contentPane.add(nameText);	
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateChooser.setBounds(147, 151, 170, 43);
		contentPane.add(dateChooser);
		
		JComboBox typeBox = new JComboBox();
		typeBox.setModel(new DefaultComboBoxModel(new String[] {"", "Dress", "Jumpsuit", "Jacket", "Playsuit", "Sets", "Suits"}));
		typeBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		typeBox.setBackground(Color.WHITE);
		typeBox.setBounds(147, 237, 170, 43);
		contentPane.add(typeBox);
		
		daysText = new JTextField();
		daysText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		daysText.setColumns(10);
		daysText.setBounds(147, 324, 170, 43);
		contentPane.add(daysText);
		
		quantityText = new JTextField();
		quantityText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		quantityText.setColumns(10);
		quantityText.setBounds(147, 401, 170, 43);
		contentPane.add(quantityText);
		
		priceText = new JTextField();
		priceText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		priceText.setColumns(10);
		priceText.setBounds(147, 477, 170, 43);
		contentPane.add(priceText);
		
		JPanel receiptPanel = new JPanel();
		receiptPanel.setBounds(439, 87, 573, 449);
		contentPane.add(receiptPanel);
		receiptPanel.setLayout(null);
		
		JLabel getName = new JLabel("");
		getName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getName.setBounds(203, 57, 214, 31);
		receiptPanel.add(getName);
		
		JLabel getDate = new JLabel("");
		getDate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getDate.setBounds(203, 126, 214, 31);
		receiptPanel.add(getDate);
		
		JLabel getTypes = new JLabel("");
		getTypes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getTypes.setBounds(203, 194, 214, 31);
		receiptPanel.add(getTypes);
		
		JLabel getDays = new JLabel("");
		getDays.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getDays.setBounds(203, 259, 214, 31);
		receiptPanel.add(getDays);
		
		JLabel getQuantity = new JLabel("");
		getQuantity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getQuantity.setBounds(203, 322, 214, 31);
		receiptPanel.add(getQuantity);
		
		JLabel getPrice = new JLabel("");
		getPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getPrice.setBounds(341, 389, 214, 31);
		receiptPanel.add(getPrice);
		
		JButton submitButton = new JButton("Submit Order");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
					String tS = typeBox.getSelectedItem().toString();
					double price = Double.parseDouble(priceText.getText());
					double quantity = Double.parseDouble(quantityText.getText());
					double days = Double.parseDouble(daysText.getText());
					
					double totalprice = price * quantity * days;
					String tp = Double.toString(totalprice);
					
					getName.setText(nameText.getText());
					getDate.setText(df.format(dateChooser.getDate()));
					getTypes.setText(tS);
					getDays.setText(daysText.getText());
					getQuantity.setText(quantityText.getText());
					getPrice.setText(tp);
			}
		});
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		submitButton.setBounds(80, 559, 194, 42);
		contentPane.add(submitButton);
		
		JLabel nameLabel_1 = new JLabel("Name:");
		nameLabel_1.setBounds(36, 57, 72, 31);
		nameLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		receiptPanel.add(nameLabel_1);
		
		JLabel dateLabel_1 = new JLabel("Date:");
		dateLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		dateLabel_1.setBounds(36, 126, 151, 31);
		receiptPanel.add(dateLabel_1);
		
		JLabel typesLabel_1 = new JLabel("Types:");
		typesLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		typesLabel_1.setBounds(36, 194, 151, 31);
		receiptPanel.add(typesLabel_1);
		
		JLabel daysLabel_1 = new JLabel("Days:");
		daysLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		daysLabel_1.setBounds(36, 259, 151, 31);
		receiptPanel.add(daysLabel_1);
		
		JLabel quantityLabel_1 = new JLabel("Quantities:");
		quantityLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		quantityLabel_1.setBounds(36, 322, 151, 31);
		receiptPanel.add(quantityLabel_1);
		
		JLabel totalpriceLabel = new JLabel("Total Price:");
		totalpriceLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		totalpriceLabel.setBounds(208, 389, 151, 31);
		receiptPanel.add(totalpriceLabel);
		
		JLabel lblOrderConfirmation = new JLabel("Order Confirmation");
		lblOrderConfirmation.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblOrderConfirmation.setBounds(171, -1, 254, 48);
		receiptPanel.add(lblOrderConfirmation);
		
		JButton checkoutButton = new JButton("Checkout");
		checkoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thanks for your purchase! \nGoing back to Login Page", "HWS Clothing Rental", JOptionPane.INFORMATION_MESSAGE);
				CustomerLogin cLogin = new CustomerLogin();
				cLogin.setVisible(true);
				setVisible(false);
			}
		});
		checkoutButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		checkoutButton.setBounds(553, 586, 151, 42);
		contentPane.add(checkoutButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure to cancel the current order?", "Cancellation", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					CustomerLogin cLogin = new CustomerLogin();
					cLogin.setVisible(true);
					setVisible(false);
				}
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelButton.setBounds(762, 586, 151, 42);
		contentPane.add(cancelButton);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(367, 0, 1563, 1080);
		contentPane.add(backgroundLabel);
		Image img1 = new ImageIcon(this.getClass().getResource("matte.jpg")).getImage();
		backgroundLabel.setIcon(new ImageIcon(img1));
		
		JLabel backgroundLabel1 = new JLabel("");
		backgroundLabel1.setBounds(0, 0, 369, 697);
		contentPane.add(backgroundLabel1);
	}
}
