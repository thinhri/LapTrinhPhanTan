/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bttuan1;

import javax.swing.JOptionPane;


public class Bt2 extends javax.swing.JFrame {
    
    public static long gt(int n){
        if(n<0){
            return 0;
        }else if(n==0 || n==1){
            return 1;
        }else{
            return n*gt(n-1);
        }
    }
    
        long tu=0, a=0, b=0;
        long s1=0, s2=0, s3=0, kq=0;
        int mau=0;
        boolean kt1=false, kt2=false, kt3=false, kt4=false;
    public class Tuyen extends Thread{
        int stt;
        int n;
        int k;
        public Tuyen(int stt, int n, int k){
            this.stt=stt;
            this.n=n;
            this.k=k;
        }
        
        @Override
        public void run(){
//            tu=gt(n-2);
            if(stt==1){
                mau=n-2-k;
                if(mau>=0){
//                    a=gt(k);
//                    b=gt(mau);
                    s1+=gt(n-2)/(gt(k)*gt(mau));
                    
                }
                kt1=true;
            }
            if(stt==2){
                mau=n-k-1;
                if(mau>=0){
//                    a=gt(k-1);
//                    b=gt(mau);
                    s2+=gt(n-2)/(gt(k-1)*gt(mau));
                }
                kt2=true;
            }
            if(stt==3){
                mau=n-k;
                if(mau>=0){
                    if(k-2<0){
                        s3=0;
                    }
                    else{
//                    a=gt(k-2);
//                    b=gt(mau);
                    s3+=gt(n-2)/(gt(k-2)*gt(mau));
                    }
                }
                else{s3=0;}
                kt3=true;
            }
        }
    }

    /**
     * Creates new form Bt2
     */
    public Bt2() {
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
        jLabel3 = new javax.swing.JLabel();
        Nhapn = new javax.swing.JTextField();
        Nhapk = new javax.swing.JTextField();
        ketqua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nhập n");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nhập k");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Kết quả");

        Nhapn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nhapn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapnActionPerformed(evt);
            }
        });

        Nhapk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nhapk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapkActionPerformed(evt);
            }
        });

        ketqua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Bài toán tổ hợp");

        jButton1.setText("Tinh");
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
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nhapn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nhapk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nhapn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nhapk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NhapnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapnActionPerformed

    private void NhapkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        System.out.print(gt(3));
        String sn=Nhapn.getText();
        String sk=Nhapk.getText();
        if(sn.isEmpty() || sk.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhap lai di");
            return;
        }
        int n=Integer.parseInt(sn);
        int k=Integer.parseInt(sk);
       
        if(n>=1 && k>=1){
            if(n>=k){
        Tuyen t1=new Tuyen(1, n, k);
        Tuyen t2=new Tuyen(2, n, k);
        Tuyen t3=new Tuyen(3, n, k);
        t1.start();
        t2.start();
        t3.start();
     
        while(true){
            if(kt1==true && kt2==true && kt3==true){
                kq=s1+s2*2+s3;
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(kq);
                ketqua.setText(String.valueOf(kq));
                break;
            }
        }
    }
            else{
                JOptionPane.showMessageDialog(this, "k>n roi bro oi");
            }}
        else{
            JOptionPane.showMessageDialog(this, "k or n phai lon hon 0" );
        }
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
            java.util.logging.Logger.getLogger(Bt2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bt2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bt2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bt2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bt2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nhapk;
    private javax.swing.JTextField Nhapn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField ketqua;
    // End of variables declaration//GEN-END:variables
}
