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
    
    CalculatorEngine Calcular = new CalculatorEngine();
    
    public float number1;
    public float number2;
    
    public InterfaceCalculadora() {
        initComponents();
        historico.setVisible(false);
        this.continha.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        num7 = new java.awt.Label();
        num9 = new java.awt.Label();
        num4 = new java.awt.Label();
        num6 = new java.awt.Label();
        num5 = new java.awt.Label();
        num3 = new java.awt.Label();
        num2 = new java.awt.Label();
        num1 = new java.awt.Label();
        num0 = new java.awt.Label();
        num18 = new java.awt.Label();
        num19 = new java.awt.Label();
        num20 = new java.awt.Label();
        num21 = new java.awt.Label();
        num22 = new java.awt.Label();
        num23 = new java.awt.Label();
        tela = new javax.swing.JTextField();
        num8 = new java.awt.Label();
        historico = new javax.swing.JPanel();
        history = new java.awt.List();
        label1 = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tela1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        continha = new javax.swing.JLabel();

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
        setName("Calculadora"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        num7.setBackground(java.awt.Color.white);
        num7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num7.setText("     7");
        num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num7MouseClicked(evt);
            }
        });

        num9.setBackground(java.awt.Color.white);
        num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num9.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num9.setText("     9");
        num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                num9MouseEntered(evt);
            }
        });
        num9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                num9MouseDragged(evt);
            }
        });

        num4.setBackground(java.awt.Color.white);
        num4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num4.setText("     4");
        num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num4MouseClicked(evt);
            }
        });

        num6.setBackground(java.awt.Color.white);
        num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num6.setText("    6");
        num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num6MouseClicked(evt);
            }
        });

        num5.setBackground(java.awt.Color.white);
        num5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num5.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num5.setText("     5");
        num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num5MouseClicked(evt);
            }
        });

        num3.setBackground(java.awt.Color.white);
        num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num3.setText("    3");
        num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num3MouseClicked(evt);
            }
        });

        num2.setBackground(java.awt.Color.white);
        num2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num2.setText("     2");
        num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num2MouseClicked(evt);
            }
        });

        num1.setBackground(java.awt.Color.white);
        num1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num1.setText("     1");
        num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1MouseClicked(evt);
            }
        });

        num0.setBackground(java.awt.Color.white);
        num0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num0.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num0.setName(""); // NOI18N
        num0.setText("     0");
        num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num0MouseClicked(evt);
            }
        });

        num18.setBackground(new java.awt.Color(255, 255, 255));
        num18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num18.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num18.setText("            =");
        num18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num18MouseClicked(evt);
            }
        });

        num19.setBackground(new java.awt.Color(255, 255, 255));
        num19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num19.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num19.setText("          CE");
        num19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num19MouseClicked(evt);
            }
        });

        num20.setBackground(new java.awt.Color(255, 255, 255));
        num20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num20.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num20.setText("     -");
        num20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num20MouseClicked(evt);
            }
        });

        num21.setBackground(new java.awt.Color(255, 255, 255));
        num21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num21.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num21.setText("     X");
        num21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num21MouseClicked(evt);
            }
        });

        num22.setBackground(new java.awt.Color(255, 255, 255));
        num22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num22.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num22.setText("     ÷");
        num22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num22MouseClicked(evt);
            }
        });

        num23.setBackground(new java.awt.Color(255, 255, 255));
        num23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num23.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num23.setText("    +");
        num23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                num23MouseEntered(evt);
            }
        });

        tela.setEditable(false);
        tela.setBackground(new java.awt.Color(204, 204, 204));
        tela.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tela.setToolTipText("Tela");
        tela.setBorder(null);
        tela.setMargin(new java.awt.Insets(5, 12, 12, 42));

        num8.setBackground(java.awt.Color.white);
        num8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num8.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        num8.setText("     8");
        num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num8MouseClicked(evt);
            }
        });

        historico.setBackground(new java.awt.Color(204, 204, 204));

        history.setBackground(new java.awt.Color(204, 204, 204));
        history.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        history.setEnabled(false);

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Historico");

        javax.swing.GroupLayout historicoLayout = new javax.swing.GroupLayout(historico);
        historico.setLayout(historicoLayout);
        historicoLayout.setHorizontalGroup(
            historicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(historicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(historicoLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        historicoLayout.setVerticalGroup(
            historicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historicoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tela, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(num19, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(num18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(num2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(num20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(num23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(historico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(historico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(num22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Padrão");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tela1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/history.png"))); // NOI18N
        jLabel1.setText("Historico");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(continha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(continha))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(57, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num7MouseClicked
        addNumber(num7.getText().trim());
    }//GEN-LAST:event_num7MouseClicked

    private void num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9MouseClicked
        addNumber(num9.getText().trim());
    }//GEN-LAST:event_num9MouseClicked

    private void num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num4MouseClicked
        addNumber(num4.getText().trim());
    }//GEN-LAST:event_num4MouseClicked

    private void num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num6MouseClicked
        addNumber(num6.getText().trim());
    }//GEN-LAST:event_num6MouseClicked

    private void num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num5MouseClicked
        addNumber(num5.getText().trim());
    }//GEN-LAST:event_num5MouseClicked

    private void num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num3MouseClicked
        addNumber(num3.getText().trim());
    }//GEN-LAST:event_num3MouseClicked

    private void num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num2MouseClicked
        addNumber(num2.getText().trim());
    }//GEN-LAST:event_num2MouseClicked

    private void num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1MouseClicked
       addNumber(num1.getText().trim());
    }//GEN-LAST:event_num1MouseClicked

    private void num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num0MouseClicked
        addNumber(num0.getText().trim());
    }//GEN-LAST:event_num0MouseClicked

    private void num18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num18MouseClicked
        calcular();
        tela1.setText("");
    }//GEN-LAST:event_num18MouseClicked

    private void num19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num19MouseClicked
       tela.setText("");
       tela1.setText("");
    }//GEN-LAST:event_num19MouseClicked

    private void num20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num20MouseClicked
       Calcular.Operation(1,tela.getText());
       tela.setText("");
       tela1.setText(tela1.getText() + " - ");
       this.continha.setText(this.continha.getText() + "-");
    }//GEN-LAST:event_num20MouseClicked

    private void num21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num21MouseClicked
        Calcular.Operation(2,tela.getText());
        tela.setText("");
        tela1.setText(tela1.getText() + " * ");
        this.continha.setText(this.continha.getText() + "*");
    }//GEN-LAST:event_num21MouseClicked

    private void num22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num22MouseClicked
        Calcular.Operation(3,tela.getText());
        tela.setText("");
        tela1.setText(tela1.getText() + " ÷ ");
        this.continha.setText(this.continha.getText() + "÷");
    }//GEN-LAST:event_num22MouseClicked

    private void num23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num23MouseClicked
        Calcular.Operation(0,tela.getText());
        tela.setText("");
        tela1.setText(tela1.getText() + " + ");
        this.continha.setText(this.continha.getText() + "+");
    }//GEN-LAST:event_num23MouseClicked

    private void num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num8MouseClicked
        addNumber(num8.getText().trim());
    }//GEN-LAST:event_num8MouseClicked

    private void num9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9MouseDragged
        
    }//GEN-LAST:event_num9MouseDragged

    private void num9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9MouseEntered
        
    }//GEN-LAST:event_num9MouseEntered

    private void num23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num23MouseEntered

    }//GEN-LAST:event_num23MouseEntered

    public boolean visibleHistory = false;
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(visibleHistory){
            historico.setVisible(false);
            this.visibleHistory = false;
        } else{
            historico.setVisible(true);
            this.visibleHistory = true;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    public void calcular(){
        Float resultado = Calcular.Display(tela.getText());
        tela.setText(""+resultado);
        String conta = this.continha.getText();
        history.add(conta+"="+resultado);
    }
    
    public void addNumber(String number){
        String telaAtual = tela.getText();
        tela.setText(telaAtual + number);
        this.continha.setText(this.continha.getText() + number);
        tela1.setText(tela1.getText() + " " + number);
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
    private javax.swing.JLabel continha;
    private javax.swing.JPanel historico;
    private java.awt.List history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private java.awt.Label num0;
    private java.awt.Label num1;
    private java.awt.Label num18;
    private java.awt.Label num19;
    private java.awt.Label num2;
    private java.awt.Label num20;
    private java.awt.Label num21;
    private java.awt.Label num22;
    private java.awt.Label num23;
    private java.awt.Label num3;
    private java.awt.Label num4;
    private java.awt.Label num5;
    private java.awt.Label num6;
    private java.awt.Label num7;
    private java.awt.Label num8;
    private java.awt.Label num9;
    private javax.swing.JTextField tela;
    private java.awt.Label tela1;
    // End of variables declaration//GEN-END:variables
}
