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
import voceAluga.view.TelaLogin;
import voceAluga.view.TelaPrincipal;
 
/**
 *
 * @author lucas
 */
public class loginController {
    private TelaLogin view;
    static int id_filial=0;
    
    public loginController(TelaLogin view) {
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
        id_filial = filialDao.pegaid(usuarioAutenticar);
        if (existe){
         TelaPrincipal telaMenu = new TelaPrincipal();
        telaMenu.setVisible(true);
        view.dispose();
        }else{
            JOptionPane.showMessageDialog(view,"Usuario ou senha invalidos","ERRO!!!!",2);
        
        }
    }
}
