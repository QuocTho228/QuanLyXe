/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.car.ec.view;

import com.car.ec.bo.CarBO;
import com.car.ec.entity.Car;
import java.util.Locale;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class FrmCar extends javax.swing.JFrame {

    /**
     * Creates new form FrmCar
     */
    private CarBO cbo = new CarBO();
    
    public FrmCar() {
        initComponents();
        listarCar();
        idMax();
        //CAI DAT GIAO DIEN KHONG THE
        setTitle("CAR MANAGEMENT");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void listarCar(){
        cbo.listarCar(tbCar);
    }
    
    public void idMax(){
        txtMaXe.setText(cbo.getMaxID()+"");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNamSanXuat = new javax.swing.JTextField();
        txtMaXe = new javax.swing.JTextField();
        txtTenXe = new javax.swing.JTextField();
        txtHangXe = new javax.swing.JTextField();
        txtGiaXe = new javax.swing.JTextField();
        rdXeXang = new javax.swing.JRadioButton();
        rdXeDien = new javax.swing.JRadioButton();
        rdNhapKhau = new javax.swing.JRadioButton();
        rdNoiDia = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCar = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("NamSanXuat:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Car Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("MaXe:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("TenXe:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("HangXe:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("GiaXe:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("LoaiXe:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("XuatXu:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtNamSanXuat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(txtNamSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 270, -1));

        txtMaXe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(txtMaXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 270, -1));

        txtTenXe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(txtTenXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 270, -1));

        txtHangXe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(txtHangXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, -1));

        txtGiaXe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(txtGiaXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 270, -1));

        rdXeXang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdXeXang);
        rdXeXang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdXeXang.setText("Xe_Xang");
        jPanel1.add(rdXeXang, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        rdXeDien.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdXeDien);
        rdXeDien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdXeDien.setText("Xe_Dien");
        jPanel1.add(rdXeDien, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        rdNhapKhau.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdNhapKhau);
        rdNhapKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdNhapKhau.setText("Nhap_Khau");
        rdNhapKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNhapKhauActionPerformed(evt);
            }
        });
        jPanel1.add(rdNhapKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        rdNoiDia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdNoiDia);
        rdNoiDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdNoiDia.setText("Noi_Dia");
        rdNoiDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoiDiaActionPerformed(evt);
            }
        });
        jPanel1.add(rdNoiDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        tbCar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 430, 330));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        btnDrop.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDrop.setText("Drop");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });
        jPanel1.add(btnDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdNhapKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNhapKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNhapKhauActionPerformed

    private void rdNoiDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoiDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoiDiaActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtMaXe.getText().isEmpty() || txtTenXe.getText().isEmpty() || txtHangXe.getText().isEmpty() 
                || txtGiaXe.getText().isEmpty() || txtNamSanXuat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin vào bảng!");
        }else{
            char loaixe;
            if (rdXeXang.isSelected()) {
                loaixe = 'X';
            }else{
                loaixe = 'D';           
           }
            char xuatxu;
            if (rdNoiDia.isSelected()) {
                xuatxu = 'D';                
            }else{
                xuatxu = 'K';
            }
                
            Car emp = new Car();
            emp.setMaXe(Integer.parseInt(txtMaXe.getText()));
            emp.setMaXe(Integer.parseInt(txtMaXe.getText()));
            emp.setTenxe(txtTenXe.getText());
            emp.setHangxe(txtHangXe.getText());
            emp.setGiaxe(txtGiaXe.getText());
            emp.setLoaixe(loaixe);
            emp.setXuatxu(xuatxu);
            emp.setNamsanxuat(Integer.parseInt(txtNamSanXuat.getText()));
            String mensaje = cbo.modificarCar(emp); //update
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCar();
        }        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        limpiar();
    }//GEN-LAST:event_btnClearActionPerformed

    public void limpiar(){
        txtMaXe.setText("");
        txtTenXe.setText("");
        txtHangXe.setText("");
        txtGiaXe.setText("");
        txtNamSanXuat.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        idMax();
//        rdXeDien.setSelected(false);
//        rdXeXang.setSelected(false);
//        rdNhapKhau.setSelected(false);
//        rdNoiDia.setSelected(false);
    }
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (txtMaXe.getText().isEmpty() || txtTenXe.getText().isEmpty() || txtHangXe.getText().isEmpty() 
                || txtGiaXe.getText().isEmpty() || txtNamSanXuat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin vào bảng!");
        }else{
            char loaixe;
            if (rdXeDien.isSelected()) {
                loaixe = 'D';
            }else{
                loaixe = 'X';           
           }
            char xuatxu;
            if (rdNoiDia.isSelected()) {
                xuatxu = 'D';                
            }else{
                xuatxu = 'K';
            }
                
            Car emp = new Car();
            emp.setMaXe(Integer.parseInt(txtMaXe.getText()));
            emp.setTenxe(txtTenXe.getText());
            emp.setHangxe(txtHangXe.getText());
            emp.setGiaxe(txtGiaXe.getText());
            emp.setLoaixe(loaixe);
            emp.setXuatxu(xuatxu);
            emp.setNamsanxuat(Integer.parseInt(txtNamSanXuat.getText()));
            String mensaje = cbo.agregarCar (emp);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCar();
        }        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        if (txtMaXe.getText().isEmpty() || txtTenXe.getText().isEmpty() || txtHangXe.getText().isEmpty() 
                || txtGiaXe.getText().isEmpty() || txtNamSanXuat.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin vào bảng!");
        }else{
            String mensaje = cbo.eliminarCar(Integer.parseInt(txtMaXe.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCar();
        }
    }//GEN-LAST:event_btnDropActionPerformed

    private void tbCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarMouseClicked
        int seleccion = tbCar.rowAtPoint(evt.getPoint());
        txtMaXe.setText(tbCar.getValueAt(seleccion, 0)+"");
        txtTenXe.setText(tbCar.getValueAt(seleccion, 1)+"");
        txtHangXe.setText(tbCar.getValueAt(seleccion, 2)+"");
        txtGiaXe.setText(tbCar.getValueAt(seleccion, 3)+"");
        String loaixe = tbCar.getValueAt(seleccion, 4)+"";
        if (loaixe.equals("D")) {
            rdXeDien.setSelected(true);            
        }else{
            rdXeXang.setSelected(true);
        }
        String xuatxu = tbCar.getValueAt(seleccion, 5)+"";
        if (xuatxu.equals("K")) {
            rdNhapKhau.setSelected(true);            
        }else{
            rdNoiDia.setSelected(true);
        }
        txtNamSanXuat.setText(tbCar.getValueAt(seleccion, 6)+"");
    }//GEN-LAST:event_tbCarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNhapKhau;
    private javax.swing.JRadioButton rdNoiDia;
    private javax.swing.JRadioButton rdXeDien;
    private javax.swing.JRadioButton rdXeXang;
    private javax.swing.JTable tbCar;
    private javax.swing.JTextField txtGiaXe;
    private javax.swing.JTextField txtHangXe;
    private javax.swing.JTextField txtMaXe;
    private javax.swing.JTextField txtNamSanXuat;
    private javax.swing.JTextField txtTenXe;
    // End of variables declaration//GEN-END:variables
}