/*
 * Acaba la clase Triangulo con el/los constructores, accesores (get/set)
 * método toString().
 * fecha limite: 15/10/2010 19:00
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class Triangulo {
    
    // propiedades
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /* Calcula el área de este triangulo */
    public double area() {
        return base*altura/2;
    }
    
    /* Calcula el perímetro de este triangulo conocida su base y altura */
     private double perimetro() {
        double hipotenusa;
        hipotenusa = Math.sqrt(((base/2)*(base/2)) + ((altura)*(altura)));
        return hipotenusa*2+base;
     }
    

       
    public static void main(String[] args) {
        Triangulo c1 = new Triangulo(19.0, 17.0);
        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
    }
    

    
}
