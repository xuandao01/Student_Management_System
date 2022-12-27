/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;
import java.util.*;
import java.io.*;
/**
 *
 * @author txdao
 */
public class DSHoTro {
    public static ArrayList<HoTro> DSHoTro = new ArrayList<>();
    public static String fileName = "DSHoTro.txt";
    public static DBEngine db = new DBEngine();
    public static void main(String[] args) {
        HoTro HT = new HoTro();
        DSHoTro.add(HT);
        try{
            db.LuuFile(fileName, DSHoTro);
            System.out.println("Done!");
        }
        catch(Exception E){
            
        }
    }
}
