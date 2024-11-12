/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.car.ec.bo;

import com.car.ec.dao.CarDAO;
import com.car.ec.db.Conexion;
import com.car.ec.entity.Car;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author pc
 */
public class CarBO {
    
    private String mensaje = "";
    private CarDAO edao = new CarDAO();
    
    public String agregarCar(Car emp){
        Connection conn =  Conexion.getConnection();
        try {
            mensaje = edao.agregarCar(conn, emp);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if (conn != null) {
                    conn.close();                   
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }        
        return mensaje;
    }
    
    public String modificarCar(Car emp){
        Connection conn =  Conexion.getConnection();
        try {
            mensaje = edao.modificarCar(conn, emp);

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();

        }finally{
            try {
                if (conn != null) {
                    conn.close();                   
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }       
        return mensaje;     
    }
     
    public String eliminarCar(int id){
        Connection conn =  Conexion.getConnection();
        try {
            mensaje = edao.eliminarCar(conn, id);

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();

        }finally{
            try {
                if (conn != null) {
                    conn.close();                   
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }        
        return mensaje;
        
    }
    
    public void listarCar(JTable tabla){
        Connection conn =  Conexion.getConnection();
        edao.listarCar(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public int getMaxID(){
        Connection conn =  Conexion.getConnection();
        int id = edao.getMaxID(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }    
}