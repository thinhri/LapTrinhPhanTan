
package view;

import bean.loaibean;
import bean.sachbean;
import bo.KetNoibo;
import bo.loaibo;
import bo.sachbo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class FrmHienThi extends javax.swing.JFrame {

    loaibo lb = new loaibo();
    sachbo sb = new sachbo();
    KetNoibo knbo = new KetNoibo();
    
    public class Tuyen1 extends Thread{
        public void run(){
            try {
                DefaultListModel<loaibean> mh = new DefaultListModel<loaibean>();
                for(loaibean h:lb.getloai()){
                    mh.addElement(h);
                }
                jList1.setModel(mh);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
}   
    public class Tuyen2 extends Thread{
        int stt=1;
        public void run(){
            try {
                DefaultTableModel mhb = new DefaultTableModel();
                mhb.addColumn("ma sach");
                mhb.addColumn("ten sach");
                mhb.addColumn("so luong");
                mhb.addColumn("gia");
                mhb.addColumn("ma loai");
                for(sachbean h:sb.getsach()){
                    Object[] t =new Object[7];
                    
                    t[0]=h.getMasach();
                    t[1]=h.getTensach();
                    t[2]=h.getSoluong();
                    t[3]=h.getGia();
                    t[4]=h.getMaloai();
                    mhb.addRow(t);
                }
                htsach.setModel(mhb);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public FrmHienThi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        htsach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        htsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(htsach);

        jTabbedPane1.addTab("tab1", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        try {
            if (!evt.getValueIsAdjusting()) {
        String TenLoai = jList1.getSelectedValue().toString();
        
        String maLoai = lb.Timloai(TenLoai);
        
        DefaultTableModel tableModel = (DefaultTableModel) htsach.getModel();
        // Tạo một sorter để lọc dữ liệu
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        // Đặt sorter cho bảng
        htsach.setRowSorter(sorter);
        // Tạo một RowFilter để lọc dữ liệu
        RowFilter<Object, Object> filter = RowFilter.regexFilter(maLoai, 4);
         // Áp dụng RowFilter để lọc dữ liệu
        sorter.setRowFilter(filter);
    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_jList1ValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            knbo.ketnoi();
            Tuyen1 t1 = new Tuyen1();
            t1.start();
            Tuyen2 t2 = new Tuyen2();
            t2.start();
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
            java.util.logging.Logger.getLogger(FrmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHienThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable htsach;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
