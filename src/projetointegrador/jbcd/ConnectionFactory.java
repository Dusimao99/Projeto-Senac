/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.jbcd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author eduardo.santos8
 */
public class ConnectionFactory {
    public static Connection getConnection(){
    final String url = "jdbc:mysql://localhost:3306/Banco?verifyServerCertificate=false&useSSL=true";
    final String user = "teste";
    final String password = "987654";
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
           //Lançar um erro na tela do usuario quando o programa executar
           
            throw new RuntimeException(e);
        }
    } 
}
