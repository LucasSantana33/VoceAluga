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
    private EstadoVeiculo estadoVeiculo;
    private Filial filial;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    
}
