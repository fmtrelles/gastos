/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class TrabajarCliente {

    public static ArrayList<Cliente> MostrarCliente() {

        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            Connection con = Conexion.conectar();
            PreparedStatement st = null;
            st = con.prepareStatement("SELECT * FROM clientes");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Cliente detalle = new Cliente();
                detalle.setIdcliente(rs.getInt(1));
                detalle.setNombre(rs.getString(2));
                lista.add(detalle);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Error al Buscar Cliente" + ex);
        }
        return lista;
    }

    public static Cliente BuscarClientepornombre(String nombre, Cliente c) {
        try {
            Connection cnn = Conexion.conectar();
            PreparedStatement ps = null;
            ps = cnn.prepareStatement("select * from clientes where nombre Like ?");
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (c == null) {
                    c = new Cliente();
                }
                c.setIdcliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
            }
            cnn.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar cliente para el combo "+ex);
        }
        return c;
    }
}
