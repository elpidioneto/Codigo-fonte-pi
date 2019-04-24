
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.entidades.Enxoval;
import br.iesb.meuprograma.negocio.EnxovalBO;
import br.iesb.meuprograma.negocio.NegocioException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class JDialogEnxovalCadastro extends javax.swing.JDialog {

 
    public JDialogEnxovalCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnDesistir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEspacoId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Enxoval Espaço.");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDesistir.setText("Desistir");
        btnDesistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesistirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel9.setText("Valor Unitário (R$)");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel13.setText("Quantidade");

        jLabel3.setText("Id do Espaço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel4)
                .addGap(146, 146, 146)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEspacoId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(38, 38, 38)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(65, 65, 65)
                .addComponent(btnDesistir)
                .addGap(255, 255, 255))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel9))
                    .addContainerGap(650, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtEspacoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesistir)
                    .addComponent(btnSalvar))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel1)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel9)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesistirActionPerformed
     dispose();
    }//GEN-LAST:event_btnDesistirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         
        enxoval.setNome(txtNome.getText());
        enxoval.setEspacoId(parseInt(txtEspacoId.getText()));
        enxoval.setQuantidade(parseInt(txtQuantidade.getText()));
        enxoval.setValor(parseDouble(txtValor.getText()));
        
        EnxovalBO bo = new EnxovalBO();
try { 
if (enxoval.getId() == 0) 
{bo.inserir(enxoval);}
else
{bo.alterar(enxoval);}
JOptionPane.showMessageDialog(rootPane,"Enxoval inserida com sucesso","Informação",JOptionPane.INFORMATION_MESSAGE);}
catch (NegocioException ex) 
{if(ex.getCause() == null) 
{JOptionPane.showMessageDialog(this,ex.getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}
else
{JOptionPane.showMessageDialog(this,ex.getCause() .getMessage(),"Aviso",JOptionPane.INFORMATION_MESSAGE);}}
 dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogEnxovalCadastro dialog = new JDialogEnxovalCadastro(new javax.swing.JFrame(), true);
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

     private Enxoval enxoval = new Enxoval();

  public void editar(Enxoval entidade){
enxoval = entidade;
txtNome.setText(String.valueOf(enxoval.getNome()));
txtEspacoId.setText(String.valueOf(enxoval.getEspacoId()));
txtValor.setText(String.valueOf(enxoval.getValor()));
txtQuantidade.setText(String.valueOf(enxoval.getQuantidade()));  
  }
  
 /* public void novo(Enxoval entidade, br.iesb.meuprograma.apresentacao.JDialogEspacoCadastro dialogo) {
enxoval = entidade;
        JDialogEspacoCadastro espaco = new JDialog();
txtNome.setText(null);
txtEspacoId.setText(dialogo.txtId.getText());
txtValor.setText(null);
txtQuantidade.setText(null);  
  } */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesistir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEspacoId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
