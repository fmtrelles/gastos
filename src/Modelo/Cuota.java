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
public class Cuota {
    int idcuota;
    Double monto;
    String fecha;
    int idgasto;
    int estado;
    String detalle;
    int cantidadcuotas;
    int numerocuotas;

    public Cuota() {
    }

    public Cuota(int idcuota, Double monto, String fecha, int idgasto, int estado, String detalle, int cantidadcuotas, int numerocuotas) {
        this.idcuota = idcuota;
        this.monto = monto;
        this.fecha = fecha;
        this.idgasto = idgasto;
        this.estado = estado;
        this.detalle = detalle;
        this.cantidadcuotas = cantidadcuotas;
        this.numerocuotas = numerocuotas;
    }

    public int getIdcuota() {
        return idcuota;
    }

    public void setIdcuota(int idcuota) {
        this.idcuota = idcuota;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdgasto() {
        return idgasto;
    }

    public void setIdgasto(int idgasto) {
        this.idgasto = idgasto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidadcuotas() {
        return cantidadcuotas;
    }

    public void setCantidadcuotas(int cantidadcuotas) {
        this.cantidadcuotas = cantidadcuotas;
    }

    public int getNumerocuotas() {
        return numerocuotas;
    }

    public void setNumerocuotas(int numerocuotas) {
        this.numerocuotas = numerocuotas;
    }
    
}
