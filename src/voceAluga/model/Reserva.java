/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import voceAluga.dao.Exceptiondao;
import voceAluga.dao.ReservaDAO;
import voceAluga.dao.conexao;

/**
 *
 * @author lucas
 */
public class Reserva {
    
    private Integer idReserva;
    private Date dataEntrega;
    private Date dataRetorno;
    private double valorReserva;
    private Filial filialRetirada;
    private Filial filialRetorno;
    private String estadoReserva;
    private Veiculo veiculo;
    private Filial filial;
    private Cliente cliente;

    public Reserva(Date dataEntrega, double valorReserva, Date dataRetorno, String nomeFilialRetorno, int idFilial) {
        this.dataEntrega = dataEntrega;
        this.valorReserva = valorReserva;
        this.dataRetorno = dataRetorno;
        Filial filialRetirada = new Filial();
        filialRetirada.setIdFilial(idFilial);
        this.filialRetirada = filialRetirada;
        Filial filialRetorno = new Filial();
        filialRetorno.setNome(nomeFilialRetorno);
        this.filialRetorno = filialRetorno;
        Filial filial = new Filial();
        filial.setIdFilial(idFilial);
        this.filial = filial;
    }

    public Reserva() {
        
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

    public Filial getFilialRetirada() {
        return filialRetirada;
    }

    public void setFilialRetirada(Filial filialRetirada) {
        this.filialRetirada = filialRetirada;
    }

    public Filial getFilialRetorno() {
        return filialRetorno;
    }

    public void setFilialRetorno(Filial filialRetorno) {
        this.filialRetorno = filialRetorno;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    public  ArrayList<Reserva> listarReservas(String nome)throws Exceptiondao, SQLException{
        Connection conexao = new conexao().getConnection();
        return new ReservaDAO(conexao).listarReservas(nome);
    
    }
}
