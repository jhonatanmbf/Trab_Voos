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
    private ControleVooPrincipal viewPrincipal=null;
    private ControleVooBuscar viewBuscar = null;
    

    
    public class ManipuladorInsertButton implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            janelaView = new ControleVooJFrame();
            janelaView.executar();
        }
    }
    
    public class ManipuladorInsere implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
           Passageiro p = janelaView.obtemObjetoPassageiro();
    
           gerenciadorDB.insereBanco(p);
           System.out.println("Inserido no banco de dados");
        }   
    }
    
    public class ManipuladorSearchButton implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ee){
            viewBuscar = new ControleVooBuscar();
            viewBuscar.executarBuscarVoo();
        }
    }
    
    public void executar(){
               
        //Config da viewPrincipal
        viewPrincipal = new ControleVooPrincipal();
        viewPrincipal.executarPrincipal();
        
        //Config da View de Inserir e o BD
        ManipuladorInsertButton mI =new ManipuladorInsertButton();
        viewPrincipal.buttonInsert(mI);
     
        janelaView = new ControleVooJFrame();
        gerenciadorDB=new PassageiroDAO();
        ManipuladorInsere m=new ManipuladorInsere();
        janelaView.adicionaManipuladorEventosInsere(m);
        
        
        //Config da View de Buscar
        ManipuladorSearchButton mS =new ManipuladorSearchButton();
        viewPrincipal.buttonSearch(mS);
    }
    
    
}
