/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.Conexion;
import Modelo.Colaborador;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Registro {
    
    public boolean agregar(Colaborador colaborador){
        
        Date date = null;
        
        try {
            Conexion con = new Conexion();//objeto coleccion
            Connection cnt = con.obtenerConexion();//conexion lista
            
            String query = "INSERT INTO colaborador(nombre,apellido,fechaingreso,sueldo) VALUES (?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(query); //capturas los elementos
            pst.setString(1, colaborador.getNombre());
            pst.setString(2, colaborador.getApellido());
            pst.setDate(3, new java.sql.Date(date.getTime()));
            pst.setInt(4, colaborador.getSueldo());
            
            pst.executeUpdate();//ejecuta consulta
            pst.close();//cierra consulta
            cnt.close();//cierra conexion
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error sql al agregar colaborador");
            return false;
        }
        
        
    }
    
    public boolean actualizar(Colaborador colaborador){
        
        Date date = null;
        
        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            
            String query = "UPDATE colaborador set nombre=?, apellido=?, fechaingreso=?, sueldo=? WHERE codigotrabajador=?";
            PreparedStatement pst = cnt.prepareStatement(query); //capturas los elementos
            pst.setString(1, colaborador.getNombre());
            pst.setString(2, colaborador.getApellido());
            pst.setDate(3, new java.sql.Date(date.getTime()));
            pst.setInt(4, colaborador.getSueldo());
            pst.setInt(5, colaborador.getCodigoTrabajador());
            
            pst.executeUpdate();
            pst.close();
            cnt.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error sql al actualizar colaborador");
            return false;
        }
     
    }
    
    public boolean eliminar(int codigoTrabajador){
        
        
        
        try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            
            String query = "DELETE FROM colaborador WHERE codigotrabajador=?";
            PreparedStatement pst = cnt.prepareStatement(query); //capturas los elementos
            pst.setInt(1, codigoTrabajador);
            
            
            pst.executeUpdate();
            pst.close();
            cnt.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error sql al eliminar colaborador");
            return false;
        }
        
        
    }
    
    public Colaborador buscarPorCodigoTrabajador(int codigoTrabajador){
        Colaborador colaborador = new Colaborador();
        try {
            
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            
            String query = "SELECT * FROM colaborador WHERE codigotrabajador=?";
            PreparedStatement pst = cnt.prepareStatement(query);
            pst.setInt(1, codigoTrabajador);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
            colaborador.setCodigoTrabajador(rs.getInt("codigotrabajador"));
            colaborador.setNombre(rs.getString("nombre"));
            colaborador.setApellido(rs.getString("apellido"));
            colaborador.setFechaIngreso(rs.getDate("fechaingreso"));
            colaborador.setSueldo(rs.getInt("sueldo"));
            
            }
            
            rs.close();
            
            pst.close();
            cnt.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error sql al listar colaborador por codigotrabajador" + e.getMessage());
        }
        return colaborador;
    }
    
    public List<Colaborador>buscarTodos(){
        
        List<Colaborador> lista = new ArrayList<>();
        
        
        try {
            
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            
            String query = "SELECT * FROM colaborador order by nombre";
            PreparedStatement pst = cnt.prepareStatement(query);
            
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
            Colaborador colaborador = new Colaborador();
            colaborador.setCodigoTrabajador(rs.getInt("codigotrabajador"));
            colaborador.setNombre(rs.getString("nombre"));
            colaborador.setApellido(rs.getString("apellido"));
            colaborador.setFechaIngreso(rs.getDate("fechaingreso"));
            colaborador.setSueldo(rs.getInt("sueldo"));
            
            lista.add(colaborador);
            
            }
            
            rs.close();
            pst.close();
            cnt.close();
          
            
            
            
        } catch (SQLException e) {
            System.out.println("Error sql al listar todos los colaboradores" + e.getMessage());
        }
        return lista;
        
        
    }

    public boolean buscarPorCodigoTrabajador(List<Colaborador> buscarTodos, int codigotrabajador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
