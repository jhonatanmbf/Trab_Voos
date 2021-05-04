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
public class BuscarP {
   private String nomePassageiro;
   private String codCompanhia;
   
   public BuscarP(String nome,String codcompanhia){
   nomePassageiro=nome;
   codCompanhia=codcompanhia;
   
   }

    /**
     * @return the nomePassageiro
     */
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    /**
     * @return the codCompanhia
     */
    public String getCodCompanhia() {
        return codCompanhia;
    }
    public String toString(){
    return("Nome: "+nomePassageiro+" ||  Cod-Companhia: "+codCompanhia);}
}
