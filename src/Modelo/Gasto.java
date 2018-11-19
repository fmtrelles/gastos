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
public class Gasto {
    Double monto;
    String fecha;
    int cuotas;
    int id;
    String comentario;
    int estado;
    Double montocuota;
    int idcliente;

    public Gasto() {
    }

    public Gasto(Double monto, String fecha, int cuotas, int id, String comentario, int estado, Double montocuota, int idcliente) {
        this.monto = monto;
        this.fecha = fecha;
        this.cuotas = cuotas;
        this.id = id;
        this.comentario = comentario;
        this.estado = estado;
        this.montocuota = montocuota;
        this.idcliente = idcliente;
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

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Double getMontocuota() {
        return montocuota;
    }

    public void setMontocuota(Double montocuota) {
        this.montocuota = montocuota;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
}
