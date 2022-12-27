/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import voceAluga.model.Cliente;
import voceAluga.model.Reserva;
import voceAluga.model.Veiculo;

/**
 *
 * @author lucas
 */
public class ReservaDAO {
    private final Connection connection;
 public ReservaDAO(Connection connection){
 
     this.connection = connection;
 }
 public void insert(Reserva reserva) throws SQLException {
       String sql = "insert into reserva(dataEntrega,valorReserva,dataRetorno,filialRetorno,idVeiculo,idFilial,idCliente,estReserva)"
                + "values(?,?,?,?,?,?,?,'Ativa')";// falta arrumar a questão do idFilial. 
       
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setString(1,reserva.getDataEntrega());
       statement.setDouble(2, reserva.getValorReserva());
       statement.setString(3,reserva.getDataRetorno());
       statement.setString(4, reserva.getFilialRetorno());
       statement.setInt(5, reserva.getIdVeiculo());
       statement.setInt(6,reserva.getIdFilial());
       statement.setInt(7,reserva.getIdCliente());
       statement.execute();
       connection.close();
        
    }
  public void AlterarReserva(Reserva reserva) throws SQLException, Exceptiondao {
       String sql = "Update reserva set filialRetorno=?,dataEntrega=?,dataRetorno=?,valorReserva=?"
               + "where idReserva =?";
       Connection connection = null;
        PreparedStatement statement = null;
       try{
        connection = new conexao().getConnection();
       statement = connection.prepareStatement(sql);
       statement.setString(1, reserva.getFilialRetorno());
       statement.setString(2, reserva.getDataEntrega());
       statement.setString(3, reserva.getDataRetorno());
       statement.setDouble(4,reserva.getValorReserva());
        statement.setInt(5,reserva.getIdReserva());
       statement.execute();
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao alterar Reserva: " + e);
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
    public void alteraEstado(Reserva reserva)throws SQLException{
    String sql = "Update veiculo set estadoVeiculo='Reservado'"
               + "where idveiculo =?";
    PreparedStatement statement = connection.prepareStatement(sql);
       statement.setInt(1,reserva.getIdVeiculo());
       statement.execute();
       connection.close();
    
    }
    public void alteraEstado2(Reserva reserva)throws SQLException{
    String sql = "Update veiculo set estadoVeiculo='Disponivel'"
               + "where idveiculo =?";
    PreparedStatement statement = connection.prepareStatement(sql);
       statement.setInt(1,reserva.getIdVeiculo());   
      statement.execute();
       connection.close();
    
    }
    public void alteraEstadoReserva(Reserva reserva)throws SQLException{
    String sql ="Update reserva set estReserva='Inativa'"
               + "where idveiculo =?";
    PreparedStatement statement = connection.prepareStatement(sql);
       statement.setInt(1,reserva.getIdVeiculo());    
       statement.execute();
       connection.close();
    
    }
    public ArrayList<Veiculo> selecionarVeiculosReserva(Integer idVeiculo)throws SQLException, Exceptiondao{
        String sql = "select * from veiculo where idVeiculo='"+idVeiculo+"'";
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
    
 public ArrayList<Veiculo> selecionarVeiculos(String nome)throws SQLException, Exceptiondao{
        String sql = "select * from veiculo where estadoVeiculo = 'Disponivel' and  modelo like '"+ nome +"%' order by modelo";
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
     public ArrayList<Reserva> listarReservas(String nome)throws SQLException, Exceptiondao{
        String sql = "select a.* from reserva a left join cliente b\n" +
"on a.idCliente = b.idCliente where b.nome like '"+ nome +"%' order by nome";
        Connection connection = null;
        PreparedStatement statement = null;
        ArrayList<Reserva> reservas = null;
        try{
        connection = new conexao().getConnection();
        statement = connection.prepareStatement(sql);
        ResultSet Rs = statement.executeQuery(sql);
        if (Rs!=null){
            reservas = new ArrayList<Reserva>();
            while(Rs.next()){
                Reserva reserva = new Reserva();
                reserva.setIdReserva(Rs.getInt("idReserva"));
                reserva.setDataEntrega(Rs.getString("dataEntrega"));
                reserva.setValorReserva(Rs.getFloat("valorReserva"));
                reserva.setDataRetorno(Rs.getString("dataRetorno"));
                reserva.setFilialRetorno(Rs.getString("FilialRetorno"));
                reserva.setIdVeiculo(Rs.getInt("idVeiculo"));
                reserva.setIdFilial(Rs.getInt("idFilial"));
                reserva.setIdCliente(Rs.getInt("idCliente"));
                reserva.setEstReserva(Rs.getString("estReserva"));
                reservas.add(reserva);
                
                
            }
        
        }
        }catch(SQLException e){
            throw new Exceptiondao("Erro ao consultar Reservas: " + e);
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
        return reservas;
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
            throw new Exceptiondao("Erro ao consultar Clientes: " + e);
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
    public ArrayList<Cliente> listarClientesReserva(Integer idCliente)throws SQLException, Exceptiondao{
        String sql = "select * from cliente where idCliente ='"+idCliente+"'";
        Connection connection = null;
        PreparedStatement statement = null;
        ArrayList<Cliente> clientes = null;
        try{
        connection = new conexao().getConnection();
        statement = connection.prepareStatement(sql);
        //statement.setInt(1,idCliente); 
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
            throw new Exceptiondao("Erro ao consultar Clientes: " + e);
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
}
