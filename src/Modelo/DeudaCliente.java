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
public class DeudaCliente {
    String fecha;
    Double monto;
    String detalle;
    int numerocuota;
    int cantidadcuotas;

    public DeudaCliente(String fecha, Double monto, String detalle, int numerocuota, int cantidadcuotas) {
        this.fecha = fecha;
        this.monto = monto;
        this.detalle = detalle;
        this.numerocuota = numerocuota;
        this.cantidadcuotas = cantidadcuotas;
    }

    public DeudaCliente() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getNumerocuota() {
        return numerocuota;
    }

    public void setNumerocuota(int numerocuota) {
        this.numerocuota = numerocuota;
    }

    public int getCantidadcuotas() {
        return cantidadcuotas;
    }

    public void setCantidadcuotas(int cantidadcuotas) {
        this.cantidadcuotas = cantidadcuotas;
    }
}
