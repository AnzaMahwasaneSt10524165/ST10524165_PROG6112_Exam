/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CASH
 */
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductAppGUI extends JFrame implements ActionListener {
    JTextField txtCustomerName, txtPrice;
    JMenuItem mnuProcess, mnuClear, mnuExit;

    public ProductAppGUI() {
        setTitle("Product App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //Input
        JLabel lblName = new JLabel("Customer Name:");
        lblName.setBounds(20, 20, 120, 25);
        add(lblName);

        JLabel lblProduct = new JLabel("Select Product:");
        lblProduct.setBounds(20, 60, 120, 25);
        add(lblProduct);
        txtPrice = new JTextField();
        txtPrice.setBounds(150, 100, 200, 25);
        add(txtPrice);

        String[] products = { "Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket" };
        JComboBox<String> cmbProduct = new JComboBox<>(products);
        cmbProduct.setBounds(150, 60, 200, 25);
        add(cmbProduct);

       JLabel lblPrice = new JLabel("Enter Price:");
        lblPrice.setBounds(20, 100, 120, 25);
        add(lblPrice);
        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(150, 20, 200, 25);
        add(txtCustomerName);

        

        JButton btnProcess = new JButton("PROCESS");
        btnProcess.setBounds(150, 140, 200, 30);
        add(btnProcess);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuTools = new JMenu("Tools");

        mnuProcess = new JMenuItem("Process");
        mnuClear = new JMenuItem("Clear");
        mnuExit = new JMenuItem("Exit");
        menuTools.add(mnuProcess);
         menuFile.add(mnuExit);
        menuTools.add(mnuClear);
       

        menuBar.add(menuFile);
        menuBar.add(menuTools);
        setJMenuBar(menuBar);
        btnProcess.addActionListener(e -> processData(cmbProduct, txtCustomerName, txtPrice));
        mnuProcess.addActionListener(e -> processData(cmbProduct, txtCustomerName, txtPrice));
        mnuClear.addActionListener(e -> {
            txtCustomerName.setText("");
            txtPrice.setText("");
            cmbProduct.setSelectedIndex(0);
        });
        mnuExit.addActionListener(e -> System.exit(0));
    }

    private void processData(JComboBox<String> cmb, JTextField txtName, JTextField txtPr) {
        try {
            String customer = txtName.getText().trim();
            String product = (String) cmb.getSelectedItem();
            double price = Double.parseDouble(txtPr.getText().trim());

            ProductCalculations calc = new ProductCalculations(price);
            double vat = calc.GetVAT();
            double comm = calc.GetCommission();
            double total = calc.GetTotal();

            String message = "Customer Name: " + customer + "\n" +
                             "Product: " + product + "\n" +
                             "VAT: R " + vat + "\n" +
                             "COMMISSION: R " + comm + "\n" +
                             "TOTAL: R " + total; // Line 84 to line 99 I created using help of Gemini

            JOptionPane.showMessageDialog(this, message);

            try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt"))) {
                writer.println("DATA LOG");
                writer.println("*****************************************");
                writer.println(message);
                writer.println("*****************************************");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file!");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price.");
        }
    }

    public static void main(String[] args) {
        new ProductAppGUI().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}