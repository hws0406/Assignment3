import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryManagement extends JPanel {
	private JTextField typesText;
	private JTextField priceText;
	private JTextField quantityText;
	private JTextField availableText;
	private JTextField rentedText;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public InventoryManagement() {
		
		setSize(870, 583);
		setVisible(true);
		setLayout(null);
		
		JLabel lblInventoryMarketing = new JLabel("Inventory Management");
		lblInventoryMarketing.setBounds(252, 26, 394, 43);
		lblInventoryMarketing.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(lblInventoryMarketing);
		
		JLabel lblTypes = new JLabel("Types:");
		lblTypes.setBounds(22, 101, 151, 31);
		lblTypes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblTypes);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(22, 167, 151, 31);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(22, 236, 151, 31);
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblQuantity);
		
		JLabel lblRental = new JLabel("Available:");
		lblRental.setBounds(22, 309, 151, 31);
		lblRental.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblRental);
		
		JLabel lblRented = new JLabel("Rented:");
		lblRented.setBounds(22, 378, 151, 31);
		lblRented.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblRented);
		
		typesText = new JTextField();
		typesText.setBounds(150, 89, 170, 43);
		typesText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		typesText.setColumns(10);
		add(typesText);
		
		priceText = new JTextField();
		priceText.setBounds(150, 161, 170, 43);
		priceText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		priceText.setColumns(10);
		add(priceText);
		
		quantityText = new JTextField();
		quantityText.setBounds(150, 230, 170, 43);
		quantityText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		quantityText.setColumns(10);
		add(quantityText);
		
		availableText = new JTextField();
		availableText.setBounds(150, 303, 170, 43);
		availableText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		availableText.setColumns(10);
		add(availableText);
		
		rentedText = new JTextField();
		rentedText.setBounds(150, 371, 170, 43);
		rentedText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rentedText.setColumns(10);
		add(rentedText);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						typesText.getText(),
						priceText.getText(),
						quantityText.getText(),
						availableText.getText(),
						rentedText.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Info Added", "Admin - Inventory Management",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(22, 454, 151, 42);
		add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() == -1) {
					if ((table.getRowCount() == 0)) {
						JOptionPane.showMessageDialog(null, "No data to edit",
								"Admin - Inventory Management", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to edit",
								"Admin - Inventory Management", JOptionPane.OK_OPTION);
					}
				} else {
					table.setValueAt(typesText.getText(), table.getSelectedRow(), 0);
					table.setValueAt(priceText.getText(), table.getSelectedRow(), 1);
					table.setValueAt(quantityText.getText(), table.getSelectedRow(), 2);
					table.setValueAt(availableText.getText(), table.getSelectedRow(), 3);
					table.setValueAt(rentedText.getText(), table.getSelectedRow(), 4);
					
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUpdate.setBounds(195, 454, 151, 42);
		add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Admin - Inventory Management", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Admin - Inventory Management", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelete.setBounds(22, 516, 151, 42);
		add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						typesText.setText("");
						priceText.setText("");
						quantityText.setText("");
						availableText.setText("");
						rentedText.setText("");
				}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(195, 516, 151, 42);
		add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBounds(386, 101, 447, 457);
		panel.setBackground(Color.WHITE);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 427, 437);
		panel.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Types", "Price", "Quantity", "Available", "Rented"
			}
		));
		scrollPane_1.setViewportView(table);

	}
}
