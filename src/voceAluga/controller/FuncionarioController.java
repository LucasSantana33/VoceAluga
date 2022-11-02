/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.controller;
package voceAluga.model;
import java.util.ArrayList;
import voceAluga.model.Endereco;
import voceAluga.model.Filial;
import voceAluga.model.Reserva;
/**
 *
 * @author lucas
 */
public class FuncionarioController {
    
    public boolean cadastrarFuncionario(String matricula,String nome,Integer cpf,
            String login,String senha,Endereco endereco,Filial filial,ArrayList<Reserva> reservas){
            
            if(matricula != null && nome != null && cpf.length() > 0 && login != null 
                    senha!=null && endereco != null){}
            return true;
    }
    
}
