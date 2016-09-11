package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double fn;
	double sn;
	double res;
	String op;
	String ans;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 232, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 220, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// --------------------------------- Row 1 ------------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn7.setBounds(6, 64, 45, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn8.setBounds(63, 64, 45, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn9.setBounds(120, 64, 45, 45);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnPlus.setBounds(177, 64, 45, 45);
		frame.getContentPane().add(btnPlus);
		
		// --------------------------------- Row 2 ------------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn4.setBounds(6, 121, 45, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn5.setBounds(63, 121, 45, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn6.setBounds(120, 121, 45, 45);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnMinus.setBounds(177, 121, 45, 45);
		frame.getContentPane().add(btnMinus);
		
		// --------------------------------- Row 3 ------------------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn1.setBounds(6, 178, 45, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn2.setBounds(63, 178, 45, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn3.setBounds(120, 178, 45, 45);
		frame.getContentPane().add(btn3);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*";
			}
		});
		btnMultiply.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnMultiply.setBounds(177, 178, 45, 45);
		frame.getContentPane().add(btnMultiply);
		
		
		// --------------------------------- Row 4 ------------------------------------
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + ".";
				textField.setText(enterNumber);
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnDot.setBounds(6, 235, 45, 45);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btn0.setBounds(63, 235, 45, 45);
		frame.getContentPane().add(btn0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sn = Double.parseDouble(textField.getText());
				if(op == "+"){
					res = fn + sn;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(op == "-"){
					res = fn - sn;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(op == "/"){
					res = fn / sn;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(op == "*"){
					res = fn * sn;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
			}
		});
		btnEquals.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnEquals.setBounds(120, 235, 45, 45);
		frame.getContentPane().add(btnEquals);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/";
			}
		});
		btnDivide.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnDivide.setBounds(177, 235, 45, 45);
		frame.getContentPane().add(btnDivide);
		
		// --------------------------------- Row 5 ------------------------------------
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op == ""){
					fn = Double.parseDouble(textField.getText());
					ans = String.format("%.2f", fn/100);
					textField.setText(ans);
				}
				else{
					sn = Double.parseDouble(textField.getText());
					ans = String.format("%.2f", sn/100);
					textField.setText(ans);
				}
			}
		});
		btnPercent.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnPercent.setBounds(6, 292, 45, 45);
		frame.getContentPane().add(btnPercent);
		
		JButton btnSign = new JButton("±");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnSign.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnSign.setBounds(63, 292, 45, 45);
		frame.getContentPane().add(btnSign);
		
		JButton btnDel = new JButton("del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String del = null;
				
				if(textField.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					del = strB.toString();
					textField.setText(del);
				}
			}
		});
		btnDel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnDel.setBounds(120, 292, 45, 45);
		frame.getContentPane().add(btnDel);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn = 0;
				sn = 0;
				res = 0;
				op = "";
				textField.setText("");
			}
		});
		btnCE.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnCE.setBounds(177, 292, 45, 45);
		frame.getContentPane().add(btnCE);
	}
}
