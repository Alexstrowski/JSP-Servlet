/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.method;

import AbstractFactory.Interface.Vehiculo;

/**
 *
 * @author usuario
 */
public interface AbstractFactory {
    
    abstract Vehiculo getVehiculo(int peso,String contenido);
    
}
