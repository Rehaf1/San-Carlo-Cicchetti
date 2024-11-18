package jdbc;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class WaiterAndManger6 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable reservationTable;
    Connection con;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WaiterAndManger4 frame = new WaiterAndManger4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    void creatConnection() throws ClassNotFoundException, SQLException {
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
    public WaiterAndManger6() {
    	
    	
    	     JLabel label11 = new JLabel(""); 
    	try {
		    ImageIcon im1 = new ImageIcon("/Users/rehaf/git/San-Carlo-Cicchetti/database/src/images.png"); 
		    Image im1Right =  im1.getImage();
		    Image modifidedIm1 = im1Right.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		    im1 = new ImageIcon( modifidedIm1);  
		    label11.setIcon(im1); 
		    }catch (NullPointerException ex1) {}
    	label11.setBounds(196, 6, 210, 176); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 828, 569);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel, "Card9");
        panel.setLayout(null);

        panel.add(label11);

        JLabel lblNewLabel_6 = new JLabel("Retrive Manger name from branch revenue: ");
        lblNewLabel_6.setBounds(0, 244, 720, 16);
        panel.add(lblNewLabel_6);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(270, 239, 130, 26);
        panel.add(jTextField1);
        jTextField1.setColumns(10);

        panel.add(label11);
        
        JButton btnNewButton_9_1 = new JButton("Home");
        btnNewButton_9_1.setBounds(609, 286, 117, 29);
        btnNewButton_9_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "Card1");
            }
        });
        panel.add(btnNewButton_9_1);
   

        JButton btnNewButton_9_2 = new JButton("Retrive");
        panel.add(btnNewButton_9_2);
        btnNewButton_9_2.setBounds(480, 286, 117, 29);
        btnNewButton_9_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validate input
                    String revenueInput = jTextField1.getText().trim();
                    if (revenueInput.isEmpty() || !revenueInput.matches("\\d+(\\.\\d+)?")) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid revenue value.");
                        return;
                    }

                    double revenue = Double.parseDouble(revenueInput);
                    System.out.println("Input Revenue: " + revenue);

                    // Use explicit JOIN for clarity
                    String sql = "SELECT EMPLOYEE.EFirstName, EMPLOYEE.ELastName "
                               + "FROM EMPLOYEE "
                               + "JOIN BRANCH ON EMPLOYEE.EID = BRANCH.Manager_ID "
                               + "WHERE BRANCH.Revenue >= " + revenue;

                    System.out.println("Executing SQL: " + sql);

                    // Execute the query
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    // Log if the ResultSet is empty
                    if (!rs.isBeforeFirst()) {
                        System.out.println("No results found for the given revenue.");
                        JOptionPane.showMessageDialog(null, "No managers found with branches having revenue >= " + revenue);
                        return;
                    }

                    // Clear previous results if any
                    JTextArea managerTextArea = new JTextArea();
                    managerTextArea.setEditable(false);
                    JScrollPane scrollPane = new JScrollPane(managerTextArea);
                    scrollPane.setBounds(40, 310, 700, 120);
                    panel.add(scrollPane);

                    // Collect results
                    StringBuilder managerNames = new StringBuilder();
                    while (rs.next()) {
                        String firstName = rs.getString("EFirstName");
                        String lastName = rs.getString("ELastName");
                        managerNames.append(firstName).append(" ").append(lastName).append("\n");
                        System.out.println("Manager Found: " + firstName + " " + lastName);
                    }

                    managerTextArea.setText(managerNames.toString());

                    rs.close();
                    stmt.close();

                    // Refresh the panel
                    panel.revalidate();
                    panel.repaint();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error executing the query: " + ex.getMessage(),
                                                  "Database Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number for the revenue.");
                }
            }
        });



        panel.add(btnNewButton_9_2);

        // Reservation Table
       // reservationTable = new JTable();
       // JScrollPane tableScrollPane9 = new JScrollPane(reservationTable);
       // tableScrollPane9.setBounds(40, 350, 700, 168);
       // panel.add(tableScrollPane9);

        // Populate table on panel load
        try {
            creatConnection();
           // populateReservationTable();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error loading reservations: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

   
   
} 

