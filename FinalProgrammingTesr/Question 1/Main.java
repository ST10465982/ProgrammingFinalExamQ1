/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ongan
 */
/**
 * MainApp class contains the main() method that runs the entire program.
 * It creates the sales data array, calls methods from ProductSales,
 * and displays the formatted sales report.
 */
public class Main {
    public static void main(String[] args) {

        // 2D Array of product sales data (rows = years, columns = quarters)
        int[][] productSales = {
            {300, 150, 700},   // Year 1
            {250, 200, 600}    // Year 2
        };

        // Create an instance of ProductSales to perform calculations
        ProductSales ps = new ProductSales();

        // Display the formatted product sales report
        ps.displayReport(productSales);
    }
}
