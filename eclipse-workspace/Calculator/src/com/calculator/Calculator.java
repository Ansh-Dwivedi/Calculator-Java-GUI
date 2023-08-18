package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
    double first;
    double second;
    double result;
    String operation;
    String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
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
		frmCalculator = new JFrame();
		frmCalculator.setBackground(new Color(240, 240, 240));
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(new Color(128, 128, 64));
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 35, 364, 91);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBackground(SystemColor.textInactiveText);
		btn1.setBounds(10, 368, 89, 56);
		frmCalculator.getContentPane().add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBackground(SystemColor.textInactiveText);
		btn0.setBounds(10, 426, 89, 56);
		frmCalculator.getContentPane().add(btn0);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBackground(SystemColor.textInactiveText);
		btn4.setBounds(10, 310, 89, 56);
		frmCalculator.getContentPane().add(btn4);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBackground(SystemColor.textInactiveText);
		btn7.setBounds(10, 252, 89, 56);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace=null;
				if (textField.getText().length()>0) {
					
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("wingdings", Font.BOLD, 20));
		btnBackspace.setBackground(SystemColor.info);
		btnBackspace.setBounds(10, 194, 89, 56);
		frmCalculator.getContentPane().add(btnBackspace);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBackground(SystemColor.activeCaption);
		btnDot.setBounds(101, 426, 89, 56);
		frmCalculator.getContentPane().add(btnDot);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBackground(SystemColor.textInactiveText);
		btn2.setBounds(101, 368, 89, 56);
		frmCalculator.getContentPane().add(btn2);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBackground(SystemColor.textInactiveText);
		btn5.setBounds(101, 310, 89, 56);
		frmCalculator.getContentPane().add(btn5);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBackground(SystemColor.textInactiveText);
		btn8.setBounds(101, 252, 89, 56);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBackground(SystemColor.textHighlight);
		btnClear.setBounds(101, 194, 89, 56);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second= Double.parseDouble(textField.getText());
				if (operation=="+") {
					result=first+second;
					textField.setText(String.valueOf(result));	
				}else if (operation=="-") {
					result=first-second;
					textField.setText(String.valueOf(result));	
				}else if (operation=="*") {
					result=first*second;
					textField.setText(String.valueOf(result));	
				}else if (operation=="/") {
					result=first/second;
					textField.setText(String.valueOf(result));	
				}else if (operation=="%") {
					result=first%second;
					textField.setText(String.valueOf(result));	
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBackground(SystemColor.activeCaption);
		btnEqual.setBounds(192, 426, 89, 56);
		frmCalculator.getContentPane().add(btnEqual);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBackground(SystemColor.textInactiveText);
		btn3.setBounds(192, 368, 89, 56);
		frmCalculator.getContentPane().add(btn3);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBackground(SystemColor.textInactiveText);
		btn6.setBounds(192, 310, 89, 56);
		frmCalculator.getContentPane().add(btn6);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBackground(SystemColor.textInactiveText);
		btn9.setBounds(192, 252, 89, 56);
		frmCalculator.getContentPane().add(btn9);
		
		final JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn00.setBackground(SystemColor.windowBorder);
		btn00.setBounds(192, 194, 89, 56);
		frmCalculator.getContentPane().add(btn00);
		
		JButton btnPersent = new JButton("%");
		btnPersent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			
			}
		});
		btnPersent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPersent.setBackground(SystemColor.activeCaption);
		btnPersent.setBounds(285, 426, 89, 56);
		frmCalculator.getContentPane().add(btnPersent);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="/";
			
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBackground(SystemColor.activeCaption);
		btnDiv.setBounds(285, 368, 89, 56);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
			
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBackground(SystemColor.activeCaption);
		btnMul.setBounds(285, 310, 89, 56);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="-";
			
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBackground(SystemColor.activeCaption);
		btnSub.setBounds(285, 252, 89, 56);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBackground(SystemColor.activeCaption);
		btnPlus.setBounds(285, 194, 89, 56);
		frmCalculator.getContentPane().add(btnPlus);
		frmCalculator.setBounds(100, 100, 400, 545);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
