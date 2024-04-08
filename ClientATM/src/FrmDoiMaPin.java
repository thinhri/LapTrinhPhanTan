
import java.awt.event.ActionEvent;
import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;


public class FrmDoiMaPin extends javax.swing.JFrame {
    
    FrmGiaoDich frmGD;  

    public FrmDoiMaPin(FrmGiaoDich frmGiaoDich) {
        this.frmGD = frmGiaoDich;
        initComponents();
    }
    
    khachhangBean khb = new khachhangBean();
    ITinhToan se =  FrmDangNhap.server;
    
    public void setServer(ITinhToan server) {
        this.se = server;
    }
    
    /**
     * Creates new form FrmDoiMaPin
     */
    public FrmDoiMaPin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoTK = new javax.swing.JTextField();
        txtMaPincu = new javax.swing.JTextField();
        txtMaPinmoi = new javax.swing.JTextField();
        txtNhapLaiMa = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("So Tai Khoan");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ma Pin cu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ma Pin moi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nhap lai Ma Pin");

        txtSoTK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtSoTK.setEnabled(false);

        txtMaPincu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtMaPincu.setEnabled(false);

        txtMaPinmoi.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtMaPinmoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaPinmoiFocusLost(evt);
            }
        });

        txtNhapLaiMa.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNhapLaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhapLaiMaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cap nhat");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("DOI MA PIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapNhat)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoTK)
                            .addComponent(txtMaPincu)
                            .addComponent(txtMaPinmoi)
                            .addComponent(txtNhapLaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPincu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaPinmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNhapLaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCapNhat)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setMaPin(khachhangBean khb) {
        this.khb = khb;
        txtSoTK.setText(khb.SoTaiKhoan.trim());
        txtMaPincu.setText(khb.SoPin);
    }
    private void txtNhapLaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhapLaiMaActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtNhapLaiMaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        try {
            CapNhatMaPin(evt);// TODO add your handling code here:
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed
    //Thong bao loi truc tiep khi chuyen qua phan khac ma khong can chon Button
    private void txtMaPinmoiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaPinmoiFocusLost
        String mpc = txtMaPincu.getText();
        String mpm = txtMaPinmoi.getText();
        String mpnl = txtNhapLaiMa.getText();
        if (mpm.equals(mpc)){
            JOptionPane.showMessageDialog(this, "Ma Pin moi khong duoc trung voi ma Pin cu");
        }
    }//GEN-LAST:event_txtMaPinmoiFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (khb != null){
            setMaPin(khb);
        }
    }//GEN-LAST:event_formWindowOpened
    
    private void CapNhatMaPin (ActionEvent evt) throws RemoteException{
        String mpc = txtMaPincu.getText();
        String mpm = txtMaPinmoi.getText();
        String mpnl = txtNhapLaiMa.getText();
        if (mpm.equals("") && mpnl.equals("")){
            JOptionPane.showMessageDialog(this, "Cac truong nay la bat buoc");
        }else if (mpm.length() != 6){
            JOptionPane.showMessageDialog(this, "Ma pin phai co dung 6 ki tu");
        }else if (!mpnl.equals("") && !mpnl.equals(mpm)){
            JOptionPane.showMessageDialog(this, "Nhap lai ma Pin khong trung voi ma Pin moi");
        }
        
        else if (se.DoiMatKhau(khb.SoTaiKhoan.trim(), mpm)){
            JOptionPane.showMessageDialog(this, "Doi ma pin thanh cong");
            System.out.println(se.DoiMatKhau(khb.SoTaiKhoan, mpm));
        }
        else {
            JOptionPane.showMessageDialog(this, "Doi mat khau khong thanh cong");
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
            java.util.logging.Logger.getLogger(FrmDoiMaPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDoiMaPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDoiMaPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDoiMaPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDoiMaPin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtMaPincu;
    private javax.swing.JTextField txtMaPinmoi;
    private javax.swing.JTextField txtNhapLaiMa;
    private javax.swing.JTextField txtSoTK;
    // End of variables declaration//GEN-END:variables
}
