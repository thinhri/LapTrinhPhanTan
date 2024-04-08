
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmGiaoDich extends javax.swing.JFrame {

    khachhangBean khb = FrmDangNhap.khb;
    ITinhToan se = FrmDangNhap.server;
    static ITinhToan ser;
    static String sodu;
    public String ip = "192.168.100.36";
    static ITinhToan server1;
    static khachhangBean khb1;

    public FrmGiaoDich() {
        initComponents();
    }

    public void updateSoDu(String newSoDu) {
        txtSoDu.setText(newSoDu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSoTK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoDu = new javax.swing.JTextField();
        btnChuyenKhoan = new javax.swing.JButton();
        btnRutTien = new javax.swing.JButton();
        btnDoiMaPin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnNapTien = new javax.swing.JButton();
        btnLSGD = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Xin vui long lua chon giao dich");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Ho Ten");

        txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtHoTen.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("So Tai Khoan");

        txtSoTK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSoTK.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("So du TK");

        txtSoDu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSoDu.setEnabled(false);

        btnChuyenKhoan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnChuyenKhoan.setText("Chuyen Khoan");
        btnChuyenKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenKhoanActionPerformed(evt);
            }
        });

        btnRutTien.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnRutTien.setText("Rut Tien");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        btnDoiMaPin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDoiMaPin.setText("Doi Ma Pin");
        btnDoiMaPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMaPinActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("GIAO DICH");

        btnNapTien.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnNapTien.setText("Nap Tien");
        btnNapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapTienActionPerformed(evt);
            }
        });

        btnLSGD.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLSGD.setText("Lich Su Giao Dich");
        btnLSGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLSGDActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDangXuat.setText("Dang xuat");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txtSoTK)
                                    .addComponent(txtSoDu))
                                .addGap(18, 18, 18)
                                .addComponent(refresh))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoiMaPin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChuyenKhoan)
                            .addComponent(btnLSGD))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRutTien, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(btnNapTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoDu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRutTien)
                    .addComponent(btnChuyenKhoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoiMaPin)
                    .addComponent(btnNapTien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLSGD)
                    .addComponent(btnDangXuat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setKhachhangBean(khachhangBean khb) {
        this.khb = khb;
        txtHoTen.setText(khb.HoTen);
        txtSoTK.setText(khb.SoTaiKhoan.trim());
        txtSoDu.setText(String.valueOf(khb.SoDu));

    }
    private void btnChuyenKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenKhoanActionPerformed
        sodu = txtSoDu.getText();
        FrmChuyenKhoan frck = new FrmChuyenKhoan(this);
        frck.setSoDu(sodu);
        frck.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChuyenKhoanActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        sodu = txtSoDu.getText();
        FrmRutTien frmr = new FrmRutTien(this);
        frmr.setSoDu(sodu);
        frmr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void btnDoiMaPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMaPinActionPerformed
        FrmDoiMaPin frmpin = new FrmDoiMaPin();
        frmpin.setMaPin(khb);
        frmpin.setVisible(true);

    }//GEN-LAST:event_btnDoiMaPinActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (khb != null) {
            setKhachhangBean(khb);

        }
    }//GEN-LAST:event_formWindowOpened

    private void btnNapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapTienActionPerformed
        sodu = txtSoDu.getText();
        FrmNapTien frmn = new FrmNapTien(this);
        frmn.setSoDu(sodu);
        frmn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNapTienActionPerformed

    private void btnLSGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLSGDActionPerformed
        FrmLichSuGD frmls = new FrmLichSuGD();
        frmls.setVisible(true);

    }//GEN-LAST:event_btnLSGDActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        try {
            se.CapNhatTT(khb.SoTaiKhoan);
            new FrmDangNhap().setVisible(true);
            dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(FrmGiaoDich.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try {
            server1 = (ITinhToan) Naming.lookup("rmi://" + ip + "/TinhToan");
            khb1 = se.Ktdn(khb.SoTaiKhoan, khb.SoPin);
            txtSoDu.setText(String.valueOf(khb1.SoDu));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGiaoDich().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenKhoan;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMaPin;
    private javax.swing.JButton btnLSGD;
    private javax.swing.JButton btnNapTien;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtSoDu;
    private javax.swing.JTextField txtSoTK;
    // End of variables declaration//GEN-END:variables
}
