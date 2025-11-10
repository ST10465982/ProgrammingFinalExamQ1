/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalesapp;

/**
 *
 * @author ongan
 */

    
/**
 * IProductSales.java
 * 
 * This interface defines the methods that the ProductSales class must implement.
 * (Question 2.4)
 */
public interface IProductSales {

    // Returns all product sales values in a single array
    int[] getProductSales();

    // Returns the total of all product sales
    int getTotalSales();

    // Returns the number of sales above the limit (500)
    int getSalesOverLimit();

    // Returns the number of sales below the limit (500)
    int getSalesUnderLimit();

    // Returns how many years (rows of data) were processed
    int getProductsProcessed();

    // Returns the average sales across all years
    double getAverageSales();
}
