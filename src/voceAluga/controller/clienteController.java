
package voceAluga.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static voceAluga.controller.loginController.id_filial;
import voceAluga.dao.ClienteDAO;
import voceAluga.dao.Exceptiondao;
import voceAluga.dao.FilialDAO;
import voceAluga.dao.conexao;
import voceAluga.model.Cliente;
import voceAluga.model.Filial;
import voceAluga.model.Veiculo;
import voceAluga.view.TelaCadastroCliente;
import voceAluga.view.TelaLogin;
import voceAluga.view.TelaPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class clienteController {
    private TelaCadastroCliente view;

    public clienteController(TelaCadastroCliente view) {
        this.view = view;
    }
    public clienteController(){
    
    }

    public boolean insere(String nome, String telefone, String dataNasc,
            String numCartMotorista, String cpf, String endereco) throws
            SQLException, ParseException {
        
        int idFilial = id_filial;
        
        if (nome != null && nome.length() > 0 && validarTelefone(telefone) &&
            validarData(dataNasc) && numCartMotorista != null &&
            numCartMotorista.length() > 0 && validarCPF(cpf) && endereco != null
            && endereco.length() > 0 && idFilial > 0) {
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dataNasc);
        
            Cliente clienteInsert = new Cliente(nome, telefone, data, numCartMotorista, cpf, endereco, idFilial);
        
            try{
                Connection conexao = new conexao().getConnection();
                ClienteDAO clienteDao = new ClienteDAO(conexao);
                clienteDao.insert(clienteInsert);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
        
    }
    
     public ArrayList<Cliente> listarClientes(String nome)throws Exceptiondao, SQLException{
        return new Cliente().listarClientes(nome);
    }
    
    public boolean alterarCliente (int idCliente, String nome, String telefone,
        String dataNasc, String numCartMotorista, String cpf, String endereco)
        throws SQLException, Exceptiondao, ParseException {
        
        int idFilial =id_filial;
        
        if (idCliente > 0 && nome != null && nome.length() > 0 &&
            validarTelefone(telefone) && validarData(dataNasc) &&
            numCartMotorista != null && numCartMotorista.length() > 0 &&
            validarCPF(cpf) && endereco != null && endereco.length() > 0 &&
            idFilial > 0) {
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dataNasc);
        
            Cliente cliente = new Cliente(nome,telefone,data,numCartMotorista,cpf,endereco,idFilial);
        
            try{
                Connection conexao = new conexao().getConnection();
                ClienteDAO clienteDao = new ClienteDAO(conexao);
                cliente.setIdCliente(idCliente);
                clienteDao.AlterarCliente(cliente);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
        
    }
     
     public void deletarCliente(int idCliente) throws SQLException, Exceptiondao {
        Cliente cliente = new Cliente();
        // verificar se existe no Banco de dados
        try{
        Connection conexao = new conexao().getConnection();
        ClienteDAO clienteDao = new ClienteDAO(conexao);
        cliente.setIdCliente(idCliente);
        clienteDao.DeletarCliente(cliente);
        JOptionPane.showMessageDialog(null,"Cliente deletado com sucesso!!!");
        //JOptionPane.showMessageDialog(null,id_filial);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar cliente!!!");
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }

    public boolean validarCPF(String cpf) {
        if (cpf != null && cpf.length() > 0) {
            for(int i = 0; i < cpf.length(); i++) {
                if (! Character.isDigit(cpf.charAt(i)) && i != 3 && i != 7 && i != 11) {
                    return false;     
                }
            }
            return true;
        }
        return false;
    }   
    
    public boolean validarData(String data) {
        if (data != null && data.length() > 0) {
            for(int i = 0; i < data.length(); i++) {
                if (! Character.isDigit(data.charAt(i)) && i != 2 && i != 5) {
                    return false;     
                }
            }
            return true; 
        }
        return false;   
    }

    public boolean validarTelefone(String telefone) {
        if (telefone != null && telefone.length() > 0) {
            for(int i = 0; i < telefone.length(); i++) {
                if (! Character.isDigit(telefone.charAt(i)) && i != 2 && i != 8) {
                    return false;     
                }
            }
            return true;
        }
        return false;
    }
}
