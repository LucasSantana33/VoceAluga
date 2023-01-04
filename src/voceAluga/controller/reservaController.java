/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.controller;

import com.mysql.jdbc.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static voceAluga.controller.loginController.id_filial;
import voceAluga.dao.ReservaDAO;
import voceAluga.dao.Exceptiondao;
import voceAluga.dao.conexao;
import voceAluga.model.Cliente;
import voceAluga.model.Reserva;
import voceAluga.model.Veiculo;
import voceAluga.view.TelaLocacao;
import voceAluga.view.TelaLogin;

/**
 *
 * @author lucas
 */
public class reservaController {
    private TelaLocacao view;
    public reservaController(TelaLocacao view) {
        this.view = view;
    }
    public reservaController(){
    
    }
    public boolean alterarReserva(int idReserva, String filialRetorno,
        String dataEntrega, String dataRetorno, double valorReserva) throws
        SQLException, Exceptiondao, ParseException {
        
        int idFilial =id_filial;
        
        if (idFilial > 0 && filialRetorno != null && filialRetorno.length() > 0
            && validarData(dataEntrega) && validarData(dataRetorno) &&
            valorReserva > 0) {
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data1 = formato.parse(dataEntrega);
            Date data2 = formato.parse(dataRetorno);
      
            Reserva reserva = new Reserva(data1,valorReserva,data2,filialRetorno,id_filial);
        
            try{
                Connection conexao = (Connection) new conexao().getConnection();
                ReservaDAO reservaDao = new ReservaDAO(conexao);
                reserva.setIdReserva(idReserva);
                reservaDao.AlterarReserva(reserva);
                return true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    
    }
    
    public void alteraEstado(int idVeiculo)throws SQLException{
    try{
            java.sql.Connection conexao = new conexao().getConnection();
        ReservaDAO reservaDao = new ReservaDAO(conexao);
        Reserva reservaAltera = new Reserva();
        Veiculo veiculo = new Veiculo();
        veiculo.setIdVeiculo(idVeiculo);
        reservaAltera.setVeiculo(veiculo);
        reservaDao.alteraEstado(reservaAltera);
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        }
    public void alteraEstado2(int idVeiculo)throws SQLException{
    try{
            java.sql.Connection conexao = new conexao().getConnection();
        ReservaDAO reservaDao = new ReservaDAO(conexao);
        Reserva reservaAltera = new Reserva();
        Veiculo veiculo = new Veiculo();
        veiculo.setIdVeiculo(idVeiculo);
        reservaAltera.setVeiculo(veiculo);
        reservaDao.alteraEstado2(reservaAltera);
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        }
    public void alteraEstadoReserva(int idVeiculo)throws SQLException{
    try{
            java.sql.Connection conexao = new conexao().getConnection();
        ReservaDAO reservaDao = new ReservaDAO(conexao);
        Reserva reservaAltera = new Reserva();
        Veiculo veiculo = new Veiculo();
        veiculo.setIdVeiculo(idVeiculo);
        reservaAltera.setVeiculo(veiculo);
        reservaDao.alteraEstadoReserva(reservaAltera);
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        }
    
    public boolean insere(int idVeiculo, int idCliente, String filialRetorno, 
        String dtEntrega, String dtRetorno, double valorReserva) throws
        SQLException, ParseException {
        
        int idFilial = id_filial;
        
        if (idVeiculo > 0 && idCliente > 0 && filialRetorno != null &&
            filialRetorno.length() > 0 && dtEntrega != null &&
            dtEntrega.length() > 0 && dtRetorno != null &&
            dtRetorno.length() > 0 && valorReserva > 0) {
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data1 = formato.parse(dtEntrega);
            Date data2 = formato.parse(dtRetorno);
        
            Reserva reservaInsert = new Reserva(data1,valorReserva,data2,filialRetorno,idFilial);
        
            try{
                java.sql.Connection conexao = new conexao().getConnection();
                ReservaDAO reservaDao = new ReservaDAO(conexao);
                Veiculo veiculo = new Veiculo();
                veiculo.setIdVeiculo(idVeiculo);
                reservaInsert.setVeiculo(veiculo);
                Cliente cliente = new Cliente();
                cliente.setIdCliente(idCliente);
                reservaInsert.setCliente(cliente);
                reservaDao.insert(reservaInsert);
                return true;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    }
    
    public ArrayList<Reserva> listarReservas(String nome)throws Exceptiondao, SQLException{
        return new Reserva().listarReservas(nome);
    }
     public ArrayList<Veiculo> selecionarVeiculos(String nome)throws Exceptiondao, SQLException{
        return new Veiculo().selecionarVeiculos(nome);
    }
     public ArrayList<Veiculo> selecionarVeiculosReserva(Integer idVeiculo)throws Exceptiondao, SQLException{
        return new Veiculo().selecionarVeiculosReserva(idVeiculo);
    }
     public ArrayList<Cliente> selecionarClientes(String nome)throws Exceptiondao, SQLException{
        return new Cliente().selecionarClientes(nome);
    }
      public ArrayList<Cliente> selecionarClientesReserva(Integer idCliente)throws Exceptiondao, SQLException{
        return new Cliente().selecionarClientesReserva(idCliente);
    }
      
    public boolean validarData(String data) {
        if (data != null && data.length() > 0) {
            for(int i = 0; i < data.length(); i++) {
                if (! Character.isDigit(data.charAt(i)) && i != 2 && i != 5) {
                    return false;     
                }
            }
            return true; 
        }
        return false;   
    }
    
}
