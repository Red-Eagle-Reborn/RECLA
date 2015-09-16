/*
 * RECLA
 * Red Eagle Code Language
 * Creator : DevilLord Red Eagle / Darius Ellert Klaus
 * For : Public Usage
 * Release Date : 17/09/2015
 */

package org.redeagle.frecla;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


class JTextFieldLimit extends PlainDocument {
  /**
	 * 
	 */
	private static final long serialVersionUID = -2163618420474377210L;
private int limit;
  JTextFieldLimit(int limit) {
    super();
    this.limit = limit;
  }

  JTextFieldLimit(int limit, boolean upper) {
    super();
    this.limit = limit;
  }

  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}


public class Recla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHay;
	private JTextField textField;
	
	public Recla() {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHay = new JTextField();
		txtHay.setToolTipText("");
		txtHay.setBounds(10, 24, 414, 20);
		contentPane.add(txtHay);
		txtHay.setColumns(10);
		txtHay.setDocument(new JTextFieldLimit(50));
		
		JLabel lblText = new JLabel("Text:");
		lblText.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblText.setBounds(10, 11, 46, 14);
		contentPane.add(lblText);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblResult.setBounds(10, 57, 46, 14);
		contentPane.add(lblResult);
		
		textField = new JTextField();
		textField.setBounds(10, 70, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Encrypt");
		btnNewButton.setBounds(133, 101, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setBounds(221, 101, 89, 23);
		contentPane.add(btnDecrypt);
		setTitle("First Red Eagle Code Language");
		
		btnNewButton.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
			   String jt = txtHay.getText();
			   String res = "";
			   if(jt != null) {
				   String[] tj = jt.split("");
				   for(int i = 0;i < tj.length;i++) {
					   if(tj[i].equals("a")) {
						   res += "q";
					   }
					   if(tj[i].equals("b")) {
						   res += "w";
					   }
					   if(tj[i].equals("c")) {
						   res += "e";
					   }
					   if(tj[i].equals("d")) {
						   res += "r";
					   }
					   if(tj[i].equals("e")) {
						   res += "t";
					   }
					   if(tj[i].equals("f")) {
						   res += "y";
					   }
					   if(tj[i].equals("g")) {
						   res += "u";
					   }
					   if(tj[i].equals("h")) {
						   res += "i";
					   }
					   if(tj[i].equals("i")) {
						   res += "o";
					   }
					   if(tj[i].equals("j")) {
						   res += "p";
					   }
					   if(tj[i].equals("k")) {
						   res += "a";
					   }
					   if(tj[i].equals("l")) {
						   res += "s";
					   }
					   if(tj[i].equals("m")) {
						   res += "d";
					   }
					   if(tj[i].equals("n")) {
						   res += "f";
					   }
					   if(tj[i].equals("o")) {
						   res += "g";
					   }
					   if(tj[i].equals("p")) {
						   res += "h";
					   }
					   if(tj[i].equals("q")) {
						   res += "j";
					   }
					   if(tj[i].equals("r")) {
						   res += "k";
					   }
					   if(tj[i].equals("s")) {
						   res += "l";
					   }
					   if(tj[i].equals("t")) {
						   res += "z";
					   }
					   if(tj[i].equals("u")) {
						   res += "x";
					   }
					   if(tj[i].equals("v")) {
						   res += "c";
					   }
					   if(tj[i].equals("w")) {
						   res += "v";
					   }
					   if(tj[i].equals("x")) {
						   res += "b";
					   }
					   if(tj[i].equals("y")) {
						   res += "n";
					   }
					   if(tj[i].equals("z")) {
						   res += "m";
					   }
					   
					   if(tj[i].equals("A")) {
						   res += "Q";
					   }
					   if(tj[i].equals("B")) {
						   res += "W";
					   }
					   if(tj[i].equals("C")) {
						   res += "E";
					   }
					   if(tj[i].equals("D")) {
						   res += "R";
					   }
					   if(tj[i].equals("E")) {
						   res += "T";
					   }
					   if(tj[i].equals("F")) {
						   res += "Y";
					   }
					   if(tj[i].equals("G")) {
						   res += "U";
					   }
					   if(tj[i].equals("H")) {
						   res += "I";
					   }
					   if(tj[i].equals("I")) {
						   res += "O";
					   }
					   if(tj[i].equals("J")) {
						   res += "P";
					   }
					   if(tj[i].equals("K")) {
						   res += "A";
					   }
					   if(tj[i].equals("L")) {
						   res += "S";
					   }
					   if(tj[i].equals("M")) {
						   res += "D";
					   }
					   if(tj[i].equals("N")) {
						   res += "F";
					   }
					   if(tj[i].equals("O")) {
						   res += "G";
					   }
					   if(tj[i].equals("P")) {
						   res += "H";
					   }
					   if(tj[i].equals("Q")) {
						   res += "J";
					   }
					   if(tj[i].equals("R")) {
						   res += "K";
					   }
					   if(tj[i].equals("S")) {
						   res += "L";
					   }
					   if(tj[i].equals("T")) {
						   res += "Z";
					   }
					   if(tj[i].equals("U")) {
						   res += "X";
					   }
					   if(tj[i].equals("V")) {
						   res += "C";
					   }
					   if(tj[i].equals("W")) {
						   res += "V";
					   }
					   if(tj[i].equals("X")) {
						   res += "B";
					   }
					   if(tj[i].equals("Y")) {
						   res += "N";
					   }
					   if(tj[i].equals("Z")) {
						   res += "M";
					   }
					   
					   if(tj[i].equals(" ")) {
						   res += " ";
					   }
				   }
				   textField.setText(res);
			   }
			  }
		});
		
		btnDecrypt.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
			   String jt = txtHay.getText();
			   String res = "";
			   if(jt != null) {
				   String[] tj = jt.split("");
				   for(int i = 0;i < tj.length;i++) {
					   if(tj[i].equals("q")) {
						   res += "a";
					   }
					   if(tj[i].equals("w")) {
						   res += "b";
					   }
					   if(tj[i].equals("e")) {
						   res += "c";
					   }
					   if(tj[i].equals("r")) {
						   res += "d";
					   }
					   if(tj[i].equals("t")) {
						   res += "e";
					   }
					   if(tj[i].equals("y")) {
						   res += "f";
					   }
					   if(tj[i].equals("u")) {
						   res += "g";
					   }
					   if(tj[i].equals("i")) {
						   res += "h";
					   }
					   if(tj[i].equals("o")) {
						   res += "i";
					   }
					   if(tj[i].equals("p")) {
						   res += "j";
					   }
					   if(tj[i].equals("a")) {
						   res += "k";
					   }
					   if(tj[i].equals("s")) {
						   res += "l";
					   }
					   if(tj[i].equals("d")) {
						   res += "m";
					   }
					   if(tj[i].equals("f")) {
						   res += "n";
					   }
					   if(tj[i].equals("g")) {
						   res += "o";
					   }
					   if(tj[i].equals("h")) {
						   res += "p";
					   }
					   if(tj[i].equals("j")) {
						   res += "q";
					   }
					   if(tj[i].equals("k")) {
						   res += "r";
					   }
					   if(tj[i].equals("l")) {
						   res += "s";
					   }
					   if(tj[i].equals("z")) {
						   res += "t";
					   }
					   if(tj[i].equals("x")) {
						   res += "u";
					   }
					   if(tj[i].equals("c")) {
						   res += "v";
					   }
					   if(tj[i].equals("v")) {
						   res += "w";
					   }
					   if(tj[i].equals("b")) {
						   res += "x";
					   }
					   if(tj[i].equals("n")) {
						   res += "y";
					   }
					   if(tj[i].equals("m")) {
						   res += "z";
					   }
					   
					   if(tj[i].equals("Q")) {
						   res += "A";
					   }
					   if(tj[i].equals("W")) {
						   res += "B";
					   }
					   if(tj[i].equals("E")) {
						   res += "C";
					   }
					   if(tj[i].equals("R")) {
						   res += "D";
					   }
					   if(tj[i].equals("T")) {
						   res += "E";
					   }
					   if(tj[i].equals("Y")) {
						   res += "F";
					   }
					   if(tj[i].equals("U")) {
						   res += "G";
					   }
					   if(tj[i].equals("I")) {
						   res += "H";
					   }
					   if(tj[i].equals("O")) {
						   res += "I";
					   }
					   if(tj[i].equals("P")) {
						   res += "J";
					   }
					   if(tj[i].equals("A")) {
						   res += "K";
					   }
					   if(tj[i].equals("S")) {
						   res += "L";
					   }
					   if(tj[i].equals("D")) {
						   res += "M";
					   }
					   if(tj[i].equals("F")) {
						   res += "N";
					   }
					   if(tj[i].equals("G")) {
						   res += "O";
					   }
					   if(tj[i].equals("H")) {
						   res += "P";
					   }
					   if(tj[i].equals("J")) {
						   res += "Q";
					   }
					   if(tj[i].equals("K")) {
						   res += "R";
					   }
					   if(tj[i].equals("L")) {
						   res += "S";
					   }
					   if(tj[i].equals("Z")) {
						   res += "T";
					   }
					   if(tj[i].equals("X")) {
						   res += "U";
					   }
					   if(tj[i].equals("C")) {
						   res += "V";
					   }
					   if(tj[i].equals("V")) {
						   res += "W";
					   }
					   if(tj[i].equals("B")) {
						   res += "X";
					   }
					   if(tj[i].equals("N")) {
						   res += "Y";
					   }
					   if(tj[i].equals("M")) {
						   res += "Z";
					   }
					   
					   if(tj[i].equals(" ")) {
						   res += " ";
					   }
				   }
				   textField.setText(res);
			   }
			  }
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recla frame = new Recla();

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
