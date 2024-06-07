/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class ShoppingCart {
    private List<Product> products;
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public double calculateTotalPrice(){
        // LÓGICA PARA CALCULAR EL PRECIO TOTAL
        return 0;
    }
}
