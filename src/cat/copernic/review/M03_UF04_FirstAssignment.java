/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     * 
     * Crea una nueva subclase de barco llamada barco de mercancias
     * 
     * Crea una nueva subclase o mas de barco de mercancais llamada cargero
     * 
     * 
     */
    public static void main(String[] args) {
        // Prueba to código aquí
        Barco barco1 = new Yate(true, new Motor(1000), 20.0, 12.5, 23, 7, 4, 6);
        barco1.arranca();
        
        Barco barco2 = new PortaAviones(35, new Motor(6000), 250.0, 75.0, 46, 60, 35);
        
        System.out.println(barco1 instanceof Barco);
        
        /*
        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
        System.out.println(cc1);
        cc1.ingresa(123.09);
        System.out.println(cc1);
        cc1.abona(98.87);
        System.out.println(cc1);*/
    }
    
}
