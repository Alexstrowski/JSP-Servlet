/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Factory;

import AbstractFactory.objetos.*;
import AbstractFactory.Interface.Vehiculo;
import AbstractFactory.method.AbstractFactory;

/**
 *
 * @author usuario
 */
public class VehiculoFactory implements AbstractFactory {

    
    @Override
    public Vehiculo getVehiculo(int peso,String contenido) {
        if (contenido.equalsIgnoreCase("PERSONAS")) {
            if(peso < 200)
                return new Cupe();
            else if(peso < 225)
                return new Sedan();
            else if(peso < 250)
                return new StationWagon();
            else if(peso < 275)
                return new Camioneta();
            else if(peso < 300)
                return new Minivan();
            else
                return new Bus();
        } else if (contenido.equalsIgnoreCase("PERSONAS Y CARGA")) {
            if(peso < 400)
                return new CamionetaDeCarga();
            else if(peso < 500)
                return new Furgon();
            else
                return null;
        } else if (contenido.equalsIgnoreCase("CARGA")) {
            if(peso < 400)
                return new Minicamion();
            else if(peso < 700)
                return new Camion();
            else
                return new Volquete();
        }
        return null;

    }

}
