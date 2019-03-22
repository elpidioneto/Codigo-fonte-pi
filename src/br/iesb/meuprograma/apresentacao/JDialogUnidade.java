
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Unidade;
import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.negocio.UnidadeBO;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialogUnidade extends javax.swing.JDialog {

    
    public JDialogUnidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unidade Autonoma - Apartamentos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Unidade", "Bloco", "Area Comum", "Area Privativa", "Vaga1", "Vaga2", "Vaga3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAlterar)
                        .addGap(38, 38, 38)
                        .addComponent(BtnNovo)
                        .addGap(34, 34, 34)
                        .addComponent(btnExcluir)
                        .addGap(75, 75, 75)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(BtnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
 
if(jTable1.getSelectedRow() < 0)
{JOptionPane.showMessageDialog(this,"Selecione uma unidade para editar","Aviso",JOptionPane.INFORMATION_MESSAGE);
return;}
int opcao = JOptionPane.showConfirmDialog(this,"Deseja editar a unidade?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
if(opcao == JOptionPane.NO_OPTION)
{return;}

Unidade unidade = new Unidade();
unidade.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));
unidade.setUnidade(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),1) .toString()));
unidade.setBloco(jTable1.getValueAt(jTable1.getSelectedRow(),2) .toString());
unidade.setAreaComum(Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3) .toString()));
unidade.setAreaPrivativa(Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),4) .toString()));
unidade.setVaga1(jTable1.getValueAt(jTable1.getSelectedRow(),5) .toString());
unidade.setVaga2(jTable1.getValueAt(jTable1.getSelectedRow(),6) .toString());
unidade.setVaga3(jTable1.getValueAt(jTable1.getSelectedRow(),7) .toString());

JDialogUnidadeCadastro dialogo = new JDialogUnidadeCadastro((JFrame)  this.getParent(), true);
dialogo.editar(unidade);

dialogo.setVisible(true);       
formWindowOpened(null);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   UnidadeBO bo = new UnidadeBO();
try { 
DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
modelo.setRowCount(0);
List<Unidade> lista = bo.listar();
for(Unidade unidade : lista) {
modelo.addRow(new Object[] {
unidade.getId(),
unidade.getUnidade(),
unidade.getBloco(),
unidade.getAreaComum(),
unidade.getAreaPrivativa(),
unidade.getVaga1(),
unidade.getVaga2(),
unidade.getVaga3()
 });
}} catch (NegocioException ex) {
if( ex.getCause() == null) {
JOptionPane.showMessageDialog(rootPane,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(rootPane,ex.getCause(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
}
}   
    }//GEN-LAST:event_formWindowOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(jTable1.getSelectedRow() < 0)
{JOptionPane.showMessageDialog(this,"Selecione uma unidade para remover","Aviso",JOptionPane.INFORMATION_MESSAGE);
return;}
int opcao = JOptionPane.showConfirmDialog(this,"Deseja remover a unidade?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
if(opcao == JOptionPane.NO_OPTION)
{return;}

Unidade unidade = new Unidade();
unidade.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));

UnidadeBO bo = new UnidadeBO();
try {bo.excluir(unidade);
formWindowOpened(null);
JOptionPane.showMessageDialog(rootPane,"Conta excluida com sucesso","Informação",JOptionPane.INFORMATION_MESSAGE);
}
catch (NegocioException ex) 
{if(ex.getCause() == null) 
{JOptionPane.showMessageDialog(this,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}
else
{JOptionPane.showMessageDialog(this,ex.getCause() .getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}}
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
JDialogUnidadeCadastro dialogo = new JDialogUnidadeCadastro((JFrame) this.getParent(), true);
dialogo.setVisible(true);       
formWindowOpened(null);
    }//GEN-LAST:event_BtnNovoActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogUnidade dialog = new JDialogUnidade(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
