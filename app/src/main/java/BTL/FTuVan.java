/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BTL;

import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author txdao
 */
public class FTuVan extends javax.swing.JFrame {
    static int count = 0;
    static String fileName = "DSSinhVien.txt";
    static String fileName2 = "taikhoan.txt";
    static DBEngine db = new DBEngine();
    static ArrayList<SinhVien> dssv = new ArrayList<>();
    static ArrayList<TaiKhoan> dstk = new ArrayList<>();
    static ArrayList<Diem> bangDiem = new ArrayList<>();

    /**
     * Creates new form FTuVan
     */
    public FTuVan() {
        initComponents();
        count = 0;
        AbstractBorder brdrLeft = new TextBubbleBorder(Color.RED, 1, 9, 6);
        AbstractBorder brdrRight = new TextBubbleBorder(Color.BLUE, 1, 9, 6);

        label1.setBorder(brdrLeft);
        label2.setBorder(brdrRight);
        label3.setBorder(brdrLeft);
        label4.setBorder(brdrRight);
        label5.setBorder(brdrLeft);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);

        try {
            dssv = (ArrayList<SinhVien>) db.docFile(fileName);
            dstk = (ArrayList<TaiKhoan>) db.docFile(fileName2);
        } catch (Exception E) {
            JOptionPane.showMessageDialog(rootPane, E);
        }
        this.setLocationRelativeTo(null);
        MainFrame main = new MainFrame();
        for (SinhVien sinhVien : dssv) {
            if (sinhVien.tk.user.compareTo(main.user) == 0) {
                bangDiem = sinhVien.BD;
                break;
            }
        }

    }

    class TextBubbleBorder extends AbstractBorder {

        private Color color;
        private int thickness = 4;
        private int radii = 8;
        private int pointerSize = 7;
        private Insets insets = null;
        private BasicStroke stroke = null;
        private int strokePad;
        private int pointerPad = 4;
        private boolean left = true;
        RenderingHints hints;

        TextBubbleBorder(
                Color color) {
            this(color, 4, 8, 7);
        }

        TextBubbleBorder(
                Color color, int thickness, int radii, int pointerSize) {
            this.thickness = thickness;
            this.radii = radii;
            this.pointerSize = pointerSize;
            this.color = color;

            stroke = new BasicStroke(thickness);
            strokePad = thickness / 2;

            hints = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int pad = radii + strokePad;
            int bottomPad = pad + pointerSize + strokePad;
            insets = new Insets(pad, pad, bottomPad, pad);
        }

        TextBubbleBorder(
                Color color, int thickness, int radii, int pointerSize, boolean left) {
            this(color, thickness, radii, pointerSize);
            this.left = left;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return insets;
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            return getBorderInsets(c);
        }

        @Override
        public void paintBorder(
                Component c,
                Graphics g,
                int x, int y,
                int width, int height) {

            Graphics2D g2 = (Graphics2D) g;

            int bottomLineY = height - thickness - pointerSize;

            RoundRectangle2D.Double bubble = new RoundRectangle2D.Double(
                    0 + strokePad,
                    0 + strokePad,
                    width - thickness,
                    bottomLineY,
                    radii,
                    radii);

            Polygon pointer = new Polygon();

            if (left) {
                // left point
                pointer.addPoint(
                        strokePad + radii + pointerPad,
                        bottomLineY);
                // right point
                pointer.addPoint(
                        strokePad + radii + pointerPad + pointerSize,
                        bottomLineY);
                // bottom point
                pointer.addPoint(
                        strokePad + radii + pointerPad + (pointerSize / 2),
                        height - strokePad);
            } else {
                // left point
                pointer.addPoint(
                        width - (strokePad + radii + pointerPad),
                        bottomLineY);
                // right point
                pointer.addPoint(
                        width - (strokePad + radii + pointerPad + pointerSize),
                        bottomLineY);
                // bottom point
                pointer.addPoint(
                        width - (strokePad + radii + pointerPad + (pointerSize / 2)),
                        height - strokePad);
            }

            Area area = new Area(bubble);
            area.add(new Area(pointer));

            g2.setRenderingHints(hints);

            // Paint the BG color of the parent, everywhere outside the clip
            // of the text bubble.
            Component parent = c.getParent();
            if (parent != null) {
                Color bg = parent.getBackground();
                Rectangle rect = new Rectangle(0, 0, width, height);
                Area borderRegion = new Area(rect);
                borderRegion.subtract(area);
                g2.setClip(borderRegion);
                g2.setColor(bg);
                g2.fillRect(0, 0, width, height);
                g2.setClip(null);
            }

            g2.setColor(color);
            g2.setStroke(stroke);
            g2.draw(area);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("UTM Cooper Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("AI Assistant");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label1.setText("Chao ban, ban can tu van gi ?");
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Gui");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(text1.getText().length()<1)
            return;
        String mess = text1.getText();
        if(count%2 == 0){
            label2.setText(mess);
            label2.setVisible(true); 
            text1.setText("");
            count++;
            label3.setText(AI(mess));
            label3.setVisible(true);
            if(count%3 == 0){
                
                label5.setVisible(false);
                label4.setVisible(false);
                label3.setVisible(false);
                label2.setVisible(false);
                label1.setText(AI(mess));
            }
        }
        else{
            label4.setText(mess);
            label4.setVisible(true); 
            text1.setText("");
            label5.setText(AI(mess));
            label5.setVisible(true);
            count++;
            if(count%3 == 0){
                label5.setVisible(false);
                label4.setVisible(false);
                label3.setVisible(false);
                label1.setText(AI(mess));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public String AI(String mess){
        if(mess.compareTo("Tu van hoc tap")==0){
            for (Diem diem : bangDiem) {
                if(diem.D10()<5){
                    return "Mon " + diem.x.name + " duoi 5 can cai thien!";
                }
            }
            return "Bang diem cua ban dang rat tot";
        }
        if(mess.compareTo("Tich luy")==0){
            TichLuy tl = new TichLuy();
            tl.setVisible(true);
            return "Ban can giup gi nua khong";
        }
        if(mess.compareTo("Bang diem")==0){
            FBangDiem bdiem = new FBangDiem();
            bdiem.setVisible(true);
            return "Ban can giup gi nua khong";
        }
        if(mess.compareTo("Chuong trinh")==0){
            ChuongTrinhHoc CT = new ChuongTrinhHoc();
            CT.setVisible(true);
            return "Ban can giup gi nua khong";
        }
        if(mess.compareTo("Ho tro")==0){
            FHoTro ht = new FHoTro();
            ht.setVisible(true);
            return "Dien thong tin can ho tro vao form sau";
        }
        if(mess.compareTo("Khong") == 0||mess.compareTo("Thoat")==0){
            JOptionPane.showMessageDialog(rootPane, "Tam biet");
            this.setVisible(false);
            return "";
        }
        else{
            return "Toi khong hieu ban noi gi";
        }
    }
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
            java.util.logging.Logger.getLogger(FTuVan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTuVan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTuVan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTuVan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTuVan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
