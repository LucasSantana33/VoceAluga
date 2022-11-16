/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.util.ArrayList;

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
    private int idFilial;
    private double valorDiaria;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public Veiculo(String modelo, String cor, Integer qtdLugares, String fabricante, String placa,int idFilial,double valorDiaria) {
        this.modelo = modelo;
        this.cor = cor;
        this.qtdLugares = qtdLugares;
        this.fabricante = fabricante;
        this.placa = placa;
        this.idFilial = idFilial;
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

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
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

    
    
   
   

    
    
}
