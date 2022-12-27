/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author txdao
 */
public class HocPhan implements Serializable {
    String name;
    int soTC;
    int soTietLyThuyet;
    int soTietThucHanh;
    String id;
    public HocPhan(){
        name = "";
        soTC = 0;
        soTietLyThuyet = 0;
        soTietThucHanh = 0;
        id = "";
    }
    public HocPhan(String id){
        this.id = id;
    }
    public HocPhan(String id, String name,int soTC,int soTietLT,int soTietTH){
        this.id = id;
        this.name = name;
        this.soTC = soTC;
        this.soTietLyThuyet = soTietLT;
        soTietThucHanh = soTietTH;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocPhan other = (HocPhan) obj;
        return Objects.equals(this.id, other.id);
    }
    
}
