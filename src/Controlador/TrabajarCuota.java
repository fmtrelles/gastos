/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cuota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class TrabajarCuota {
    public static void InsertarCuota(Cuota detalle) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("CALL PROC_INSERTARCUOTA(?,?,?,?,?,?,?,?)");
            st.setInt(1, detalle.getIdcuota());
            st.setDouble(2, detalle.getMonto());
            st.setString(3, detalle.getFecha());
            st.setInt(4, detalle.getIdgasto());
            st.setInt(5, detalle.getEstado());
            st.setString(6, detalle.getDetalle());
            st.setInt(7, detalle.getCantidadcuotas());
            st.setInt(8, detalle.getNumerocuotas());
            st.executeUpdate();
            con.close();
            st.close();
            //JOptionPane.showMessageDialog(null, "Guardado Correctamente", "Listo", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Error al insertar Cuotas:" + ex);
        }
    }
}
