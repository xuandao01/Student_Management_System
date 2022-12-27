/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

/**
 *
 * @author txdao
 */
public abstract class Nguoi {
    String name;
    int age;
    String address;

    public Nguoi(){
        name = this.name;
        age = 0;
        address = "";
    }
    
    public Nguoi(String name,int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
