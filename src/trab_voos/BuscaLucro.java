/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab_voos;

/**
 *
 * @author Douglas Verly
 */
public class BuscaLucro {
    private String nome_comp;
    private String datavoo;
    private String lucro;
    
    public BuscaLucro(String nome,String dtvoo,String lc){
    nome_comp=nome;
    datavoo=dtvoo;
    lucro=lc;
    }

    /**
     * @return the nome_comp
     */
    public String getNome_comp() {
        return nome_comp;
    }

    /**
     * @return the datavoo
     */
    public String getDatavoo() {
        return datavoo;
    }

    /**
     * @return the lucro
     */
    public String getLucro() {
        return lucro;
    }
    public String toString(){
    return("Nome: "+nome_comp+"     lucro: "+lucro+     "      Data:"+datavoo);}
    
    
    
}
