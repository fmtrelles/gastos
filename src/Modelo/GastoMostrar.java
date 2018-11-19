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
public class GastoMostrar {
    String fecha;
    Double monto;
    int cuotas;
    String comentario;
    String estado;
    Double montocuota;
    String cliente;

    public GastoMostrar() {
    }

    public GastoMostrar(String fecha, Double monto, int cuotas, String comentario, String estado, Double montocuota, String cliente) {
        this.fecha = fecha;
        this.monto = monto;
        this.cuotas = cuotas;
        this.comentario = comentario;
        this.estado = estado;
        this.montocuota = montocuota;
        this.cliente = cliente;
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

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getMontocuota() {
        return montocuota;
    }

    public void setMontocuota(Double montocuota) {
        this.montocuota = montocuota;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
}
