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
public class Conenectionfactory {
    public static Connection getConnection(){
    final String url = "jdbc:mysql://localhost:33006/projetointegrador?verifyServerCertificate=false&useSSL=true";
    final String user = "teste";
    final String password = "eduardo12";
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
           //Lançar um erro na tela do usuario quando o programa executar
           
            throw new RuntimeException(e);
        }
    } 
}
