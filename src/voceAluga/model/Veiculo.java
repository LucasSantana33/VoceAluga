/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import voceAluga.dao.Exceptiondao;
import voceAluga.dao.ReservaDAO;
import voceAluga.dao.VeiculoDAO;
import voceAluga.dao.conexao;

/**
 *
 * @author lucas
 */
public class Veiculo {
    
    private Integer idVeiculo;
    private String modelo;
    private String cor;
    private Integer qtdLugares;
    private String fabricante;
    private String placa;
     private String EstadoVeiculo;
    private Filial filial;
    private double valorDiaria;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    
    public Veiculo(){
    
    }
    public Veiculo(String modelo, String cor, Integer qtdLugares, String fabricante, String placa,int idFilial,double valorDiaria) {
        this.modelo = modelo;
        this.cor = cor;
        this.qtdLugares = qtdLugares;
        this.fabricante = fabricante;
        this.placa = placa;
        Filial filial = new Filial();
        filial.setIdFilial(idFilial);
        this.filial = filial;
        this.valorDiaria = valorDiaria;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(Integer qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstadoVeiculo() {
        return EstadoVeiculo;
    }

    public void setEstadoVeiculo(String EstadoVeiculo) {
        this.EstadoVeiculo = EstadoVeiculo;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

   
    
    public  ArrayList<Veiculo> listarVeiculos(String nome)throws Exceptiondao, SQLException{
        Connection conexao = new conexao().getConnection();
        return new VeiculoDAO(conexao).listarVeiculos(nome);
    
    }
    public  void alterarVeiculo(Veiculo veiculo)throws Exceptiondao, SQLException{
               Connection conexao = new conexao().getConnection();
               new VeiculoDAO(conexao).AlterarVeiculo(veiculo);
           }  
    public  void deletarVeiculo(Veiculo veiculo)throws Exceptiondao, SQLException{
               Connection conexao = new conexao().getConnection();
               new VeiculoDAO(conexao).DeletarVeiculo(veiculo);
           } 
    public  ArrayList<Veiculo> selecionarVeiculos(String nome)throws Exceptiondao, SQLException{
        Connection conexao = new conexao().getConnection();
        return new ReservaDAO(conexao).selecionarVeiculos(nome);
    
    }
    public  ArrayList<Veiculo> selecionarVeiculosReserva(Integer idVeiculo)throws Exceptiondao, SQLException{
        Connection conexao = new conexao().getConnection();
        return new ReservaDAO(conexao).selecionarVeiculosReserva(idVeiculo);
    
    }
}
