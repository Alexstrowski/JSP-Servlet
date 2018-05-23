/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import modelo.Persona;

/**
 *
 * @author LABO08
 */
public class FactoryPersona implements Factory {

    @Override
    public Persona crearPersona() {
        
        return new Persona();
    }
    
}
