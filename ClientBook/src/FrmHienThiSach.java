
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
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
public class FrmHienThiSach extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultListModel<String> listMaLoai = new DefaultListModel<>();
    ArrayList<TypeBean> dsl;
    public String ip = "192.168.1.10";
    static BookBean bb;
    static ITinhToan server;
    int socot = 5;
    private ITinhToan selectse;

    /**
     * Creates new form FrmHienThiSach
     */
    public FrmHienThiSach() {
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

        txtTimKiem = new javax.swing.JTextField();
        BtTimKiem = new javax.swing.JButton();
        ChTenLoai = new java.awt.Choice();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BtTimKiem.setText("Tim Kiem");
        BtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTimKiemActionPerformed(evt);
            }
        });

        ChTenLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ChTenLoaiItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChTenLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(37, 37, 37)
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(539, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtTimKiem)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtTimKiem))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void NapMaLoaiChoice(ITinhToan Server) {
        try {
            ChTenLoai.removeAll();
            List<String> maloai = server.LayMaLoai();
            for (String n : maloai) {
                ChTenLoai.add(n);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi ha");
        }
    }

    public void HienThiDS(ITinhToan Server, String maloai) {
        try {
            model.setRowCount(0);
            ArrayList<BookBean> ds = new ArrayList<>();
            ds = server.getds(maloai);
            Object[] t = new Object[socot];
            for (int i = 0; i < ds.size(); i++) {
                BookBean ht = (BookBean) ds.get(i);
                t[0] = ht.getMasach();
                t[1] = ht.getTensach();
                t[2] = String.valueOf(ht.getGia());
                t[3] = String.valueOf(ht.getSoluong());
                t[4] = ht.getMaloai();

                model.addRow(t);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi");
        }

    }

    private void NapTenLoaiList(ITinhToan Server) {
        try {
            List<String> ds = Server.LayMaLoaiTuType();
            for (String n : ds) {
                listMaLoai.addElement(n);
            }
            jList1.setModel(listMaLoai);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi nạp mã loại sách!");
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            server = (ITinhToan) Naming.lookup("rmi://" + ip + "/TinhToan");
            //NapNgayChoice();
            model.addColumn("Ma Sach");
            model.addColumn("Ten Sach");
            model.addColumn("Gia");
            model.addColumn("So Luong");
            model.addColumn("Ma Loai");

            jTable1.setModel(model);

            Object[] t = new Object[socot];
            ArrayList<BookBean> ds = new ArrayList<>();
            ds = server.Show();
            for (int i = 0; i < ds.size(); i++) {
                BookBean ht = (BookBean) ds.get(i);
                t[0] = ht.getMasach();
                t[1] = ht.getTensach();
                t[2] = String.valueOf(ht.getGia());
                t[3] = String.valueOf(ht.getSoluong());
                t[4] = ht.getMaloai();

                model.addRow(t);
            }

            NapMaLoaiChoice(server);
            NapTenLoaiList(server);
            selectse = (ITinhToan) Naming.lookup("rmi://" + ip + "/TinhToan");
            dsl = server.getloai();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void ChTenLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ChTenLoaiItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            if (ChTenLoai.getItemCount() > 0) {
                String maloai = ChTenLoai.getSelectedItem();
                HienThiDS(selectse, maloai);
            }
        }
    }//GEN-LAST:event_ChTenLoaiItemStateChanged

    private void BtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTimKiemActionPerformed
        try {
            model.setRowCount(0);
            String Tim = txtTimKiem.getText();
            ArrayList<BookBean> ds = new ArrayList<>();
            ds = selectse.HtTimKiem(Tim);
            System.err.println(ds.get(1).getTensach());
            Object[] t = new Object[socot];
            for (int i = 0; i < ds.size(); i++) {
                BookBean ht = (BookBean) ds.get(i);
                t[0] = ht.getMasach();
                t[1] = ht.getTensach();
                t[2] = String.valueOf(ht.getGia());
                t[3] = String.valueOf(ht.getSoluong());
                t[4] = ht.getMaloai();

                model.addRow(t);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtTimKiemActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() == 1) {
            try {
                //TypeBean dsl = selectse.getloai();
                String selectedTenloai = jList1.getSelectedValue();
                String maloai = "";
                System.err.println(selectedTenloai);
                for (TypeBean typeBean : dsl) {
                    if (typeBean.getTenloai().equals(selectedTenloai)) {
                        maloai = typeBean.getMaloai().trim();
                    }
                }
                HienThiDS(selectse, maloai);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(FrmHienThiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHienThiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHienThiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHienThiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHienThiSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtTimKiem;
    private java.awt.Choice ChTenLoai;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
