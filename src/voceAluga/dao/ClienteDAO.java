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
import voceAluga.view.TelaLogin3;


/**
 *
 * @author lucas
 */
public class ClienteDAO {

 private final Connection connection;
 public ClienteDAO(Connection connection){
 
     this.connection = connection;
 }

    public void insert(Cliente cliente) throws SQLException {
       String sql = "insert into cliente(nome,telefone,dataNasc,numCartMotorista,cpf,endereco,idFilial)"
                + "values(?,?,?,?,?,?,?)";// falta arrumar a questão do idFilial. 
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1, cliente.getNome());
       statement.setString(2, cliente.getTelefone());
       statement.setString(3,cliente.getDataNasc());
       statement.setString(4, cliente.getNumCartMotorista());
       statement.setString(5, cliente.getCpf());
       statement.setString(6,cliente.getEndereco());
       statement.setInt(7,cliente.getIdFilial());
       statement.execute();
       connection.close();
        
    }
}