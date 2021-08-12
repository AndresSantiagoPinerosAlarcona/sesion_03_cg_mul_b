/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfera;

public class Esfera {
    private double angulo1;
    private double angulo2;
    private double r;
    
    public Esfera( double angulo1,  double angulo2,  double r ){
        this.r = r;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
    }    
    
    public double getR(){
        return r;
    }   
    
    public double setR(double r){
        this.r = r;
    }   
    public double getR(){
        return r;
    }   
}
