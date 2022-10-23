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
    private Date dataNasc;
    private String numCartMotorista;
    private Integer cpf;
    private Endereco endereco;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    
}
