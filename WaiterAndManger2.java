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

public class WaiterAndManger2 extends JFrame {

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
                    WaiterAndManger2 frame = new WaiterAndManger2();
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
    public WaiterAndManger2() {
    	
    	
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
        // Labels and TextFields
        JLabel lblNewLabel_6 = new JLabel(" Customer first Name");
        lblNewLabel_6.setBounds(86, 244, 170, 16);
        panel.add(lblNewLabel_6);

        JTextField jTextField1 = new JTextField(); // New Number of People
        jTextField1.setBounds(230, 239, 130, 26);
        panel.add(jTextField1);
        jTextField1.setColumns(10);
        
        
        JLabel lblNewLabel_7 = new JLabel(" Customer Last Name");
        lblNewLabel_7.setBounds(400, 244, 270, 16);
        panel.add(lblNewLabel_7);

        JTextField jTextField2 = new JTextField(); // New Number of People
        jTextField2.setBounds(564, 239, 130, 26);
        panel.add(jTextField2);
        jTextField2.setColumns(10);


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

       
        JButton btnNewButton_9_2 = new JButton("Retrive");
        panel.add(btnNewButton_9_2);
        btnNewButton_9_2.setBounds(480, 286, 117, 29);
        btnNewButton_9_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	   try {
            		     
                       String sql = "SELECT RNum FROM CUSTOMER "
                               + "JOIN RESERVATION ON CUSTOMER.CNumber = RESERVATION.CRPhone "
                               + "WHERE CFirstName = ? AND CLastName = ?";
                       	PreparedStatement pst = con.prepareStatement(sql);
                       String firstNameInput = jTextField1.getText().trim();
                       String lastNameInput = jTextField2.getText().trim();
                       if (firstNameInput.isEmpty() || lastNameInput.isEmpty()) {
                           JOptionPane.showMessageDialog(null, "Please enter both first name and last name.");
                           return;
                       }
                       pst.setString(1, firstNameInput);
                       pst.setString(2, lastNameInput);
                       ResultSet rs = pst.executeQuery();
                       StringBuilder reservationNumbers = new StringBuilder();
                       boolean foundReservation = false;
                       JLabel resultLabel = new JLabel("Reservation Numbers:");
                       resultLabel.setBounds(40, 310, 700, 30);
                       panel.add(resultLabel);
                       while (rs.next()) {
                           int reservationNumber = rs.getInt("RNum");
                           reservationNumbers.append(reservationNumber).append("\n");
                           foundReservation = true;
                       }

                       if (!foundReservation) {
                           reservationNumbers.append("No reservations found for customer ")
                                             .append(firstNameInput).append(" ").append(lastNameInput).append(".");
                       }

                       JTextArea reservationTextArea = new JTextArea(reservationNumbers.toString());
                       reservationTextArea.setEditable(false);
                       JScrollPane scrollPane = new JScrollPane(reservationTextArea);
                       scrollPane.setBounds(40, 350, 700, 120);
                       panel.add(scrollPane);
                       rs.close();
                       pst.close();
                       panel.revalidate();
                       panel.repaint();

                   } catch (SQLException ex) {
                       ex.printStackTrace();
                       JOptionPane.showMessageDialog(null, "Error executing the query: " + ex.getMessage(),
                                                     "Database Error", JOptionPane.ERROR_MESSAGE);
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
    
   
} 

