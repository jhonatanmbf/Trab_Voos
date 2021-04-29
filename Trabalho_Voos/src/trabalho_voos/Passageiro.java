/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_voos;

/**
 *
 * @author Douglas Verly
 */
public class Passageiro {
    
    private String nomePassageiro;
private int cpfPassageiro;
private String codigoVoo;
private Double precoPassagem;
private String codigoCompanhia;
private String nomeCompanhia;
private String mesAnoVoo;
    public Passageiro(String nome,int cpf,String codigovoo,
            Double preco,String codigocompanhia,String nomecompanhia,String mesanovoo){
        
nomePassageiro=nome;
cpfPassageiro=cpf;
codigoVoo=codigovoo;
precoPassagem=preco;
codigoCompanhia=codigocompanhia;
nomeCompanhia=nomecompanhia;
mesAnoVoo=mesanovoo;
        
    }

    /**
     * @return the nomePassageiro
     */
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    /**
     * @return the cpfPassageiro
     */
    public int getCpfPassageiro() {
        return cpfPassageiro;
    }

    /**
     * @return the codigoVoo
     */
    public String getCodigoVoo() {
        return codigoVoo;
    }

    /**
     * @return the precoPassagem
     */
    public Double getPrecoPassagem() {
        return precoPassagem;
    }

    /**
     * @return the codigoCompanhia
     */
    public String getCodigoCompanhia() {
        return codigoCompanhia;
    }

    /**
     * @return the nomeCompanhia
     */
    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    /**
     * @return the mesAnoVoo
     */
    public String getMesAnoVoo() {
        return mesAnoVoo;
    }
    
}
