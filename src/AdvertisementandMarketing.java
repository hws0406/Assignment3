import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvertisementandMarketing extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public AdvertisementandMarketing() {
		
		setSize(870, 583);
		setLayout(null);
		setVisible(true);
		
		JLabel anmLabel = new JLabel("Advertisement & Marketing");
		anmLabel.setBounds(196, 48, 539, 43);
		anmLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(anmLabel);
		
		JLabel monthLabel = new JLabel("Month:");
		monthLabel.setBounds(73, 170, 151, 31);
		monthLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(monthLabel);
		
		JLabel lblBestSelling = new JLabel("Best Selling:");
		lblBestSelling.setBounds(73, 256, 151, 31);
		lblBestSelling.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblBestSelling);
		
		JLabel lblNewArrival = new JLabel("New Arrival:");
		lblNewArrival.setBounds(73, 342, 151, 31);
		lblNewArrival.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblNewArrival);
		
		JLabel lblTotalRented = new JLabel("Total Rented:");
		lblTotalRented.setBounds(73, 423, 151, 31);
		lblTotalRented.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblTotalRented);
		
		textField = new JTextField();
		textField.setBounds(275, 250, 170, 43);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		add(textField);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(275, 170, 170, 41);
		add(monthChooser);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(275, 336, 170, 43);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(275, 417, 170, 43);
		add(textField_2);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Advertisement Updated", "Inventory System",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUpdate.setBounds(584, 484, 151, 42);
		add(btnUpdate);
	}
}
