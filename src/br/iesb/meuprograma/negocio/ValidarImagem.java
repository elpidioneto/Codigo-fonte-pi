/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LENOVO
 */
public class ValidarImagem {
       
    public static BufferedImage validarImagem(int a,File b){
       BufferedImage imagem=null;
        while (true){
        //verifica se a imagem foi aprovada
        if(a == JFileChooser.APPROVE_OPTION){
            if(!b.getName().endsWith(".jpg")){
                JOptionPane.showMessageDialog(null, "Selecione um arquivo no formato JPG");
                break;
            }else{
                try {
                    imagem = ImageIO.read(b);
                } catch (IOException ex) {
                    Logger.getLogger(ValidarImagem.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            JOptionPane.showMessageDialog(null,"Arquivo enviada com sucesso!");
            break;
            }
            }else{
               JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");       
            break;
        }
        }
        return imagem;
       
    }
}
