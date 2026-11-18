/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CASH
 */
public class Product implements IProduct {
    int[][] sales;
    String[] names;

    public Product(int[][] sales, String[] names) {
        this.sales = sales;
        this.names = names;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i< sales.length; i++) {
            for (int j = 0;j < sales[i].length; j++) {
               total += sales[i][j];
            }
        }
        return total;
    }
    @Override
    public String GetMostPopularProduct() {
        int highest = -1;
        int bestIndex = 0;

        for (int i = 0; i < sales.length; i++) {
          int currentSum = 0;
            for (int j = 0; j <sales[i].length; j++) {
                currentSum +=sales[i][j];
            }
               if (currentSum > highest) {
                 highest = currentSum;
                 bestIndex = i;
            }
        }
        return names[bestIndex];
    }
    
    @Override
    public double GetAverageProductSold() {
      int totalSum = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        return (double) totalSum / count;
    }

    
    }
