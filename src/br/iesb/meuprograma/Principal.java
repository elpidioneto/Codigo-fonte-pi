package br.iesb.meuprograma;

import br.iesb.meuprograma.apresentacao.JDialogLogin;
import br.iesb.meuprograma.apresentacao.JFramePrincipal;
import java.awt.EventQueue;
import java.awt.Frame;

public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogLogin dialog = new JDialogLogin(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
                
            }
        });
    }
}
