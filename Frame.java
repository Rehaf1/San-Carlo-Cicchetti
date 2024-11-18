package jdbc;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Image image;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table1; // Employee table
	private JTable table8;
	private JTable table7;

	
	 Connection con ; 
	 private JPasswordField passwordField;
	 /**
	  * @wbp.nonvisual location=-20,41
	  */
	 private final JPanel pane8 = new JPanel();
	 private JTable table;
	 private JTextField textField_13;
	 private JTextField textField_15;
	 private JTextField textField_16;
	 private JTable table8_1;
	
	void creatConnection() throws ClassNotFoundException, java.sql.SQLException{
	    

		
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    String URL = "jdbc:mysql://localhost:3306/San Carlo Cicchetti";
	    String USER = "root";
	    String PASSWORD = "Rehaf123";
	      con = DriverManager.getConnection(URL, USER, PASSWORD);
	    System.out.println("Database connected: " + con);
	}
	
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	
	
	
	
	
	
	public Frame() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 743, 715);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);

	    // Initialize the tables
	    table1 = new JTable();


	    CardLayout cardlayout = new CardLayout(0, 0);
	    contentPane.setLayout(cardlayout);
			 JLabel label = new JLabel("");
			JLabel label2 = new JLabel ("");
			label2.setBounds(226, 6, 233, 214);
			JLabel label5= new JLabel(""); 
			JLabel label4 = new JLabel("");
			JLabel label6 = new JLabel("");
			JLabel label7= new JLabel(""); 
			JLabel label8= new JLabel(""); 
			JLabel label9= new JLabel(""); 
			JLabel label10= new JLabel(""); 
			JLabel label11= new JLabel(""); 
			JLabel label3 = new JLabel("");
			
			//ImageIcon icon = new ImageIcon("/Users/rehaf/git/San-Carlo-Cicchetti/database/src/jdbc/images.png");
			//Image image = icon.getImage();
			//Image newImage =  image.getScaledInstance(28, 28, Image.SCALE_DEFAULT);
			//Image scaledImage = image.getScaledInstance(300, 400, Image.SCALE_SMOOTH);
			//JLabel label = new JLabel(new ImageIcon(scaledImage));
			try {
			    ImageIcon im1 = new ImageIcon("/Users/rehaf/git/San-Carlo-Cicchetti/database/src/images.png"); 
			    Image im1Right =  im1.getImage();
			    Image modifidedIm1 = im1Right.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			    im1 = new ImageIcon( modifidedIm1); 
			    label.setIcon(im1);
			    label3.setIcon(im1);
			    label2.setIcon(im1);
			    label4.setIcon(im1);
			    label5.setIcon(im1); 
			    label6.setIcon(im1); 
			    label7.setIcon(im1);
			    label8.setIcon(im1);
			    label9.setIcon(im1); 
			    label10.setIcon(im1); 
			    label11.setIcon(im1); 
			    }catch (NullPointerException ex1) {}
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(312, 218, 130, 26);
			
			CardLayout cardLayout= (CardLayout) contentPane.getLayout();
			
			
			JPanel Panel1 = new JPanel();
			contentPane.add(Panel1, "Card1");
			cardlayout.show(contentPane, "Card1");
			Panel1.setLayout(null);
			JLabel lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(305, 291, 69, 16);
			Panel1.add(lblNewLabel);
			
			
			
			  
			
			
			JPanel panel7 = new JPanel();
			contentPane.add(panel7, "Card7");
			panel7.setLayout(null);
			panel7.add(label7);
			
			JButton btnNewButton_77_2 = new JButton("Delete Item ");
			btnNewButton_77_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnNewButton_77_2.setBounds(332, 243, 148, 29);
			panel7.add(btnNewButton_77_2);
			
			JButton btnNewButton_7_3 = new JButton("Home");
			btnNewButton_7_3.setBounds(599, 462, 117, 29);
			panel7.add(btnNewButton_7_3);
			btnNewButton_7_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout= (CardLayout) contentPane.getLayout();
					cardlayout.show(contentPane, "Card1");
					
				}
			});
			
			JTable table7 = new JTable();
			JScrollPane tableScrollPane2 = new JScrollPane(table1);
			tableScrollPane2.setBounds(40, 503, 561, 168);
			panel7.add(tableScrollPane2); 
			
			
			// Delete button with fixed logic
			JButton btnNewButton_7_4 = new JButton("Delete");
			btnNewButton_7_4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 // Refresh the table
		            String query = "SELECT * FROM EMPLOYEE";
		            populateTable(table1, query);

	                String empID = textField_13.getText().trim();
	                if (empID.isEmpty()) {
	                    JOptionPane.showMessageDialog(Frame.this, "Please enter a valid Employee ID.",
	                            "Input Error", JOptionPane.WARNING_MESSAGE);
	                    return;
	                }

	                try {
	                    if (con == null || con.isClosed()) {
	                        creatConnection();
	                    }
	                    con.setAutoCommit(false);

	                    String deleteEmployeeSQL = "DELETE FROM EMPLOYEE WHERE EID = ?";
	                    try (PreparedStatement stmt = con.prepareStatement(deleteEmployeeSQL)) {
	                        stmt.setString(1, empID);
	                        int rowsDeleted = stmt.executeUpdate();
	                        if (rowsDeleted > 0) {
	                            JOptionPane.showMessageDialog(Frame.this, "Employee deleted successfully!",
	                                    "Success", JOptionPane.INFORMATION_MESSAGE);
	                        } else {
	                            JOptionPane.showMessageDialog(Frame.this, "Employee ID not found.",
	                                    "Deletion Error", JOptionPane.WARNING_MESSAGE);
	                        }
	                    }

	                    con.commit();

	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                    try {
	                        con.rollback();
	                    } catch (SQLException rollbackEx) {
	                        rollbackEx.printStackTrace();
	                    }
	                    JOptionPane.showMessageDialog(Frame.this, "Error deleting employee: " + ex.getMessage(),
	                            "Database Error", JOptionPane.ERROR_MESSAGE);
	                } catch (ClassNotFoundException ex) {
	                    ex.printStackTrace();
	                }
	            }
	        });
			btnNewButton_7_4.setBounds(484, 462, 117, 29);
			panel7.add(btnNewButton_7_4);

			
			
			
			JPanel panel6 = new JPanel();
			contentPane.add(panel6, "Card6");
			panel6.setLayout(null);
			

			JPanel panel8 = new JPanel();
			panel8.setBounds(0, 0, 733, 677);
			contentPane.add(panel8,"Card8");
			panel8.setLayout(null);
			
			JButton btnNewButton_6_1 = new JButton("Delete Employee");
			btnNewButton_6_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout= (CardLayout) contentPane.getLayout();
					cardlayout.show(contentPane, "Card7");
				}
			});
			btnNewButton_6_1.setBounds(142, 244, 148, 29);
			panel6.add(btnNewButton_6_1);
			panel6.add(label6);
			
			JButton btnNewButton_6_2 = new JButton("Delete Item ");
			btnNewButton_6_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout cardlayout = (CardLayout) contentPane.getLayout();
					cardlayout.show(contentPane,"Card8");
				}
			});
			btnNewButton_6_2.setBounds(332, 243, 148, 29);
			panel6.add(btnNewButton_6_2);
			

			JButton btnNewButton_7_1 = new JButton("Delete Employee");
			btnNewButton_7_1.setBounds(142, 244, 117, 29);
			panel7.add(btnNewButton_7_1);
			
			JButton btnNewButton_7_2 = new JButton("Item");
			btnNewButton_7_2.setBounds(332, 243, 117, 29);
			panel7.add(btnNewButton_7_2);
			panel7.add(label7); 
			
			JLabel lblNewLabel_2 = new JLabel("Employee id to delete:");
			lblNewLabel_2.setBounds(38, 339, 148, 16);
			panel7.add(lblNewLabel_2);
			
			textField_13 = new JTextField();
			textField_13.setBounds(215, 334, 202, 26);
			panel7.add(textField_13);
			textField_13.setColumns(10);
			
			
			JTable table8 = new JTable();

			// Ensure `populateTable` targets this table
			String query = "SELECT * FROM Item"; 

			
			
			
			
			label.setBounds(196, 6, 210, 176); 
			Panel1.add(label);
			
			textField = new JTextField();
			textField.setBounds(153, 286, 130, 26);
			Panel1.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("UserName");
			lblNewLabel_1.setBounds(84, 291, 69, 16);
			Panel1.add(lblNewLabel_1);
			JComboBox comboBox = new JComboBox();
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout= (CardLayout) contentPane.getLayout();
					String selectedCard = (String) comboBox.getSelectedItem();
					if(selectedCard.equals("Manger")) {
						cardlayout.show(contentPane, "Card5");}
						else if (selectedCard.equals("Waiter")) {
							cardlayout.show(contentPane, "Card2");}
					}
			});
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Manger", "Waiter"}));
			comboBox.setBounds(516, 287, 90, 27);
			Panel1.add(comboBox);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(386, 286, 118, 26);
			Panel1.add(passwordField);
			
			JPanel Panel3 = new JPanel();
			contentPane.add(Panel3, "Card3");
			Panel3.setLayout(null);
			
			
			JButton btnNewButton_8 = new JButton("Employee");
			btnNewButton_8.setBounds(142, 244, 117, 29);
			Panel3.add(btnNewButton_8);
			Panel3.add(label2);
		
			JButton btnNewButton_9 = new JButton("Item");
			btnNewButton_9.setBounds(332, 243, 117, 29);
			Panel3.add(btnNewButton_9);
			btnNewButton_9.setBounds(398, 243, 120, 30); // X, Y, Width, Height
			
			JLabel lblNewLabel_5 = new JLabel("Item Name:  ");
			lblNewLabel_5.setBounds(113, 308, 93, 29);
			Panel3.add(lblNewLabel_5);
			JLabel lblNewLabel_3_1 = new JLabel("Item Price");
			lblNewLabel_3_1.setBounds(123, 346, 80, 16);
			Panel3.add(lblNewLabel_3_1);
			
			JTextField textField_11 = new JTextField();
			textField_11.setBounds(207, 309, 130, 26);
			Panel3.add(textField_11);
			textField_11.setColumns(10);
			
			JTextField textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(207, 341, 130, 26);
			Panel3.add(textField_12);
			
			
			JButton btnNewButton_3_1 = new JButton("Home");
			btnNewButton_3_1.setBounds(599, 462, 117, 29);
			Panel3.add(btnNewButton_3_1);
			btnNewButton_3_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout= (CardLayout) contentPane.getLayout();
					cardlayout.show(contentPane, "Card1");
					
				}
			});
			
			JButton btnNewButton_3_2 = new JButton("Insert");
			btnNewButton_3_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 String query = "SELECT * FROM ITEM"; // Replace with your table name
			         populateTable(table, query); 
			        // Ensure database connection is established
			        try {
			            if (con == null || con.isClosed()) {
			                creatConnection();
			            }
			        } catch (Exception ex) {
			            Logger.getLogger(WaiterAndManger.class.getName()).log(Level.SEVERE, null, ex);
			            JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(),
			                                          "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }

			        // Get inputs and validate
			        String name = textField_11.getText().trim();
			        String priceText = textField_12.getText().trim();

			        if (name.isEmpty() || priceText.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "All fields must be filled!", "Input Error",
			                                          JOptionPane.WARNING_MESSAGE);
			            return;
			        }

			        double price;
			        try {
			            price = Double.parseDouble(priceText);
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, "Invalid price format. Please enter a valid number.",
			                                          "Input Error", JOptionPane.WARNING_MESSAGE);
			            return;
			        }

			        // Prepare and execute SQL operation
			        String operation1 = "INSERT INTO ITEM (ItemName, ItemPrice) VALUES ('"
			                + name + "', " + price + ")";

			        try (Statement stat = con.createStatement()) { // Try-with-resources for Statement
			            stat.executeUpdate(operation1);
			            JOptionPane.showMessageDialog(null, "Item added successfully!", "Success",
			                                          JOptionPane.INFORMATION_MESSAGE);
			        } catch (SQLException ex) {
			            Logger.getLogger(WaiterAndManger.class.getName()).log(Level.SEVERE, null, ex);
			            JOptionPane.showMessageDialog(null, "Error executing query: " + ex.getMessage(),
			                                          "Database Error", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			});

				
			btnNewButton_3_2.setBounds(484, 462, 117, 29);
			Panel3.add(btnNewButton_3_2); 
			
			label.setBounds(196, 6, 210, 176); 
			label2.setBounds(196, 6, 210, 176); 
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(90, 577, 1, 16);
			Panel3.add(textArea);
			
			JScrollPane tableScrollPane = new JScrollPane();
			tableScrollPane.setBounds(40, 503, 561, 168); // Adjust dimensions as needed
			Panel3.add(tableScrollPane);

			table = new JTable();
			tableScrollPane.setViewportView(table);
		
			label3.setBounds(196, 6, 210, 176); 
			
						
									JPanel panel5 = new JPanel();
									panel5.setBounds(0, 0, 733, 510);
									contentPane.add(panel5, "Card5");
									panel5.setLayout(null);
									panel5.add(label3);
									label3.setBounds(266, 5, 200, 200); 
									
									JButton btnNewButton_2 = new JButton("Insert");
									btnNewButton_2.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											CardLayout cardLayout= (CardLayout) contentPane.getLayout();
											cardlayout.show(contentPane, "Card2");
											
										}
									});
									btnNewButton_2.setBounds(69, 292, 117, 29);
									panel5.add(btnNewButton_2);
									
									JButton btnNewButton_3 = new JButton("Delete");
									btnNewButton_3.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											CardLayout cardLayout= (CardLayout) contentPane.getLayout();
											cardlayout.show(contentPane, "Card6");
											
										}
									});
									btnNewButton_3.setBounds(229, 292, 117, 29);
									panel5.add(btnNewButton_3);
									
									JButton btnNewButton_5 = new JButton("Update Employee Shift");
									btnNewButton_5.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											CardLayout cardLayout= (CardLayout) contentPane.getLayout();
											cardlayout.show(contentPane, "Card9");
										}
									});
									btnNewButton_5.setBounds(59, 375, 188, 29);
									panel5.add(btnNewButton_5);
									
									JButton btnNewButton_10 = new JButton(" Retrive ");
									btnNewButton_10.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
										}
									});
									btnNewButton_10.setBounds(69, 451, 135, 29);
									panel5.add(btnNewButton_10);
									
									JButton btnNewButton_5_1 = new JButton("Update Assigend to \n");
									btnNewButton_5_1.setBounds(259, 375, 183, 29);
									panel5.add(btnNewButton_5_1);
									
									JSeparator separator = new JSeparator();
									separator.setBackground(new Color(0, 0, 0));
									separator.setBounds(65, 321, 302, 12);
									panel5.add(separator);
									
									JSeparator separator_1 = new JSeparator();
									separator_1.setBackground(Color.BLACK);
									separator_1.setBounds(65, 416, 302, 12);
									panel5.add(separator_1);
									
									JLabel lblNewLabel_3 = new JLabel("Update:");
									lblNewLabel_3.setBounds(75, 333, 61, 16);
									panel5.add(lblNewLabel_3);
									
									JLabel lblNewLabel_3_3 = new JLabel("Action: ");
									lblNewLabel_3_3.setBounds(75, 264, 61, 16);
									panel5.add(lblNewLabel_3_3);


			
			JPanel Panel4 = new JPanel();
			Panel4.setBounds(0, 0, 733, 677);
			contentPane.add(Panel4, "Card4");
			Panel4.setLayout(null);

			// ScrollPane for Panel4
			JScrollPane tableScrollPane1 = new JScrollPane();
			tableScrollPane1.setBounds(40, 503, 561, 168); // Correct dimensions for table
			Panel4.add(tableScrollPane1);

			// Add Label
			label4.setBounds(218, 6, 214, 225);
			Panel4.add(label4);

			JButton btnNewButton_4 = new JButton("Insert");
			btnNewButton_4.setBounds(484, 462, 117, 29);
			Panel4.add(btnNewButton_4);
			
			JLabel lblNewLabel_4 = new JLabel("Last Name ");
			lblNewLabel_4.setBounds(44, 346, 86, 16);
			Panel4.add(lblNewLabel_4);
			
			JLabel lblNewLabel_4_1 = new JLabel("First Name");
			lblNewLabel_4_1.setBounds(44, 314, 86, 16);
			Panel4.add(lblNewLabel_4_1);
			
			JLabel lblNewLabel_4_2 = new JLabel("Role");
			lblNewLabel_4_2.setBounds(365, 346, 110, 16);
			Panel4.add(lblNewLabel_4_2);
			
			JLabel lblNewLabel_4_2_1 = new JLabel("ID ");
			lblNewLabel_4_2_1.setBounds(44, 382, 86, 16);
			Panel4.add(lblNewLabel_4_2_1);
			
			JLabel lblNewLabel_4_2_2 = new JLabel("Phone Number");
			lblNewLabel_4_2_2.setBounds(43, 410, 110, 16);
			Panel4.add(lblNewLabel_4_2_2);
			
			JLabel lblNewLabel_4_2_3 = new JLabel("Shift");
			lblNewLabel_4_2_3.setBounds(365, 314, 110, 16);
			Panel4.add(lblNewLabel_4_2_3);
			
			JLabel lblNewLabel_4_2_4 = new JLabel("Salary");
			lblNewLabel_4_2_4.setBounds(365, 410, 110, 16);
			Panel4.add(lblNewLabel_4_2_4);
			
			JLabel lblNewLabel_4_2_4_1 = new JLabel("Gender");
			lblNewLabel_4_2_4_1.setBounds(365, 382, 110, 16);
			Panel4.add(lblNewLabel_4_2_4_1);
			
			JLabel lblNewLabel_4_2_4_2 = new JLabel("Branch National Address");
			lblNewLabel_4_2_4_2.setBounds(42, 438, 164, 16);
			Panel4.add(lblNewLabel_4_2_4_2);
			
			JButton btnNewButton_6 = new JButton("Employee");
			btnNewButton_6.setBounds(142, 244, 117, 29);
			Panel4.add(btnNewButton_6);
			Panel4.add(label4);
			
			btnNewButton_6.setBounds(142, 244, 117, 29); // X, Y, Width, Height
			
				JButton btnNewButton_7 = new JButton("Item");
				Panel4.add(btnNewButton_7);
				btnNewButton_7.setBounds(332, 243, 117, 29); // X, Y, Width, Height
				
				textField_2 = new JTextField();
				textField_2.setBounds(207, 309, 130, 26);
				Panel4.add(textField_2);
				textField_2.setColumns(10);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(207, 341, 130, 26);
				Panel4.add(textField_3);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(207, 377, 130, 26);
				Panel4.add(textField_4);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(207, 405, 130, 26);
				Panel4.add(textField_5);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(207, 433, 130, 26);
				Panel4.add(textField_6);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(425, 309, 130, 26);
				Panel4.add(textField_7);
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(425, 341, 130, 26);
				Panel4.add(textField_8);
				
				textField_9 = new JTextField();
				textField_9.setColumns(10);
				textField_9.setBounds(425, 374, 130, 26);
				Panel4.add(textField_9);
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(425, 410, 130, 26);
				Panel4.add(textField_10);
				
				btnNewButton_6.setBounds(129, 243, 120, 30); // X, Y, Width, Height
				lblNewLabel_4.setBounds(44, 346, 86, 16);
				Panel4.add(lblNewLabel_4);
				lblNewLabel_4_1.setBounds(44, 314, 86, 16);
				Panel4.add(lblNewLabel_4_1);
				
		
				JButton btnNewButton_4_1 = new JButton("Home");
				btnNewButton_4_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CardLayout cardLayout= (CardLayout) contentPane.getLayout();
						cardlayout.show(contentPane, "Card1");
						
					}
				});
				btnNewButton_4_1.setBounds(599, 462, 117, 29);
				Panel4.add(btnNewButton_4_1);
				
				
	
							btnNewButton_4.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									String query = "SELECT * FROM EMPLOYEE"; 
							         populateTable(table1, query); 
									
									
									 try {
								            if (con == null || con.isClosed()) {
								                creatConnection();
								            }
								        } catch (Exception ex) {
								            Logger.getLogger(WaiterAndManger.class.getName()).log(Level.SEVERE, null, ex);
								            JOptionPane.showMessageDialog(null, "Database connection failed: " + ex.getMessage(), 
								                                          "Error", JOptionPane.ERROR_MESSAGE);
								            return;
								        }
									 
									 String first = textField_2.getText().trim();
								        String last = textField_3.getText().trim();
								        String id = textField_4.getText().trim();
								        String phone = textField_5.getText().trim();
								        String role = textField_8.getText().trim();
								        String gender = textField_9.getText().trim();
								        String shift = textField_7.getText().trim();
								        String salaryText = textField_10.getText().trim();
								        String branch = textField_6.getText().trim();
								        int ID = Integer.parseInt(id);
								        if (first.isEmpty() || last.isEmpty() || id.isEmpty() || phone.isEmpty() || 
								                role.isEmpty() || gender.isEmpty() || shift.isEmpty() || salaryText.isEmpty() || branch.isEmpty()) {
								                JOptionPane.showMessageDialog(null, "All fields must be filled!", "Input Error", 
								                                              JOptionPane.WARNING_MESSAGE);
								                return;
								            }
								        double salary;
								        try {
								            salary = Double.parseDouble(salaryText);
								        } catch (NumberFormatException ex) {
								            JOptionPane.showMessageDialog(null, "Invalid salary format. Please enter a valid number.", 
								                                          "Input Error", JOptionPane.WARNING_MESSAGE);
								            return;
								        }
				
				            String operation = "INSERT INTO EMPLOYEE (EFirstName, ELastName, EID, EPhoneNum, Role, Gender, Shift, Salary, Branch_NationalAddress) VALUES ('"
				                    + first + "', '" + last + "', '" + ID + "', '" + phone + "', '" + role + "', '" + gender + "', '"
				                    + shift + "', '" + salary + "', '" + branch + "')";
				
				            try (Statement stat = con.createStatement()) { // Try-with-resources for Statement
				                stat.executeUpdate(operation);
				                JOptionPane.showMessageDialog(null, "Employee added successfully!", "Success", 
				                        JOptionPane.INFORMATION_MESSAGE);
				            }catch (SQLException ex) {
				        	    Logger.getLogger(Manger.class.getName()).log(Level.SEVERE, null, ex); // Logs SQL errors
				        	} catch (NumberFormatException ex) {
				        		Logger.getLogger(WaiterAndManger.class.getName()).log(Level.SEVERE, null, ex);
				                JOptionPane.showMessageDialog(null, "Error executing query: " + ex.getMessage(), 
				                                              "Database Error", JOptionPane.ERROR_MESSAGE);
				        	}
						
						}});
			label3.setBounds(266, 5, 200, 200); 
			label4.setBounds(196, 6, 210, 176); 
			label5.setBounds(266, 5, 200, 200); 
			label2.setBounds(266, 5, 200, 200); 
			label6.setBounds(266, 5, 200, 200); 
			label7.setBounds(266, 5, 200, 200); 
			label8.setBounds(266, 5, 200, 200); 
			label11.setBounds(266, 5, 200, 200); 
			
						// JTable inside the ScrollPane
						JTable table1_1 = new JTable();
						tableScrollPane1.setViewportView(table1_1);
						
				// Panel9 Definition
				JPanel panel9 = new JPanel();
				contentPane.add(panel9, "Card9");
				panel9.setLayout(null);
				
								// Labels and TextFields
								JLabel lblNewLabel_6 = new JLabel("Employee ID");
								lblNewLabel_6.setBounds(115, 244, 90, 16);
								panel9.add(lblNewLabel_6);
								
												JLabel lblNewLabel_6_1 = new JLabel("Employee new Shift");
												lblNewLabel_6_1.setBounds(115, 277, 127, 16);
												panel9.add(lblNewLabel_6_1);
												
																textField_15 = new JTextField(); // New Shift
																textField_15.setBounds(264, 239, 130, 26);
																panel9.add(textField_15);
																textField_15.setColumns(10);
																
																				textField_16 = new JTextField(); // Employee ID
																				textField_16.setBounds(264, 272, 130, 26);
																				panel9.add(textField_16);
																				textField_16.setColumns(10);
																				
																								// Home Button
																								JButton btnNewButton_9_1 = new JButton("Home");
																								btnNewButton_9_1.setBounds(610, 309, 117, 29);
																								btnNewButton_9_1.addActionListener(new ActionListener() {
																								    public void actionPerformed(ActionEvent e) {
																								        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
																								        cardLayout.show(contentPane, "Card1");
																								    }
																								});
																								panel9.add(btnNewButton_9_1);
																								
																												// Update Button
																												JButton btnNewButton_9_2 = new JButton("Update");
																												btnNewButton_9_2.setBounds(481, 309, 117, 29);
																												btnNewButton_9_2.addActionListener(new ActionListener() {
																												    public void actionPerformed(ActionEvent e) {
																												        String empID = textField_15.getText().trim(); // Employee ID
																												        String newShift = textField_16.getText().trim(); // New Shift

																												        // Validate inputs
																												        if (empID.isEmpty() || newShift.isEmpty()) {
																												            JOptionPane.showMessageDialog(Frame.this, "Both Employee ID and New Shift must be filled.",
																												                                          "Input Error", JOptionPane.WARNING_MESSAGE);
																												            return;
																												        }

																												        if (!newShift.matches("[A-Za-z0-9]+")) { // Ensure valid shift format
																												            JOptionPane.showMessageDialog(Frame.this, "Invalid shift value. Please use only alphanumeric characters.",
																												                                          "Input Error", JOptionPane.WARNING_MESSAGE);
																												            return;
																												        }

																												        try {
																												            if (con == null || con.isClosed()) {
																												                creatConnection();
																												            }
																												            con.setAutoCommit(false); 

																												            String updateSQL = "UPDATE EMPLOYEE SET Shift = ? WHERE EID = ?";
																												            try (PreparedStatement stmt = con.prepareStatement(updateSQL)) {
																												                stmt.setString(1, newShift);
																												                stmt.setString(2, empID);

																												                System.out.println("Executing SQL: " + stmt); 

																												                int rowsUpdated = stmt.executeUpdate();

																												                if (rowsUpdated > 0) {
																												                    JOptionPane.showMessageDialog(Frame.this, "Employee updated successfully!",
																												                                                  "Success", JOptionPane.INFORMATION_MESSAGE);
																												                } else {
																												                    JOptionPane.showMessageDialog(Frame.this, "Employee ID not found.",
																												                                                  "Update Error", JOptionPane.WARNING_MESSAGE);
																												                }
																												            }

																												            con.commit(); 
																												            populateTable(table1_1, "SELECT * FROM EMPLOYEE"); 

																												        } catch (SQLException ex) {
																												            ex.printStackTrace();
																												            try {
																												                con.rollback(); 
																												            } catch (SQLException rollbackEx) {
																												                rollbackEx.printStackTrace();
																												            }
																												            JOptionPane.showMessageDialog(Frame.this, "Error updating employee: " + ex.getMessage(),
																												                                          "Database Error", JOptionPane.ERROR_MESSAGE);
																												        } catch (ClassNotFoundException ex) {
																												            ex.printStackTrace();
																												            JOptionPane.showMessageDialog(Frame.this, "Database connection error: " + ex.getMessage(),
																												                                          "Connection Error", JOptionPane.ERROR_MESSAGE);
																												        }
																												    }
																												});
									                                                                                            panel9.add(btnNewButton_9_2);
																												panel9.add(label11);
																																
																																JScrollPane tableScrollPane9 = new JScrollPane(table1_1);
																																tableScrollPane9.setBounds(40, 350, 561, 168); // Adjust as needed
																																panel9.add(tableScrollPane9);
																																
																																				// Populate the table
																																				populateTable(table1_1, "SELECT * FROM EMPLOYEE");
																																				table = new JTable();
																													
																																				
																																				
																																				
																																				

																																				JButton btnNewButton_8_1 = new JButton("Employee");
																																				btnNewButton_8_1.setBounds(142, 244, 117, 29);
																																				panel8.add(btnNewButton_8_1);
																																				
																																				JButton btnNewButton_8_2 = new JButton("Item");
																																				btnNewButton_8_2.setBounds(332, 243, 117, 29);
																																				panel8.add(btnNewButton_8_2);
																																				panel8.add(label8); 
																																				
																																				JLabel lblNewLabel_8 = new JLabel("Item name to delete:");
																																				lblNewLabel_8.setBounds(38, 339, 148, 16);
																																				panel8.add(lblNewLabel_8);
																																				
																																				JButton btnNewButton_8_3 = new JButton("Home");
																																				btnNewButton_8_3.setBounds(599, 462, 117, 29);
																																				panel8.add(btnNewButton_8_3);
																																				btnNewButton_8_3.addActionListener(new ActionListener() {
																																					public void actionPerformed(ActionEvent e) {
																																						CardLayout cardLayout= (CardLayout) contentPane.getLayout();
																																						cardlayout.show(contentPane, "Card1");
																																						
																																					}
																																				});
																																				JTextField textField_14 = new JTextField();
																																				textField_14.setBounds(215, 334, 202, 26);
																																				panel8.add(textField_14);
																																				textField_14.setColumns(10);
																																				
																																				JButton btnNewButton_8_4 = new JButton("Delete");
																																				btnNewButton_8_4.addActionListener(new ActionListener() {
																																				    public void actionPerformed(ActionEvent e) {
																																				        String itemName = textField_14.getText().trim();
																																				        if (itemName.isEmpty()) {
																																				            JOptionPane.showMessageDialog(Frame.this, "Please enter a valid Item Name.",
																																				                                          "Input Error", JOptionPane.WARNING_MESSAGE);
																																				            return;
																																				        }

																																				        try {
																																				            // Check if the item exists
																																				            String countQuery = "SELECT COUNT(*) FROM Has WHERE ItemsName = ?";
																																				            PreparedStatement countStmt = con.prepareStatement(countQuery);
																																				            countStmt.setString(1, itemName);
																																				            ResultSet resultSet = countStmt.executeQuery();
																																				            boolean exists = false;

																																				            if (resultSet.next()) {
																																				                exists = resultSet.getInt(1) > 0;
																																				            }

																																				            resultSet.close();
																																				            countStmt.close();

																																				            if (exists) {
																																				                // Delete from Has table and Item table
																																				                String deleteFromHasQuery = "DELETE FROM Has WHERE ItemsName = ?";
																																				                String deleteFromItemQuery = "DELETE FROM Item WHERE ItemName = ?";
																																				                try (PreparedStatement deleteHasStmt = con.prepareStatement(deleteFromHasQuery);
																																				                     PreparedStatement deleteItemStmt = con.prepareStatement(deleteFromItemQuery)) {
																																				                     
																																				                    deleteHasStmt.setString(1, itemName);
																																				                    deleteItemStmt.setString(1, itemName);

																																				                    deleteHasStmt.executeUpdate();
																																				                    deleteItemStmt.executeUpdate();

																																				                    JOptionPane.showMessageDialog(Frame.this, "Item deleted successfully!",
																																				                                                  "Success", JOptionPane.INFORMATION_MESSAGE);
																																				                }
																																				            } else {
																																				                // Delete only from Item table
																																				                String deleteFromItemQuery = "DELETE FROM Item WHERE ItemName = ?";
																																				                try (PreparedStatement deleteItemStmt = con.prepareStatement(deleteFromItemQuery)) {
																																				                    deleteItemStmt.setString(1, itemName);
																																				                    deleteItemStmt.executeUpdate();

																																				                    JOptionPane.showMessageDialog(Frame.this, "Item deleted successfully!",
																																				                                                  "Success", JOptionPane.INFORMATION_MESSAGE);
																																				                }
																																				            }

																																				            // Refresh the table
																																				            String query = "SELECT * FROM Item";
																																				            populateTable(table, query);

																																				        } catch (SQLException ex) {
																																				            ex.printStackTrace();
																																				            JOptionPane.showMessageDialog(Frame.this, "Error deleting item: " + ex.getMessage(),
																																				                                          "Database Error", JOptionPane.ERROR_MESSAGE);
																																				        }
																																				    }
																																				});
																																				
																																							panel8.add(btnNewButton_8_4);
																																							btnNewButton_8_4.setBounds(484, 462, 117, 29);
																																							JScrollPane tableScrollPane8 = new JScrollPane();
																																							tableScrollPane8.setViewportView(table);
																																							
																																										
																																										tableScrollPane8.setBounds(40, 503, 561, 168); // Ensure proper bounds
																																										panel8.add(tableScrollPane8);
																																										
																																													 table8_1 = new JTable(); // This should be the table used in `panel8`
																																													 tableScrollPane8.setViewportView(table8_1);
																																													 populateTable(table8_1, query); // Pass `table8` instead of `table`
																																													 label8.setBounds(196, 6, 210, 176); 
			
			JLabel label1 = new JLabel("");
			
				
				
				JPanel panel2 = new JPanel();
				panel2.setBounds(0, 0, 733, 510);
				contentPane.add(panel2, "Card2");
				panel2.setLayout(null);
				panel2.add(label1);
				
				JButton btnNewButton_1 = new JButton("Employee");
				btnNewButton_1.setBounds(142, 244, 117, 29);
				panel2.add(btnNewButton_1);
				
				JButton btnNewButton = new JButton("Item");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CardLayout cardlayout = (CardLayout) contentPane.getLayout();
						cardlayout.show(contentPane, "Card3");
					}
				});
				btnNewButton.setBounds(332, 243, 117, 29);
				panel2.add(btnNewButton);
				label1.setBounds(196, 6, 210, 176); 
				label4.setBounds(196, 6, 210, 176); 
				label5.setBounds(196, 6, 210, 176); 
				label6.setBounds(196, 6, 210, 176); 
				label7.setBounds(196, 6, 210, 176); 
				label9.setBounds(196, 6, 210, 176); 
				
				
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CardLayout cardLayout= (CardLayout) contentPane.getLayout();
						cardlayout.show(contentPane, "Card4");
						
						 
	 
					}
				});
			
			
			
			
			
			
				btnNewButton_4.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        // Validate inputs
				        String first = textField_2.getText().trim();
				        String last = textField_3.getText().trim();
				        String id = textField_4.getText().trim();
				        String phone = textField_5.getText().trim();
				        String role = textField_6.getText().trim();
				        String gender = textField_7.getText().trim();
				        String shift = textField_8.getText().trim();
				        String salaryText = textField_9.getText().trim();
				        String branch = textField_10.getText().trim();

				        if (first.isEmpty() || last.isEmpty() || id.isEmpty() || phone.isEmpty() || 
				                role.isEmpty() || gender.isEmpty() || shift.isEmpty() || salaryText.isEmpty() || branch.isEmpty()) {
				            JOptionPane.showMessageDialog(null, "All fields must be filled!", "Input Error", 
				                                          JOptionPane.WARNING_MESSAGE);
				            return;
				        }
				        double salary;
				        try {
				            salary = Double.parseDouble(salaryText);
				        } catch (NumberFormatException ex) {
				            JOptionPane.showMessageDialog(null, "Invalid salary format. Please enter a valid number.", 
				                                          "Input Error", JOptionPane.WARNING_MESSAGE);
				            return;
				        }

				        // Insert into database
				        String operation = "INSERT INTO EMPLOYEE (EFirstName, ELastName, EID, EPhoneNum, Role, Gender, Shift, Salary, Branch_NationalAddress) "
				                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				        try (PreparedStatement stmt = con.prepareStatement(operation)) {
				            stmt.setString(1, first);
				            stmt.setString(2, last);
				            stmt.setString(3, id);
				            stmt.setString(4, phone);
				            stmt.setString(5, role);
				            stmt.setString(6, gender);
				            stmt.setString(7, shift);
				            stmt.setDouble(8, salary);
				            stmt.setString(9, branch);
				            stmt.executeUpdate();

				            JOptionPane.showMessageDialog(null, "Employee added successfully!", "Success", 
				                                          JOptionPane.INFORMATION_MESSAGE);

				            // Repopulate table
				            populateTable(table1, "SELECT * FROM EMPLOYEE");
				        } catch (SQLException ex) {
				            ex.printStackTrace();
				            JOptionPane.showMessageDialog(null, "Error executing query: " + ex.getMessage(),
				                                          "Database Error", JOptionPane.ERROR_MESSAGE);
				        }
				    }
				});

			}
	
	private void populateTable(JTable table, String query) {
	    try {
	        creatConnection();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(query);

	        ResultSetMetaData metaData = rs.getMetaData();
	        int columnCount = metaData.getColumnCount();
	        String[] columnNames = new String[columnCount];
	        for (int i = 1; i <= columnCount; i++) {
	            columnNames[i - 1] = metaData.getColumnName(i);
	        }

	        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	        while (rs.next()) {
	            Object[] row = new Object[columnCount];
	            for (int i = 1; i <= columnCount; i++) {
	                row[i - 1] = rs.getObject(i);
	            }
	            model.addRow(row);
	        }
	        table.setModel(model); // Set the model to the table
	        rs.close();
	        stmt.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Error populating table: " + e.getMessage(),
	                "Database Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
}
