/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.view;

import javax.swing.JTextField;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import voceAluga.controller.idController;
import voceAluga.controller.veiculoController;
import voceAluga.dao.Exceptiondao;
import voceAluga.view.TelaLogin3;
import voceAluga.view.TelaConsultaVeiculo;
/**
 *
 * @author Rhuan
 */
public class TelaCadastroVeiculo extends javax.swing.JFrame {
    private final veiculoController controller;
    static  int idVeiculo=0;
    /**
     * Creates new form TelaCadastroVeiculo
     */
    public TelaCadastroVeiculo() {
        initComponents();
        controller = new veiculoController(this);
    }
    public void buscarVeiculo(Integer idVeiculo,String modelo,String cor,Integer qtdLugares,String fabricante,String placa,double valorDiaria){
        this.idVeiculo=idVeiculo;
        this.jTextFieldModelo.setText(modelo);
        this.jTextFieldCor.setText(cor);
        this.jTextFieldqtdLugares.setText(Integer.toString(qtdLugares));
        this.jTextFieldFabricante.setText(fabricante);
        this.jTextFieldPlaca.setText(placa);
        this.jTextFieldValorDiaria.setText(Double.toString(valorDiaria));
        //JOptionPane.showMessageDialog(null,idVeiculo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadstroVeiculo = new javax.swing.JPanel();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        jLabelqtdLugares = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jTextFieldqtdLugares = new javax.swing.JTextField();
        jTextFieldFabricante = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jLabelValorDiaria = new javax.swing.JLabel();
        jTextFieldValorDiaria = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Veiculo");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro De Veículo");

        jPanelCadstroVeiculo.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadstroVeiculo.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelModelo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelModelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModelo.setText("Modelo:");

        jTextFieldModelo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldModelo.setToolTipText("Informe o modelo");

        jLabelCor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCor.setText("Cor:");

        jLabelqtdLugares.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelqtdLugares.setForeground(new java.awt.Color(255, 255, 255));
        jLabelqtdLugares.setText("Quantidade de Lugares:");

        jLabelFabricante.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelFabricante.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFabricante.setText("Fabricante:");

        jLabelPlaca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPlaca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlaca.setText("Placa:");

        jTextFieldCor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldCor.setToolTipText("Informe a Cor");

        jTextFieldqtdLugares.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldqtdLugares.setToolTipText("Informe a quantidade de lugares");

        jTextFieldFabricante.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldFabricante.setToolTipText("Informe o Fabricante");

        jTextFieldPlaca.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldPlaca.setToolTipText("Informe a placa");

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabelValorDiaria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelValorDiaria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorDiaria.setText("Valor da diária:");

        jTextFieldValorDiaria.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButtonExcluir.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadstroVeiculoLayout = new javax.swing.GroupLayout(jPanelCadstroVeiculo);
        jPanelCadstroVeiculo.setLayout(jPanelCadstroVeiculoLayout);
        jPanelCadstroVeiculoLayout.setHorizontalGroup(
            jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButtonSalvar)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonLimpar)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonCancelar)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonConsultar)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                                        .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCor)
                                            .addComponent(jLabelModelo))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldCor, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                                            .addComponent(jTextFieldModelo)))
                                    .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                                        .addComponent(jLabelqtdLugares)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldqtdLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                                        .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelFabricante)
                                            .addComponent(jLabelPlaca))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                            .addComponent(jTextFieldPlaca))))
                                .addGap(69, 69, 69))
                            .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabelValorDiaria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadstroVeiculoLayout.setVerticalGroup(
            jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadstroVeiculoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCor)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelqtdLugares)
                    .addComponent(jTextFieldqtdLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFabricante)
                    .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlaca)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDiaria)
                    .addComponent(jTextFieldValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelCadstroVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadstroVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCadstroVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(this.idVeiculo==0){
        try {
            controller.insere();
            limpaCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed
        else{
            try {
                controller.alterarVeiculo(idVeiculo);
                idVeiculo=0;
                limpaCampos();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exceptiondao ex) {
                Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       this.dispose();
       TelaPrincipalGerente telaMenu = new TelaPrincipalGerente();
        telaMenu.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpaCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        TelaConsultaVeiculo telaconsultaveiculo = new TelaConsultaVeiculo();
        telaconsultaveiculo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(this.idVeiculo==0){
        JOptionPane.showMessageDialog(null,"Erro, nenhum veiculo foi selecionado para exclusão");
        
    }                                             
        else{
            try {
                controller.deletarVeiculo(idVeiculo);
                limpaCampos();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exceptiondao ex) {
                Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }
    public JTextField getjTextFieldCor() {
        return jTextFieldCor;
    }

    public void setjTextFieldCor(JTextField jTextFieldCor) {
        this.jTextFieldCor = jTextFieldCor;
    }

    public JTextField getjTextFieldFabricante() {
        return jTextFieldFabricante;
    }

    public void setjTextFieldFabricante(JTextField jTextFieldFabricante) {
        this.jTextFieldFabricante = jTextFieldFabricante;
    }

    public JTextField getjTextFieldModelo() {
        return jTextFieldModelo;
    }

    public void setjTextFieldModelo(JTextField jTextFieldModelo) {
        this.jTextFieldModelo = jTextFieldModelo;
    }

    public JTextField getjTextFieldPlaca() {
        return jTextFieldPlaca;
    }

    public void setjTextFieldPlaca(JTextField jTextFieldPlaca) {
        this.jTextFieldPlaca = jTextFieldPlaca;
    }

    public JTextField getjTextFieldValorDiaria() {
        return jTextFieldValorDiaria;
    }

    public void setjTextFieldValorDiaria(JTextField jTextFieldValorDiaria) {
        this.jTextFieldValorDiaria = jTextFieldValorDiaria;
    }

    public JTextField getjTextFieldqtdLugares() {
        return jTextFieldqtdLugares;
    }

    public void setjTextFieldqtdLugares(JTextField jTextFieldqtdLugares) {
        this.jTextFieldqtdLugares = jTextFieldqtdLugares;
    }
     public void limpaCampos(){
        jTextFieldModelo.setText("");
        jTextFieldqtdLugares.setText("");
        jTextFieldValorDiaria.setText("");
        jTextFieldPlaca.setText("");
        jTextFieldFabricante.setText("");
        jTextFieldCor.setText("");
        idVeiculo=0;
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValorDiaria;
    private javax.swing.JLabel jLabelqtdLugares;
    private javax.swing.JPanel jPanelCadstroVeiculo;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldValorDiaria;
    private javax.swing.JTextField jTextFieldqtdLugares;
    // End of variables declaration//GEN-END:variables
}
