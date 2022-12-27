/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author txdao
 */
public class BangDiem {
    public static ArrayList<Diem> bangDiem = new ArrayList<>();
    public static String fileName = "BangDiem.txt";
    public static String fileName2 = "HocPhan.txt";
    public static DBEngine db = new DBEngine();
    public static ArrayList<ArrayList<HocPhan>> List = new ArrayList<>();
    public static ArrayList<HocPhan> KTPM = new ArrayList<>();
    public static void main(String[] args) {
        
        try{
            List = (ArrayList<ArrayList<HocPhan>>)db.docFile(fileName2);
            System.out.println("Done!");
        }
        catch(Exception E){
            System.out.println(E.toString());
        }
        KTPM = List.get(0);
        Diem D1 = new Diem(5,6,1,KTPM.get(0));
        Diem D2 = new Diem(8,7,4,KTPM.get(1));
        Diem D3 = new Diem(8,9,6,KTPM.get(2));
        Diem D4 = new Diem(4,6,4,KTPM.get(3));
        Diem D5 = new Diem(9,9,8,KTPM.get(4));
        Diem D6 = new Diem(10,9,7,KTPM.get(5));
        Diem D7 = new Diem(9,6,8,KTPM.get(6));
        Diem D8 = new Diem(7,6,6,KTPM.get(7));
        Diem D9 = new Diem(8,6,7,KTPM.get(8));
        Diem D10 = new Diem(9,6,8,KTPM.get(9));
        bangDiem.add(D1);
        bangDiem.add(D2);
        bangDiem.add(D3);
        bangDiem.add(D4);
        bangDiem.add(D5);
        bangDiem.add(D6);
        bangDiem.add(D7);
        bangDiem.add(D8);
        bangDiem.add(D9);
        bangDiem.add(D10);
        try{
            db.LuuFile(fileName, bangDiem);
        }
        catch(Exception E){
            
        }
       
    }
}
