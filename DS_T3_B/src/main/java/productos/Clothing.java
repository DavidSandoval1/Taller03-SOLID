/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

import taller2.PhysicalProduct;

/**
 *
 * @author CltControl
 */
public class Clothing extends PhysicalProduct {
    public Clothing(String name, double price, double weight) {
        super(name, price, weight);
    }
    @Override
    public double calculateIVA(){
        return this.getPrice()*0.12;
    }
}
