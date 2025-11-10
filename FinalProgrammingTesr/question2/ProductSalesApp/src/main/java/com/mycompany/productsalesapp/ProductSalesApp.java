/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesapp;

/**
 *
 * @author ongan
 */

/**
 * ProductSalesApp.java
 * 
 * This is the main GUI application.
 * It satisfies Question 2.1, 2.2, and 2.3 requirements:
 * - GUI with 2 buttons, text area, and label
 * - Menu bar (File, Tools)
 * - Load and Save functionality
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ProductSalesApp extends JFrame {

    private JTextArea textArea;
    private JLabel lblYears;
    private ProductSales productSales = new ProductSales();

    public ProductSalesApp() {
        setTitle("Product Sales Application");
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        JButton btnLoad = new JButton("Load Product Data");
        JButton btnSave = new JButton("Save Product Data");

        // Create text area
        textArea = new JTextArea(10, 35);
        textArea.setEditable(false);

        // Create label
        lblYears = new JLabel("Years Processed: ");

        // Add components to frame
        add(btnLoad);
        add(btnSave);
        add(new JScrollPane(textArea));
        add(lblYears);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");

        // Add items to menus
        fileMenu.add(exitItem);
        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        // Action Listeners
        btnLoad.addActionListener(e -> loadProductData());
        btnSave.addActionListener(e -> saveProductData());
        loadItem.addActionListener(e -> loadProductData());
        saveItem.addActionListener(e -> saveProductData());
        clearItem.addActionListener(e -> clearData());
        exitItem.addActionListener(e -> System.exit(0));
    }

    /**
     * Loads and displays product data (Question 2.2)
     */
    private void loadProductData() {
        int total = productSales.getTotalSales();
        double avg = productSales.getAverageSales();
        int over = productSales.getSalesOverLimit();
        int under = productSales.getSalesUnderLimit();
        int years = productSales.getProductsProcessed();

        String data = "Total Sales: " + total +
                      "\nAverage Sales: " + String.format("%.0f", avg) +
                      "\nSales over limit: " + over +
                      "\nSales under limit: " + under;

        textArea.setText(data);
        lblYears.setText("Years Processed: " + years);
    }

    /**
     * Saves displayed product data to a text file (Question 2.2)
     */
    private void saveProductData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt"))) {
            writer.println("DATA LOG");
            writer.println("*************************");
            writer.println(textArea.getText());
            writer.println("*************************");
            JOptionPane.showMessageDialog(this, "Data saved to data.txt successfully!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file!");
        }
    }

    /**
     * Clears the displayed data (Question 2.3)
     */
    private void clearData() {
        textArea.setText("");
        lblYears.setText("Years Processed: ");
    }

    /**
     * Main method (entry point of the application)
     */
    public static void main(String[] args) {
        new ProductSalesApp().setVisible(true);
    }
}

