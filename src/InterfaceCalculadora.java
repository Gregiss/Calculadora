/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class InterfaceCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceCalculadora
     */
    public InterfaceCalculadora() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tela = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Divisao = new java.awt.Label();
        Limpar = new java.awt.Label();
        num4 = new java.awt.Label();
        num9 = new java.awt.Label();
        num8 = new java.awt.Label();
        num7 = new java.awt.Label();
        num5 = new java.awt.Label();
        num6 = new java.awt.Label();
        num2 = new java.awt.Label();
        num3 = new java.awt.Label();
        num1 = new java.awt.Label();
        label15 = new java.awt.Label();
        label17 = new java.awt.Label();
        num0 = new java.awt.Label();
        label19 = new java.awt.Label();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);

        tela.setEditable(false);
        tela.setBackground(java.awt.Color.white);
        tela.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tela.setToolTipText("Tela");
        tela.setBorder(null);
        tela.setMargin(new java.awt.Insets(5, 12, 12, 42));

        jPanel2.setBackground(java.awt.Color.white);

        Divisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Divisao.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Divisao.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        Divisao.setText("  /");
        Divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivisaoMouseClicked(evt);
            }
        });

        Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpar.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Limpar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        Limpar.setText("CE");
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });

        num4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num4.setText("4");
        num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num4MouseClicked(evt);
            }
        });

        num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num9.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num9.setText("9");
        num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num9MouseClicked(evt);
            }
        });

        num8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num8.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num8.setText("8");
        num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num8MouseClicked(evt);
            }
        });

        num7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num7.setText("7");
        num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num7MouseClicked(evt);
            }
        });

        num5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num5.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num5.setText("5");
        num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num5MouseClicked(evt);
            }
        });

        num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num6.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num6.setText("6");
        num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num6MouseClicked(evt);
            }
        });

        num2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num2.setText("2");
        num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num2MouseClicked(evt);
            }
        });

        num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num3.setText("3");
        num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num3MouseClicked(evt);
            }
        });

        num1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num1.setText("1");
        num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1MouseClicked(evt);
            }
        });

        label15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label15.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label15.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        label15.setText("+");
        label15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label15MouseClicked(evt);
            }
        });

        label17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label17.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label17.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        label17.setText("X");
        label17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label17MouseClicked(evt);
            }
        });

        num0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num0.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num0.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num0.setText("0");
        num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num0MouseClicked(evt);
            }
        });

        label19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label19.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label19.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        label19.setText("=");
        label19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label19MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tela))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num0MouseClicked
        String number = num0.getText();
        addNumber(number);
    }//GEN-LAST:event_num0MouseClicked

    private void num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1MouseClicked
        String number = num1.getText();
        addNumber(number);
    }//GEN-LAST:event_num1MouseClicked

    private void num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num2MouseClicked
        String number = num2.getText();
        addNumber(number);
    }//GEN-LAST:event_num2MouseClicked

    private void num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num3MouseClicked
        String number = num3.getText();
        addNumber(number);
    }//GEN-LAST:event_num3MouseClicked

    private void num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num4MouseClicked
        String number = num4.getText();
        addNumber(number);
    }//GEN-LAST:event_num4MouseClicked

    private void num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num5MouseClicked
        String number = num5.getText();
        addNumber(number);
    }//GEN-LAST:event_num5MouseClicked

    private void num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num6MouseClicked
        String number = num6.getText();
        addNumber(number);
    }//GEN-LAST:event_num6MouseClicked

    private void num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num7MouseClicked
        String number = num7.getText();
        addNumber(number);
    }//GEN-LAST:event_num7MouseClicked

    private void num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num8MouseClicked
        String number = num8.getText();
        addNumber(number);
    }//GEN-LAST:event_num8MouseClicked

    private void num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9MouseClicked
        String number = num9.getText();
        addNumber(number);
    }//GEN-LAST:event_num9MouseClicked

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
        tela.setText("");
    }//GEN-LAST:event_LimparMouseClicked

    private void label19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label19MouseClicked
        calcular();
    }//GEN-LAST:event_label19MouseClicked

    private void label19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_label19MouseEntered

    private void label15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label15MouseClicked
       addNumber("+");
    }//GEN-LAST:event_label15MouseClicked

    private void label17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label17MouseClicked
        addNumber("X");
    }//GEN-LAST:event_label17MouseClicked

    private void DivisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivisaoMouseClicked
        addNumber("/");
    }//GEN-LAST:event_DivisaoMouseClicked

    public void calcular(){
        String telaN = tela.getText();
        char[] array = telaN.toCharArray();
        int soma = 0;
        String aux = "";
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == '+'){
                aux = array[i - 1] +""+ array[i + 1];
                soma = Integer.parseInt(aux);
            }
        }
        
        tela.setText(""+soma);
        
    }
    
    public void addNumber(String number){
        String telaAtual = tela.getText();
        tela.setText(telaAtual + number);
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
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Divisao;
    private java.awt.Label Limpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.Label label15;
    private java.awt.Label label17;
    private java.awt.Label label19;
    private java.awt.Label num0;
    private java.awt.Label num1;
    private java.awt.Label num2;
    private java.awt.Label num3;
    private java.awt.Label num4;
    private java.awt.Label num5;
    private java.awt.Label num6;
    private java.awt.Label num7;
    private java.awt.Label num8;
    private java.awt.Label num9;
    private javax.swing.JTextField tela;
    // End of variables declaration//GEN-END:variables
}
