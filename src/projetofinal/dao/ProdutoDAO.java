/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projetofinal.jbcd.ConnectionFactory;
import projetofinal.model.Produto;
public class ProdutoDAO {
    private Connection conexao;

    //Construtor
    public ProdutoDAO() {
        //Fazendo a conexao com o bd
        this.conexao = ConnectionFactory.getConnection();
}
     public void cadastrarProduto(Produto obj) {
        try {
             //comando sql para insirir produto no bd
            String sql = "insert into tb_produtos(nome,descricao,peso,valor,qtd_estoque)"
                    + "values (?,?,?,?,?)";
           //preparando o comando 
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, obj.getNome());
            comando.setString(2, obj.getDescicao());
            comando.setDouble(3, obj.getPeso());
            comando.setDouble(4, obj.getValor());
            comando.setInt(5, obj.getQtd_estoque());

            // executando o comando sql e fechando a conexão
            comando.execute();
            comando.close();
             //Mostrando que o cadastro foi efetuado 
            JOptionPane.showMessageDialog(null, "Cadastro do Produto efetuado com sucesso!");
            
       //MOSTRANDO POSSIVEL ERRO NO COMANDO SQL
       
    } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
     public List<Produto> listarProduto() {
        try {
            //1ºpasso: criar uma lista para armazenar os produtos
            List<Produto> lista = new ArrayList<>(); 
            
            //2º passo: criar o comando sql que seleciona todos os itens da
            //tabela de produtos
            //comando sql para selecionador todos os produtos da tabela produtos
            String sql = "select * from tb_produtos";
            
            //3º passo: preparar o comando colocando na conexao que será
            //utilizada para executá-lo no BD
            PreparedStatement comando = conexao.prepareStatement(sql);
            
            //4º passo: quando usamos JDBC, o resultado de um comando select 
            //precisa ser armazenado em um objeto do tipo ResultSet
            ResultSet rs = comando.executeQuery();
            
            //5º passo: criar um laço de repetição para adicionar os itens do
            //ResultSet na lista criada no primeiro passo.
            while(rs.next()){ //Enquanto(while) conseguir percorrer o próximo (next) item do ResultSet
                //É preciso criar um objeto (obj) do modelo de produtos para 
                //cada item que retorn do ResultSet;
                Produto obj = new Produto();
                
                //Nesse objeto preciso salvar cada atributo dos campos do ResultSet
               
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setDescicao(rs.getString("descricao"));
                obj.setPeso(rs.getDouble("peso"));
                obj.setValor(rs.getDouble("Valor"));
                obj.setQtd_estoque(rs.getInt("Qtd_estoque"));
                
              
                lista.add(obj);       
            }
            //6º passo: após a lista ser criada, agora eu retorno como resultado
            // do meu método a lista pronta.
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     public List<Produto> buscarProduto(String valorDeBusca) {
        try {
            //1º passo: criar uma lista para armazenar os produtos
            List<Produto> lista = new ArrayList<>();

            //2º passo: criar o comando sql que seleciona todos os itens da
            //tabela de produtos
            String sql = "select * from tb_produtos where concat_ws(id,nome,descricao,peso,valor,qtd_estoque) like ?";

            //3º passo: preparar o comando colocando na conexao que será
            //utilizada para executá-lo no BD
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, "%"+ valorDeBusca+ "%");

            //4º passo: quando usamos JDBC, o resultado de um comando select 
            //precisa ser armazenado em um objeto do tipo ResultSet
            ResultSet rs = comando.executeQuery();

            //5º passo: criar um laço de repetição para adicionar os itens do
            //ResultSet na lista criada no primeiro passo.
            while(rs.next()){ //Enquanto(while) conseguir percorrer o próximo (next) item do ResultSet
                //É preciso criar um objeto (obj) do modelo de produtos para 
                //cada item que retorn do ResultSet;
                Produto obj = new Produto();
                
                //Nesse objeto preciso salvar cada atributo dos campos do ResultSet
                //em um atributo do objeto do tipo produto
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setDescicao(rs.getString("descricao"));
                obj.setPeso(rs.getDouble("peso"));
                obj.setValor(rs.getDouble("Valor"));
                obj.setQtd_estoque(rs.getInt("Quantidade"));
                
                //Após todos os atributos serem inserido dentro do objeto
                //preciso adicionar esse objeto na minha lista de enderecos
                lista.add(obj);       
            }
            //6º passo: após a lista ser criada, agora eu retorno como resultado
            // do meu método a lista pronta.
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;}
     }
     public void atualizarProduto(Produto obj){
        try {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar o Produto?", "CONFIRMAÇÃO DE ATUALIZAÇÃO", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == 0) {    
       //comando para atualizar os produtos no bd
            String sql = "update tb_produtos set  nome=?, descricao=?, peso=?, valor=?, qtd_estoque=? where id=?";
                    

            // preparando o comando SQL para o driver
            PreparedStatement comando = conexao.prepareStatement(sql);
            
            comando.setString(1, obj.getNome());
            comando.setString(2, obj.getDescicao());
            comando.setDouble(3, obj.getPeso());
            comando.setDouble(4, obj.getValor());
            comando.setInt(5,obj.getQtd_estoque());
            comando.setInt(6, obj.getId());
            
          

            //executando o comando sql para começar a finalizar a conexao
            comando.execute();
            comando.close();
            
            
            JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");
            }         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }}
     public void deletarProduto(Produto obj){
try {
          int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o cliente?", "CONFIRMAÇÃO DE EXCLUSÃO", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == 0) {
        //2º passo: criar uma string de comando SQL
            String sql = "delete from tb_produtos where id=?;";
                    

            //3º passo: preparar o comando SQL para o driver
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, obj.getId());
            

            //4º passo: executar o comando sql e fechar a conexão
            comando.execute();
            comando.close();
            
          
            //Se chegar aqui mostra a janela de exclusao com sucesso;
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
            }        
        } catch (SQLException e) {
       JOptionPane.showMessageDialog(null, e);
        }
}
}
    
    
    

