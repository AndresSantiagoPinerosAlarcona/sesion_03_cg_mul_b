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
public class Esferica {
    private double radio_1;
    private double radio_2;
    private double x;
    
    //Cilindricas a esfericas 

    public Esferica(double radio_1, double radio_2, double x) {
        this.radio_1 = radio_1;
        this.radio_2 = radio_2;
        this.x = x;
    }
    public Esferica(){}
//////////////////////////////////////////////////////////////////////////////////
    public double getRadio_1() {
        return radio_1;
    }

    public double getRadio_2() {
        return radio_2;
    }

    public double getX() {
        return x;
    }
//////////////////////////////////////////////////////////////////////////////////
    public void setRadio_1(double radio_1) {
        this.radio_1 = radio_1;
    }

    public void setRadio_2(double radio_2) {
        this.radio_2 = radio_2;
    }

    public void setX(double x) {
        this.x = x;
    }
}
