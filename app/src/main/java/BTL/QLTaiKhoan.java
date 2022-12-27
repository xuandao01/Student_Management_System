/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author txdao
 */
public class QLTaiKhoan implements Serializable{
    public static ArrayList<TaiKhoan> dstk = new ArrayList<>();
    public static ArrayList<TaiKhoan> dstkgv = new ArrayList<>();
    public static ArrayList<TaiKhoan> dstkqtv = new ArrayList<>();

    public static String fileName = "taikhoan.txt";
    public static String fileName2 = "taikhoangv.txt";
    public static String fileName3 = "taikhoanqtv.txt";

    public static DBEngine db = new DBEngine();
    public TaiKhoan getTK(String user){
        try{
            TaiKhoan tk = new TaiKhoan(user);
            dstk = (ArrayList<TaiKhoan>)db.docFile(fileName);
            if(dstk.contains(tk))
                return dstk.get(dstk.indexOf(tk));
            else return null;
        }
        catch(Exception E){
            return null;
        }
    }  
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan("Xuandao","123456",1);
        TaiKhoan tk2 = new TaiKhoan("Xuandao2","123456",1);
        TaiKhoan tk11 = new TaiKhoan("Xuandao3","123456",1);
        TaiKhoan tk22 = new TaiKhoan("Xuandao4","123456",1);
        TaiKhoan tk12 = new TaiKhoan("Xuandao5","123456",1);
        TaiKhoan tk21 = new TaiKhoan("Xuandao6","123456",1);        
        dstk.add(tk1);
        dstk.add(tk2);
        dstk.add(tk21);
        dstk.add(tk11);
        dstk.add(tk22);
        dstk.add(tk12);
        TaiKhoan tk3 = new TaiKhoan("GiangVien1","123456",2);
        TaiKhoan tk4 = new TaiKhoan("GiangVien2","123456",2);
        TaiKhoan tk5 = new TaiKhoan("QTV1","123456",3);
        TaiKhoan tk6 = new TaiKhoan("QTV2","123456",3);
        dstkgv.add(tk3);
        dstkgv.add(tk4);
        dstkqtv.add(tk5);
        dstkqtv.add(tk6);

        try{
            db.LuuFile(fileName, dstk);
            System.out.println("completed");
            db.LuuFile(fileName2, dstkgv);
            System.out.println("completed");
            db.LuuFile(fileName3, dstkqtv);
            System.out.println("completed");
        }
        catch(Exception E)
        {
            System.out.println(E.toString());
        }
    }
}
