/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.dao;

import projetofinal.model.Produto;
import projetofinal.model.Enderecos;

/**
 *
 * @author eduardo.santos8
 */
public class TesteDAO {
    //TESTANDO O CADASTRO DO PRODUTO
    public static void main(String[] args) {
      
        Produto produtoTeste = new Produto();
        produtoTeste.setNome("Mouse Grande");
        produtoTeste.setDescicao("Mouse razer gamer");
        produtoTeste.setPeso(15);
        produtoTeste.setValor(500);
        produtoTeste.setQtd_estoque(25);
        
         ProdutoDAO dao = new ProdutoDAO();
        dao.cadastrarProduto(produtoTeste);
        
        
        
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