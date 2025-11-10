/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsalesapp;

/**
 * ProductSalesTest.java
 * 
 * Unit tests for the ProductSales class (Question 2.5)
 * Uses JUnit 5 to test specific methods.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductSalesTest {

    @Test
    void GetSalesOverLimit_ReturnsNumberOfSales() {
        ProductSales ps = new ProductSales();
        assertEquals(2, ps.getSalesOverLimit());
    }

    @Test
    void GetSalesUnderLimit_ReturnsNumberOfSales() {
        ProductSales ps = new ProductSales();
        assertEquals(4, ps.getSalesUnderLimit());
    }
}
