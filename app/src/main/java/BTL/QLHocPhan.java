/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;
import java.io.*;
import java.util.*;
/**
 *
 * @author txdao
 */
public class QLHocPhan implements Serializable{
    static ArrayList<HocPhan> KTPM = new ArrayList<>();
    static ArrayList<HocPhan> CNTT = new ArrayList<>();
    static ArrayList<HocPhan> KHMT = new ArrayList<>();
    static HocPhan lyLuanChinhTri = new HocPhan("LLCT01","Triet Hoc",2,30,0);
    static HocPhan lyLuanChinhTri1 = new HocPhan("LLCT02","Tu tuong HCM",2,30,0);
    static HocPhan lyLuanChinhTri2 = new HocPhan("LLCT03","Chu nghia XH",2,30,0);
    static HocPhan lyLuanChinhTri3 = new HocPhan("LLCT04","Kinh te CT",2,30,0);
    static HocPhan lyLuanChinhTri4 = new HocPhan("LLCT05","Lich su dang",2,30,0);
    static HocPhan giaoDucTheChat = new HocPhan("GTC01","Bong ro1",1,0,15);
    static HocPhan giaoDucTheChat2 = new HocPhan("GTC02","Bong ro2",1,0,15);
    static HocPhan giaoDucTheChat3 = new HocPhan("GTC03","Bong chuyen1",1,0,15);
    static HocPhan giaoDucTheChat4 = new HocPhan("GTC04","Bong chuyen2",1,0,15);
    static HocPhan giaoQuocPhongAnNinh1 = new HocPhan("GAN01","CTQPAN",2,30,0);
    static HocPhan giaoQuocPhongAnNinh2 = new HocPhan("GAN02","DLQSD",3,30,0);
    static HocPhan giaoQuocPhongAnNinh3 = new HocPhan("GAN03","KT AK(CKC)",3,15,15);
    static HocPhan kienThucCoSoNganh1 = new HocPhan("CSN01","Lap trinh C",3,15,15);
    static HocPhan kienThucCoSoNganh2 = new HocPhan("CSN02","Ky thuat LT",3,15,15);
    static HocPhan kienThucCoSoNganh3 = new HocPhan("CSN03","Lap trinh HDT",3,15,15);
    static HocPhan kienThucCoSoNganh4 = new HocPhan("CSN04","PTDTYCPM ",3,15,15);
    static HocPhan kienThucCoSoNganh5 = new HocPhan("CSN05","Thiet ke web",3,15,15);
    static HocPhan kienThucChuyenNganh1 = new HocPhan("CN01","Lap trinh Java",3,15,15);
    static HocPhan kienThucChuyenNganh2 = new HocPhan("CN02","Lap trinh .NET",3,15,15);
    static HocPhan kienThucChuyenNganh3 = new HocPhan("CN03","Lap trinh game",3,15,15);
    public static void main(String[] args) {
        KTPM.add(lyLuanChinhTri);
        KTPM.add(lyLuanChinhTri1);
        KTPM.add(giaoDucTheChat);
        KTPM.add(giaoDucTheChat2);
        KTPM.add(giaoQuocPhongAnNinh1);
        KTPM.add(giaoQuocPhongAnNinh2);
        KTPM.add(kienThucCoSoNganh1);
        KTPM.add(kienThucCoSoNganh2);
        KTPM.add(kienThucChuyenNganh1);
        KTPM.add(kienThucChuyenNganh2);
        CNTT.add(lyLuanChinhTri2);
        CNTT.add(lyLuanChinhTri3);
        CNTT.add(giaoDucTheChat3);
        CNTT.add(giaoDucTheChat4);
        CNTT.add(giaoQuocPhongAnNinh3);
        CNTT.add(giaoQuocPhongAnNinh1);
        CNTT.add(kienThucCoSoNganh4);
        CNTT.add(kienThucCoSoNganh5);
        CNTT.add(kienThucChuyenNganh2);
        CNTT.add(kienThucChuyenNganh1);
        KHMT.add(lyLuanChinhTri);
        KHMT.add(lyLuanChinhTri2);
        KHMT.add(giaoDucTheChat);
        KHMT.add(giaoDucTheChat3);
        KHMT.add(giaoQuocPhongAnNinh1);
        KHMT.add(giaoQuocPhongAnNinh3);
        KHMT.add(kienThucCoSoNganh2);
        KHMT.add(kienThucCoSoNganh5);
        KHMT.add(kienThucChuyenNganh3);
        KHMT.add(kienThucChuyenNganh2);
        ArrayList<ArrayList<HocPhan>> List = new ArrayList<>();
        List.add(KTPM);
        List.add(CNTT);
        List.add(KHMT);
        DBEngine db = new DBEngine();
        String fileName = "HocPhan.txt";
        try{
            db.LuuFile(fileName, List);
            System.out.println("Done!");
        }
        catch(Exception E){
            System.out.println(E.toString());
        }
    }
}
