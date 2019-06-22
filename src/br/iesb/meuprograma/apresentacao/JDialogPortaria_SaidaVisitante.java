/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Visitante;
import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.negocio.VisitanteBO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class JDialogPortaria_SaidaVisitante extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPortaria_SaidaVisitante
     */
    public JDialogPortaria_SaidaVisitante(java.awt.Frame parent, boolean modal) {
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

        jPanelBotoes = new javax.swing.JPanel();
        jButtonMarcarSaida = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisitantesAtivos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonMarcarSaida.setText("Marcar Saída");
        jButtonMarcarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarSaidaActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jButtonMarcarSaida)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonMarcarSaida))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanelBotoes, java.awt.BorderLayout.PAGE_END);

        jTableVisitantesAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Visitante", "Data/Hora Entrada", "Bloco", "Unidade", "Tipo de Visita", "Data/Hora Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVisitantesAtivos);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        VisitanteBO bo = new VisitanteBO();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableVisitantesAtivos.getModel();
            modelo.setRowCount(0);
            List<Visitante> lista = bo.listarSaida();
            for (Visitante visitante : lista) {
                modelo.addRow(new Object[]{
                    visitante.getId(),
                    visitante.getNome(),
                    visitante.getDataHoraEntrada(),
                    visitante.getBloco(),
                    visitante.getUnidade(),
                    visitante.getTipoVisita(),
                    visitante.getDataHoraSaida()
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

    private void jButtonMarcarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarSaidaActionPerformed
        // TODO add your handling code here
        if (jTableVisitantesAtivos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um visitante", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja Marcar saída para visitante?", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == JOptionPane.NO_OPTION) {
            return;
        }
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataTx = sdf.format(data);
        Visitante visitante = new Visitante();
        visitante.setId(Integer.valueOf(jTableVisitantesAtivos.getValueAt(jTableVisitantesAtivos.getSelectedRow(), 0).toString()));
        visitante.setNome(jTableVisitantesAtivos.getValueAt(jTableVisitantesAtivos.getSelectedRow(), 1).toString());
        visitante.setDataHoraEntrada(jTableVisitantesAtivos.getValueAt(jTableVisitantesAtivos.getSelectedRow(), 2).toString());
        visitante.setBloco(jTableVisitantesAtivos.getValueAt(jTableVisitantesAtivos.getSelectedRow(), 3).toString());
        visitante.setUnidade(Integer.valueOf(jTableVisitantesAtivos.getValueAt(jTableVisitantesAtivos.getSelectedRow(), 4).toString()));
        visitante.setTipoVisita(jTableVisitantesAtivos.getValueAt(jTableVisitantesAtivos.getSelectedRow(), 5).toString());
        visitante.setDataHoraSaida(dataTx);

        VisitanteBO bo = new VisitanteBO();

        try {
            bo.alterar(visitante);
        } catch (NegocioException ex) {
            {
                if (ex.getCause() == null) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, ex.getCause().getMessage(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
            dispose();


    }//GEN-LAST:event_jButtonMarcarSaidaActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogPortaria_SaidaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPortaria_SaidaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPortaria_SaidaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPortaria_SaidaVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPortaria_SaidaVisitante dialog = new JDialogPortaria_SaidaVisitante(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonMarcarSaida;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVisitantesAtivos;
    // End of variables declaration//GEN-END:variables
}
