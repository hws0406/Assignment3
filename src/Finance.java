import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JPanel {
	private JTextField textSales;
	private JTextField textExpenses;
	private JTextField textSalary;

	/**
	 * Create the panel.
	 */
	public Finance() {
		
		setSize(870, 583);
		setLayout(null);
		setVisible(true);
		
		JLabel lblFinanceSystem = new JLabel("Finance System");
		lblFinanceSystem.setBounds(293, 58, 244, 43);
		lblFinanceSystem.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(lblFinanceSystem);
		
		JLabel lblTotalSales = new JLabel("Total Sales:");
		lblTotalSales.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalSales.setBounds(53, 248, 151, 31);
		add(lblTotalSales);
		
		JLabel lblTotalExpenses = new JLabel("Total Expenses:");
		lblTotalExpenses.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalExpenses.setBounds(53, 334, 180, 31);
		add(lblTotalExpenses);
		
		JLabel lblTotalSalary = new JLabel("Total Salary:");
		lblTotalSalary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalSalary.setBounds(53, 415, 151, 31);
		add(lblTotalSalary);
		
		JLabel monthLabel = new JLabel("Month:");
		monthLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		monthLabel.setBounds(53, 162, 151, 31);
		add(monthLabel);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(255, 162, 170, 41);
		add(monthChooser);
		
		textSales = new JTextField();
		textSales.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textSales.setColumns(10);
		textSales.setBounds(255, 242, 170, 43);
		add(textSales);
		
		textExpenses = new JTextField();
		textExpenses.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textExpenses.setColumns(10);
		textExpenses.setBounds(255, 328, 170, 43);
		add(textExpenses);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textSalary.setColumns(10);
		textSalary.setBounds(255, 409, 170, 43);
		add(textSalary);
		
		JLabel lblNettIncome = new JLabel("Nett Income:");
		lblNettIncome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNettIncome.setBounds(53, 492, 151, 31);
		add(lblNettIncome);
		
		JLabel lblGetIncome = new JLabel("");
		lblGetIncome.setBounds(255, 477, 164, 43);
		add(lblGetIncome);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sales = Double.parseDouble(textSales.getText());
				double expenses = Double.parseDouble(textExpenses.getText());
				double salary = Double.parseDouble(textSalary.getText());
				
				double income = sales - expenses - salary;
				String ni = Double.toString(income);
				
				lblGetIncome.setText(ni);
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalculate.setBounds(498, 503, 151, 42);
		add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSales.setText("");
				textExpenses.setText("");
				textSalary.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(673, 503, 151, 42);
		add(btnClear);

	}
}
