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
    
    public ArrayList<Cliente> listarClientes(String nome)throws SQLException, Exceptiondao{
        String sql = "select * from cliente where nome like '"+ nome +"%' order by nome";
        Connection connection = null;
        PreparedStatement statement = null;
        ArrayList<Cliente> clientes = null;
        try{
        connection = new conexao().getConnection();
        statement = connection.prepareStatement(sql);
        ResultSet Rs = statement.executeQuery(sql);
        if (Rs!=null){
            clientes = new ArrayList<Cliente>();
            while(Rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(Rs.getInt("idCliente"));
                cliente.setNome(Rs.getString("nome"));
                cliente.setTelefone(Rs.getString("telefone"));
                cliente.setDataNasc(Rs.getString("dataNasc"));
                cliente.setNumCartMotorista(Rs.getString("numCartMotorista"));
                cliente.setCpf(Rs.getString("cpf"));
                cliente.setEndereco(Rs.getString("endereco"));
                cliente.setIdFilial(Rs.getInt("idFilial"));
                clientes.add(cliente);
                
                
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
        return clientes;
    }
    public void AlterarCliente(Cliente cliente) throws SQLException, Exceptiondao {
       String sql = "Update cliente set nome=?,telefone=?,dataNasc=?,numCartMotorista=?"
               + ",cpf=?,endereco=? where idCliente =?";
       Connection connection = null;
        PreparedStatement statement = null;
       try{
        connection = new conexao().getConnection();
       statement = connection.prepareStatement(sql);
       statement.setString(1, cliente.getNome());
       statement.setString(2, cliente.getTelefone());
       statement.setString(3,cliente.getDataNasc());
       statement.setString(4, cliente.getNumCartMotorista());
       statement.setString(5, cliente.getCpf());
       statement.setString(6,cliente.getEndereco());
       statement.setInt(7,cliente.getIdCliente());
       statement.execute();
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao alterar dados do cliente: " + e);
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
    }
    public void DeletarCliente(Cliente cliente) throws SQLException, Exceptiondao {
       String sql = "delete from cliente where idCliente =?";
       Connection connection = null;
        PreparedStatement statement = null;
       try{
        connection = new conexao().getConnection();
        statement = connection.prepareStatement(sql);
       statement.setInt(1,cliente.getIdCliente());
       statement.execute();
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao deletar Cliente: " + e);
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
    }
}