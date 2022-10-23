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
public class Funcionario {
    
    private Integer idFuncionario;
    private String matricula;
    private String nome;
    private Integer cpf;
    private String login;
    private String senha;
    private Endereco endereco;
    private Filial filial;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    
}
