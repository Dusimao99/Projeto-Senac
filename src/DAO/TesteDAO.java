/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Enderecos;

/**
 *
 * @author eduardo.santos8
 */
public class TesteDAO {
    public static void main(String[] args) {
        Enderecos enderecoTeste = new Enderecos();
        
        enderecoTeste.setCEP("88888-88");
        enderecoTeste.setRua("Rua grande");
        enderecoTeste.setNumero(128);
        enderecoTeste.setComplemento("D");
        enderecoTeste.setBairro("CENTRO");
        enderecoTeste.setCidade("Chapeco");
        enderecoTeste.setUf("SC");
        
        EnderecosDAO dao = new EnderecosDAO();
        dao.cadastrarEnderecos(enderecoTeste);
    }
}
