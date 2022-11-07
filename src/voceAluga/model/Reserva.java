/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.util.Date;

/**
 *
 * @author lucas
 */
public class Reserva {
    
    private Integer idReserva;
    private Date dataEntrega;
    private Float valorDiaria;
    private Date dataRetorno;
    private String filialRetorno;
    private String filialRetirada;
    private Cliente cliente;
    private Filial filial;
    private Veiculo veiculo;
    
}
