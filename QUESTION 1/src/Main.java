/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CASH
 */
public class Main {
    public static void main(String[] args) {
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] salesData = {
            {25,18,20 },
            {15,10,12 },
            {18,15,20 }
        };

        Product productCalc = new Product(salesData, products);
        PrintProduct printer = new PrintProduct();
        
        printer.printReport(products, salesData, productCalc);
    }
}