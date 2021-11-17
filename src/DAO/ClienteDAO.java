/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import model.Enderecos;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;
import model.Cliente;
import projetointegrador.jbcd.ConnectionFactory;
/**
 *
 * @author eduardo.santos8
 */
public class ClienteDAO {
    private Connection conexao;
    public ClienteDAO() {
        //Garante conexao com o BD
        this.conexao = ConnectionFactory.getConnection();}
    public void cadastrarCliente(Cliente obj ){
        try {
            String sql = "insert into tb_clientes(nome,email,cpf,telefone)values(?,?,?,?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1,obj.getNome());
            comando.setString(2,obj.getEmail());
            comando.setString(3,obj.getCpf());
            comando.setString(4,obj.getTelefone());
            
            comando.execute();
            comando.close();
            
            
            sql = "select id from tb_clientes where=?";
            comando = conexao.prepareStatement(sql);
            comando.setString(1,obj.getCpf());
            
            ResultSet resultado = comando.executeQuery();
            
            while(resultado.next()){
            obj.setId(resultado.getInt("id"));
            }
            
            JOptionPane.showMessageDialog(null,"Cadastro de endereço efetudado com sucesso");
            
            
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
   
    
    
    
    
    }
}
