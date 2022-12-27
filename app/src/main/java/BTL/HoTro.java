/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.io.Serializable;

/**
 *
 * @author txdao
 */
public class HoTro implements Serializable{
    String thongTinHT;
    SinhVien x;
    String gmail;
    public HoTro(){
        thongTinHT = "Ho tro 1";
        x = new SinhVien();
    }
    public HoTro(String TT, SinhVien x,String gmail){
        thongTinHT = TT;
        this.x = x;
        this.gmail = gmail;
    }
}
