/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_voos;

import java.sql.*;

/**
 *
 * @author Douglas Verly
 */
public class PassageiroDAO {
    private Connection conexaoBD;
    
    public PassageiroDAO(){
        try {
           //ALTERAR DADOS PARA CONEXAO COM BANCO 
           
            String servidor ="localhost" ;
            String porta="1521";
            String bd="banco aqui";       
            String user="userdb";
            String password="userdb";
          //----------------------------------------  
            
            
            
            String url="jdbc:oracle:thin:@"+servidor+":"+porta+":"+bd;
            conexaoBD = DriverManager.getConnection(url,user,password);
            
        } catch (SQLException e) {
            System.out.println("Problema na conexão");
        }
    
    }
    
   
    public void insereBanco(Passageiro p){
        try {
           // COLOQUE SQL INSERT INTO... VALUES JÁ ADICIONADOS 
            String sql="COMANDO SQL ... VALUES('"+p.getNomePassageiro()+"',"
                    +p.getCpfPassageiro()+","
                    +p.getCodigoVoo()+","
                    +p.getPrecoPassagem()+","
                    +p.getCodigoCompanhia()+","
                    +p.getNomeCompanhia()+","
                    +p.getMesAnoVoo()+")";
            
            Statement comando = conexaoBD.createStatement();
            comando.executeUpdate(sql);
            
        } catch (SQLException e) {
            System.out.println("Problema na conexão");
        }
    
    
}
}