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
public class Diem implements Serializable{
    float L1,L2,L3;
    HocPhan x;
    public Diem(){
        L1 = 0;
        L2 = 0;
        L3 = 0;
        x = null;
    }
    public Diem(float L1,float L2,float L3, HocPhan x){
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
        this.x = x;
    }
    public double D10(){
        return Math.ceil(((L1*0.5+L2*0.5)*0.3 + L3*0.7)*10.0)/10.0;
    }
    public double D4(){
        return Math.round((D10()*0.4)*10.0)/10.0;
    }
    public String Dchar(){
        if(D10()>8.5)
            return "A";
        else if(D10()>8)
            return "B+";
        else if(D10()>6.5)
            return "B";
        else if(D10()>6)
            return "C+";
        else if(D10()>5)
            return "C";
        else if(D10()>4.5)
            return "D+";
        else if(D10()>4)
            return "D";
        else return "F";
    }
}
