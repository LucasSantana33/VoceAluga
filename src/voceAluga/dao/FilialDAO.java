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
import voceAluga.model.Filial;


/**
 *
 * @author lucas
 */
public class FilialDAO {

 private final Connection connection;
 public FilialDAO(Connection connection){
 
     this.connection = connection;
 }

    public boolean ExisteNoBancoUsuarioESenha(Filial usuario) throws SQLException {
       String sql = " Select * from Filial where login = '"+usuario.getLogin()+"' and senha = '"+usuario.getSenha()+"'";
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.execute();
     ResultSet resultSet = statement.getResultSet();
     return resultSet.next();
    }
}
