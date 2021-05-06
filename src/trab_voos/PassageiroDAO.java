/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab_voos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Douglas Verly
 */
public class PassageiroDAO {
    
    
    private BuscaLucroJFrame janelalucro=null;
    private ControleVooJFrame janelaView = null;
    private Connection conexaoBD;
    
    public PassageiroDAO(){
        try {
            //ALTERAR DADOS PARA CONEXAO COM BANCO     
            String user="system";
            String password="userdb";
          
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            conexaoBD = DriverManager.getConnection(url,user,password);
          
           
        } catch (SQLException e) {
            System.out.println("Problema na conexão");
        }
    
    }
    
   
    public void insereBanco(Passageiro p){
        try {
           // COLOQUE SQL INSERT INTO... VALUES JÁ ADICIONADOS 
            String sql="INSERT INTO Passageiro VALUES('"+p.getNomePassageiro()+"',"
                    +p.getCpfPassageiro()+",'"
                    +p.getCodigoVoo()+"',"
                    +p.getPrecoPassagem()+",'"
                    +p.getCodigoCompanhia()+"','"
                    +p.getNomeCompanhia()+"','"
                    +p.getMesAnoVoo()+"')";
            
            Statement comando = conexaoBD.createStatement();
            comando.executeUpdate(sql);
            System.out.println("Salvo com Sucesso!!");
           
            
        } catch (SQLException e) {
            System.out.println("Problema na INSERÇÃO");
        }
    
    
}
    
   public void buscarBanco(ArrayList<BuscarP> lista){

       try {
           String sql="SELECT NOME,CODCOMPANHIA FROM PASSAGEIRO order by nome";
           Statement comando=conexaoBD.createStatement();
           ResultSet resultado=comando.executeQuery(sql);
           while (resultado.next()){
            String nome=resultado.getString(1);
            String codcompanhia=resultado.getString(2);
            BuscarP bp = new BuscarP(nome,codcompanhia);
            lista.add(bp);
           }      
       } catch (Exception e) {
      System.out.println("Erro na Busca"+e);
        }
    }
    
   
   public void lucroBanco(ArrayList<BuscaLucro> lista){
   try{
           String sql="SELECT NOME_COMPANHIA,LUCRO,DATAVOO FROM TB_LUCRO order by NOME_COMPANHIA";
           Statement comando=conexaoBD.createStatement();
           ResultSet resultado=comando.executeQuery(sql);
           while (resultado.next()){
                String nome=resultado.getString(1);
                String lucro=resultado.getString(2);
                String datavoo=resultado.getString(3);

                BuscaLucro bl = new BuscaLucro(nome,datavoo,lucro);
                lista.add(bl);
            }      
        } catch (Exception e) {
           System.out.println("Erro na BuscaLucro"+e);

       }
   
   
   }
   
  
    }
  


  
