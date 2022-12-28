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
import voceAluga.view.TelaLogin3;

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
    public void alterarReserva(int idReserva) throws SQLException, Exceptiondao, ParseException {
        String filialRetorno = view.getjTextFieldFilialRetorno().getText();
        String dataEntrega = view.getjFormattedTextFieldDtEntrega().getText();
        String dataRetorno = view.getjFormattedTextFieldDtRetorno().getText();
        int idFilial =id_filial;
        double valorReserva = Double.parseDouble(view.getjTextFieldValorReserva().getText()) ;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = formato.parse(dataEntrega);
        Date data2 = formato.parse(dataRetorno);
        
        
        
        Reserva reserva = new Reserva(data1,valorReserva,data2,filialRetorno,id_filial);
        // verificar se existe no Banco de dados
        try{
        Connection conexao = (Connection) new conexao().getConnection();
        ReservaDAO reservaDao = new ReservaDAO(conexao);
        reserva.setIdReserva(idReserva);
        reservaDao.AlterarReserva(reserva);
        JOptionPane.showMessageDialog(null,"Locação alterada com sucesso!!!");
        //JOptionPane.showMessageDialog(null,id_filial);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar locação!!!");
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
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
    
    public void insere(int idVeiculo,int idCliente) throws SQLException, ParseException {
        // Buscar um Usuário da view
        
        String filialRetorno = view.getjTextFieldFilialRetorno().getText();
        String dtEntrega = view.getjFormattedTextFieldDtEntrega().getText();
        String dtRetorno = view.getjFormattedTextFieldDtRetorno().getText();
        Float valorReserva = Float.parseFloat(view.getjTextFieldValorReserva().getText());
        int idFilial = id_filial;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = formato.parse(dtEntrega);
        Date data2 = formato.parse(dtRetorno);
        
        Reserva reservaInsert = new Reserva(data1,valorReserva,data2,filialRetorno,idFilial);
        // verificar se existe no Banco de dados
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
        JOptionPane.showMessageDialog(null,"Locação Salvo com sucesso!!!");
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(TelaLogin3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
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
}
