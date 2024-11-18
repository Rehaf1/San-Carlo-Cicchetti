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

public class WaiterAndManger4 extends JFrame {

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
    public WaiterAndManger4() {
    	
    	
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

        JLabel lblNewLabel_6 = new JLabel("Retrive Salary higher than : ");
        lblNewLabel_6.setBounds(86, 244, 172, 16);
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
        	            String sql = "SELECT EFirstName, ELastName FROM EMPLOYEE WHERE Salary > ?";
        	            PreparedStatement pst = con.prepareStatement(sql);

        	            // Get and validate input
        	            String salaryInput = jTextField1.getText().trim();
        	            if (salaryInput.isEmpty() || !salaryInput.matches("\\d+(\\.\\d+)?")) {
        	                JOptionPane.showMessageDialog(null, "Please enter a valid salary.");
        	                return;
        	            }

        	            double salaryThreshold = Double.parseDouble(salaryInput);
        	            pst.setDouble(1, salaryThreshold);

        	            ResultSet rs = pst.executeQuery();

        	            // Create a DefaultTableModel to hold the results
        	            DefaultTableModel tableModel = new DefaultTableModel();
        	            tableModel.addColumn("First Name");
        	            tableModel.addColumn("Last Name");

        	            boolean foundEmployee = false;

        	            // Add rows to the table model
        	            while (rs.next()) {
        	                String firstName = rs.getString("EFirstName");
        	                String lastName = rs.getString("ELastName");
        	                tableModel.addRow(new Object[]{firstName, lastName});
        	                foundEmployee = true;
        	            }

        	            if (!foundEmployee) {
        	                JOptionPane.showMessageDialog(null, "No employees found with a salary greater than " + salaryThreshold + ".");
        	            } else {
        	                // Create JTable and JScrollPane
        	                JTable employeeTable = new JTable(tableModel);
        	                JScrollPane tableScrollPane = new JScrollPane(employeeTable);
        	                tableScrollPane.setBounds(40, 350, 700, 150);
        	                
        	                // Add the scroll pane to the panel
        	                panel.add(tableScrollPane);
        	                panel.revalidate();
        	                panel.repaint(); // Refresh panel to show the table
        	            }

        	            rs.close();
        	            pst.close();

        	        } catch (SQLException ex) {
        	            ex.printStackTrace();
        	            JOptionPane.showMessageDialog(null, "Error executing the query: " + ex.getMessage(),
        	                                          "Database Error", JOptionPane.ERROR_MESSAGE);
        	        } catch (NumberFormatException ex) {
        	            JOptionPane.showMessageDialog(null, "Please enter a valid number for the salary.");
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

