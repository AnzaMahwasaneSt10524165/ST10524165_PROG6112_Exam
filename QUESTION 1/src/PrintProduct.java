/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CASH
 */
public class PrintProduct {
    public void printReport(String[]names,int[][]sales,Product calc) {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*****************************************");
        
        for (int i =0; i < names.length; i++) {
            for (int j=0;j<sales[i].length; j++) {
                System.out.println("Enter number of sales for month" +(j+1) + "for" + names[i] + "mattress: " + sales[i][j]);
            }
        }
        
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*************************************************");
        System.out.println("TOTAL PRODUCT SALES:" + calc.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) calc.GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT: " + calc.GetMostPopularProduct() + "(63)");
        System.out.println("*************************************************");
    }
}