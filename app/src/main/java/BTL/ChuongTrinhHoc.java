/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BTL;

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
/**
 *
 * @author txdao
 */
public class ChuongTrinhHoc extends javax.swing.JFrame {
    public static QLHocPhan HP = new QLHocPhan();
    public static DBEngine db = new DBEngine();
    public static ArrayList<ArrayList<HocPhan>> HPh = new ArrayList(); 
    String fileName = "HocPhan.txt";
    /**
     * Creates new form ChuongTrinhHoc
     */
    public ChuongTrinhHoc() {
        try{
            HPh = (ArrayList<ArrayList<HocPhan>>) db.docFile(fileName);
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(rootPane, E.toString());
        }
        ArrayList<HocPhan> KTPM = new ArrayList<>();
        KTPM = HPh.get(0);
        ArrayList<HocPhan> CNTT = new ArrayList<>();
        CNTT = HPh.get(1);
        ArrayList<HocPhan> KHMT = new ArrayList<>();
        KHMT = HPh.get(2);
        initComponents();
        this.id1.setText(KTPM.get(0).id);
        this.id2.setText(KTPM.get(1).id);
        this.id3.setText(KTPM.get(2).id);
        this.id4.setText(KTPM.get(3).id);
        this.id5.setText(KTPM.get(4).id);
        this.id6.setText(KTPM.get(5).id);
        this.id7.setText(KTPM.get(6).id);
        this.id8.setText(KTPM.get(7).id);
        this.id9.setText(KTPM.get(8).id);
        this.id10.setText(KTPM.get(9).id);
        
        this.name1.setText(KTPM.get(0).name);
        this.name2.setText(KTPM.get(1).name);
        this.name3.setText(KTPM.get(2).name);
        this.name4.setText(KTPM.get(3).name);
        this.name5.setText(KTPM.get(4).name);
        this.name6.setText(KTPM.get(5).name);
        this.name7.setText(KTPM.get(6).name);
        this.name8.setText(KTPM.get(7).name);
        this.name9.setText(KTPM.get(8).name);
        this.name10.setText(KTPM.get(9).name);
        if(KTPM.get(0).soTC == 1)
            this.tc1.setText("1");
        else if(KTPM.get(0).soTC == 2)
            this.tc1.setText("2");
        else this.tc1.setText("3");
        if(KTPM.get(1).soTC == 1)
            this.tc2.setText("1");
        else if(KTPM.get(1).soTC == 2)
            this.tc2.setText("2");
        else this.tc2.setText("3");
        if(KTPM.get(2).soTC == 1)
            this.tc3.setText("1");
        else if(KTPM.get(2).soTC == 2)
            this.tc3.setText("2");
        else this.tc3.setText("3");

        if(KTPM.get(3).soTC == 1)
            this.tc4.setText("1");
        else if(KTPM.get(3).soTC == 2)
            this.tc4.setText("2");
        else this.tc4.setText("3");
        if(KTPM.get(4).soTC == 1)
            this.tc5.setText("1");
        else if(KTPM.get(4).soTC == 2)
            this.tc5.setText("2");
        else this.tc5.setText("3");
        if(KTPM.get(5).soTC == 1)
            this.tc6.setText("1");
        else if(KTPM.get(5).soTC == 2)
            this.tc6.setText("2");
        else this.tc6.setText("3");

        if(KTPM.get(6).soTC == 1)
            this.tc7.setText("1");
        else if(KTPM.get(6).soTC == 2)
            this.tc7.setText("2");
        else this.tc7.setText("3");
        if(KTPM.get(7).soTC == 1)
            this.tc8.setText("1");
        else if(KTPM.get(7).soTC == 2)
            this.tc8.setText("2");
        else this.tc8.setText("3");
        if(KTPM.get(8).soTC == 1)
            this.tc9.setText("1");
        else if(KTPM.get(8).soTC == 2)
            this.tc9.setText("2");
        else this.tc9.setText("3");
        if(KTPM.get(9).soTC == 1)
            this.tc10.setText("1");
        else if(KTPM.get(9).soTC == 2)
            this.tc10.setText("2");
        else this.tc10.setText("3");
        this.lt1.setText(String.valueOf(KTPM.get(0).soTietLyThuyet));
        this.lt2.setText(String.valueOf(KTPM.get(1).soTietLyThuyet));
        this.lt3.setText(String.valueOf(KTPM.get(2).soTietLyThuyet));
        this.lt4.setText(String.valueOf(KTPM.get(3).soTietLyThuyet));
        this.lt5.setText(String.valueOf(KTPM.get(4).soTietLyThuyet));
        this.lt6.setText(String.valueOf(KTPM.get(5).soTietLyThuyet));
        this.lt7.setText(String.valueOf(KTPM.get(6).soTietLyThuyet));
        this.lt8.setText(String.valueOf(KTPM.get(7).soTietLyThuyet));
        this.lt9.setText(String.valueOf(KTPM.get(8).soTietLyThuyet));
        this.lt10.setText(String.valueOf(KTPM.get(9).soTietLyThuyet));
        
        this.th1.setText(String.valueOf(KTPM.get(0).soTietThucHanh));
        this.th2.setText(String.valueOf(KTPM.get(1).soTietThucHanh));
        this.th3.setText(String.valueOf(KTPM.get(2).soTietThucHanh));
        this.th4.setText(String.valueOf(KTPM.get(3).soTietThucHanh));
        this.th5.setText(String.valueOf(KTPM.get(4).soTietThucHanh));
        this.th6.setText(String.valueOf(KTPM.get(5).soTietThucHanh));
        this.th7.setText(String.valueOf(KTPM.get(6).soTietThucHanh));
        this.th8.setText(String.valueOf(KTPM.get(7).soTietThucHanh));
        this.th9.setText(String.valueOf(KTPM.get(8).soTietThucHanh));
        this.th10.setText(String.valueOf(KTPM.get(9).soTietThucHanh));
        
        this.setLocationRelativeTo(null);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        tc1 = new javax.swing.JLabel();
        lt1 = new javax.swing.JLabel();
        th1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        tc2 = new javax.swing.JLabel();
        lt2 = new javax.swing.JLabel();
        th2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tc4 = new javax.swing.JLabel();
        lt4 = new javax.swing.JLabel();
        th4 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        tc3 = new javax.swing.JLabel();
        lt3 = new javax.swing.JLabel();
        th3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        th5 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        tc6 = new javax.swing.JLabel();
        lt6 = new javax.swing.JLabel();
        th6 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        tc5 = new javax.swing.JLabel();
        lt5 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        th7 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();
        tc8 = new javax.swing.JLabel();
        lt8 = new javax.swing.JLabel();
        th8 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        tc7 = new javax.swing.JLabel();
        lt7 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        lt = new javax.swing.JLabel();
        th = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        th9 = new javax.swing.JLabel();
        id10 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        tc10 = new javax.swing.JLabel();
        lt10 = new javax.swing.JLabel();
        th10 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        tc9 = new javax.swing.JLabel();
        lt9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Emmett", 0, 18)); // NOI18N
        jLabel1.setText("Hoc Phan");

        jLabel2.setText("Hoc phan ly luan chinh tri");

        id1.setText("ID");

        name1.setText("Ten hoc phan");

        tc1.setText("So tin chi");

        lt1.setText("Ly thuyet");

        th1.setText("Thuc hanh");

        id2.setText("ID");

        name2.setText("Ten hoc phan");

        tc2.setText("So tin chi");

        lt2.setText("Ly thuyet");

        th2.setText("Thuc hanh");

        jLabel13.setText("Hoc phan giao duc the chat");

        tc4.setText("So tin chi");

        lt4.setText("Ly thuyet");

        th4.setText("Thuc hanh");

        id3.setText("ID");

        name3.setText("Ten hoc phan");

        tc3.setText("So tin chi");

        lt3.setText("Ly thuyet");

        th3.setText("Thuc hanh");

        id4.setText("ID");

        name4.setText("Ten hoc phan");

        jLabel24.setText("Hoc phan giao duc QPAN");

        th5.setText("Thuc hanh");

        id6.setText("ID");

        name6.setText("Ten hoc phan");

        tc6.setText("So tin chi");

        lt6.setText("Ly thuyet");

        th6.setText("Thuc hanh");

        id5.setText("ID");

        name5.setText("Ten hoc phan");

        tc5.setText("So tin chi");

        lt5.setText("Ly thuyet");

        jLabel35.setText("Hoc phan co so nganh");

        th7.setText("Thuc hanh");

        id8.setText("ID");

        name8.setText("Ten hoc phan");

        tc8.setText("So tin chi");

        lt8.setText("Ly thuyet");

        th8.setText("Thuc hanh");

        id7.setText("ID");

        name7.setText("Ten hoc phan");

        tc7.setText("So tin chi");

        lt7.setText("Ly thuyet");

        ID.setText("ID");

        name.setText("Ten hoc phan");

        tc.setText("So tin chi");

        lt.setText("Ly thuyet");

        th.setText("Thuc hanh");

        jLabel51.setText("Hoc phan chuyen nganh");

        th9.setText("Thuc hanh");

        id10.setText("ID");

        name10.setText("Ten hoc phan");

        tc10.setText("So tin chi");

        lt10.setText("Ly thuyet");

        th10.setText("Thuc hanh");

        id9.setText("ID");

        name9.setText("Ten hoc phan");

        tc9.setText("So tin chi");

        lt9.setText("Ly thuyet");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id9)
                                .addGap(36, 36, 36)
                                .addComponent(name9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id10)
                                .addGap(36, 36, 36)
                                .addComponent(name10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lt3)
                                        .addComponent(lt4)
                                        .addComponent(lt1)
                                        .addComponent(lt2)
                                        .addComponent(lt9)
                                        .addComponent(lt10)
                                        .addComponent(lt7)
                                        .addComponent(lt8)
                                        .addComponent(lt5)
                                        .addComponent(lt6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tc)
                                        .addGap(30, 30, 30)
                                        .addComponent(lt)))
                                .addGap(42, 42, 42)
                                .addComponent(th))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ID)
                                        .addGap(36, 36, 36)
                                        .addComponent(name))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id1)
                                        .addGap(36, 36, 36)
                                        .addComponent(name1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id2)
                                        .addGap(36, 36, 36)
                                        .addComponent(name2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id3)
                                        .addGap(36, 36, 36)
                                        .addComponent(name3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id4)
                                        .addGap(36, 36, 36)
                                        .addComponent(name4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id7)
                                        .addGap(36, 36, 36)
                                        .addComponent(name7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id8)
                                        .addGap(36, 36, 36)
                                        .addComponent(name8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id5)
                                        .addGap(36, 36, 36)
                                        .addComponent(name5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id6)
                                        .addGap(36, 36, 36)
                                        .addComponent(name6)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tc2)
                                        .addComponent(tc1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tc9)
                                            .addComponent(tc10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tc7)
                                            .addComponent(tc8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tc5)
                                            .addComponent(tc6))
                                        .addComponent(tc3)
                                        .addComponent(tc4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(th2)
                                .addComponent(th1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(th10)
                                    .addComponent(th9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(th4)
                                    .addComponent(th3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(th8)
                                        .addComponent(th7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(th6)
                                        .addComponent(th5)))))))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID)
                    .addComponent(name)
                    .addComponent(tc)
                    .addComponent(lt)
                    .addComponent(th))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id1)
                                .addComponent(name1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id2)
                                .addComponent(name2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id3)
                                        .addComponent(name3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id4)
                                        .addComponent(name4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id5)
                                        .addComponent(name5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id6)
                                        .addComponent(name6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id7)
                                        .addComponent(name7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id8)
                                        .addComponent(name8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel51)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id9)
                                        .addComponent(name9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(id10)
                                        .addComponent(name10)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(tc3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tc4)
                                    .addGap(30, 30, 30)
                                    .addComponent(tc5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tc6)
                                    .addGap(30, 30, 30)
                                    .addComponent(tc7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tc8)
                                    .addGap(30, 30, 30)
                                    .addComponent(tc9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tc10))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tc1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tc2)
                            .addGap(276, 276, 276)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(th1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th2)
                        .addGap(30, 30, 30)
                        .addComponent(th3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th4)
                        .addGap(30, 30, 30)
                        .addComponent(th5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th6)
                        .addGap(30, 30, 30)
                        .addComponent(th7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th8)
                        .addGap(30, 30, 30)
                        .addComponent(th9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lt2)
                        .addGap(30, 30, 30)
                        .addComponent(lt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lt4)
                        .addGap(30, 30, 30)
                        .addComponent(lt5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lt6)
                        .addGap(30, 30, 30)
                        .addComponent(lt7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lt8)
                        .addGap(30, 30, 30)
                        .addComponent(lt9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lt10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuongTrinhHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id10;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JLabel id8;
    private javax.swing.JLabel id9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel lt;
    private javax.swing.JLabel lt1;
    private javax.swing.JLabel lt10;
    private javax.swing.JLabel lt2;
    private javax.swing.JLabel lt3;
    private javax.swing.JLabel lt4;
    private javax.swing.JLabel lt5;
    private javax.swing.JLabel lt6;
    private javax.swing.JLabel lt7;
    private javax.swing.JLabel lt8;
    private javax.swing.JLabel lt9;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name10;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel name8;
    private javax.swing.JLabel name9;
    private javax.swing.JLabel tc;
    private javax.swing.JLabel tc1;
    private javax.swing.JLabel tc10;
    private javax.swing.JLabel tc2;
    private javax.swing.JLabel tc3;
    private javax.swing.JLabel tc4;
    private javax.swing.JLabel tc5;
    private javax.swing.JLabel tc6;
    private javax.swing.JLabel tc7;
    private javax.swing.JLabel tc8;
    private javax.swing.JLabel tc9;
    private javax.swing.JLabel th;
    private javax.swing.JLabel th1;
    private javax.swing.JLabel th10;
    private javax.swing.JLabel th2;
    private javax.swing.JLabel th3;
    private javax.swing.JLabel th4;
    private javax.swing.JLabel th5;
    private javax.swing.JLabel th6;
    private javax.swing.JLabel th7;
    private javax.swing.JLabel th8;
    private javax.swing.JLabel th9;
    // End of variables declaration//GEN-END:variables
}
