/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.car.ec.entity;

/**
 *
 * @author pc
 */
public class Car {
    private int maXe;
    private String tenxe;
    private String hangxe;
    private String giaxe;
    private char loaixe;
    private char xuatxu;
    private int namsanxuat;

    public Car() {
    }

    public Car(int maXe, String tenxe, String hangxe, String giaxe, char loaixe, char xuatxu, int namsanxuat) {
        this.maXe = maXe;
        this.tenxe = tenxe;
        this.hangxe = hangxe;
        this.giaxe = giaxe;
        this.loaixe = loaixe;
        this.xuatxu = xuatxu;
        this.namsanxuat = namsanxuat;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public String getGiaxe() {
        return giaxe;
    }

    public void setGiaxe(String giaxe) {
        this.giaxe = giaxe;
    }

    public char getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(char loaixe) {
        this.loaixe = loaixe;
    }

    public char getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(char xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    @Override
    public String toString() {
        return "Car{" + "maXe=" + maXe + ", tenxe=" + tenxe + ", hangxe=" + hangxe + ", giaxe=" + giaxe + ", loaixe=" + loaixe + ", xuatxu=" + xuatxu + ", namsanxuat=" + namsanxuat + '}';
    }
    
    
}
