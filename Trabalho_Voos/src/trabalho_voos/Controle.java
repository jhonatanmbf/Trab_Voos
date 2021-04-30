/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_voos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;


public class Controle {
    
    private ControleVooJFrame janelaView = null;
    private PassageiroDAO gerenciadorDB = null;
    
    public class ManipuladorInsere implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          
           Passageiro p = janelaView.obtemObjetoPassageiro();
    
           gerenciadorDB.insereBanco(p);
           
           
           //gerenciadorDB.insereBanco(p);
          
           
        }
        
    }
    
    public void executar(){
    janelaView = new ControleVooJFrame();
    gerenciadorDB=new PassageiroDAO();
    ManipuladorInsere m=new ManipuladorInsere();
    janelaView.adicionaManipuladorEventosInsere(m);
    janelaView.setVisible(true);
    
    }
    
    
}
