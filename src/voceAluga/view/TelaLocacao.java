/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import voceAluga.controller.reservaController;
import voceAluga.controller.veiculoController;
import voceAluga.dao.Exceptiondao;
import voceAluga.model.Cliente;
import voceAluga.model.Veiculo;

/**
 *
 * @author lucas
 */
public class TelaLocacao extends javax.swing.JFrame {
    private static  int idVeiculo=0;
    private static  int idCliente=0;
    private static int idReserva=0;
    private final reservaController controller;
    /**
     * Creates new form TelaLocacao
     */
    public TelaLocacao() {
        initComponents();
        controller = new reservaController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanelCadastroReserva = new javax.swing.JPanel();
        jLabelFilialRetorno = new javax.swing.JLabel();
        jTextFieldFilialRetorno = new javax.swing.JTextField();
        jLabelDtRetorno = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jFormattedTextFieldDtEntrega = new javax.swing.JFormattedTextField();
        jTextFieldValorReserva = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonConsultar1 = new javax.swing.JButton();
        jFormattedTextFieldDtRetorno = new javax.swing.JFormattedTextField();
        jLabelDtEntrega = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSelecionaCliente = new javax.swing.JTable();
        jLabelConsultaVeiculo = new javax.swing.JLabel();
        jTextFieldTituloVeiculo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaVeiculo = new javax.swing.JTable();
        jButtonConsultarVeiculo = new javax.swing.JButton();
        jButtonConsultarClientes = new javax.swing.JButton();
        jLabelCadReserva = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 580));
        setResizable(false);

        jPanelCadastroReserva.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroReserva.setPreferredSize(new java.awt.Dimension(800, 400));

        jLabelFilialRetorno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelFilialRetorno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFilialRetorno.setText("Filial Retorno:");

        jTextFieldFilialRetorno.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabelDtRetorno.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDtRetorno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDtRetorno.setText("Data de Retorno:");

        jLabelEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("valor Reserva:");

        jFormattedTextFieldDtEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldDtEntrega.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jFormattedTextFieldDtEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDtEntregaActionPerformed(evt);
            }
        });

        jTextFieldValorReserva.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setMaximumSize(new java.awt.Dimension(69, 27));
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(69, 27));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(69, 27));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(69, 27));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonExcluir.setText("Finalizar");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonConsultar1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonConsultar1.setText("Consultar");
        jButtonConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultar1ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDtRetorno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDtRetorno.setText("##/##/####");
        jFormattedTextFieldDtRetorno.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jFormattedTextFieldDtRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDtRetornoActionPerformed(evt);
            }
        });

        jLabelDtEntrega.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDtEntrega.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDtEntrega.setText("Data da entrega:");

        jLabelNomeCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCliente.setText("Selecione o Cliente:");

        jTextFieldNomeCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldNomeCliente.setToolTipText("informe o nome do cliente que deseja consultar! ");

        jTableSelecionaCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableSelecionaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSelecionaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSelecionaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSelecionaCliente);

        jLabelConsultaVeiculo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelConsultaVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsultaVeiculo.setText("Selecione o Veículo:");

        jTextFieldTituloVeiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloVeiculo.setToolTipText("Informe o Veículo que deseja consultar !");

        jTableConsultaVeiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableConsultaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDVeiculo", "Modelo", "Placa", "Valor Diaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane2.setViewportView(jTableConsultaVeiculo);

        jButtonConsultarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarVeiculoConsultarVeiculo(evt);
            }
        });

        jButtonConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroReservaLayout = new javax.swing.GroupLayout(jPanelCadastroReserva);
        jPanelCadastroReserva.setLayout(jPanelCadastroReservaLayout);
        jPanelCadastroReservaLayout.setHorizontalGroup(
            jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFilialRetorno)
                            .addComponent(jLabelDtEntrega)
                            .addComponent(jLabelDtRetorno)
                            .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEndereco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFilialRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldDtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(jButtonConsultar1))))
                    .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                                .addComponent(jTextFieldTituloVeiculo)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroReservaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addGap(71, 71, 71))
                    .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelConsultaVeiculo)
                        .addGap(240, 240, 240)
                        .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeCliente)
                            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                                .addComponent(jTextFieldNomeCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonConsultarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastroReservaLayout.setVerticalGroup(
            jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(jLabelNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonConsultarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroReservaLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonConsultarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroReservaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelConsultaVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldTituloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFilialRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFilialRetorno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldDtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtRetorno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco))
                .addGap(27, 27, 27)
                .addGroup(jPanelCadastroReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar1)
                    .addComponent(jButtonExcluir))
                .addGap(63, 63, 63))
        );

        jLabelCadReserva.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelCadReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        jLabelCadReserva.setText("Cadastro de reserva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabelCadReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelCadastroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabelCadReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCadastroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDtEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDtEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDtEntregaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    if(idReserva == 0){    
        try {
            //JOptionPane.showMessageDialog(null,idVeiculo);    
            if(idVeiculo > 0 & idCliente>0){
                controller.insere(idVeiculo, idCliente);
                controller.alteraEstado(idVeiculo);
                limpaCampos();
            }else{JOptionPane.showMessageDialog(null,"Por favor selecione um veiculo e um cliente");}
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{try {
        controller.alterarReserva(idReserva);
        } catch (SQLException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpaCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
            idReserva=0;
            idVeiculo=0;    
            idCliente=0;
            TelaPrincipalGerente telaMenu = new TelaPrincipalGerente();
            telaMenu.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            //JOptionPane.showMessageDialog(null,idVeiculo);
            if(idReserva !=0){
                this.idVeiculo=idVeiculo;
                controller.alteraEstado2(idVeiculo);
                controller.alteraEstadoReserva(idVeiculo);
                
                JOptionPane.showMessageDialog(null,"Reserva finalizada com sucesso");
                limpaCampos();
            }else{JOptionPane.showMessageDialog(null,"Por favor selecione uma reserva para dar baixa");}
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultar1ActionPerformed
        TelaConsultaReserva telaconsultareserva= new TelaConsultaReserva();
        telaconsultareserva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultar1ActionPerformed

    private void jFormattedTextFieldDtRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDtRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDtRetornoActionPerformed

    private void jTableSelecionaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSelecionaClienteMouseClicked
        if(evt.getClickCount()==1){
            Integer idCliente = (Integer)jTableSelecionaCliente.getModel().getValueAt(jTableSelecionaCliente.getSelectedRow(),0);
            this.idCliente=idCliente;
            //JOptionPane.showMessageDialog(null,idCliente);
        }
    }//GEN-LAST:event_jTableSelecionaClienteMouseClicked
 public void buscarReserva(Integer idReserva,Date dataEntrega,double valorReserva,Date dataRetorno,String filialRetorno,Integer idVeiculo,Integer idCliente){
        this.idReserva=idReserva;
        this.jTextFieldFilialRetorno.setText(filialRetorno);
        SimpleDateFormat mask = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat mask1 = new SimpleDateFormat("dd/MM/yyyy");
        this.jFormattedTextFieldDtEntrega.setText(mask.format(dataEntrega));
        this.jFormattedTextFieldDtRetorno.setText(mask.format(dataRetorno));
        this.jTextFieldValorReserva.setText(Double.toString(valorReserva));
        this.idVeiculo=idVeiculo;
        this.idCliente=idCliente;
        DefaultTableModel tableModel = (DefaultTableModel) jTableSelecionaCliente.getModel();
        tableModel.setRowCount(0);
        //reservaController reservaController = new reservaController();
        try {
            ArrayList<Cliente> clientes = controller.selecionarClientesReserva(idCliente);
            clientes.forEach((Cliente cliente)->{
                tableModel.addRow(new Object[]{cliente.getIdCliente(),
                    cliente.getNome(),
                    cliente.getCpf()});
        });
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel tableModel2 = (DefaultTableModel) jTableConsultaVeiculo.getModel();
        tableModel2.setRowCount(0);
        try {
            ArrayList<Veiculo> veiculos = controller.selecionarVeiculosReserva(idVeiculo);
            veiculos.forEach((Veiculo veiculo)->{
                tableModel2.addRow(new Object[]{veiculo.getIdVeiculo(),
                    veiculo.getModelo(),
                    veiculo.getPlaca(),
                    veiculo.getValorDiaria()});
        });
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //JOptionPane.showMessageDialog(null,idVeiculo);
    }
    private void jTableConsultaVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaVeiculoMouseClicked
        if(evt.getClickCount()==1){
            Integer idVeiculo = (Integer)jTableConsultaVeiculo.getModel().getValueAt(jTableConsultaVeiculo.getSelectedRow(),0);
            this.idVeiculo=idVeiculo;
            //JOptionPane.showMessageDialog(null,idVeiculo);
        }
        
    }//GEN-LAST:event_jTableConsultaVeiculoMouseClicked
    public void limpaCampos(){
        idReserva=0;
        idVeiculo=0;
        idCliente=0;
        DefaultTableModel tableModel = (DefaultTableModel) jTableSelecionaCliente.getModel();
        tableModel.setRowCount(0);
        DefaultTableModel tableModel2 = (DefaultTableModel) jTableConsultaVeiculo.getModel();
        tableModel2.setRowCount(0);
        jTextFieldTituloVeiculo.setText("");
        jTextFieldNomeCliente.setText("");
        jFormattedTextFieldDtEntrega.setText("");
        jFormattedTextFieldDtRetorno.setText("");
        jTextFieldFilialRetorno.setText("");
        jTextFieldValorReserva.setText("");
    
    }
    private void jButtonConsultarVeiculoConsultarVeiculo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarVeiculoConsultarVeiculo
     if(idReserva==0){   
        String nome = jTextFieldTituloVeiculo.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableConsultaVeiculo.getModel();
        tableModel.setRowCount(0);
        try {
            ArrayList<Veiculo> veiculos = controller.selecionarVeiculos(nome);
            veiculos.forEach((Veiculo veiculo)->{
                tableModel.addRow(new Object[]{veiculo.getIdVeiculo(),
                    veiculo.getModelo(),
                    veiculo.getPlaca(),
                    veiculo.getValorDiaria()});
        });
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    }//GEN-LAST:event_jButtonConsultarVeiculoConsultarVeiculo

    private void jButtonConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarClientesActionPerformed
     if(idReserva==0){   
        String nome = jTextFieldNomeCliente.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTableSelecionaCliente.getModel();
        tableModel.setRowCount(0);
        //reservaController reservaController = new reservaController();
        try {
            ArrayList<Cliente> clientes = controller.selecionarClientes(nome);
            clientes.forEach((Cliente cliente)->{
                tableModel.addRow(new Object[]{cliente.getIdCliente(),
                    cliente.getNome(),
                    cliente.getCpf()});
        });
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exceptiondao ex) {
            Logger.getLogger(TelaConsultaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConsultarClientesActionPerformed
  }
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
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocacao().setVisible(true);
            }
        });
    }

    public JFormattedTextField getjFormattedTextFieldDtEntrega() {
        return jFormattedTextFieldDtEntrega;
    }

    public void setjFormattedTextFieldDtEntrega(JFormattedTextField jFormattedTextFieldDtEntrega) {
        this.jFormattedTextFieldDtEntrega = jFormattedTextFieldDtEntrega;
    }

    public JFormattedTextField getjFormattedTextFieldDtRetorno() {
        return jFormattedTextFieldDtRetorno;
    }

    public void setjFormattedTextFieldDtRetorno(JFormattedTextField jFormattedTextFieldDtRetorno) {
        this.jFormattedTextFieldDtRetorno = jFormattedTextFieldDtRetorno;
    }

    public JTextField getjTextFieldFilialRetorno() {
        return jTextFieldFilialRetorno;
    }

    public void setjTextFieldFilialRetorno(JTextField jTextFieldFilialRetorno) {
        this.jTextFieldFilialRetorno = jTextFieldFilialRetorno;
    }

    public JTextField getjTextFieldNomeCliente() {
        return jTextFieldNomeCliente;
    }

    public void setjTextFieldNomeCliente(JTextField jTextFieldNomeCliente) {
        this.jTextFieldNomeCliente = jTextFieldNomeCliente;
    }

    public JTextField getjTextFieldTituloVeiculo() {
        return jTextFieldTituloVeiculo;
    }

    public void setjTextFieldTituloVeiculo(JTextField jTextFieldTituloVeiculo) {
        this.jTextFieldTituloVeiculo = jTextFieldTituloVeiculo;
    }

    public JTextField getjTextFieldValorReserva() {
        return jTextFieldValorReserva;
    }

    public void setjTextFieldValorReserva(JTextField jTextFieldValorReserva) {
        this.jTextFieldValorReserva = jTextFieldValorReserva;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar1;
    private javax.swing.JButton jButtonConsultarClientes;
    private javax.swing.JButton jButtonConsultarVeiculo;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtEntrega;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtRetorno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadReserva;
    private javax.swing.JLabel jLabelConsultaVeiculo;
    private javax.swing.JLabel jLabelDtEntrega;
    private javax.swing.JLabel jLabelDtRetorno;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelFilialRetorno;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JPanel jPanelCadastroReserva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultaVeiculo;
    private javax.swing.JTable jTableSelecionaCliente;
    private javax.swing.JTextField jTextFieldFilialRetorno;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldTituloVeiculo;
    private javax.swing.JTextField jTextFieldValorReserva;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
