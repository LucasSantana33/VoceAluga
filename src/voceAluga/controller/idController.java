/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import voceAluga.dao.FilialDAO;
import voceAluga.dao.conexao;
import voceAluga.model.Filial;
import voceAluga.view.TelaCadastroVeiculo;
import voceAluga.view.TelaLogin3;

/**
 *
 * @author lucas
 */
public class idController {
    private TelaLogin3 vasco;
    public idController(TelaLogin3 vasco) {
        this.vasco = vasco;
    }
    
     public void updateid() throws SQLException{
        String usuario2 = vasco.getjTextFieldUsuario().getText();
        String senha2 = vasco.getjPasswordFieldSenha().getText(); //"admin";
        Filial usuarioAutenticado = new Filial(usuario2,senha2);
        // verificar se existe no Banco de dados
        try{    
        Connection conexao = new conexao().getConnection();
        FilialDAO filialDao = new FilialDAO(conexao);
        filialDao.updateid(usuarioAutenticado);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar veiculo!!!");
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
