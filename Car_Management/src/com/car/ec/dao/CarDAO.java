/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.car.ec.dao;

import com.car.ec.entity.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author pc
 */
public class CarDAO {
    private String mensaje = "";
    
    public String agregarCar(Connection con , Car emp){
        PreparedStatement pst = null;
        String sql = "INSERT INTO CAR (maxe, tenxe, hangxe, giaxe, loaixe, xuatxu, namsanxuat) "
                    + "VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getMaXe());
            pst.setString(2, emp.getTenxe());
            pst.setString(3, emp.getHangxe());
            pst.setString(4, emp.getGiaxe());
            pst.setString(5, emp.getLoaixe()+"");
            pst.setString(6, emp.getXuatxu()+"");
            pst.setInt(7, emp.getNamsanxuat());
            mensaje = "Thêm dữ liệu thành công!!!";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "\"Thêm dữ liệu thất bại!!! \n" + e.getMessage();
            //mensaje = "Thêm dữ liệu thất bại! \n" + e.getMessage(); //NO SE GUARDAR CORRECATMENTE
        }
        return mensaje;
    }
//            pst.setString(2, emp.getTenxe());
//            pst.setString(3, emp.getHangxe());
//            pst.setString(4, emp.getGiaxe());
//            pst.setString(5, emp.getLoaixe()+"");
//            pst.setString(6, emp.getXuatxu()+"");
//            pst.setInt(7, emp.getNamsanxuat());
//            mensaje = "Thêm dữ liệu thành công!";  //GUARDADO CORRECATMENTE
//            pst.execute();
//            pst.close();
//        } catch (SQLException e) {
//            mensaje = "Thêm dữ liệu thất bại! \n" + e.getMessage(); //NO SE GUARDAR CORRECATMENTE
//        }
//        return mensaje;
//    }
    
    public String modificarCar(Connection con , Car emp){
        PreparedStatement pst = null;
        String sql = "UPDATE CAR SET TENXE = ?, HANGXE = ?, GIAXE = ?, LOAIXE = ?, XUATXU = ?, NAMSANXUAT = ? "
                     + "WHERE MAXE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getTenxe());
            pst.setString(2, emp.getHangxe());
            pst.setString(3, emp.getGiaxe());
            pst.setString(4, emp.getLoaixe()+"");
            pst.setString(5, emp.getXuatxu()+"");
            pst.setInt(6, emp.getNamsanxuat());
            pst.setInt(7, emp.getMaXe());
            mensaje = "Cập nhật dữ liệu thành công!!!";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "Cập nhật dữ liệu thất bại!!! \n" + e.getMessage();
            //mensaje = "Thêm dữ liệu thất bại! \n" + e.getMessage(); //NO SE GUARDAR CORRECATMENTE
        }        
        return mensaje;     
    }
     
    public String eliminarCar(Connection con , int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM CAR WHERE MAXE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "Xóa dữ liệu thành công!"; //ELIMINADO CORRECATMENTE
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "Xóa dữ liệu thành công! \n" + e.getMessage(); //NO SE PUDO ELIMINADO CORRECATMENTE
        }  
        return mensaje;
        
    }
    
    public void listarCar(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"MaXe","TenXe","HangXe","GiaXe","LoaiXe","XuatXu","NamSanXuat"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM CAR ORDER BY MAXE";
        
        String [] filas = new String[7]; //SO 7
        
        Statement st = null;
        ResultSet rs =null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 7; i++) { //SO 7 
                    filas[i] = rs.getString(i+1); //???
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE LISTAR LA TABLA");
        }
    }
    public int getMaxID(Connection con){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs =null;
        String sql = "SELECT MAX(MAXE)+1 AS ID FROM CAR";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println("Error al mostart id" + e.getMessage());
        }        
        return id;
    }
    
}
