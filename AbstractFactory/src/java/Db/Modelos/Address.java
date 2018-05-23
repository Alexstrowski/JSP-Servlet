/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db.Modelos;

/**
 *
 * @author usuario
 */
public class Address {
    private int address_id;
    private String address;
    private String district;

    public Address(int address_id, String address, String district) {
        this.address_id = address_id;
        this.address = address;
        this.district = district;
    }
    
    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
}
