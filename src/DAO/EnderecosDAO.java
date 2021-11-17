package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import model.Enderecos;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;

import projetointegrador.jbcd.ConnectionFactory;
public class EnderecosDAO {
    //Atributos
    private Connection conexao;
    
    //CONSTRUTOR
    public EnderecosDAO() {
        //Garante conexao com o BD
        this.conexao = ConnectionFactory.getConnection();
    }
    //Metodos
    //Metodo para cadastrar os enderecos
    public void cadastrarEnderecos(Enderecos obj ){
        try {
             final String sql = "insert into tb_enderecos(cep,rua,numero,complemento,bairro,cidade,uf, id_cliente)values(?,?,?,?,?,?,?,?)";
        PreparedStatement comando = conexao.prepareStatement(sql);
        //Cadaa ponto de interrogação
        comando.setString(1,obj.getCep());
        comando.setString(2,obj.getRua());
        comando.setInt(3,obj.getNumero());
        comando.setString(4,obj.getComplemento());
        comando.setString(5,obj.getBairro());
        comando.setString(6,obj.getCidade());
        comando.setString(7,obj.getUF());
        comando.setInt(8,obj.getClientes().getId());
        //executar e fechar os comando
        comando.execute();
        comando.close();
        //Dizer que o cadastrio deu certo
        JOptionPane.showMessageDialog(null,"Cadastro de endereço efetudado com sucesso");
        
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
       
    }
  public List<Enderecos> listarEnderecos(){
      try {
          List<Enderecos>lista = new ArrayList<>();
         String sql = "select *from tb_enderecos";
         PreparedStatement comando = conexao.prepareStatement(sql);
         ResultSet rs = comando.executeQuery();
         while(rs.next()){
         Enderecos obj = new Enderecos();
         obj.setId(rs.getInt("id"));
                obj.setCep(rs.getString("cep"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUF(rs.getString("uf"));
                                
                lista.add(obj);
         
         
         
         
         
         
         }
         return lista;
      } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
      return null;
      }
        
  
  } 
}
