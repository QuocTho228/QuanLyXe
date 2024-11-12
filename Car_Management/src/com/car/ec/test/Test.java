/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.car.ec.test;

import com.car.ec.bo.CarBO;
import com.car.ec.entity.Car;

/**
 *
 * @author pc
 */
public class Test {
    CarBO cbo = new CarBO(); //carbo
    Car emp = new Car();
    String mensaje = "";
    
    public void insertar(){
//        emp.setTenxe("Camry");
//        emp.setHangxe("Toyota");
//        emp.setGiaxe("850000000");
//        emp.setLoaixe('X');
//        emp.setXuatxu('K');
//        emp.setNamsanxuat(2020);
        
        emp.setTenxe("Seltos");
        emp.setHangxe("Kia");
        emp.setGiaxe("720000000");
        emp.setLoaixe('X');
        emp.setXuatxu('K');
        emp.setNamsanxuat(2021);
        mensaje = cbo.agregarCar(emp);
        System.out.println(mensaje);
    }  
    
    public void modificarCar(){
        emp.setMaXe(2);
        emp.setTenxe("Sel");
        emp.setHangxe("Kia");
        emp.setGiaxe("720000000");
        emp.setLoaixe('X');
        emp.setXuatxu('K');
        emp.setNamsanxuat(2021);
        mensaje = cbo.modificarCar(emp);
        System.out.println(mensaje);
    }    
    
    public void eliminarCar(){
        mensaje = cbo.eliminarCar(2);
        System.out.println(mensaje);
    }  
    
    public static void main(String[] args) {
        Test test = new Test();
        //test.insertar();
        //test.modificarCar();
        test.eliminarCar();
    }
}
