package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Enderecos;
import javax.swing.JOptionPane;

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
             final String sql = "insert into tb_enderecos(cep,rua,numero,complemento,bairro,cidade,uf)values(?,?,?,?,?,?,?)";
        PreparedStatement comando = conexao.prepareStatement(sql);
        //Cadaa ponto de interrogação
        comando.setString(1,obj.getCEP());
        comando.setString(2,obj.getRua());
        comando.setInt(3,obj.getNumero());
        comando.setString(4,obj.getComplemento());
        comando.setString(5,obj.getBairro());
        comando.setString(6,obj.getCidade());
        comando.setString(7,obj.getUf());
        //executar e fechar os comando
        comando.execute();
        comando.close();
        //Dizer que o cadastrio deu certo
        JOptionPane.showMessageDialog(null,"Cadastro de endereço efetudado com sucesso");
        
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
       
    }
    
}
