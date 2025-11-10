package com.mycompany.main;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ProductSales.
 * Tests all methods including edge cases and normal scenarios.
 */
public class ProductSalesTest {

    // ✅ Create an instance of the class being tested
    private final ProductSales productSales = new ProductSales();

    @Test
    public void testTotalSales_NormalData() {
        int[][] salesData = {
            {100, 200, 300},
            {150, 250, 350},
            {120, 220, 320}
        };
        int result = productSales.TotalSales(salesData);
        assertEquals(2010, result);
    }

    @Test
    public void testTotalSales_WithZeros() {
        int[][] salesData = {
            {0, 100, 0},
            {50, 0, 75}
        };
        int result = productSales.TotalSales(salesData);
        assertEquals(225, result);
    }

    @Test
    public void testTotalSales_SingleElement() {
        int[][] salesData = {{42}};
        int result = productSales.TotalSales(salesData);
        assertEquals(42, result);
    }

    @Test
    public void testAverageSales_NormalData() {
        int[][] salesData = {
            {10, 20, 30},
            {15, 25, 35}
        };
        double result = productSales.AverageSales(salesData);
        assertEquals(22.5, result, 0.001);
    }

    @Test
    public void testAverageSales_SingleValue() {
        int[][] salesData = {{100}};
        double result = productSales.AverageSales(salesData);
        assertEquals(100.0, result, 0.001);
    }

    @Test
    public void testMaxSale_NormalData() {
        int[][] salesData = {
            {100, 200, 300},
            {500, 150, 250},
            {400, 350, 450}
        };
        int result = productSales.MaxSale(salesData);
        assertEquals(500, result);
    }

    @Test
    public void testMaxSale_AllSameValues() {
        int[][] salesData = {
            {50, 50, 50},
            {50, 50, 50}
        };
        int result = productSales.MaxSale(salesData);
        assertEquals(50, result);
    }

    @Test
    public void testMaxSale_NegativeValues() {
        int[][] salesData = {
            {-10, -5, -20},
            {-15, -1, -30}
        };
        int result = productSales.MaxSale(salesData);
        assertEquals(-1, result);
    }

    @Test
    public void testMinSale_NormalData() {
        int[][] salesData = {
            {100, 200, 300},
            {50, 150, 250},
            {400, 350, 450}
        };
        int result = productSales.MinSale(salesData);
        assertEquals(50, result);
    }

    @Test
    public void testMinSale_AllSameValues() {
        int[][] salesData = {
            {75, 75, 75},
            {75, 75, 75}
        };
        int result = productSales.MinSale(salesData);
        assertEquals(75, result);
    }

    @Test
    public void testMinSale_NegativeValues() {
        int[][] salesData = {
            {-10, -5, -20},
            {-15, -1, -30}
        };
        int result = productSales.MinSale(salesData);
        assertEquals(-30, result);
    }

    @Test
    public void testMinSale_MixedPositiveNegative() {
        int[][] salesData = {
            {-10, 5, -20},
            {15, -1, 30}
        };
        int result = productSales.MinSale(salesData);
        assertEquals(-20, result);
    }

    @Test
    public void testDisplayReport_OutputFormat() {
        int[][] salesData = {
            {100, 200, 300},
            {150, 250, 350}
        };
        // Ensure no exception occurs during display
        assertDoesNotThrow(() -> productSales.displayReport(salesData));
    }

    @Test
    public void testAllMethods_EmptyArray() {
        int[][] emptySalesData = {};
        assertEquals(0, productSales.TotalSales(emptySalesData));
        assertEquals(0.0, productSales.AverageSales(emptySalesData), 0.001);
        // You could add exception handling for empty arrays in your actual class
    }

    @Test
    public void testIntegration_AllMethodsConsistent() {
        int[][] salesData = {
            {100, 200, 300},
            {150, 250, 350}
        };
        int total = productSales.TotalSales(salesData);
        double average = productSales.AverageSales(salesData);
        int max = productSales.MaxSale(salesData);
        int min = productSales.MinSale(salesData);

        assertTrue(max >= min);
        assertTrue(total >= (min * 6));
        assertTrue(total <= (max * 6));
        assertEquals(total / 6.0, average, 0.001);
    }
}
