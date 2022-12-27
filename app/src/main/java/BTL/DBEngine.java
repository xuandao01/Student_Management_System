/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author txdao
 */
public class DBEngine implements Serializable{
    public void LuuFile(String fileName, Object obj)
        throws Exception{
        FileOutputStream fs=new FileOutputStream(fileName);
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(obj);
        fs.close();
        os.close();
    }
    public Object docFile(String fileName) throws Exception{
        Object file = null;
        FileInputStream fi = new FileInputStream(fileName);
        ObjectInputStream ob = new ObjectInputStream(fi);
        file = ob.readObject();
        fi.close();
        ob.close();
        return file;
    }
    public boolean CheckFile(String fileName){
        File f = new File(fileName);
        if(f.exists()) return true;
        else return false;
    }
}
