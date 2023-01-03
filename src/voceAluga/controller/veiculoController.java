package voceAluga.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static voceAluga.controller.loginController.id_filial;
import voceAluga.dao.Exceptiondao;
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
    private TelaCadastroVeiculo view1;
    public veiculoController(TelaCadastroVeiculo view1) {
        this.view1 = view1;
    }

    public veiculoController() {
    }
    public boolean insere(String modelo, String cor, int qtdLugares,
        String fabricante, String placa, double valorDiaria) throws
        SQLException {
        
        int idFilial =id_filial;
        
        if (modelo != null && modelo.length() > 0 && cor != null &&
            cor.length() > 0 && qtdLugares > 0 && fabricante != null &&
            fabricante.length() > 0 && placa != null && placa.length() > 0 &&
            valorDiaria > 0) {
            
            Veiculo veiculoInsert = new Veiculo(modelo,cor,qtdLugares,fabricante,placa,idFilial,valorDiaria);
            
            try{
                Connection conexao = new conexao().getConnection();
                VeiculoDAO veiculoDao = new VeiculoDAO(conexao);
                veiculoDao.insert(veiculoInsert);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    }
    
    public ArrayList<Veiculo> listarVeiculos(String nome)throws Exceptiondao, SQLException{
        return new Veiculo().listarVeiculos(nome);
    }
    
    public boolean alterarVeiculo(int idVeiculo, String modelo, String cor,
        int qtdLugares, String fabricante, String placa, double valorDiaria)
        throws SQLException, Exceptiondao {
        
        int idFilial =id_filial;
        
        if (idVeiculo > 0 && modelo != null && modelo.length() > 0 &&
            cor != null && cor.length() > 0 && qtdLugares > 0 &&
            fabricante != null && fabricante.length() > 0 && placa != null &&
            placa.length() > 0 && valorDiaria > 0) {
        
            Veiculo veiculo = new Veiculo(modelo,cor,qtdLugares,fabricante,placa,idFilial,valorDiaria);
        
            try {
                Connection conexao = new conexao().getConnection();
                VeiculoDAO veiculoDao = new VeiculoDAO(conexao);
                veiculo.setIdVeiculo(idVeiculo);
                veiculoDao.AlterarVeiculo(veiculo);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    
    }
    
     public void deletarVeiculo(int idVeiculo) throws SQLException, Exceptiondao {
        Veiculo veiculo = new Veiculo();
        // verificar se existe no Banco de dados
        try{
        Connection conexao = new conexao().getConnection();
        VeiculoDAO veiculoDao = new VeiculoDAO(conexao);
        veiculo.setIdVeiculo(idVeiculo);
        veiculoDao.DeletarVeiculo(veiculo);
        JOptionPane.showMessageDialog(null,"Veiculo deletado com sucesso!!!");
        //JOptionPane.showMessageDialog(null,id_filial);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar veiculo!!!");
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
    /* public  boolean alterarVeiculo(int idVeiculo,String modelo, String cor, Integer qtdLugares, String fabricante, String placa,double valorDiaria)throws Exceptiondao, SQLException{
            if(modelo!=null&& modelo.length()>0 && cor!=null&& cor.length()>0 &&
                    qtdLugares>=0 && fabricante!=null&& fabricante.length()>0 &&
                    placa!=null&& placa.length()>0 && valorDiaria>0){
              Veiculo veiculo = new Veiculo(modelo,cor,qtdLugares,fabricante,placa,valorDiaria);
              veiculo.setIdVeiculo(idVeiculo);
              veiculo.alterarVeiculo(veiculo);
              return true;
           }
            return false;
    }*/
    }