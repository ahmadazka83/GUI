package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCounter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCounter frame = new WordCounter();
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
	public WordCounter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(10, 23, 414, 190);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl1A = new JLabel("");
		lbl1A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1A.setBounds(102, 224, 38, 23);
		contentPane.add(lbl1A);
		
		JLabel lbl1B = new JLabel("/ 5000 kata");
		lbl1B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1B.setBounds(127, 224, 89, 23);
		contentPane.add(lbl1B);
		
		JButton btn1 = new JButton("Cek Kata");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int jumlah = textField.getText().replaceAll(" ", "").length();
				lbl1A.setText(Integer.toString(jumlah));
			}
		});
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(0, 255, 0));
		btn1.setBounds(335, 224, 89, 23);
		contentPane.add(btn1);
		
		JLabel lbl2B = new JLabel("Kalimat");
		lbl2B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2B.setBounds(50, 224, 56, 23);
		contentPane.add(lbl2B);
		
		JLabel lbl2A = new JLabel("");
		lbl2A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2A.setBounds(10, 224, 38, 23);
		contentPane.add(lbl2A);
		
		JButton btn2 = new JButton("Cek Kalimat");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kalimat = textField.getText().replaceAll(" + ", " ").trim();
				int jumlah = 0;
				if(!kalimat.isEmpty()) {
					String kata[] = kalimat.split(" ");
					jumlah = kata.length;
				}
				lbl2A.setText(Integer.toString(jumlah));
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setBackground(Color.ORANGE);
		btn2.setBounds(211, 224, 114, 23);
		contentPane.add(btn2);
	}
}
