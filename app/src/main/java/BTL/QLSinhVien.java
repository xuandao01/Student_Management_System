/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;
import java.util.*;
/**
 *
 * @author txdao
 */
public class QLSinhVien {
    static String fileName1 = "taikhoan.txt";
    static String fileName2 = "BangDiem.txt";
    static String fileName3 = "HocPhan.txt";
    static ArrayList<TaiKhoan> dstk = new ArrayList<>();
    static ArrayList<Diem> bangDiem = new ArrayList<>();
    static DBEngine db = new DBEngine();
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<ArrayList<HocPhan>> List = new ArrayList<>();
    static ArrayList<HocPhan> KTPM = new ArrayList<>();
    public static void main(String[] args) {
    try{
        dstk = (ArrayList<TaiKhoan>) db.docFile(fileName1);
        bangDiem = (ArrayList<Diem>) db.docFile(fileName2);
        List = (ArrayList<ArrayList<HocPhan>>) db.docFile(fileName3);
    }
    catch(Exception E){
            System.out.println(E.toString());
    }
    ArrayList<ArrayList<Diem>> bangDiem2 = new ArrayList<>();
    ArrayList<Diem> bangDiem3 = new ArrayList<>();
    Diem diem = new Diem();
    Random r = new Random();
    for(int i=0;i<6;i++){
        for(int j=0;j<9;j++){
            diem.L1 = Math.round((bangDiem.get(j).L1 +r.nextFloat(1))*100)/100;
            diem.L2 = Math.round((bangDiem.get(j).L1 -r.nextFloat(1))*100)/100;
            diem.L3 = Math.round((bangDiem.get(j).L1 +r.nextFloat(1))*100)/100;
            bangDiem3.add(diem);
        }
        bangDiem2.add(bangDiem3);
        bangDiem3.clear();
    }
    SinhVien  sv1 = new SinhVien("TXD", 20, "Ha noi", "20190012", "CNTT",bangDiem,dstk.get(0));
    SinhVien  sv2 = new SinhVien("TXS", 21, "Ha noi", "20190013", "CNTT",bangDiem2.get(0),dstk.get(1));
    SinhVien  sv3 = new SinhVien("MKL", 21, "Ha noi", "20190015", "CNTT",bangDiem2.get(1),dstk.get(2));
    SinhVien  sv4 = new SinhVien("SCD", 22, "Ha noi", "20190014", "CNTT",bangDiem2.get(2),dstk.get(3));
    SinhVien  sv5 = new SinhVien("XAS", 20, "Ha noi", "20190018", "CNTT",bangDiem2.get(3),dstk.get(4));
    SinhVien  sv6 = new SinhVien("QWS", 22, "Ha noi", "20190011", "CNTT",bangDiem2.get(4),dstk.get(5));
    dssv.add(sv1);
    dssv.add(sv2);
    dssv.add(sv3);
    dssv.add(sv4);
    dssv.add(sv5);
    dssv.add(sv6);
    String fileName4 = "DSSinhVien.txt";
    try{
        db.LuuFile(fileName4, dssv);
        System.out.println("Done!");
    }
    catch(Exception E){
        System.out.println(E.toString());
    }
    ArrayList<SinhVien> dssv2 = new ArrayList<>();
    try{
        dssv2 = (ArrayList<SinhVien>) db.docFile(fileName4);
    }
    catch(Exception E){
        
    }
       // System.out.println(sv2.BD.get(0).D4());
}
}
