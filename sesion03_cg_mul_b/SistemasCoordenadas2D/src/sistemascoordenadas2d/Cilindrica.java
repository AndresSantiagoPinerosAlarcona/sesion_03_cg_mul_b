/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemascoordenadas2d;

/**
 * 2. forma del constructor: 1 sin parametros 
 *                           otro con parametros
 * Metodos sobrecrgados para convertir de 
 *      cilindricas a esfericas 
 *      Esfericas a cilindircas
 * 
 * 
 * 
 * @author ERROR 404
 */
public class Cilindrica {
    private double radio;
    private double angulo;
    private double z;
    
    //Esfericas a cilindircas

    public Cilindrica(double radio, double aguglo, double z) {
        this.radio = radio;
        this.angulo = aguglo;
        this.z = z;
    }
    public Cilindrica(){}
//////////////////////////////////////////////////////////////////////////////////
    public double getRadio() {
        return radio;
    }

    public double getAguglo() {
        return angulo;
    }

    public double getZ() {
        return z;
    }
//////////////////////////////////////////////////////////////////////////////////
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAguglo(double aguglo) {
        this.angulo = aguglo;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Cilindrica cilindrica_cartesiana3D(double x,double y,double w ){
        Cilindrica obj = new Cilindrica();
        x = radio * Math.sin(angulo);
        y = radio * Math.cos(angulo);
        w = z;
        
        return obj;
    }
    
    public Cilindrica cilindrica_cartesiana3D(cartesiana3D p){
        return cilindrica_cartesiana3D(p.getW(), p.getX(), p.getY());
    }
    
    public Cilindrica cartesiana3D_esfericas(double x,double y,double w ){
        Cilindrica obj = new Cilindrica();
        x = radio * Math.sin(angulo);
        y = radio * Math.cos(angulo);
        w = z;
        
        return obj;
    }
    
    public Cilindrica cartesiana3D_esfericas(cartesiana3D p){
        return cilindrica_cartesiana3D(p.getW(), p.getX(), p.getY());
    }
    
}

//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////




class cartesiana3D{
    private double x;
    private double y;
    private double w;

    public cartesiana3D(double x, double y, double w) {
        this.x = x;
        this.y = y;
        this.w = w;
    }
//////////////////////////////////////////////////////////////////////////////////
    public cartesiana3D(){}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getW() {
        return w;
    }
//////////////////////////////////////////////////////////////////////////////////
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setW(double w) {
        this.w = w;
    }
}
