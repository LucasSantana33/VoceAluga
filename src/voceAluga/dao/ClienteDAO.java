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
                + "values('"+cliente.getNome()+"','"+cliente.getTelefone()+"','"+cliente.getDataNasc()+"','"+cliente.getNumCartMotorista()+"',"
               + "'"+cliente.getCpf()+"','"+cliente.getEndereco()+"','1')"; 
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.execute();
       connection.close();
        
    }
}