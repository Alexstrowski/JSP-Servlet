/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Producer;
import AbstractFactory.Factory.VehiculoFactory;
import AbstractFactory.method.AbstractFactory;
/**
 *
 * @author usuario
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice){
        
        if(choice.equalsIgnoreCase("Vehiculo")){
            return new VehiculoFactory();
        }
        return null;
    }
}
