package AbstractFactory.objetos;

import AbstractFactory.Interface.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Volquete extends Vehiculo{
    @Override
    public String getTipo() {
        return "Volquete";
    }
}
