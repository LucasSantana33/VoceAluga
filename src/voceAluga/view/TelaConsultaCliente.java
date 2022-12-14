/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import voceAluga.controller.clienteController;
import voceAluga.controller.veiculoController;
import voceAluga.dao.Exceptiondao;
import voceAluga.model.Cliente;
import voceAluga.model.Veiculo;

/**
 *
 * @author Lucas Silva
 */
public class TelaConsultaCliente extends javax.swing.JFrame {

    private TelaCadastroCliente telaCadCliente;
   
    public TelaConsultaCliente() {
        initComponents();
    }

    public TelaConsultaCliente(TelaCadastroCliente telaCadCliente){
        this.telaCadCliente = telaCadCliente;
        initComponents();
    }   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultaCliente = new javax.swing.JPanel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jButtonConsultarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaCliente = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Você Aluga");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Fechar_Janela(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Fechar_Janela(evt);
            }
        });

        jPanelConsultaCliente.setBackground(new java.awt.Color(102, 102, 102));

        jLabelNomeCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCliente.setText("Informe o Nome do Cliente:");

        jTextFieldNomeCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldNomeCliente.setToolTipText("informe o nome do cliente que deseja consultar! ");

        jButtonConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa2.png"))); // NOI18N
        jButtonConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarCliente(evt);
            }
        });

        jTableConsultaCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Nome", "Telefone", "Data de Nascimento", "CNH", "CPF", "Endereço", "Id Filial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaCliente);

        javax.swing.GroupLayout jPanelConsultaClienteLayout = new javax.swing.GroupLayout(jPanelConsultaCliente);
        jPanelConsultaCliente.setLayout(jPanelConsultaClienteLayout);
        jPanelConsultaClienteLayout.setHorizontalGroup(
            jPanelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaClienteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConsultaClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanelConsultaClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNomeCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanelConsultaClienteLayout.setVerticalGroup(
            jPanelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaClienteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConsultarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNomeCliente)
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px.png"))); // NOI18N
        jLabelTitulo.setText("Consulta De Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarCliente
        String nome = jTextFieldNomeCliente.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaCliente.getModel();
        tableModel.setRowCount(0);
        clienteController clienteController = new clienteController();
        try {
            ArrayList<Cliente> clientes = clienteController.listarClientes(nome);
            clientes.forEach((Cliente cliente)->{
                tableModel.addRow(new Object[]{cliente.getIdCliente(),
                                               cliente.getNome(),
                                               cliente.getTelefone(),
                                               cliente.getDataNasc(),
                                               cliente.getNumCartMotorista(),
                                               cliente.getCpf(),
                                               cliente.getEndereco(),
                                               cliente.getFilial().getIdFilial()});
            });    
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsultarCliente

    private void Fechar_Janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Fechar_Janela
        this.dispose();
        this.telaCadCliente.setVisible(true);
    }//GEN-LAST:event_Fechar_Janela

    private void jTableConsultaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaClienteMouseClicked
     if(evt.getClickCount()==2){
            Integer idCliente = (Integer)jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),0);
            String nome =(String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),1);
            String telefone= (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),2);
            Date dataNasc = (Date) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),3);
            String cnh = (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),4);
            String cpf= (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),5);
            String endereco= (String) jTableConsultaCliente.getModel().getValueAt(jTableConsultaCliente.getSelectedRow(),6);
            
            telaCadCliente.buscarCliente(idCliente, nome, telefone, dataNasc, cnh, cpf, endereco);
            telaCadCliente.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTableConsultaClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarCliente;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsultaCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaCliente;
    private javax.swing.JTextField jTextFieldNomeCliente;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextFieldNomeCliente() {
        return jTextFieldNomeCliente;
    }

    public void setjTextFieldNomeCliente(JTextField jTextFieldNomeCliente) {
        this.jTextFieldNomeCliente = jTextFieldNomeCliente;
    }


}
