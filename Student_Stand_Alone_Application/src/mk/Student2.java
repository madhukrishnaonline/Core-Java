package mk;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

@SuppressWarnings("serial")
public class Student2 extends JFrame implements ActionListener {
	String str1, str2 = null, str3, str4;
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	JLabel lb5;
	JLabel lb6;
	JLabel lb7;
	JLabel lb8;
	@SuppressWarnings("rawtypes")
	JComboBox jc;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JButton b1;
	JButton b2;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	Student2() // constructor
	{
		Container c = this.getContentPane();
		String str1[] = { "ECE", "CSE", "EEE", "MECH", "CIVIL" };
		jc = new JComboBox(str1);
		c.setLayout(null);
		c.setBackground(Color.yellow);
		Font f1 = new Font("dialog", Font.BOLD, 30);
		lb1 = new JLabel("Student Data");
		lb1.setFont(f1);
		lb1.setBounds(450, 50, 500, 50);
		lb1.setForeground(Color.red);
		Font f = new Font("dialog", Font.BOLD, 20);
		lb3 = new JLabel("BRANCH");
		lb3.setFont(f);
		lb3.setBounds(450, 100, 500, 50);
		lb3.setForeground(Color.red);
		jc.setFont(f);
		jc.setBounds(550, 100, 150, 50);
		jc.setForeground(Color.GREEN);
		lb2 = new JLabel("NAME");
		lb2.setFont(f);
		lb2.setBounds(50, 100, 500, 50);
		lb2.setForeground(Color.red);
		t1 = new JTextField(50);
		t1.setBounds(200, 100, 200, 50);
		lb4 = new JLabel("RNO");
		lb4.setFont(f);
		lb4.setBounds(50, 180, 500, 50);
		lb4.setForeground(Color.red);
		t2 = new JTextField(50);
		t2.setBounds(200, 180, 200, 50);
		lb5 = new JLabel("6 SUB MARKS");
		lb5.setFont(f);
		lb5.setBounds(50, 260, 500, 50);
		lb5.setForeground(Color.red);
		t3 = new JTextField(50);
		t3.setBounds(200, 260, 300, 50);
		lb6 = new JLabel("TOTAL");
		lb6.setFont(f);
		lb6.setBounds(50, 340, 500, 50);
		lb6.setForeground(Color.red);
		t4 = new JTextField(50);
		t4.setBounds(200, 340, 150, 50);
		lb7 = new JLabel("PERCENTAGE");
		lb7.setFont(f);
		lb7.setBounds(450, 340, 500, 50);
		lb7.setForeground(Color.red);
		t5 = new JTextField(50);
		t5.setBounds(600, 340, 150, 50);
		lb8 = new JLabel("RESULT");
		lb8.setFont(f);
		lb8.setBounds(50, 420, 500, 50);
		lb8.setForeground(Color.red);
		t6 = new JTextField(50);
		t6.setBounds(200, 420, 150, 50);
		b1 = new JButton("Calculate");
		b1.setBounds(300, 500, 100, 50);
		b2 = new JButton("Clear");
		b2.setBounds(500, 500, 100, 50);
		c.add(lb1);
		c.add(lb2);
		c.add(t1);
		c.add(lb3);
		c.add(jc);
		c.add(lb4);
		c.add(t2);
		c.add(lb5);
		c.add(t3);
		c.add(lb6);
		c.add(t4);
		c.add(lb7);
		c.add(t5);
		c.add(lb8);
		c.add(t6);
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public static void main(String[] args) {
		Student2 obj1 = new Student2();
		obj1.setTitle("Student Details");
		obj1.setSize(800, 600);
		obj1.setVisible(true);
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window
	}//main

	public void actionPerformed(ActionEvent arg) {
		str1 = arg.getActionCommand();
		if (str1.equals("Calculate")) {
			str2 = t1.getText();
			str3 = t2.getText();
			try {
				int len = str3.length();
				if (len == 10) {
					try {
						String s11 = str3.substring(7, 8);
						Choice2 c1 = new Choice2();
						String bb = c1.valid(s11);
						boolean br1 = bb.equals("1");
						boolean br2 = bb.equals("2");
						boolean br3 = bb.equals("3");
						boolean br4 = bb.equals("4");
						boolean br5 = bb.equals("5");
						String ss = null;
						if (br1)
							ss = "CIVIL";
						else if (br2)
							ss = "EEE";
						else if (br3)
							ss = "mech";
						else if (br4)
							ss = "ECE";
						else if (br5)
							ss = "CSE";
						if (((jc.getSelectedItem().toString()).equals(ss))) {
							try {
								str4 = t3.getText();
								StringTokenizer st = new StringTokenizer(str4, " ");
								int a, b, c, d, e, f;
								String s1 = st.nextToken();
								String s2 = st.nextToken();
								String s3 = st.nextToken();
								String s4 = st.nextToken();
								String s5 = st.nextToken();
								String s6 = st.nextToken();
								a = Integer.parseInt(s1);
								b = Integer.parseInt(s2);
								c = Integer.parseInt(s3);
								d = Integer.parseInt(s4);
								e = Integer.parseInt(s5);
								f = Integer.parseInt(s6);
								if (!((a < 0 || a > 100) || (b < 0 || b > 100) || (c < 0 || c > 100)
										|| (d < 0 || d > 100) || (e < 0 || e > 100) || (f < 0 || f > 100))) {
									int total = a + b + c + d + e + f;
									t4.setText(" " + total);
									float per = total / 6;
									t5.setText(" " + per);
									if ((a < 35 || b < 35 || c < 35 || d < 35 || e < 35 || f < 35)) {
										t6.setText("fail");
									} else {
										t6.setText("pass");
									}
								} else {
									JOptionPane.showMessageDialog(this, "values between 0 to 100");
								}
							} catch (NumberFormatException nfe) {
								JOptionPane.showMessageDialog(this, "only enter the number in marks");
							}
						} else {
							JOptionPane.showMessageDialog(this, "mismatch of rno and branch");
						}
					} catch (NullPointerException npe) {
						JOptionPane.showMessageDialog(this, "invalid rno");
					}
				} else {
					JOptionPane.showMessageDialog(this, "rno must be 10 digits");
				}
			} catch (NoSuchElementException nsee) {
				JOptionPane.showMessageDialog(this, " plz enter 6 sub marks");
			}
		} else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
		}
	}
}

class Choice2 {
	String b;

	String valid(String s1) {
		switch (s1) {
		case "1":
			b = "1";
			break;
		case "2":
			b = "2";
			break;
		case "3":
			b = "3";
			break;
		case "4":
			b = "4";
			break;
		case "5":
			b = "5";
			break;
		}
		return b;
	}
}//class