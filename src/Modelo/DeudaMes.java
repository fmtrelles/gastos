/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fernando
 */
public class DeudaMes {
    String nombre;
    Double total;

    public DeudaMes() {
    }

    public DeudaMes(String nombre, Double total) {
        this.nombre = nombre;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
