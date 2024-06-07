/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author CltControl
 */
public abstract class PhysicalProduct extends Product{
    private final double weight;
    
    public PhysicalProduct(String name, double price, double weight){
        super(name, price);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
