package jdbc;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class WaiterAndManger3 extends JFrame {

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
                    WaiterAndManger3 frame = new WaiterAndManger3();
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
    public WaiterAndManger3() {
    	
    	
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

        // Home Button
        JButton btnNewButton_9_1 = new JButton("Home");
        btnNewButton_9_1.setBounds(609, 286, 117, 29);
        btnNewButton_9_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "Card1");
            }
        });
        panel.add(btnNewButton_9_1);

        // Update Button
        JButton btnNewButton_9_2 = new JButton("Retrive Most Expensive Item");
        panel.add(btnNewButton_9_2);
        btnNewButton_9_2.setBounds(380, 286, 230, 29);
        btnNewButton_9_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {
            	    String sql = "SELECT ItemName FROM ITEM WHERE ItemPrice = (SELECT MAX(ItemPrice) FROM ITEM)";
            	    
            	   
            	    Statement stmt = con.createStatement();
            	    ResultSet rs = stmt.executeQuery(sql);

            	 
            	    StringBuilder itemNames = new StringBuilder();
            	    boolean foundItem = false;

            	    JLabel itemLabel = new JLabel("Most Expensive Item:");
            	    itemLabel.setBounds(40, 310, 700, 30); // Adjust label position
            	    panel.add(itemLabel);

            	   
            	    while (rs.next()) {
            	        String itemName = rs.getString("ItemName");
            	        itemNames.append(itemName).append("\n");
            	        foundItem = true;
            	    }

            	    if (!foundItem) {
            	        itemNames.append("No items found in the database.");
            	    }

            	 
            	    JTextArea itemTextArea = new JTextArea(itemNames.toString());
            	    itemTextArea.setEditable(false);
            	    JScrollPane scrollPane = new JScrollPane(itemTextArea);
            	    scrollPane.setBounds(40, 350, 700, 120); 
            	    panel.add(scrollPane);

            	    rs.close();
            	    stmt.close();

 
            	    panel.revalidate();
            	    panel.repaint();
            	    
            	} catch (SQLException e1) {
            	    e1.printStackTrace();
            	    JOptionPane.showMessageDialog(null, "Error executing the query: " + e1.getMessage(),
            	                                  "Database Error", JOptionPane.ERROR_MESSAGE);
            	}}
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

    /**
     * Populate the reservation table.
     */
   /* private void populateReservationTable() {
        try {
            String query = "SELECT * FROM reservation";
            try (PreparedStatement stmt = con.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                // Get ResultSet metadata
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Create DefaultTableModel
                DefaultTableModel tableModel = new DefaultTableModel();

                // Add column names to the table model
                for (int i = 1; i <= columnCount; i++) {
                    tableModel.addColumn(metaData.getColumnName(i));
                }

                // Add rows to the table model
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    tableModel.addRow(row);
                }

                // Set the table model to the reservationTable
                reservationTable.setModel(tableModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error fetching reservation data: " + e.getMessage(),
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }*/
   
} 

