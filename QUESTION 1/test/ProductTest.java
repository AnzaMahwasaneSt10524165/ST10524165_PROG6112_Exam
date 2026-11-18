/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CASH
 */
public class ProductTest {

    @Test
    public void GetTotalProductsSales_WithValidData_ReturnsCorrectValue() {
        int[][] data = {
            { 25, 18, 20 },
            { 15, 10, 12 },
            { 18, 15, 20 }
        };
        String[] prods = { "Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket" };
        Product p = new Product(data, prods);

        int expected = 153;
        int actual = p.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        int[][] data = {
            { 25, 18, 20 },
            { 15, 10, 12 },
            { 18, 15, 20 }
        };
        String[] prods = { "Cozy ", "Restonic Barbados", "Sealy Phuket" };
        Product p = new Product(data, prods);

        double expected = 17.0;
        double actual = p.GetAverageProductSold();
        assertEquals(expected, actual, 0.01);
    }
}
