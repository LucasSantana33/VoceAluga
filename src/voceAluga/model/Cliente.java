/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class Cliente {
    
    private Integer idCliente;
    private String nome;
    private String telefone;
    private String dataNasc;
    private String numCartMotorista;
    private String cpf;
    private String endereco;
    private Filial idFilial;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public Cliente(String nome, String telefone, String dataNasc, String numCartMotorista, String cpf, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.numCartMotorista = numCartMotorista;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idFilial = idFilial;
    }

    
    

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNumCartMotorista() {
        return numCartMotorista;
    }

    public void setNumCartMotorista(String numCartMotorista) {
        this.numCartMotorista = numCartMotorista;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Filial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(Filial idFilial) {
        this.idFilial = idFilial;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    
    
}
