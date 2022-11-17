/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.dao;

import java.sql.PreparedStatement;
import voceAluga.model.Filial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import voceAluga.model.Cliente;
import voceAluga.model.Filial;
import voceAluga.model.Veiculo;
import voceAluga.view.TelaLogin3;
import voceAluga.dao.FilialDAO;
import voceAluga.dao.Exceptiondao;
import voceAluga.controller.loginController;
//import static voceAluga.controller.loginController.id_filial;

/**
 *
 * @author lucas
 */
public class VeiculoDAO{
 private final Connection connection;
 public VeiculoDAO(Connection connection){
 
     this.connection = connection;
 }
    public void insert(Veiculo veiculo) throws SQLException {
        //int idFilial = filialDao.pegaid(usuarioAutenticar);
       String sql = "insert into veiculo(modelo,cor,qtdLugares,fabricante,placa,estadoVeiculo,valorDiaria,idFilial)"
                + "values(?,?,?,?,?,'Disponivel',?,?)"; // falta arrumar a questão do idFilial. 
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, veiculo.getModelo());
       statement.setString(2, veiculo.getCor());
       statement.setInt(3,veiculo.getQtdLugares());
       statement.setString(4, veiculo.getFabricante());
       statement.setString(5, veiculo.getPlaca());
       statement.setDouble(6,veiculo.getValorDiaria());
       statement.setInt(7,veiculo.getIdFilial());
       
       //statement.setString(7,"Select idFilial from Filial where login = '"+usuario.getLogin()+"'");
       statement.execute();
       connection.close();
        
    }
    
    public ArrayList<Veiculo> listarVeiculos(String nome)throws SQLException, Exceptiondao{
        String sql = "select * from veiculo where modelo like '"+ nome +"%' order by modelo";
        Connection connection = null;
        PreparedStatement statement = null;
        ArrayList<Veiculo> veiculos = null;
        try{
        connection = new conexao().getConnection();
        statement = connection.prepareStatement(sql);
        ResultSet Rs = statement.executeQuery(sql);
        if (Rs!=null){
            veiculos = new ArrayList<Veiculo>();
            while(Rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setIdVeiculo(Rs.getInt("idVeiculo"));
                veiculo.setModelo(Rs.getString("modelo"));
                veiculo.setCor(Rs.getString("cor"));
                veiculo.setQtdLugares(Rs.getInt("qtdLugares"));
                veiculo.setFabricante(Rs.getString("fabricante"));
                veiculo.setPlaca(Rs.getString("placa"));
                veiculo.setEstadoVeiculo(Rs.getString("estadoVeiculo"));
                veiculo.setValorDiaria(Rs.getDouble("valorDiaria"));
                veiculo.setIdFilial(Rs.getInt("idFilial"));
                veiculos.add(veiculo);
                
                
            }
        
        }
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao consultar Veiculos: " + e);
        }finally{
           try{
            if(statement!=null){statement.close();}
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao fechar statement: " + e);
        }
           try{
            if(connection!=null){connection.close();}
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao fechar conexão: " + e);
        }
        }
        return veiculos;
    }
    
}