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
public class Endereco {
    
    private Integer idEndereco;
    private String rua;
    private String cidade;
    private String complemento;
    private String numero;
    private String UF;
    private String CEP;
    private Filial filial;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
     
}
