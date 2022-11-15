/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import voceAluga.dao.FilialDAO;
import voceAluga.dao.conexao;
import voceAluga.model.Filial;  
import voceAluga.view.TelaLogin3;
import voceAluga.view.TelaPrincipalGerente;

/**
 *
 * @author lucas
 */
public class loginController {
    private TelaLogin3 view;

    public loginController(TelaLogin3 view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        // Buscar um Usuário da view
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Filial usuarioAutenticar = new Filial(usuario,senha);
        // verificar se existe no Banco de dados
        Connection conexao = new conexao().getConnection();
        FilialDAO filialDao = new FilialDAO(conexao);
        //int idFilial = filialDao.pegaid(usuarioAutenticar);
        //filialDao.updateid(usuarioAutenticar);
        boolean existe = filialDao.ExisteNoBancoUsuarioESenha(usuarioAutenticar);
        //System.out.println(idFilial); 
        // se existir direciona para menu
        if (existe){
         TelaPrincipalGerente telaMenu = new TelaPrincipalGerente();
        telaMenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view,"Usuario ou senha invalidos");
        
        }
    }
}
