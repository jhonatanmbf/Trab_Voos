package trab_voos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import trab_voos.Controle.ManipuladorInsere;
import trab_voos.Controle.Manipuladorlistar;


public class Controle {
    private ViewInicialJFrame janelaInicial=null;
    private BuscarPVooJFrame janelaViewBuscar=null;
    private ControleVooJFrame janelaView = null;
    private PassageiroDAO gerenciadorDB = null;
    
    public class ManipuladorInsere implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          
           Passageiro p = janelaView.obtemObjetoPassageiro();
    
           gerenciadorDB.insereBanco(p);
           
        }
    
        
    }
    public class Manipuladorlistar implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<BuscarP> lista = new ArrayList<BuscarP>();
                gerenciadorDB.buscarBanco(lista);
                Iterator<BuscarP> it=lista.iterator();
                while(it.hasNext()){
                BuscarP bp = (BuscarP) it.next();
                janelaViewBuscar.inserirlista(bp);
                
                }
                
            }
          
            
    }
    public class ManipuladorLimpar implements ActionListener{
             @Override
                public void actionPerformed(ActionEvent ae) {
           
                 janelaViewBuscar.acionaLimpar();}            
    }
    public class abirInserir implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
          janelaView.setVisible(true);
        }
    }
    
    public class abrirBuscar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            janelaViewBuscar.setVisible(true);  
        }
    }
    
    public class abrirLucro implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
              }
    }
    
    
    
    public void executar(){
    janelaInicial=new ViewInicialJFrame();    
    janelaViewBuscar= new BuscarPVooJFrame();
    janelaView = new ControleVooJFrame();
    gerenciadorDB=new PassageiroDAO();
    
    //INSERIR BANCO
    ManipuladorInsere m=new ManipuladorInsere();
    janelaView.adicionaManipuladorEventosInsere(m);
    //LISTAR BANCO
    Manipuladorlistar ml =new Manipuladorlistar();
    janelaViewBuscar.listar(ml);
    //LIMPAR LISTA
    ManipuladorLimpar limp=new ManipuladorLimpar();
    janelaViewBuscar.Limpar(limp);
    
    //----------Abrir view Insere-----------------------------
    abirInserir abrir=new abirInserir();
    janelaInicial.abrirInserir(abrir);
    //----------Abrir view Buscar-----------------------------
    abrirBuscar buscar=new abrirBuscar();
    janelaInicial.abrirBuscar(buscar);
    //----------Abrir view Lucro-----------------------------
    abrirLucro lucro=new abrirLucro();
    janelaInicial.abrirBuscar(lucro);
    //--------------------------------------------------------
   janelaInicial.setVisible(true);
    
    
    
    }
   
    
    
}
