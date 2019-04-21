/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Pessoa;
import br.iesb.meuprograma.negocio.ValidarImagem;
import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.negocio.PessoaBO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class JDialogSindico_Cadastro extends javax.swing.JDialog {

    /**
     * Creates new form JDialogSindico_EditarPerfil
     */
    public JDialogSindico_Cadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelDtNasc = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelBiometria = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelSenhaProv = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtNasc = new javax.swing.JFormattedTextField();
        jRadioButtonMasc = new javax.swing.JRadioButton();
        jRadioButtonFem = new javax.swing.JRadioButton();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonBiometriaBusca = new javax.swing.JButton();
        jButtonFotoBusca = new javax.swing.JButton();
        jPasswordFieldSenhaProv = new javax.swing.JPasswordField();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jPanelCadastroUnidade = new javax.swing.JPanel();
        jLabelBloco = new javax.swing.JLabel();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelUnidade = new javax.swing.JLabel();
        jComboBoxUnidade = new javax.swing.JComboBox<>();
        jLabelMorador = new javax.swing.JLabel();
        jComboBoxMorador = new javax.swing.JComboBox<>();
        jScrollPaneCadastroUnidade = new javax.swing.JScrollPane();
        jTableBloco_Unidade = new javax.swing.JTable();
        jButtonIncluir_Unidade = new javax.swing.JButton();
        jButtonIncluir_EndCorrespondencia = new javax.swing.JButton();
        jLabelCelular = new javax.swing.JLabel();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Perfil");

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelDtNasc.setText("Data de Nascimento:");

        jLabelGenero.setText("Gênero:");

        jLabelEndereco.setText("Endereço:");

        jLabelTelefone.setText("Telefone:");

        jLabelEmail.setText("Email:");

        jLabelBiometria.setText("Biometria:");

        jLabelFoto.setText("Foto:");

        jLabelSenhaProv.setText("Senha Provisória:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelRG.setText("RG:");

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtNasc.setText("dd  /MM  /aaaa    ");

        buttonGroupGenero.add(jRadioButtonMasc);
        jRadioButtonMasc.setText("Masculino");
        jRadioButtonMasc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMascMouseClicked(evt);
            }
        });

        buttonGroupGenero.add(jRadioButtonFem);
        jRadioButtonFem.setText("Feminino");
        jRadioButtonFem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonFemMouseClicked(evt);
            }
        });

        jButtonBiometriaBusca.setText("Buscar");
        jButtonBiometriaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBiometriaBuscaActionPerformed(evt);
            }
        });

        jButtonFotoBusca.setText("Upload/Buscar");
        jButtonFotoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoBuscaActionPerformed(evt);
            }
        });

        jButtonVisualizar.setText("Visualizar");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanelCadastroUnidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Unidade"));

        jLabelBloco.setText("Bloco:");

        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguarde..." }));

        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Tipo", "Proprietário", "Inquilino", "Morador" }));

        jLabelUnidade.setText("Unidade:");

        jComboBoxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguarde..." }));

        jLabelMorador.setText("Morador:");

        jComboBoxMorador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));

        jTableBloco_Unidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bloco", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneCadastroUnidade.setViewportView(jTableBloco_Unidade);

        jButtonIncluir_Unidade.setText("Incluir Unidade");

        jButtonIncluir_EndCorrespondencia.setText("Incluir Endereço de Correspondencia");

        javax.swing.GroupLayout jPanelCadastroUnidadeLayout = new javax.swing.GroupLayout(jPanelCadastroUnidade);
        jPanelCadastroUnidade.setLayout(jPanelCadastroUnidadeLayout);
        jPanelCadastroUnidadeLayout.setHorizontalGroup(
            jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUnidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUnidadeLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBloco)
                            .addGroup(jPanelCadastroUnidadeLayout.createSequentialGroup()
                                .addComponent(jLabelTipo)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMorador)
                            .addComponent(jLabelUnidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonIncluir_EndCorrespondencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIncluir_Unidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jScrollPaneCadastroUnidade)))
        );
        jPanelCadastroUnidadeLayout.setVerticalGroup(
            jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUnidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUnidadeLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonIncluir_EndCorrespondencia))
                    .addGroup(jPanelCadastroUnidadeLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelBloco)
                                .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUnidade)
                                .addComponent(jComboBoxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonIncluir_Unidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipo)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMorador)
                            .addComponent(jComboBoxMorador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneCadastroUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelCelular.setText("Celular:");

        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar)
                        .addContainerGap())
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelSenhaProv)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldSenhaProv, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVisualizar)
                        .addGap(137, 137, 137))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelTelefone)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelGenero)
                                .addGap(69, 69, 69)
                                .addComponent(jRadioButtonMasc)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonFem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelDtNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabelRG)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelCelular)
                                                    .addComponent(jLabelFoto))
                                                .addGap(66, 66, 66)
                                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButtonFotoBusca)
                                                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                                .addComponent(jLabelEmail)
                                                .addGap(73, 73, 73)
                                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(24, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelCadastroUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF)
                                    .addComponent(jLabelEndereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelBiometria)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBiometriaBusca)
                                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtNasc)
                    .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRG)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEmail)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelGenero)
                        .addComponent(jRadioButtonMasc)
                        .addComponent(jRadioButtonFem)))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBiometria)
                    .addComponent(jButtonBiometriaBusca)
                    .addComponent(jLabelFoto)
                    .addComponent(jButtonFotoBusca))
                .addGap(4, 4, 4)
                .addComponent(jPanelCadastroUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenhaProv)
                    .addComponent(jPasswordFieldSenhaProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVisualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonCadastrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
       //Coleta de dados do formulário
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(jTextFieldNome.getText());
        pessoa.setDataNascimento(jFormattedTextFieldDtNasc.getText());
        pessoa.setCpf(jFormattedTextFieldCPF.getText());
        pessoa.setRg(jFormattedTextFieldRG.getText());
        if(jRadioButtonMasc.isSelected()){
            pessoa.setGenero(jRadioButtonMasc.getLabel());
        }
        if(jRadioButtonFem.isSelected()){
            pessoa.setGenero(jRadioButtonFem.getLabel());
        }
        pessoa.setEndereco(jTextFieldEndereco.getText());
        pessoa.setEmail(jTextFieldEmail.getText());
        pessoa.setTelefone(jFormattedTextFieldTelefone.getText());
        pessoa.setCelular(jFormattedTextFieldCelular.getText());
        pessoa.setSenha(new String(jPasswordFieldSenhaProv.getPassword()));
        Date dataAtual=new Date(System.currentTimeMillis());//colhe a data atual
        pessoa.setDataCadastro(dataAtual);//guarda a data de cadastro.        
        //Inclusão do usuário e teste de validação
        PessoaBO bo= new PessoaBO();
        try{
            bo.inserir(pessoa);
            JOptionPane.showMessageDialog(this, "Usuário Incluido com Sucesso!",
                    "Informação", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }catch(NegocioException e){
        JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jRadioButtonMascMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMascMouseClicked
      
    }//GEN-LAST:event_jRadioButtonMascMouseClicked

    private void jRadioButtonFemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonFemMouseClicked
        
    }//GEN-LAST:event_jRadioButtonFemMouseClicked

    private void jButtonFotoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoBuscaActionPerformed
        Pessoa pessoa = new Pessoa();
        ValidarImagem vi= new ValidarImagem();
        BufferedImage bi;
      JFileChooser fc= new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Arquivo *.jpg","jpg"));
        int dlg=fc.showOpenDialog(null);
        File arquivo =fc.getSelectedFile();
         bi=vi.validarImagem(dlg,arquivo);
         pessoa.setFoto(bi);  
    }//GEN-LAST:event_jButtonFotoBuscaActionPerformed

    private void jButtonBiometriaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBiometriaBuscaActionPerformed
        Pessoa pessoa = new Pessoa();
        ValidarImagem vi= new ValidarImagem();
        BufferedImage bi;
        JFileChooser fc= new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Arquivo *.jpg","jpg"));
        int dlg=fc.showOpenDialog(null);
        File arquivo =fc.getSelectedFile();
        bi=vi.validarImagem(dlg,arquivo);
        pessoa.setBiometria(bi);

    }//GEN-LAST:event_jButtonBiometriaBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogSindico_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogSindico_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogSindico_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogSindico_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogSindico_Cadastro dialog = new JDialogSindico_Cadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JButton jButtonBiometriaBusca;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonFotoBusca;
    private javax.swing.JButton jButtonIncluir_EndCorrespondencia;
    private javax.swing.JButton jButtonIncluir_Unidade;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxBloco;
    private javax.swing.JComboBox<String> jComboBoxMorador;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxUnidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelBiometria;
    private javax.swing.JLabel jLabelBloco;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelMorador;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSenhaProv;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUnidade;
    private javax.swing.JPanel jPanelCadastroUnidade;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordFieldSenhaProv;
    private javax.swing.JRadioButton jRadioButtonFem;
    private javax.swing.JRadioButton jRadioButtonMasc;
    private javax.swing.JScrollPane jScrollPaneCadastroUnidade;
    private javax.swing.JTable jTableBloco_Unidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
