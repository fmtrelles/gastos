/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.DetalleMEs;
import Modelo.DeudaCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class TrabajarDeuda {

    public static ArrayList<DeudaCliente> MostrarDeudaCliente(String fecha, int cliente) {        
        ArrayList<DeudaCliente> lista = new ArrayList<>();
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("CALL PROC_MOSTRARDETALLECUOTA(?,?)");
            st.setString(1, fecha);
            st.setInt(2,cliente);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DeudaCliente detalle = new DeudaCliente();
                detalle.setFecha(rs.getString(1));
                detalle.setDetalle(rs.getString(2));
                detalle.setCantidadcuotas(rs.getInt(3));
                detalle.setNumerocuota(rs.getInt(4));
                detalle.setMonto(rs.getDouble(5));
                lista.add(detalle);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Error al Buscar Gastos" + ex);
        }
        return lista;
    }
    
    public static Double MostrarDeudaMes(String fecha, int cliente) {        
        //ArrayList<DetalleMEs> lista = new ArrayList<>();
        Double monto = null;
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("CALL PROC_DETALLEMES(?,?)");
            st.setString(1, fecha);
            st.setInt(2,cliente);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DetalleMEs detalle = new DetalleMEs();
                detalle.setMonto(rs.getDouble(1));
                //lista.add(detalle);
                monto = detalle.getMonto();
            }
            return monto;
        } catch (SQLException ex) {
            System.out.println("Error al Buscar Gastos Mes" + ex);
        }
        return monto;
    }
}
