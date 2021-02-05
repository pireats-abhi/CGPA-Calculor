package com.das.abhijeet.project.CGPACal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MainDashBoard {

	private JFrame frame;
	private JTextField noOfTheorySubject;
	private JTextField noOfLabSubject;
	private ArrayList<JTextField> gradePointOfTheorySubject = new ArrayList<>();
	private ArrayList<JTextField> gradePointOfLabSubject = new ArrayList<>();
	private ArrayList<JLabel> theorySubjectLabel = new ArrayList<>();
	private ArrayList<JLabel> labSubjectLabel = new ArrayList<>();
	
	private JTextField subOne;
	private JTextField labOne;
	private JLabel lblNewLabel_1;
	private int verified;
	private JPanel panel;
	private JPanel panel_3;
	private JPanel panel_3_1;
	private JPanel panel_1;
	private JPanel panel_2;
	
	private double finalGradePoint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashBoard window = new MainDashBoard();
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
	public MainDashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 729, 32);
		frame.getContentPane().add(panel);
		
		JLabel headerLabel = new JLabel("CGPA Calculator");
		headerLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		headerLabel.setForeground(new Color(255, 255, 255));
		panel.add(headerLabel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 32, 729, 105);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel subjectLabel = new JLabel("No. of Theory Subject:");
		subjectLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		subjectLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		subjectLabel.setBounds(244, 11, 141, 18);
		panel_1.add(subjectLabel);
		
		noOfTheorySubject = new JTextField();
		noOfTheorySubject.setFont(new Font("Tahoma", Font.PLAIN, 12));
		noOfTheorySubject.setHorizontalAlignment(SwingConstants.CENTER);
		noOfTheorySubject.setBounds(395, 10, 86, 20);
		panel_1.add(noOfTheorySubject);
		noOfTheorySubject.setColumns(10);
		
		JLabel labLabel = new JLabel("No. of Lab Subject:");
		labLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		labLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labLabel.setBounds(223, 40, 162, 18);
		panel_1.add(labLabel);
		
		noOfLabSubject = new JTextField();
		noOfLabSubject.setFont(new Font("Tahoma", Font.PLAIN, 12));
		noOfLabSubject.setHorizontalAlignment(SwingConstants.CENTER);
		noOfLabSubject.setBounds(395, 41, 86, 20);
		panel_1.add(noOfLabSubject);
		noOfLabSubject.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 136, 729, 290);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 429, 709, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		panel_3 = new JPanel();
		
		panel_3_1 = new JPanel();
		
		JButton nextBtn = new JButton("Next");
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalTheorySubject = 0;
				int totalLabSubject = 0;
				try {
					totalTheorySubject = Integer.parseInt(noOfTheorySubject.getText());
					totalLabSubject = Integer.parseInt(noOfLabSubject.getText());
					panel_2.removeAll();
					panel_3.removeAll();
					panel_3_1.removeAll();
					gradePointOfTheorySubject.clear();
					gradePointOfLabSubject.clear();
					lblNewLabel_1.setText(null);
					verified = 1;
					
					frame.revalidate();
					frame.repaint();
					
				} catch (Exception e2) {
					panel_2.removeAll();
					panel_3.removeAll();
					panel_3_1.removeAll();
					lblNewLabel_1.setText("Please insert valid input");
					verified = 0;
					
					frame.revalidate();
					frame.repaint();
				}
				
				if (verified == 0) {
					
				} else if (totalTheorySubject > 0 || totalLabSubject > 0) {
					
					panel_3.setBorder(new LineBorder(new Color(0, 128, 128), 2));
					panel_3.setBounds(10, 5, 709, 30);
					panel_3.setBackground(new Color(255, 255, 255));
					panel_2.add(panel_3);
					
					panel_3_1.setBorder(new LineBorder(new Color(0, 128, 128), 2));
					panel_3_1.setBackground(new Color(255, 255, 255));
					panel_3_1.setBounds(10, 148, 709, 30);
					panel_2.add(panel_3_1);
					
					JLabel lblNewLabel = new JLabel("Input Your Theory Subject Point");
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setForeground(new Color(0, 128, 128));
					lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel_3.add(lblNewLabel);
					
					int x = 42;
					int y = 46;
					int z = 164;
					for (int i = 1; i <= totalTheorySubject; i++) {
						
						if (i <= 3) {
							JLabel subLabel = new JLabel("Theory Subject " + i + ":");
							subLabel.setHorizontalAlignment(SwingConstants.TRAILING);
							subLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
							subLabel.setBounds(x, y, 112, 23);
							x += 215;
							panel_2.add(subLabel);
							theorySubjectLabel.add(subLabel);
							
							subOne = new JTextField();
							subOne.setHorizontalAlignment(SwingConstants.CENTER);
							subOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
							subOne.setColumns(10);
							subOne.setBounds(z, y, 86, 20);
							z += 215;
							panel_2.add(subOne);
							gradePointOfTheorySubject.add(subOne);
							
							if (i == 3) {
								x = 42;
								y += 34;
								z = 164;
							}
						} else if (i <= 6) {
							JLabel subLabel = new JLabel("Theory Subject " + i + ":");
							subLabel.setHorizontalAlignment(SwingConstants.TRAILING);
							subLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
							subLabel.setBounds(x, y, 112, 23);
							x += 215;
							panel_2.add(subLabel);
							theorySubjectLabel.add(subLabel);
							
							subOne = new JTextField();
							subOne.setHorizontalAlignment(SwingConstants.CENTER);
							subOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
							subOne.setColumns(10);
							subOne.setBounds(z, y, 86, 20);
							z += 215;
							panel_2.add(subOne);
							gradePointOfTheorySubject.add(subOne);
							
							if (i == 6) {
								x = 42;
								y += 34;
								z = 164;
							}
						} else {
							if (i >= 10) {
								break;
							}
							JLabel subLabel = new JLabel("Theory Subject " + i + ":");
							subLabel.setHorizontalAlignment(SwingConstants.TRAILING);
							subLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
							subLabel.setBounds(x, y, 112, 23);
							x += 215;
							panel_2.add(subLabel);
							theorySubjectLabel.add(subLabel);
							
							subOne = new JTextField();
							subOne.setHorizontalAlignment(SwingConstants.CENTER);
							subOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
							subOne.setColumns(10);
							subOne.setBounds(z, y, 86, 20);
							z += 215;
							panel_2.add(subOne);
							gradePointOfTheorySubject.add(subOne);
						}
						
					}
					
					JLabel lblNewLabel_2 = new JLabel("Input Your Lab Subject Point");
					lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblNewLabel_2.setForeground(new Color(0, 128, 128));
					panel_3_1.add(lblNewLabel_2);
					
					
					x = 42;
					y = 189;
					z = 164;
					for (int i = 1; i <= totalLabSubject; i++) {
						if (i <= 3) {
							JLabel lblLabSubject = new JLabel("Lab Subject " + i + ":");
							lblLabSubject.setHorizontalAlignment(SwingConstants.TRAILING);
							lblLabSubject.setFont(new Font("Tahoma", Font.PLAIN, 14));
							lblLabSubject.setBounds(x, y, 112, 23);
							x += 215;
							panel_2.add(lblLabSubject);
							labSubjectLabel.add(lblLabSubject);
							
							labOne = new JTextField();
							labOne.setHorizontalAlignment(SwingConstants.CENTER);
							labOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
							labOne.setColumns(10);
							labOne.setBounds(z, y, 86, 20);
							z += 215;
							panel_2.add(labOne);
							gradePointOfLabSubject.add(labOne);
							
							if (i == 3) {
								x = 42;
								y += 34;
								z = 164;
							}
						} else {
							if (i >= 7) {
								break;
							}
							JLabel lblLabSubject = new JLabel("Lab Subject " + i + ":");
							lblLabSubject.setHorizontalAlignment(SwingConstants.TRAILING);
							lblLabSubject.setFont(new Font("Tahoma", Font.PLAIN, 14));
							lblLabSubject.setBounds(x, y, 112, 23);
							x += 215;
							panel_2.add(lblLabSubject);
							labSubjectLabel.add(lblLabSubject);
							
							labOne = new JTextField();
							labOne.setHorizontalAlignment(SwingConstants.CENTER);
							labOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
							labOne.setColumns(10);
							labOne.setBounds(z, y, 86, 20);
							z += 215;
							panel_2.add(labOne);
							gradePointOfLabSubject.add(labOne);
						}
						
					}
					
					JButton submitBtn = new JButton("Submit");
					submitBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double finalTheorySubjectPoint = 0;
							double finalLabSubjectPoint = 0;
							int counter = 0;
							int theorySubject = 0;
							int labSubject = 0;
							String message;
							
							for(JTextField textField:gradePointOfTheorySubject) {
								try {
									double point = Double.parseDouble(textField.getText());
									point *= 4;
									finalTheorySubjectPoint += point;
									counter += 4;
									theorySubject++;
								} catch (Exception e2) {
									lblNewLabel_1.setText("Please insert valid input");
								}
							}
							
							for(JTextField textField:gradePointOfLabSubject) {
								try {
									double point = Double.parseDouble(textField.getText());
									point *= 1;
									finalLabSubjectPoint += point;
									counter++;
									labSubject++;
								} catch (Exception e2) {
									lblNewLabel_1.setText("Please insert valid input");
								}
							}
							
							finalGradePoint = (finalTheorySubjectPoint + finalLabSubjectPoint) / counter;
							
							
							if (finalGradePoint >= 3.5) {
								message = "Congratulations! In this trimister you got " + finalGradePoint + " out of 4.00.";
							} else if (finalGradePoint < 2) {
								message = "Sorry! In this trimister you got " + finalGradePoint + " out of 4.00.";
							} else {
								message = "In this trimister you got " + finalGradePoint + " out of 4.00.";
							}
							
//							if (lblNewLabel_1.get)
							
							if (gradePointOfTheorySubject.size() == theorySubject && gradePointOfLabSubject.size() == labSubject) {
								lblNewLabel_1.setText(message);
							}
							
							frame.revalidate();
							frame.repaint();
						}
					});
					submitBtn.setForeground(Color.WHITE);
					submitBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
					submitBtn.setBackground(new Color(0, 128, 128));
					submitBtn.setBounds(240, 255, 237, 23);
					panel_2.add(submitBtn);
					
//					noOfTheorySubject.setEnabled(false);
//					noOfLabSubject.setEnabled(false);
//					nextBtn.setEnabled(false);
					
					frame.revalidate();
					frame.repaint();
				}
			}
		});
		nextBtn.setForeground(new Color(255, 255, 255));
		nextBtn.setBackground(new Color(0, 128, 128));
		nextBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nextBtn.setBounds(244, 72, 237, 23);
		panel_1.add(nextBtn);
		
	}
	
}
