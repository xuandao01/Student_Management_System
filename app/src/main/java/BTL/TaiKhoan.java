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
public class TaiKhoan implements Serializable{
    String user;
    String pass;
    int kind;
    public TaiKhoan(){
        user = "";
        pass ="";
        kind = 0;
    }
    public TaiKhoan(String user){
        this.user = user;
    }
    public TaiKhoan(String user, String pass, int kind){
        this.user = user;
        this.pass = pass;
        this.kind = kind;
    }
    public String getUser(){
        return this.user;
    }
    public String getPass(){
        return this.pass;
    }
    public void setUser(String user){
        this.user = user;
    }
    public void setPass(String pass){
        this.pass = pass; 
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.user);
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
        final TaiKhoan other = (TaiKhoan) obj;
        return Objects.equals(this.user, other.user);
    }
    
}

