/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eduardo.santos8
 */

public class Enderecos {

    
    private int id;
    private String CEP = "";
    private String rua = "";
    private int numero = 0;
    private String complemento = "";
    private String bairro = "";
    private String cidade = "";
    private String uf ="";
   
    

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
   public String getCEP() {
        return CEP;
}
public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
