/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.objetos;

import AbstractFactory.Interface.Vehiculo;

/**
 *
 * @author usuario
 */
public class Minicamion extends Vehiculo{
    
    @Override
    public String getTipo() {
        return "Minicamion";
    }
}
