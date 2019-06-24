/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Pessoa;
import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.negocio.PessoaBO;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elpidio
 */
public class JDialogSindico_PesquisaPessoa extends javax.swing.JDialog {

    /**
     * Creates new form JDialogSindico_PesquisaPessoa
     */
    public JDialogSindico_PesquisaPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        buttonGroupSelecao = new javax.swing.ButtonGroup();
        jPanelGrupoBotoes = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListar = new javax.swing.JTable();
        jPanelBtRadio = new javax.swing.JPanel();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonCpf = new javax.swing.JRadioButton();
        jPanelDadosdePesquisa = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelGrupoBotoes.setLayout(new java.awt.GridLayout(1, 0));

        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelGrupoBotoes.add(jButtonSair);

        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelGrupoBotoes.add(jButtonEditar);

        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelGrupoBotoes.add(jButtonExcluir);

        jTableListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cpf", "Bloco", "Unidade", "Endereço", "Tipo", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListar);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBtRadio.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroupSelecao.add(jRadioButtonNome);
        jRadioButtonNome.setText("NOME");
        jRadioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNomeActionPerformed(evt);
            }
        });
        jPanelBtRadio.add(jRadioButtonNome);

        buttonGroupSelecao.add(jRadioButtonCpf);
        jRadioButtonCpf.setText("CPF");
        jRadioButtonCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCpfActionPerformed(evt);
            }
        });
        jPanelBtRadio.add(jRadioButtonCpf);

        jTextFieldNome.setEnabled(false);

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setEnabled(false);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosdePesquisaLayout = new javax.swing.GroupLayout(jPanelDadosdePesquisa);
        jPanelDadosdePesquisa.setLayout(jPanelDadosdePesquisaLayout);
        jPanelDadosdePesquisaLayout.setHorizontalGroup(
            jPanelDadosdePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosdePesquisaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosdePesquisaLayout.setVerticalGroup(
            jPanelDadosdePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosdePesquisaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelDadosdePesquisaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelDadosdePesquisaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButtonBuscar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBtRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGrupoBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelDadosdePesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDadosdePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelGrupoBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNomeActionPerformed
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(false);
        jFormattedTextFieldCpf.setText("");
    }//GEN-LAST:event_jRadioButtonNomeActionPerformed

    private void jRadioButtonCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCpfActionPerformed
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCpf.setEnabled(true);
        jTextFieldNome.setText("");
    }//GEN-LAST:event_jRadioButtonCpfActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PessoaBO bo = new PessoaBO();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableListar.getModel();
            modelo.setRowCount(0);
            List<Pessoa> lista = bo.listar();
            for (Pessoa pessoa : lista) {
                modelo.addRow(new Object[]{
                    pessoa.getId(),
                    pessoa.getNome(),
                    pessoa.getCpf(),
                    pessoa.getBloco(),
                    pessoa.getUnidade(),
                    pessoa.getEndereco(),
                    pessoa.getTipo(),
                    pessoa.getTelefone(),
                    pessoa.getCelular()
                });
            }
        } catch (NegocioException ex) {
            if (ex.getCause() == null) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, ex.getCause().getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (jRadioButtonNome.isSelected()) {
            PessoaBO bo = new PessoaBO();
            String nome = "";
            try {
                DefaultTableModel modelo = (DefaultTableModel) jTableListar.getModel();
                modelo.setRowCount(0);
                nome = jTextFieldNome.getText();
                List<Pessoa> lista = bo.listarPorNome(nome);
                for (Pessoa pessoa : lista) {
                    modelo.addRow(new Object[]{
                        pessoa.getId(),
                        pessoa.getNome(),
                        pessoa.getCpf(),
                        pessoa.getBloco(),
                        pessoa.getUnidade(),
                        pessoa.getEndereco(),
                        pessoa.getTipo(),
                        pessoa.getTelefone(),
                        pessoa.getCelular()
                    });
                }
            } catch (NegocioException ex) {
                if (ex.getCause() == null) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, ex.getCause().getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (jRadioButtonCpf.isSelected()) {
            PessoaBO bo = new PessoaBO();
            String cpf = "";
            try {
                DefaultTableModel modelo = (DefaultTableModel) jTableListar.getModel();
                modelo.setRowCount(0);
                cpf = jFormattedTextFieldCpf.getText();
                List<Pessoa> lista = bo.listarPorCpf(cpf);
                for (Pessoa pessoa : lista) {
                    modelo.addRow(new Object[]{
                        pessoa.getId(),
                        pessoa.getNome(),
                        pessoa.getCpf(),
                        pessoa.getBloco(),
                        pessoa.getUnidade(),
                        pessoa.getEndereco(),
                        pessoa.getTipo(),
                        pessoa.getTelefone(),
                        pessoa.getCelular()
                    });
                }
            } catch (NegocioException ex) {
                if (ex.getCause() == null) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, ex.getCause().getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (jTableListar.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para excluir",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja excluir a pessoa?",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == JOptionPane.NO_OPTION) {
            return;
        }

        Pessoa pessoa = new Pessoa();
        pessoa.setId(Integer.valueOf(jTableListar.getValueAt(jTableListar.getSelectedRow(), 0).toString()));

        PessoaBO bo = new PessoaBO();

        try {
            bo.excluir(pessoa);
            formWindowOpened(null);
            JOptionPane.showMessageDialog(this, "Pessoa excluida com sucesso", "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NegocioException ex) {
            if (ex.getCause() == null) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, ex.getCause().getMessage(),
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
            };

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (jTableListar.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para excluir",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja editar esta pessoa?",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == JOptionPane.NO_OPTION) {
            return;
        }
        Pessoa pessoa = new Pessoa();
        pessoa.setId(Integer.valueOf(jTableListar.getValueAt(jTableListar.getSelectedRow(), 0).toString()));
        
        PessoaBO bo = new PessoaBO();
        try {
            pessoa = bo.consultar(pessoa.getId());
            JDialogSindico_Cadastro dialogo = new JDialogSindico_Cadastro((Frame) this.getParent(), true);
            dialogo.editar(pessoa);
            dialogo.setVisible(true);
            
        } catch (NegocioException ex) {
            
         if(ex.getCause()==null)JOptionPane.showMessageDialog(this, ex.getMessage(),
                 "AVISO",JOptionPane.INFORMATION_MESSAGE);
         else JOptionPane.showMessageDialog(rootPane,ex.getCause(),"Aviso",JOptionPane.INFORMATION_MESSAGE); ;
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogSindico_PesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogSindico_PesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogSindico_PesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogSindico_PesquisaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogSindico_PesquisaPessoa dialog = new JDialogSindico_PesquisaPessoa(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupSelecao;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JPanel jPanelBtRadio;
    private javax.swing.JPanel jPanelDadosdePesquisa;
    private javax.swing.JPanel jPanelGrupoBotoes;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JRadioButton jRadioButtonCpf;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListar;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
