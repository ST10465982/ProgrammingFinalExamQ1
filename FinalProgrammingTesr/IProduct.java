/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ongan
 */

/**
 * IProduct interface defines the required methods for calculating
 * product sales  
 * Each method will be implemented in the ProductSales class.
 */
public interface IProduct {

    // Method to calculate the total sales for all years and quarters
    int TotalSales(int[][] productSales);

    // Method to calculate the average sales for all years and quarters
    double AverageSales(int[][] productSales);

    // Method to find the highest sale value in the data
    int MaxSale(int[][] productSales);

    // Method to find the lowest sale value in the data
    int MinSale(int[][] productSales);
}
