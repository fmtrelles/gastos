/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DeudaMes;
import Modelo.Gasto;
import Modelo.GastoMostrar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class TrabajarGasto {

    public static void InsertarGasto(Gasto detalle) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("CALL PROC_INSERTARGASTO(?,?,?,?,?,?,?,?)");
            st.setInt(1, detalle.getId());
            st.setDouble(2, detalle.getMonto());
            st.setString(3, detalle.getFecha());
            st.setInt(4, detalle.getCuotas());
            st.setString(5, detalle.getComentario());
            st.setInt(6, detalle.getEstado());
            st.setDouble(7, detalle.getMontocuota());
            st.setInt(8, detalle.getIdcliente());
            st.executeUpdate();
            con.close();
            st.close();
            JOptionPane.showMessageDialog(null, "Guardado Correctamente", "Listo", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Error al insertar Gasto:" + ex);
        }
    }
    
    public static ArrayList<GastoMostrar> MostrarGastosPendientes() {

        ArrayList<GastoMostrar> lista = new ArrayList<>();
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("SELECT gastos.monto,"
                    + "gastos.monto_cuota,"
                    + " gastos.fecha_compra,"
                    + " clientes.nombre,"
                    + " gastos.cuotas,"
                    + " gastos.comentario,"
                    + " (select if(estado=1,'Pendiente','Cancelado')) as Estado"
                    + " FROM gastos, clientes"
                    + " where clientes.idcliente = gastos.cliente"
                    + " AND estado = 1"
                    + " order by gastos.fecha_compra");            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                GastoMostrar detalle = new GastoMostrar();
                detalle.setMonto(rs.getDouble(1));
                detalle.setMontocuota(rs.getDouble(2));
                detalle.setFecha(rs.getString(3));
                detalle.setCliente(rs.getString(4));
                detalle.setCuotas(rs.getInt(5));
                detalle.setComentario(rs.getString(6));
                detalle.setEstado(rs.getString(7));
                lista.add(detalle);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Error al Buscar Gastos" + ex);
        }
        return lista;
    }
    
    public static int MostrarUltimoGAsto() {
        int max = 0;
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("SELECT MAX(idgasto) from gastos");            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Gasto detalle = new Gasto();
                detalle.setId(rs.getInt(1));
                max = detalle.getId();
            }            
            //return max;
        } catch (SQLException ex) {
            System.out.println("Error al Buscar Gastos" + ex);
        }
        return max;
    }
    
    public static ArrayList<DeudaMes> MostrarDeudaMes(String fecha) {

        ArrayList<DeudaMes> lista = new ArrayList<>();
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("CALL PROC_PAGODELMES(?)"); 
            st.setString(1, fecha);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DeudaMes detalle = new DeudaMes();
                detalle.setNombre(rs.getString(1));
                detalle.setTotal(rs.getDouble(2));
                lista.add(detalle);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Error al Buscar Gastos" + ex);
        }
        return lista;
    }
}
