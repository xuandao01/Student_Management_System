/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BTL;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author txdao
 */
public class TichLuy extends javax.swing.JFrame {
    static DBEngine db = new DBEngine();
    static String fileName = "BangDiem.txt";
    static ArrayList<Diem> bangDiem = new ArrayList<>();
    static double LLCT,GDTC,GDQP,ChuyenNganh;
    static double LLCT2,GDTC2,GDQP2,ChuyenNganh2;
    static double LLCT3,GDTC3,GDQP3,ChuyenNganh3;
    static double LLCTT,GDTCT,GDQPT,ChuyenNganhT;


    /**
     * Creates new form TichLuy
     */
    public TichLuy() {
        try{
            bangDiem = (ArrayList<Diem>) db.docFile(fileName);
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(rootPane, E);
        }
        LLCT = (bangDiem.get(0).D4()+bangDiem.get(1).D4())/2;
        GDTC = (bangDiem.get(2).D4()+bangDiem.get(3).D4())/2;
        GDQP = (bangDiem.get(4).D4()+bangDiem.get(5).D4())/2;
        ChuyenNganh = (bangDiem.get(6).D4()+bangDiem.get(7).D4()+bangDiem.get(8).D4()+bangDiem.get(9).D4())/4;
        LLCT = (Math.round(LLCT*100))/100.0;
        GDTC = (Math.round(GDTC*100))/100.0;
        GDQP = (Math.round(GDQP*100))/100.0;
        ChuyenNganh = (Math.round(ChuyenNganh*100))/100.0;
        Random r = new Random();
        LLCT2 = Math.round((LLCT + r.nextFloat(0.5f))*100)/100.0;
        GDTC2 = Math.round((GDTC - r.nextFloat(0.5f))*100)/100.0;
        GDQP2 = Math.round((GDQP + r.nextFloat(0.5f))*100)/100.0;
        ChuyenNganh2 = Math.round((ChuyenNganh - r.nextFloat(0.5f))*100)/100.0;

        LLCT3 = Math.round((LLCT2 - r.nextFloat(0.5f))*100)/100.0;
        GDTC3 = Math.round((GDTC2 + r.nextFloat(0.5f))*100)/100.0;
        GDQP3 = Math.round((GDQP2 - r.nextFloat(0.5f))*100)/100.0;
        ChuyenNganh3 = Math.round((ChuyenNganh2 + r.nextFloat(0.5f))*100)/100.0;

        LLCTT = Math.round(((LLCT+LLCT2+LLCT3)/3)*100)/100.0;
        GDTCT = Math.round(((GDTC+GDTC2+GDTC3)/3)*100)/100.0;
        GDQPT = Math.round(((GDQP+GDQP2+GDQP3)/3)*100)/100.0;
        ChuyenNganhT = Math.round(((ChuyenNganh + ChuyenNganh2 + ChuyenNganh3)/3)*100)/100.0;
        initComponents();
        this.jTable1.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("KG Red Hands", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tich Luy");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ky 1", LLCT, GDTC, GDQP,ChuyenNganh},
                {"Ky 2", LLCT2, GDTC2, GDQP2,ChuyenNganh2},
                {"Ky 3", LLCT3, GDTC3, GDQP3,ChuyenNganh3},
                {"Ky 4", null, null, null,null},
                {"Ky 5", null, null, null,null},
                {"Ky 6", null, null, null,null},
                {"Ky 7", null, null, null,null},
                {"Ky 8", null, null, null,null},
                {"TBC", LLCTT, GDTCT, GDQPT,ChuyenNganhT},
                {"TL Chung", Math.round(((LLCTT+GDTCT+GDQPT+ChuyenNganhT)/4)*100)/100.0, null, null,null}

            },
            new String [] {
                "Ky","Ly luan CT", "GDTC", "GDQPAN", "Chuyen nganh"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(209, 209, 209))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(TichLuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TichLuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TichLuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TichLuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TichLuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
