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
import voceAluga.model.Filial;
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
       String sql = "insert into reserva(dataEntrega,valorReserva,dataRetorno,filialRetorno,idVeiculo,idFilial,idCliente,estadoReserva)"
                + "values(?,?,?,?,?,?,?,'Ativa')";// falta arrumar a questão do idFilial. 
       
       PreparedStatement statement = connection.prepareStatement(sql);
       statement.setDate(1, new Date(reserva.getDataEntrega().getTime()));
       statement.setDouble(2, reserva.getValorReserva());
       statement.setDate(3, new Date(reserva.getDataRetorno().getTime()));
       statement.setString(4, reserva.getFilialRetorno().getNome());
       statement.setInt(5, reserva.getVeiculo().getIdVeiculo());
       statement.setInt(6,reserva.getFilial().getIdFilial());
       statement.setInt(7,reserva.getCliente().getIdCliente());
       statement.execute();
       connection.close();
        
    }
  public void AlterarReserva(Reserva reserva) throws SQLException, Exceptiondao {
       String sql = "Update reserva set filialRetorno=?, dataEntrega=?, dataRetorno=?, valorReserva=?"
               + "where idReserva =?";
       Connection connection = null;
        PreparedStatement statement = null;
       try{
        connection = new conexao().getConnection();
       statement = connection.prepareStatement(sql);
       statement.setString(1, reserva.getFilialRetorno().getNome());
       statement.setDate(2, new Date(reserva.getDataEntrega().getTime()));
       statement.setDate(3, new Date(reserva.getDataRetorno().getTime()));
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
       statement.setInt(1,reserva.getVeiculo().getIdVeiculo());
       statement.execute();
       connection.close();
    
    }
    public void alteraEstado2(Reserva reserva)throws SQLException{
    String sql = "Update veiculo set estadoVeiculo='Disponivel'"
               + "where idveiculo =?";
    PreparedStatement statement = connection.prepareStatement(sql);
       statement.setInt(1,reserva.getVeiculo().getIdVeiculo());   
      statement.execute();
       connection.close();
    
    }
    public void alteraEstadoReserva(Reserva reserva)throws SQLException{
    String sql ="Update reserva set estadoReserva='Inativa'"
               + "where idveiculo =?";
    PreparedStatement statement = connection.prepareStatement(sql);
       statement.setInt(1,reserva.getVeiculo().getIdVeiculo());    
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
                Filial filial = new Filial();
                veiculo.setIdVeiculo(Rs.getInt("idVeiculo"));
                veiculo.setModelo(Rs.getString("modelo"));
                veiculo.setCor(Rs.getString("cor"));
                veiculo.setQtdLugares(Rs.getInt("qtdLugares"));
                veiculo.setFabricante(Rs.getString("fabricante"));
                veiculo.setPlaca(Rs.getString("placa"));
                veiculo.setEstadoVeiculo(Rs.getString("estadoVeiculo"));
                veiculo.setValorDiaria(Rs.getDouble("valorDiaria"));
                filial.setIdFilial(Rs.getInt("idFilial"));
                veiculo.setFilial(filial);
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
                Filial filial = new Filial();
                veiculo.setIdVeiculo(Rs.getInt("idVeiculo"));
                veiculo.setModelo(Rs.getString("modelo"));
                veiculo.setCor(Rs.getString("cor"));
                veiculo.setQtdLugares(Rs.getInt("qtdLugares"));
                veiculo.setFabricante(Rs.getString("fabricante"));
                veiculo.setPlaca(Rs.getString("placa"));
                veiculo.setEstadoVeiculo(Rs.getString("estadoVeiculo"));
                veiculo.setValorDiaria(Rs.getDouble("valorDiaria"));
                filial.setIdFilial(Rs.getInt("idFilial"));
                veiculo.setFilial(filial);
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
                Filial filialRetirada = new Filial();
                Filial filialRetorno = new Filial();
                Veiculo veiculo = new Veiculo();
                Filial filial = new Filial();
                Cliente cliente = new Cliente();
                reserva.setIdReserva(Rs.getInt("idReserva"));
                reserva.setDataEntrega(Rs.getDate("dataEntrega"));
                reserva.setDataRetorno(Rs.getDate("dataRetorno"));
                reserva.setValorReserva(Rs.getFloat("valorReserva"));
                filialRetorno.setNome(Rs.getString("filialRetorno"));
                reserva.setFilialRetorno(filialRetorno);
                reserva.setEstadoReserva(Rs.getString("estadoReserva"));
                veiculo.setIdVeiculo(Rs.getInt("idVeiculo"));
                reserva.setVeiculo(veiculo);
                filial.setIdFilial(Rs.getInt("idFilial"));
                reserva.setFilial(filial);
                cliente.setIdCliente(Rs.getInt("idCliente"));
                reserva.setCliente(cliente);
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
                Filial filial = new Filial();
                cliente.setIdCliente(Rs.getInt("idCliente"));
                cliente.setNome(Rs.getString("nome"));
                cliente.setTelefone(Rs.getString("telefone"));
                cliente.setDataNasc(Rs.getDate("dataNasc"));
                cliente.setNumCartMotorista(Rs.getString("numCartMotorista"));
                cliente.setCpf(Rs.getString("cpf"));
                cliente.setEndereco(Rs.getString("endereco"));
                filial.setIdFilial(Rs.getInt("idFilial"));
                cliente.setFilial(filial);
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
                Filial filial = new Filial();
                cliente.setIdCliente(Rs.getInt("idCliente"));
                cliente.setNome(Rs.getString("nome"));
                cliente.setTelefone(Rs.getString("telefone"));
                cliente.setDataNasc(Rs.getDate("dataNasc"));
                cliente.setNumCartMotorista(Rs.getString("numCartMotorista"));
                cliente.setCpf(Rs.getString("cpf"));
                cliente.setEndereco(Rs.getString("endereco"));
                filial.setIdFilial(Rs.getInt("idFilial"));
                cliente.setFilial(filial);
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
