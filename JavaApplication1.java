
package javaapplication1;

/**
 *
 * @author ERROR 404
 */
public class Cilindirca {

    private double radio;
    private double angle;
    private double z;
    
    public Cartesiana2D polar_cartesiana2D(Polar p) {
        return polar_cartesiana2D(p.getRadio(), p.getAngulo());
    }
    
    
    public void setradio (double radio) {
        this.radio = radio;
    }
    
    public void setangle (double angle) {
        this.angle = angle;
    }
    
    public void setZ (double z) {
        this.z = z;
    }

    public Cilindirca(double radio, double angle, double z) {
        this.radio = radio;
        this.angle = angle;
        this.z = z;
    }
    public Cilindirca() {
        
    }
    

    
    
}
