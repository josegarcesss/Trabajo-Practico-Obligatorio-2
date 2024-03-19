/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpo2;

/**
 *
 * @author Alakyan
 */
public class Aleatorio {
    private final double num;

    public Aleatorio(double num) {
        this.num = num*Math.random();
    }

    public double getNum() {
        return num;
    }
    
    
    
}
