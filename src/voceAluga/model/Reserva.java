/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.sql.Connection;
import java.sql.Date;
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
    private String dataEntrega;
    private Float valorReserva;
    private String dataRetorno;
    private String filialRetorno;
    private int idVeiculo;
    private int idFilial;
    private int idCliente;

    public Reserva(String dataEntrega, Float valorReserva, String dataRetorno, String filialRetorno, int idFilial) {
        this.dataEntrega = dataEntrega;
        this.valorReserva = valorReserva;
        this.dataRetorno = dataRetorno;
        this.filialRetorno = filialRetorno;
        this.idFilial = idFilial;
    }

    public Reserva() {
        
    }
    
    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Float getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(Float valorReserva) {
        this.valorReserva = valorReserva;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getFilialRetorno() {
        return filialRetorno;
    }

    public void setFilialRetorno(String filialRetorno) {
        this.filialRetorno = filialRetorno;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public  ArrayList<Reserva> listarReservas(String nome)throws Exceptiondao, SQLException{
        Connection conexao = new conexao().getConnection();
        return new ReservaDAO(conexao).listarReservas(nome);
    
    }
}
