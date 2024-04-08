
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class FrmNhaXuatBan extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    DefaultListModel<String> listMaLoai = new DefaultListModel<>();
    ArrayList<SachBean> dsS;
    public String ip = "192.168.1.10";
    static ITinhToan server;
    int socot = 5;
    int socot2 = 4;
    private ITinhToan selectse;
    /**
     * Creates new form FrmNhaXuatBan
     */
    public FrmNhaXuatBan() {
        initComponents();
    }

    void LoadSach(ArrayList<SachBean> ds) {
        model.setRowCount(0);
        for (SachBean sv : ds) {
            Object[] t = new Object[socot];
            t[0] = sv.getMaSach();
            t[1] = sv.getTenSach();
            t[2] = String.valueOf(sv.getGia());
            t[3] = String.valueOf(sv.getSoLuong());
            t[4] = sv.getMaNhaXuatBan();
            model.addRow(t);
        }
        TbSach.setModel(model);
    }
    
    void LoadNXB (ArrayList<NhaXuatBanBean> ds) {
        model2.setRowCount(0);
        for (NhaXuatBanBean dv : ds) {
            Object[] t = new Object[socot2];
            t[0] = dv.getMaNhaXuatBan();
            t[1] = dv.getTenNhaXuatBan();
            t[2] = dv.getTbc();
           // t[2] = dv.getTbc();
            model2.addRow(t);
        }
        TbNXB.setModel(model2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbNXB = new javax.swing.JTable();
        txtTim = new javax.swing.JTextField();
        BtTimKiem = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TbSach = new javax.swing.JTable();
        BtSapXep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TbNXB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TbNXB);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        BtTimKiem.setText("Tim Kiem");
        BtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTimKiemActionPerformed(evt);
            }
        });

        TbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TbSach);

        jTabbedPane2.addTab("tab1", jScrollPane3);

        BtSapXep.setText("Sap Xep");
        BtSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSapXep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtTimKiem)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtTimKiem)
                    .addComponent(BtSapXep))
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            server = (ITinhToan) Naming.lookup("rmi://" + ip + "/TinhToan");
            //NapNgayChoice();
            model.addColumn("Ma Sach");
            model.addColumn("Ten Sach");
            model.addColumn("Gia");
            model.addColumn("So Luong");
            model.addColumn("Ma Nha Xuat Ban");

            TbSach.setModel(model);

            ArrayList<SachBean> ds = new ArrayList<>();
            ds = server.getS();
            LoadSach(ds);


            model2.addColumn("Ma NXB");
            model2.addColumn("Ten NXB");
            model2.addColumn("Trung binh T");

            TbNXB.setModel(model2);

            ArrayList<NhaXuatBanBean> ds1 = new ArrayList<>();
            ds1 = server.getNXB();
            LoadNXB(ds1);

            selectse = (ITinhToan) Naming.lookup("rmi://" + ip + "/TinhToan");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void BtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTimKiemActionPerformed
        try {
            model.setRowCount(0);
            String Tim = txtTim.getText().trim();
            System.out.println(Tim);
            ArrayList<SachBean> ds = new ArrayList<>();
            ds = selectse.HtTimKiem(Tim);
            LoadSach(ds);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtTimKiemActionPerformed

    private void BtSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSapXepActionPerformed
        try {
            ArrayList<SachBean> ds = new ArrayList<>();
            ds=selectse.MaxSL();
            LoadSach(ds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNhaXuatBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSapXep;
    private javax.swing.JButton BtTimKiem;
    private javax.swing.JTable TbNXB;
    private javax.swing.JTable TbSach;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}