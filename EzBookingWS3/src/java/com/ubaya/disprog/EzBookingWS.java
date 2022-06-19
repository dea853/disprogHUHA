/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.disprog;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.mitraResto;

/**
 *
 * @author Windows 10 PRO
 */
@WebService(serviceName = "EzBookingWS")
public class EzBookingWS {
mitraResto model;
    ArrayList<String> userList;
    
    public EzBookingWS(){
        model = new mitraResto();
        userList = model.display();
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    
    @WebMethod(operationName = "registrasiMitra")
    public String registrasiMitra(@WebParam(name = "namaPemilik") String namaPemilik, @WebParam(name = "namaResto") String namaResto, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "jumlahMeja") int jumlahMeja) {
        
        //TODO write your implementation code here:
        model = new mitraResto(namaPemilik,namaResto,username, password,jumlahMeja);
        model.insert();
        userList.add(username+"-"+password);
        return "true";
    
    }
}
