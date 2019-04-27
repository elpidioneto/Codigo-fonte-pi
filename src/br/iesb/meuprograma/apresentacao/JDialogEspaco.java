package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Espaco;
import br.iesb.meuprograma.negocio.EspacoBO;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JDialogEspaco extends javax.swing.JDialog {

    
    public JDialogEspaco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cadastro de Espaços Comuns para Reserva Individual");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Hora Inicial", "Hora Final", "Quantidade de Horas", "Quantidade de Reserva", "Quantidade de Convidados", "Valor Reserva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(146, 146, 146)
                        .addComponent(BtnNovo)
                        .addGap(99, 99, 99)
                        .addComponent(btnExcluir)
                        .addGap(151, 151, 151)
                        .addComponent(btnVoltar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnVoltar)
                    .addComponent(BtnNovo))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    if(jTable1.getSelectedRow() < 0)
{JOptionPane.showMessageDialog(this,"Selecione um espaço para editar","Aviso",JOptionPane.INFORMATION_MESSAGE);
return;}
int opcao = JOptionPane.showConfirmDialog(this,"Deseja editar o espaco?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
if(opcao == JOptionPane.NO_OPTION)
{return;}

Espaco espaco = new Espaco();
espaco.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));
espaco.setNome(jTable1.getValueAt(jTable1.getSelectedRow(),1) .toString());
espaco.setHoraMin(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),2) .toString()));
espaco.setHoraMax(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3) .toString()));
espaco.setQtdHoras(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),4) .toString()));
espaco.setQtdReserva(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),5) .toString()));
espaco.setQtdConvidados(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),6) .toString()));
espaco.setValorReserva(Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),7) .toString()));

JDialogEspacoCadastro dialogo = new JDialogEspacoCadastro((JFrame)  this.getParent(), true);
dialogo.editar(espaco);

dialogo.setVisible(true);       
formWindowOpened(null);  
    }
/*private void formWindowOpened(java.awt.event.WindowEvent evt){
 
                   
    }//GEN-LAST:event_btnAlterarActionPerformed
    */

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(jTable1.getSelectedRow() < 0)
{JOptionPane.showMessageDialog(this,"Selecione um espaço para remover","Aviso",JOptionPane.INFORMATION_MESSAGE);
return;}
int opcao = JOptionPane.showConfirmDialog(this,"Deseja remover a espaço?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
if(opcao == JOptionPane.NO_OPTION)
{return;}

Espaco espaco = new Espaco();
espaco.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));

EspacoBO bo = new EspacoBO();
try {bo.excluir(espaco);
formWindowOpened(null);
JOptionPane.showMessageDialog(rootPane,"Espaço excluido com sucesso","Informação",JOptionPane.INFORMATION_MESSAGE);
}
catch (NegocioException ex) 
{if(ex.getCause() == null) 
{JOptionPane.showMessageDialog(this,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}
else
{JOptionPane.showMessageDialog(this,ex.getCause() .getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}}
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
     dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        JDialogEspacoCadastro dialogo = new JDialogEspacoCadastro((JFrame) this.getParent(), true);
        dialogo.setVisible(true);
        formWindowOpened(null);
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        EspacoBO bo = new EspacoBO();
try { 
DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
modelo.setRowCount(0);
List<Espaco> lista = bo.listar();
for(Espaco espaco : lista) {
modelo.addRow(new Object[] {
espaco.getId(),
espaco.getNome(),
espaco.getHoraMin(),
espaco.getHoraMax(),
espaco.getQtdHoras(),
espaco.getQtdReserva(),
espaco.getQtdConvidados(),
espaco.getValorReserva()
});
}} catch (NegocioException ex) {
if( ex.getCause() == null) {
JOptionPane.showMessageDialog(rootPane,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(rootPane,ex.getCause(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
}
}   
    }//GEN-LAST:event_formWindowOpened

   
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
            java.util.logging.Logger.getLogger(JDialogEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogEspaco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogEspaco dialog = new JDialogEspaco(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnNovo;
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
