
package voceAluga.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static voceAluga.controller.loginController.id_filial;
import voceAluga.dao.ClienteDAO;
import voceAluga.dao.FilialDAO;
import voceAluga.dao.conexao;
import voceAluga.model.Cliente;
import voceAluga.model.Filial;
import voceAluga.view.TelaCadCliente;
import voceAluga.view.TelaLogin3;
import voceAluga.view.TelaPrincipalGerente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class clienteController {
    private TelaCadCliente view;

    public clienteController(TelaCadCliente view) {
        this.view = view;
    }

    public void insere() throws SQLException {
        // Buscar um Usuário da view
        String nome = view.getjTextFieldNome().getText();
        String cpf = view.getjFormattedTextFieldCpf().getText();
        String dataNasc = view.getjFormattedTextFieldDtNascimento().getText();
        String telefone = view.getjFormattedTextFieldTelefone().getText();
        String numCartMotorista = view.getjFormattedTextFieldCnh().getText();
        String endereco = view.getjTextFieldEndereco().getText();
        int idFilial = id_filial;
        
        Cliente clienteInsert = new Cliente(nome,telefone,dataNasc,numCartMotorista,cpf,endereco,idFilial);
        // verificar se existe no Banco de dados
        try{
        Connection conexao = new conexao().getConnection();
        ClienteDAO clienteDao = new ClienteDAO(conexao);
        clienteDao.insert(clienteInsert);
        JOptionPane.showMessageDialog(null,"Cliente Salvo com sucesso!!!");
        }catch(SQLException ex) {
            Logger.getLogger(TelaLogin3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }
