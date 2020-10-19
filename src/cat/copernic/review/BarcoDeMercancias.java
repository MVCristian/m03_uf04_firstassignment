/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author HP
 */
public abstract class BarcoDeMercancias extends Barco {
    
    private int capacidadContenedores;

    public BarcoDeMercancias(Motor motor, double eslora, double manga, int nudos, int peso, int capacidadContenedores) {
        //llama al constructor de la superclase
        super(motor, eslora, manga, nudos, peso);
        this.capacidadContenedores = capacidadContenedores;
    }
    @Override
    public void arranca(){
        System.out.println("Arrancando barco de mercancias");
    }
    
    @Override
    public void atraca(){
        System.out.println("Atracando barco de mercancias");
    }

    
    
    
    
    
}
