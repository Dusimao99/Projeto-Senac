/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.jbcd;

import javax.swing.JOptionPane;


/**
 *
 * @author eduardo.santos8
 */
public class TestaConexao {
    public static void main(String[] args) {
        try {
            ConnectionFactory.getConnection();
            JOptionPane.showMessageDialog(null,"Conexao bem sucedida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
