/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesapp;

/**
 *
 * @author ongan
 */

    /**
 * ProductSales.java
 * 
 * This class implements the IProductSales interface and performs calculations
 * for total sales, average, over/under limit counts, and number of years processed.
 * (Question 2.4)
 */
public class ProductSales implements IProductSales {

    // Two years of product sales (for example purposes)
    private int[][] salesData = {
        {300, 150, 700}, // Year 1
        {250, 200, 600}  // Year 2
    };

    private final int SALES_LIMIT = 500;

    // Combines all sales into a single array
    @Override
    public int[] getProductSales() {
        int[] allSales = new int[salesData.length * salesData[0].length];
        int index = 0;
        for (int[] year : salesData) {
            for (int sale : year) {
                allSales[index++] = sale;
            }
        }
        return allSales;
    }

    // Calculates total of all sales
    @Override
    public int getTotalSales() {
        int total = 0;
        for (int[] year : salesData) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    // Counts number of sales above 500
    @Override
    public int getSalesOverLimit() {
        int count = 0;
        for (int[] year : salesData) {
            for (int sale : year) {
                if (sale > SALES_LIMIT)
                    count++;
            }
        }
        return count;
    }

    // Counts number of sales below 500
    @Override
    public int getSalesUnderLimit() {
        int count = 0;
        for (int[] year : salesData) {
            for (int sale : year) {
                if (sale < SALES_LIMIT)
                    count++;
            }
        }
        return count;
    }

    // Returns how many years were processed (rows)
    @Override
    public int getProductsProcessed() {
        return salesData.length;
    }

    // Calculates average sales across all years
    @Override
    public double getAverageSales() {
        return (double) getTotalSales() / getProductSales().length;
    }
}

