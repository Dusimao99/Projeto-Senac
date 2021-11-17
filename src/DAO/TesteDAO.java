/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Cliente;
import model.Enderecos;

/**
 *
 * @author eduardo.santos8
 */
public class TesteDAO {
    public static void main(String[] args) {
      
        Cliente clientesTeste = new Cliente();
        clientesTeste.setNome("Joao ");
        clientesTeste.setEmail("joao@gmail.com");
        clientesTeste.setCpf("109.134.678-45");
        clientesTeste.setTelefone("49987658907");
        
         ClienteDAO dao = new ClienteDAO();
        dao.cadastrarCliente(clientesTeste);
        
        
        
        /*Enderecos enderecoTeste = new Enderecos();
        
        enderecoTeste.setCep("88888-88");
        enderecoTeste.setRua("Rua grande");
        enderecoTeste.setNumero(128);
        enderecoTeste.setComplemento("D");
        enderecoTeste.setBairro("CENTRO");
        enderecoTeste.setCidade("Chapeco");
        enderecoTeste.setUF("SC");
        
        EnderecosDAO dao = new EnderecosDAO();
        dao.cadastrarEnderecos(enderecoTeste);*/
    }
}