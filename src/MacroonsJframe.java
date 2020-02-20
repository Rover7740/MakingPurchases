/* Rose Verma
 * 20/02/2020
 * Making Purchases
 * 
 */

/**
 *
 * @author Rover7740
 */
public class MacroonsJframe extends javax.swing.JFrame {

    /**
     * Creates new form MacroonsJframe
     */
    public MacroonsJframe() {
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

        jPanel1 = new javax.swing.JPanel();
        LemonMacroons = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        BlueberryMarcroons = new javax.swing.JLabel();
        Description2 = new javax.swing.JLabel();
        RaspberryMacroons = new javax.swing.JLabel();
        LemonAmount = new javax.swing.JTextField();
        BlueberryAmount = new javax.swing.JTextField();
        LimeMacroons = new javax.swing.JLabel();
        BananaMacroons = new javax.swing.JLabel();
        RaspberryAmount = new javax.swing.JTextField();
        BananaAmount = new javax.swing.JTextField();
        LimeAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Taxes = new javax.swing.JLabel();
        GrandTotal = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        TaxAns = new javax.swing.JLabel();
        TotAns = new javax.swing.JLabel();
        SubAns = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LemonMacroons.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        LemonMacroons.setForeground(new java.awt.Color(102, 102, 255));
        LemonMacroons.setText("Lemon Macroons ($1.99):");
        LemonMacroons.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        Title1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(102, 102, 255));
        Title1.setText("Madeleine's Macroons");

        description1.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        description1.setForeground(new java.awt.Color(102, 102, 255));
        description1.setText("Enter the number of each Macroon that you would");
        description1.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        BlueberryMarcroons.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        BlueberryMarcroons.setForeground(new java.awt.Color(102, 102, 255));
        BlueberryMarcroons.setText("Blueberry Macroons ($1.79):");
        BlueberryMarcroons.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        Description2.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        Description2.setForeground(new java.awt.Color(102, 102, 255));
        Description2.setText("like to purchase and click Calculate.");
        Description2.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        RaspberryMacroons.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        RaspberryMacroons.setForeground(new java.awt.Color(102, 102, 255));
        RaspberryMacroons.setText("Raspberry Macroons ($1.99):");
        RaspberryMacroons.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        LemonAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemonAmountActionPerformed(evt);
            }
        });

        BlueberryAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueberryAmountActionPerformed(evt);
            }
        });

        LimeMacroons.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        LimeMacroons.setForeground(new java.awt.Color(102, 102, 255));
        LimeMacroons.setText("Lime Macroons ($1.99):");
        LimeMacroons.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        BananaMacroons.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        BananaMacroons.setForeground(new java.awt.Color(102, 102, 255));
        BananaMacroons.setText("Banana Macroons ($1.99):");
        BananaMacroons.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        RaspberryAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaspberryAmountActionPerformed(evt);
            }
        });

        BananaAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BananaAmountActionPerformed(evt);
            }
        });

        LimeAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimeAmountActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Vijaya", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Taxes.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        Taxes.setForeground(new java.awt.Color(102, 102, 255));
        Taxes.setText("Taxes (15%):");
        Taxes.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        GrandTotal.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        GrandTotal.setForeground(new java.awt.Color(102, 102, 255));
        GrandTotal.setText("Grand Total:");
        GrandTotal.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        Subtotal.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        Subtotal.setForeground(new java.awt.Color(102, 102, 255));
        Subtotal.setText("Subtotal:");
        Subtotal.setToolTipText("Enter the number of each Macroon that you would\n like to purchase and click Calculate");

        jLabel1.setIcon(new javax.swing.ImageIcon("Y:\\Documents\\macaroons-advanced (1).jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BananaMacroons)
                        .addGap(18, 18, 18)
                        .addComponent(BananaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RaspberryMacroons)
                                    .addComponent(LimeMacroons))
                                .addComponent(BlueberryMarcroons))
                            .addComponent(LemonMacroons))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LemonAmount)
                            .addComponent(BlueberryAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LimeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(RaspberryAmount))))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GrandTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotAns, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Taxes)
                            .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TaxAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SubAns, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(Description2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Title1)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(description1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(92, 92, 92))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Title1)
                        .addGap(27, 27, 27)
                        .addComponent(description1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Description2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LemonMacroons)
                            .addComponent(LemonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlueberryMarcroons)
                            .addComponent(BlueberryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RaspberryMacroons)
                            .addComponent(RaspberryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimeMacroons)
                            .addComponent(LimeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BananaMacroons)
                            .addComponent(BananaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Taxes)
                            .addComponent(TaxAns, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Subtotal)
                            .addComponent(SubAns, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TotAns, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GrandTotal))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LemonAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemonAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LemonAmountActionPerformed

    private void BlueberryAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueberryAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BlueberryAmountActionPerformed

    private void RaspberryAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaspberryAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RaspberryAmountActionPerformed

    private void BananaAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BananaAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BananaAmountActionPerformed

    private void LimeAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimeAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimeAmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double Lemoncookie = Double.parseDouble(LemonAmount.getText());
        double Blueberrycookie = Double.parseDouble(BlueberryAmount.getText());
        double Raspberrycookie = Double.parseDouble(RaspberryAmount.getText());
        double Bananacookie = Double.parseDouble(BananaAmount.getText());
        double LemonPrice, BlueberryPrice, RaspberryPrice, BananaPrice;
        double TotTax, GrandTot;
        double total;
        
        LemonPrice = Lemoncookie * 1.99;
        BlueberryPrice = Blueberrycookie * 1.79;
        RaspberryPrice = Raspberrycookie * 1.99;
        BananaPrice = Bananacookie * 1.99;
        
        total = (LemonPrice + BlueberryPrice + RaspberryPrice + BananaPrice);
        TotTax = total * 0.15;
        
        TaxAns.setText("The Tax is " + TotTax);
       
        SubAns.setText("Your Sub-Total is " + total);
        
        GrandTot = (TotTax + total);
        
        TotAns.setText("Your Total is " + GrandTot );
        
        
        
        
        
        
        
        
         
        
        
        
        
// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(MacroonsJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MacroonsJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MacroonsJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MacroonsJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MacroonsJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BananaAmount;
    private javax.swing.JLabel BananaMacroons;
    private javax.swing.JTextField BlueberryAmount;
    private javax.swing.JLabel BlueberryMarcroons;
    private javax.swing.JLabel Description2;
    private javax.swing.JLabel GrandTotal;
    private javax.swing.JTextField LemonAmount;
    private javax.swing.JLabel LemonMacroons;
    private javax.swing.JTextField LimeAmount;
    private javax.swing.JLabel LimeMacroons;
    private javax.swing.JTextField RaspberryAmount;
    private javax.swing.JLabel RaspberryMacroons;
    private javax.swing.JLabel SubAns;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel TaxAns;
    private javax.swing.JLabel Taxes;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel TotAns;
    private javax.swing.JLabel description1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
