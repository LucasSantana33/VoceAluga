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
import java.util.logging.Level;
import java.util.logging.Logger;
import voceAluga.model.Cliente;
import voceAluga.model.Filial;
import voceAluga.model.Veiculo;
import voceAluga.view.TelaLogin3;


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
       String sql = "insert into veiculo(modelo,cor,qtdLugares,fabricante,placa,estadoVeiculo,valorDiaria,idFilial)"
                + "values(?,?,?,?,?,'Disponivel',?,'1')"; // falta arrumar a questão do idFilial. 
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, veiculo.getModelo());
       statement.setString(2, veiculo.getCor());
       statement.setInt(3,veiculo.getQtdLugares());
       statement.setString(4, veiculo.getFabricante());
       statement.setString(5, veiculo.getPlaca());
       statement.setDouble(6,veiculo.getValorDiaria());
       statement.execute();
       connection.close();
        
    }
}