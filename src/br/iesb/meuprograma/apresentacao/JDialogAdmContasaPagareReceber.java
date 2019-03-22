/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import javax.swing.JFrame;

  



public class JDialogAdmContasaPagareReceber extends javax.swing.JDialog {

    private JDialogLancamentosaPagar janela2;
    
    public JDialogAdmContasaPagareReceber(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        categoria1.removeAllItems();
        categoria2.removeAllItems();
        categoria3.removeAllItems();
        
        categoria1.addItem ("Cotas Condominais - Residencial");
        categoria1.addItem ("Cotas Condominais - Comercial");
        categoria1.addItem ("Taxas para uso do Salão de Festa");
        categoria1.addItem ("Taxa de reposição de bens");
        categoria1.addItem ("Taxa de reparo de bens");
        categoria1.addItem ("Multas por atraso ou infração");
        categoria1.addItem ("Outras receitas");
        
        
        categoria2.addItem ("Remuneração do Sindíco/Prolabore");
        categoria2.addItem ("Salários");
        categoria2.addItem ("Honorários Profissionais");
        categoria2.addItem ("Energia elétrica");
        categoria2.addItem ("Água/Esgoto");
        categoria2.addItem ("Gás");
        categoria2.addItem ("Serviços de manutenção");
        categoria2.addItem ("Serviços de terceiros");
        categoria2.addItem ("Despeas eventais");
        categoria2.addItem ("Despesas financeiras");
        categoria2.addItem ("Impostos");
        
        categoria3.addItem ("Cotas Condominais - Residencial");
        categoria3.addItem ("Cotas Condominais - Comercial");
        categoria3.addItem ("Taxas para uso do Salão de Festa");
        categoria3.addItem ("Taxa de reposição de bens");
        categoria3.addItem ("Taxa de reparo de bens");
        categoria3.addItem ("Multas por atraso ou infração");
        categoria3.addItem ("Outras receitas");
        categoria3.addItem ("Remuneração do Sindíco/Prolabore");
        categoria3.addItem ("Salários");
        categoria3.addItem ("Honorários Profissionais");
        categoria3.addItem ("Energia elétrica");
        categoria3.addItem ("Água/Esgoto");
        categoria3.addItem ("Gás");
        categoria3.addItem ("Serviços de manutenção");
        categoria3.addItem ("Serviços de terceiros");
        categoria3.addItem ("Despeas eventais");
        categoria3.addItem ("Despesas financeiras");
        categoria3.addItem ("Impostos");
        
        
        //this.janela2 = new JDialogLancamentosaPagar;
    }

      

   //this.janela2 = new janela2(this, true);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        categoria1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        categoria2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        lblIncluir = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        textField5 = new java.awt.TextField();
        jLabel14 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        categoria3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Data início: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        textField1.setText("  /  /    ");
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 60, -1));

        jLabel3.setText("Data Final:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        textField2.setText("  /  /    ");
        jPanel1.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Data Emissão");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Data vencimento");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Data Recebimento");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        categoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria1ActionPerformed(evt);
            }
        });
        jPanel1.add(categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setText("Categoria:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setText("Situação:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jButton1.setText("Pesquisar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jButton2.setText("Incluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jButton3.setText("Excluir");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jButton4.setText("Débito");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jButton5.setText("Quitar Débitos");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jButton6.setText("Editar");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jButton7.setText("Fechar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Emissão", "Recebimento", "Descrição", "Devedor", "Categoria", "Valor", "Situação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 800, 180));

        jLabel11.setText("Recebimento: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, 20));

        jLabel12.setText("Débito: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        jLabel25.setText("R$: 0,00");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        jLabel26.setText("R$: 0,00");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        jButton17.setText("Imprimir");
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, -1));

        jTabbedPane3.addTab("Entradas", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Data início:  ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        textField3.setText("  /  /    ");
        jPanel2.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 60, -1));

        jLabel7.setText("Data Fina: l");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        textField4.setText("  /  /    ");
        jPanel2.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Data Emissão");
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Data vencimento");
        jPanel2.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Data Pagamento");
        jPanel2.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        categoria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(categoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel8.setText("Categoria: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setText("Situação: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 20));

        jButton8.setText("Pesquisar");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        lblIncluir.setText("Incluir");
        lblIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIncluirActionPerformed(evt);
            }
        });
        jPanel2.add(lblIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jButton10.setText("Excluir");
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jButton12.setText("Quitar");
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jButton13.setText("Editar");
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jButton14.setText("Fechar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Emissão", "Pagamento", "Descrição", "Fornecedor", "Categoria", "Valor", "Situação"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 800, 170));

        jLabel1.setText("Pagamento: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        jLabel10.setText("Crédito: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        jLabel23.setText("R$: 0,00");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        jLabel24.setText("R$: 0,00");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        jButton16.setText("Imprimir");
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

        jPanel8.add(jPanel2);

        jTabbedPane3.addTab("Saídas", jPanel8);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Data início ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        textField5.setText("  /  /    ");
        jPanel3.add(textField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 60, -1));

        jLabel14.setText("Data Final");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        textField6.setText("  /  /    ");
        jPanel3.add(textField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, -1));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Data Emissão");
        jPanel3.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Data vencimento");
        jPanel3.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("Data Pagamento");
        jPanel3.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        categoria3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(categoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel15.setText("Categoria");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel16.setText("Situação");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jButton11.setText("Pesquisar");
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jButton20.setText("Fechar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Emissão", "Recebimento/pagamento", "Descrição", "Devedor/Credor", "Categoria", "Valor", "Situação"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 790, 180));

        jLabel17.setText("Recebimento: ");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));

        jLabel18.setText("Pagamento: ");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("Data Recebimento");
        jPanel3.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel19.setText("Saldo: ");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jLabel20.setText("R$ 0,00");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 334, -1, 30));

        jLabel21.setText("R$: 0,00");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel22.setText("R$: 0,00");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        jButton15.setText("Imprimir");
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        jPanel9.add(jPanel3);

        jTabbedPane3.addTab("Caixa", jPanel9);

        getContentPane().add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void lblIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIncluirActionPerformed
 
        JDialogLancamentosaPagar dialog = new JDialogLancamentosaPagar(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
        
       
    }//GEN-LAST:event_lblIncluirActionPerformed

    private void categoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    JDialogLancamentosaReceber dialog = new JDialogLancamentosaReceber(new javax.swing.JFrame(), true);
    dialog.setVisible(true);        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
         dispose();
    }//GEN-LAST:event_jButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogAdmContasaPagareReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAdmContasaPagareReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAdmContasaPagareReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAdmContasaPagareReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAdmContasaPagareReceber dialog = new JDialogAdmContasaPagareReceber(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> categoria1;
    private javax.swing.JComboBox<String> categoria2;
    private javax.swing.JComboBox<String> categoria3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton lblIncluir;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
