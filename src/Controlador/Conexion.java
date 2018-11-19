/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class Conexion {

    public static Connection conectar() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/controlgastos_prueba";
            String user = "root";
            String pass = "";
            try {
                cn = DriverManager.getConnection(url, user, pass);
                System.out.println("conectado Correctamente");
            } catch (SQLException ex) {
                System.out.println("Error al conectar DriverManager"+ex);
            }
        } catch (ClassNotFoundException ex) {
           System.out.println("Error al conectar ClassnotFound"+ex);
        }
        return cn;
    }

}
