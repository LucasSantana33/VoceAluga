package voceAluga.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import voceAluga.dao.VeiculoDAO;
import voceAluga.dao.conexao;
import voceAluga.model.Veiculo;
import voceAluga.view.TelaCadastroVeiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class veiculoController {
    private TelaCadastroVeiculo view;

    public veiculoController(TelaCadastroVeiculo view) {
        this.view = view;
    }

    public void insere() throws SQLException {
        // Buscar um Usuário da view
        String modelo = view.getjTextFieldModelo().getText();
        String cor = view.getjTextFieldCor().getText();
        int qtdLugares = Integer.parseInt(view.getjTextFieldqtdLugares().getText());
        String fabricante = view.getjTextFieldFabricante().getText();
        String placa = view.getjTextFieldPlaca().getText();
        double valorDiaria = Double.parseDouble(view.getjTextFieldValorDiaria().getText()) ;
     
        
        Veiculo veiculoInsert = new Veiculo(modelo,cor,qtdLugares,fabricante,placa,valorDiaria);
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
    }