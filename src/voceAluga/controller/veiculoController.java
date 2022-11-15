package voceAluga.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import voceAluga.dao.FilialDAO;
import voceAluga.dao.VeiculoDAO;
import voceAluga.dao.conexao;
import voceAluga.model.Filial;
import voceAluga.model.Veiculo;
import voceAluga.view.TelaCadastroVeiculo;
import voceAluga.view.TelaLogin3;
import voceAluga.view.TelaPrincipalGerente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class veiculoController {
    private TelaLogin3 view2;
    private TelaCadastroVeiculo view1;
    public veiculoController(TelaCadastroVeiculo view1) {
        this.view1 = view1;
    }
    public veiculoController(TelaLogin3 view2) {
        this.view2 = view2;
    }
    public void insere() throws SQLException {
        String modelo = view1.getjTextFieldModelo().getText();
        String cor = view1.getjTextFieldCor().getText();
        int qtdLugares = Integer.parseInt(view1.getjTextFieldqtdLugares().getText());
        String fabricante = view1.getjTextFieldFabricante().getText();
        String placa = view1.getjTextFieldPlaca().getText();
        Filial idFilial =null;
        double valorDiaria = Double.parseDouble(view1.getjTextFieldValorDiaria().getText()) ;
        Veiculo veiculoInsert = new Veiculo(modelo,cor,qtdLugares,fabricante,placa,idFilial,valorDiaria);
        // verificar se existe no Banco de dados
        try{
        Connection conexao = new conexao().getConnection();
        VeiculoDAO veiculoDao = new VeiculoDAO(conexao);
        veiculoDao.insert(veiculoInsert);
        JOptionPane.showMessageDialog(null,"Veiculo Cadastrado com sucesso!!!");
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar veiculo!!!");
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    public void updateid() throws SQLException{
        TelaLogin3 telalogin = new TelaLogin3();
        String usuario2 = telalogin.getjTextFieldUsuario().getText();
        String senha2 = telalogin.getjPasswordFieldSenha().getText(); //"admin";
        Filial usuarioAutenticado = new Filial(usuario2,senha2);
        // verificar se existe no Banco de dados
        try{    
        Connection conexao = new conexao().getConnection();
        FilialDAO filialDao = new FilialDAO(conexao);
        filialDao.updateid(usuarioAutenticado);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar veiculo " +usuario2+ " "+senha2+"!!!");
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    }