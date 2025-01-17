/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import bean.KhachHangbean;
import bean.LichSuGDbean;
import bo.KetNoibo;

import bo.KhachHangbo;
import bo.LichSuGDbo;

import dao.KetNoiDao;
import java.net.InetAddress;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FormServer extends javax.swing.JFrame {
    KhachHangbo khbo = new KhachHangbo();
    LichSuGDbo lsbo = new LichSuGDbo();
    KetNoibo kn = new KetNoibo();
//    KetNoiDao kn = new KetNoiDao();
    public class TuyenNhan extends Thread{
        public void run(){ KetNoiDao kn = new KetNoiDao();
            try {
                while(true){
                    String t = gn.Nhan();
                    String[] tach = t.split("[:]");
                    String ipclient = tach[0];
                    if(tach[1].equals("/ls"))
                    {
                        String[] tach2 = tach[2].split("[;]");
                        String tstk = tach2[0];
                        String tcmnd = tach2[1];
                        
                        ArrayList<KhachHangbean> ds1 = khbo.getKH();
                        ArrayList<LichSuGDbean> ds2 = lsbo.getLS();
                        
                            String s = khbo.TimKh(ds1, tstk, tcmnd);
                           
                            String[] ts=s.split("[;]");
                            String a=ts[0];
                            String s1 = lsbo.TimLS(ds2, tstk);
                           
                            if(s!="")
                                gn.Gui(s+"+"+s1, ipclient, 1260);
                            else
                                gn.Gui("Error", ipclient, 1260);
                                
                       }
                    list1.add(t);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Creates new form FormClient
     */
    public FormServer() {
        initComponents();
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
        txtipserver = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtport = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Server");

        jLabel2.setText("IpServer");

        txtipserver.setText("127.0.0.1");

        jLabel3.setText("Port");

        txtport.setText("1260");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        list1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtipserver, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(txtport, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtipserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    GuiNhan gn = new GuiNhan();
    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        try {
            if(evt.getKeyCode() == 10){
                String Ipclient = InetAddress.getLocalHost().getHostAddress();
                String data = Ipclient+":"+jTextField3.getText();
                gn.Gui(data, txtipserver.getText(), Integer.parseInt(txtport.getText()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            kn.ketnoi();
            gn.MoCong(1261);
            new TuyenNhan().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        System.setProperty("file.encoding", "UTF-8");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private java.awt.List list1;
    private javax.swing.JTextField txtipserver;
    private javax.swing.JTextField txtport;
    // End of variables declaration//GEN-END:variables
}
