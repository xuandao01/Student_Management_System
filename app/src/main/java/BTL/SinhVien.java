/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.io.Serializable;
import java.io.*;
import java.util.*;
/**
 *
 * @author txdao
 */
public class SinhVien implements Serializable{
    String name;
    int age;
    String address;
    String id;
    String khoa; 
    ArrayList<Diem> BD;
    TaiKhoan tk;
    public SinhVien(){
        name = "";
        age = 0;
        address = "";
        BD = null;
        tk = null;
        khoa = "";
        id = "";
    }
    public SinhVien(String name,int age, String address,String id,String khoa,ArrayList<Diem> BD,TaiKhoan tk){
        this.name = name;
        this.age = age;
        this.address = address;
        this.khoa = khoa;
        this.id = id;
        this.BD = BD;
        this.tk = tk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
}
