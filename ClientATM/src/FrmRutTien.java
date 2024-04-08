
import javax.swing.JOptionPane;

public class FrmRutTien extends javax.swing.JFrame {

    int hanmuc = 5000000;
    FrmGiaoDich frmGD;

    public FrmRutTien(FrmGiaoDich frmGiaoDich) {
        this.frmGD = frmGiaoDich;
        initComponents();
    }

    khachhangBean khb = FrmDangNhap.khb;
    ITinhToan se = FrmDangNhap.server;

    static String sOdU;

    public FrmRutTien() {
        initComponents();
    }

    public void setSoDu(String sodu) {
        txtSoDu.setText(sodu);
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
        btn100 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        btn1tr = new javax.swing.JButton();
        btn2tr = new javax.swing.JButton();
        btn5tr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSoDu = new javax.swing.JTextField();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RUT TIEN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("So tien ban muon rut");

        btn100.setText("100000");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn200.setText("200000");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        btn500.setText("500000");
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });

        btn1tr.setText("1000000");
        btn1tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1trActionPerformed(evt);
            }
        });

        btn2tr.setText("2000000");
        btn2tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2trActionPerformed(evt);
            }
        });

        btn5tr.setText("5000000");
        btn5tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5trActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("So du hien tai");

        txtSoDu.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtSoDu.setEnabled(false);

        btnQuayLai.setText("Quay lai");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuayLai))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn2tr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1tr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(txtSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn5tr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuayLai)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100)
                    .addComponent(btn1tr))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn200)
                    .addComponent(btn2tr))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn500)
                    .addComponent(btn5tr))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CapNhatRutTien(khachhangBean khb, int mg) {
        try {

            if (se.KTSoDu(khb.SoTaiKhoan, mg)) {
                if (se.KtrRutTien(khb.SoTaiKhoan) >= hanmuc) {
                    JOptionPane.showMessageDialog(this, "Han muc toi da rut tien trong ngay cua ban da vuot qua cho phep ");
                } else {
                    int soducl = hanmuc - se.KtrRutTien(khb.SoTaiKhoan);
                    if (mg > soducl) {
                        JOptionPane.showMessageDialog(this, "Ban chi duoc rut them " + soducl + " nua thoi");
                    } else {
                        if (se.RutTien(khb.SoTaiKhoan, mg)) {
                            se.TruTien(khb.SoTaiKhoan, mg);
                            JOptionPane.showMessageDialog(this, "Ban da rut " + mg + " dong");
                            int sodu = Integer.valueOf(txtSoDu.getText());
                            int con = sodu - mg;
                            String tien = String.valueOf(con);
                            txtSoDu.setText(tien);
                        } else {
                            JOptionPane.showMessageDialog(this, "Khong the rut tien");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "So du khong du de rut");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        int mg = Integer.valueOf(btn200.getText());
        CapNhatRutTien(khb, mg);
    }//GEN-LAST:event_btn200ActionPerformed


    private void btn1trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1trActionPerformed
        int mg = Integer.valueOf(btn1tr.getText());
        CapNhatRutTien(khb, mg);
    }//GEN-LAST:event_btn1trActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (khb != null) {
            setSoDu(FrmGiaoDich.sodu);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        int mg = Integer.valueOf(btn100.getText());
        CapNhatRutTien(khb, mg);
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        int mg = Integer.valueOf(btn500.getText());
        CapNhatRutTien(khb, mg);
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn2trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2trActionPerformed
        int mg = Integer.valueOf(btn2tr.getText());
        CapNhatRutTien(khb, mg);
    }//GEN-LAST:event_btn2trActionPerformed

    private void btn5trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5trActionPerformed
        int mg = Integer.valueOf(btn5tr.getText());
        CapNhatRutTien(khb, mg);
    }//GEN-LAST:event_btn5trActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        sOdU = txtSoDu.getText();
        frmGD.updateSoDu(sOdU);
        frmGD.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRutTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRutTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRutTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRutTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRutTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn1tr;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn2tr;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btn5tr;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtSoDu;
    // End of variables declaration//GEN-END:variables
}
