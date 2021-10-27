package DAO;
import java.sql.Connection;
import model.Enderecos;
import projetointegrador.jbcd.FabricaConexao;
public class EnderecosDAO {
    //Atributos
    private Connection conexao;
    
    //CONSTRUTOR
    public EnderecosDAO() {
        //Garante conexao com o BD
        this.conexao = FabricaConexao.criaConexao();
    }
    //Metodos
    //Metodo para cadastrar os enderecos
    public void cadastrarEnderecos(Enderecos obj ){
        try {
             final String sql = "insert into tb_enderecos(id,cep,rua,numero,complemento,bairro,cidade,uf)values()";
        } catch (Exception e) {
        }
       
    }
    
}
