/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import voceAluga.controller.veiculoController;
import voceAluga.dao.Exceptiondao;
import voceAluga.model.Veiculo;
import static voceAluga.view.TelaCadastroVeiculo.idVeiculo;

/**
 *
 * @author Lucas Silva
 */
public class TelaConsultaVeiculo extends javax.swing.JFrame {

    
    public TelaConsultaVeiculo() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultaVeiculo = new javax.swing.JPanel();
        jLabelConsultaVeiculo = new javax.swing.JLabel();
        jTextFieldTituloVeiculo = new javax.swing.JTextField();
        jButtonConsultarVeiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaVeiculo = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Fechar_Janela(evt);
            }
        });

        jPanelConsultaVeiculo.setBackground(new java.awt.Color(102, 102, 102));

        jLabelConsultaVeiculo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelConsultaVeiculo.setText("Informe o Veículo:");

        jTextFieldTituloVeiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloVeiculo.setToolTipText("Informe o Veículo que deseja consultar !");

        jButtonConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarVeiculo(evt);
            }
        });

        jTableConsultaVeiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableConsultaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDVeiculo", "Modelo", "Cor", "Quantidade De Lugares", "Fabricante", "Placa", "Estado_veiculo", "Valor Diaria", "ID Filial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaVeiculo);

        javax.swing.GroupLayout jPanelConsultaVeiculoLayout = new javax.swing.GroupLayout(jPanelConsultaVeiculo);
        jPanelConsultaVeiculo.setLayout(jPanelConsultaVeiculoLayout);
        jPanelConsultaVeiculoLayout.setHorizontalGroup(
            jPanelConsultaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaVeiculoLayout.createSequentialGroup()
                .addGroup(jPanelConsultaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaVeiculoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultaVeiculoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabelConsultaVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTituloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelConsultaVeiculoLayout.setVerticalGroup(
            jPanelConsultaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaVeiculoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultaVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConsultaVeiculo)
                    .addComponent(jTextFieldTituloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        jLabelTitulo.setText("Consulta De Veículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelConsultaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(247, 247, 247)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConsultaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarVeiculo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarVeiculo
        String nome = jTextFieldTituloVeiculo.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaVeiculo.getModel();
        tableModel.setRowCount(0);
        veiculoController veiculoController = new veiculoController();
        try {
            ArrayList<Veiculo> veiculos = veiculoController.listarVeiculos(nome);
            veiculos.forEach((Veiculo veiculo)->{
                tableModel.addRow(new Object[]{veiculo.getIdVeiculo(),
                                               veiculo.getModelo(),
                                               veiculo.getCor(),
                                               veiculo.getQtdLugares(),
                                               veiculo.getFabricante(),
                                               veiculo.getPlaca(),
                                               veiculo.getEstadoVeiculo(),
                                               veiculo.getValorDiaria(),
                                               veiculo.getFilial().getIdFilial()});
            });    
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsultarVeiculo

    private void Fechar_Janela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Fechar_Janela
        this.dispose();
        TelaCadastroVeiculo cadastroVeiculo= new TelaCadastroVeiculo();
        
        //cadastroVeiculo.setVisible(true);
    }//GEN-LAST:event_Fechar_Janela

    private void jTableConsultaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaVeiculoMouseClicked
        if(evt.getClickCount()==2){
            Integer idVeiculo = (Integer)jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),0);
            String modelo =(String) jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),1);
            String cor = (String) jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),2);
            Integer qtdLugares = (Integer)jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),3);
            String fabricante = (String) jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),4);
            String placa = (String) jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),5);
            double valorDiaria = (double) jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),7);
            TelaCadastroVeiculo cadastroVeiculo= new TelaCadastroVeiculo();
            cadastroVeiculo.buscarVeiculo(idVeiculo, modelo, cor, qtdLugares, fabricante, placa, valorDiaria);
            cadastroVeiculo.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jTableConsultaVeiculoMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaVeiculo().setVisible(true);
            }
        });
    }

    public JTextField getjTextFieldTituloVeiculo() {
        return jTextFieldTituloVeiculo;
    }

    public void setjTextFieldTituloVeiculo(JTextField jTextFieldTituloVeiculo) {
        this.jTextFieldTituloVeiculo = jTextFieldTituloVeiculo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarVeiculo;
    private javax.swing.JLabel jLabelConsultaVeiculo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsultaVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaVeiculo;
    private javax.swing.JTextField jTextFieldTituloVeiculo;
    // End of variables declaration//GEN-END:variables
}
