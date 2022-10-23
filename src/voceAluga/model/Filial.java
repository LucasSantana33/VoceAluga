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
public class Filial {
    
    private Integer idFilial;
    private Integer cnpj;
    private String nome;
    private Endereco endereco;
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    
}
