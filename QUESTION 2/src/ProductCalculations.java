/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CASH
 */
public class ProductCalculations implements IProductCalculations {
    double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVAT() {
        return price * 0.15; // 15% VAT[cite: 30]
    }

    @Override
    public double GetCommission() {
        return price * 0.05; // This line I 
    }

    @Override
    public double GetTotal() {
        return price + GetVAT() + GetCommission(); // Price + VAT + Commission[cite: 30]
    }
}
