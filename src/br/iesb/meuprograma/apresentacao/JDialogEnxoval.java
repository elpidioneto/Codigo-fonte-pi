package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Enxoval;
import br.iesb.meuprograma.negocio.EnxovalBO;
import br.iesb.meuprograma.negocio.NegocioException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialogEnxoval extends javax.swing.JDialog {

    public JDialogEnxoval(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        BtnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cadastro de Enxoval para Espaços Comuns");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Id Espaço", "Nome", "Valor Unitário", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addGap(96, 96, 96)
                        .addComponent(BtnNovo)
                        .addGap(83, 83, 83)
                        .addComponent(btnExcluir)
                        .addGap(129, 129, 129)
                        .addComponent(btnVoltar)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAlterar)
                    .addComponent(BtnNovo)
                    .addComponent(btnExcluir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
     dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
if(jTable1.getSelectedRow() < 0)
{JOptionPane.showMessageDialog(this,"Selecione uma enxoval para editar","Aviso",JOptionPane.INFORMATION_MESSAGE);
return;}
int opcao = JOptionPane.showConfirmDialog(this,"Deseja editar a enxoval?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
if(opcao == JOptionPane.NO_OPTION)
{return;}

Enxoval enxoval = new Enxoval();
enxoval.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));
enxoval.setEspacoId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),1) .toString()));
enxoval.setNome(jTable1.getValueAt(jTable1.getSelectedRow(),2) .toString());
enxoval.setValor(Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3) .toString())); 
enxoval.setQuantidade(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),4) .toString()));

JDialogEnxovalCadastro dialogo = new JDialogEnxovalCadastro((JFrame)  this.getParent(), true);
dialogo.editar(enxoval);

dialogo.setVisible(true);       
formWindowOpened(null);
      
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        JDialogEnxovalCadastro dialogo = new JDialogEnxovalCadastro((JFrame) this.getParent(), true);
        dialogo.setVisible(true);
        formWindowOpened(null);
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(jTable1.getSelectedRow() < 0)
        {JOptionPane.showMessageDialog(this,"Selecione uma Enxoval para remover","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;}
        int opcao = JOptionPane.showConfirmDialog(this,"Deseja remover o Enxoval?","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        if(opcao == JOptionPane.NO_OPTION)
        {return;}

        Enxoval enxoval = new Enxoval();
        enxoval.setId(Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0) .toString()));

        EnxovalBO bo = new EnxovalBO();
        try {bo.excluir(enxoval);
            formWindowOpened(null);
            JOptionPane.showMessageDialog(rootPane,"Conta excluida com sucesso","Informação",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NegocioException ex)
        {if(ex.getCause() == null)
            {JOptionPane.showMessageDialog(this,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}
            else
            {JOptionPane.showMessageDialog(this,ex.getCause() .getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}}
    }//GEN-LAST:event_btnExcluirActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogEnxoval dialog = new JDialogEnxoval(new javax.swing.JFrame(), true);
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
    
    private void formWindowOpened(Object object) {
        
   EnxovalBO bo = new EnxovalBO();
try { 
DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
modelo.setRowCount(0);
List<Enxoval> lista = bo.listar();
for(Enxoval enxoval : lista) {
modelo.addRow(new Object[] {
enxoval.getId(),
enxoval.getEspacoId(),
enxoval.getNome(),
enxoval.getValor(),
enxoval.getQuantidade()
 });
}} catch (NegocioException ex) {
if( ex.getCause() == null) {
JOptionPane.showMessageDialog(rootPane,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(rootPane,ex.getCause(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
}
} 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
