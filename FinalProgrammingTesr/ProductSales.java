/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ongan
 */
/**
 * ProductSales class implements the IProduct interface.
 * This class performs all calculations (total, average, max, min)
 * and displays a formatted product sales report.
 */

public class ProductSales implements IProduct {

    /**
     * Calculates the total sales for all years and quarters.
     * @param productSales 2D array of sales data
     * @return total of all sales
     */
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] year : productSales) {       // Loop through each year (row)
            for (int sale : year) {             // Loop through each quarter (column)
                total += sale;                  // Add each sale to the total
            }
        }
        return total;
    }

    /**
     * Calculates the average sales for all entries.
     * @param productSales 2D array of sales data
     * @return average sales value
     */
    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);   // Reuse total calculation
        int count = 0;                          // Count total number of sales values

        for (int[] year : productSales) {
            count += year.length;               // Add up how many quarters in each year
        }

        return (double) total / count;          // Compute average
    }

    /**
     * Finds the maximum sale value in the sales data.
     * @param productSales 2D array of sales data
     * @return maximum sale
     */
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];           // Start with first element
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > max) {
                    max = sale;                 // Update if a higher sale is found
                }
            }
        }
        return max;
    }

    /**
     * Finds the minimum sale value in the sales data.
     * @param productSales 2D array of sales data
     * @return minimum sale
     */
    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];           // Start with first element
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < min) {
                    min = sale;                 // Update if a lower sale is found
                }
            }
        }
        return min;
    }

    /**
     * Displays the complete product sales report in a well-formatted layout.
     * Includes rows and columns to show the yearly and quarterly data clearly.
     * @param productSales 2D array of sales data
     */
    public void displayReport(int[][] productSales) {
        System.out.println("=========================================");
        System.out.println("         PRODUCT SALES DATA TABLE        ");
        System.out.println("=========================================");
        System.out.println("Year\tQuarter 1\tQuarter 2\tQuarter 3");
        System.out.println("-----------------------------------------");

        // Print each year's quarterly sales data
        for (int i = 0; i < productSales.length; i++) {
            System.out.print("Year " + (i + 1) + "\t");
            for (int j = 0; j < productSales[i].length; j++) {
                System.out.print(productSales[i][j] + "\t\t");
            }
            System.out.println(); // move to next line for next year
        }

        System.out.println("\n=========================================");
        System.out.println("        PRODUCT SALES REPORT - 2025      ");
        System.out.println("=========================================");
        System.out.println("Total sales:   " + TotalSales(productSales));
        System.out.printf("Average sales: %.0f%n", AverageSales(productSales));
        System.out.println("Maximum sale:  " + MaxSale(productSales));
        System.out.println("Minimum sale:  " + MinSale(productSales));
        System.out.println("=========================================");
    }
}
