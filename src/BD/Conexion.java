/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebas
 */
public class Conexion {
    
    public Connection obtenerConexion(){
        
        Connection connection = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal","root","");
            System.out.println("Conexion Exitosa");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error de conexion"+ e.getMessage());
            
        }
        
        return connection;
        
    }
    
////    public static void main(String[] args) {
////        Conexion con = new Conexion();
////        con.obtenerConexion();
////    }
}
