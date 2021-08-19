package sistemascoordenadas2d;

import java.util.Scanner;

/* Bajo el sistema de coordenadas cartesianas referir un punto en un plano 2D
   con sus respectivas propiedades y valores. Dicho valores deben asignarse
   como una entrada por teclado de parte del usuario
*/

public class SistemasCoordenadas2D {

    public static void main(String[] args) {
        Cartesiana2D punto = new Cartesiana2D();
        Polar punto2 = new Polar();
        // Agregar las instrucciones necesarias para que se presente
        // en pantalla la solicitud de los datos y posteriormente
        // el usuario los ingrese desde el teclado
        Scanner entrada = new Scanner(System.in);
        double D1 = 0, D2 = 0;
        int respuesta = 0;
        
        //de polar a cartesiana2D
        System.out.println("Esccriba 1 para pasar de polar a cartesiana");
        System.out.println("Esccriba 2 para pasar de cartesiana a polar");
        System.out.println("Esccriba 3 para pasar de cilindrica a esferica");
        System.out.println("Esccriba 4 para pasar de esferica a cilindrica");
        respuesta = entrada.nextInt();
        
        
        if (respuesta == 1){
            System.out.println("Escribe el radio ");
            D1 = entrada.nextFloat();
            System.out.println("Escribe el angulo en radianes");
            D2 = entrada.nextFloat();
            punto.polar_cartesiana2D(D1, D2);
        }
        if(respuesta == 2){
            System.out.println("Escribe la coordenada X");
            D1 = entrada.nextFloat();
            System.out.println("Escribe la coordenada Y");
            D2 = entrada.nextFloat();
            punto2.cartesiana2D_polar(D1, D2);
        }
        
        //punto.polar_cartesiana2D(D1,D2);
        
        
        
        
    }
}

class Cartesiana2D {
    private double x, y;
    
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Cartesiana2D polar_cartesiana2D(double r, double angulo) {
        Cartesiana2D obj = new Cartesiana2D();
        //angulo = angulo*180/Math.PI;
        x =r*Math.cos(angulo);
        y =r*Math.sin(angulo);
        obj.setX(x);
        obj.setY(y);
        System.out.println(obj.getX()+" (radianes) ");
        System.out.println(obj.getY()+" (radianes) ");
        return obj;
    }
    public Cartesiana2D polar_cartesiana2D(Polar p) {
        return polar_cartesiana2D(p.getRadio(), p.getAngulo());
    }
}

class Polar {
    private double radio;
    private double angulo;  //

    public Polar() {
    }
    
    public Polar(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    public Polar cartesiana2D_polar(double x, double y) {
        Polar obj2 = new Polar();
        //double grados = (y * 180/Math.PI);
        double r = Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
        double ang = Math.atan(y/x);
        
        obj2.setRadio(r);
        obj2.setAngulo(ang);
        System.out.println(obj2.getRadio());
        System.out.println(obj2.getAngulo() + " (radianes) ");
        
        return new Polar(r, ang);
        
        
    }
    
    public Polar cartesiana2D_polar(Cartesiana2D c) {
        return new Polar(c.getX(), c.getY());
    }    
}