/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetofinal.dao.ClienteDAO;
import projetofinal.dao.EnderecosDAO;
import projetofinal.model.Cliente;
import projetofinal.model.Enderecos;
import projetofinal.jbcd.ConnectionFactory;
import java.sql.Connection;
import javax.swing.*;


public class CadastrarClientes extends javax.swing.JFrame {

    
    public CadastrarClientes() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastroClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPaneClientes = new javax.swing.JTabbedPane();
        jPanelDadosPessoais = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelNo = new javax.swing.JLabel();
        jLabelComp = new javax.swing.JLabel();
        jTextFieldComp = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jFormattedTextFieldNo = new javax.swing.JFormattedTextField();
        jComboBoxEnderecos = new javax.swing.JComboBox<>();
        jButtonSalvarEndereco = new javax.swing.JButton();
        jButtonListarEnderecos = new javax.swing.JButton();
        jButtonNovoCadastro = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanelConsultaClientes = new javax.swing.JPanel();
        jLabelNomeCon = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPaneCon = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCadastroClientes.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de clientes");

        javax.swing.GroupLayout jPanelCadastroClientesLayout = new javax.swing.GroupLayout(jPanelCadastroClientes);
        jPanelCadastroClientes.setLayout(jPanelCadastroClientesLayout);
        jPanelCadastroClientesLayout.setHorizontalGroup(
            jPanelCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastroClientesLayout.setVerticalGroup(
            jPanelCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDadosPessoais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDadosPessoaisMouseClicked(evt);
            }
        });

        jLabelId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelId.setText("Identificador:");

        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldId.setEnabled(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTel.setText("Tel:");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("E-mail:");

        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelActionPerformed(evt);
            }
        });

        jLabelCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCPF.setText("CPF:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });

        jLabelEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEndereco.setText("Endere??o:");

        jLabelCEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCEP.setText("CEP:");

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCEPActionPerformed(evt);
            }
        });

        jLabelRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRua.setText("Rua:");

        jTextFieldRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });

        jLabelNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNo.setText("N??:");

        jLabelComp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelComp.setText("Comp.:");

        jTextFieldComp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCompActionPerformed(evt);
            }
        });

        jTextFieldBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });

        jLabelBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jLabelCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jTextFieldCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelUF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUF.setText("UF:");

        jComboBoxUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jFormattedTextFieldNo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNoActionPerformed(evt);
            }
        });

        jComboBoxEnderecos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEnderecos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEnderecosFocusGained(evt);
            }
        });

        jButtonSalvarEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvarEndereco.setText("Salvar endere??o");
        jButtonSalvarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEnderecoActionPerformed(evt);
            }
        });

        jButtonListarEnderecos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonListarEnderecos.setText("Listar endere??os");
        jButtonListarEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarEnderecosActionPerformed(evt);
            }
        });

        jButtonNovoCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonNovoCadastro.setText("NOVO CADASTRO");
        jButtonNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCadastroActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEditar.setText("ATUALIZAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabelRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldNo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelComp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldComp))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jButtonEditar)
                                        .addGap(53, 53, 53)
                                        .addComponent(jButtonExcluir))))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEnderecos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButtonSalvarEndereco))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)))
                .addGap(6, 6, 6))
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonListarEnderecos)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButtonNovoCadastro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonEditar, jButtonExcluir, jButtonNovoCadastro});

        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTel)
                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jComboBoxEnderecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarEndereco)
                    .addComponent(jButtonListarEnderecos))
                .addGap(12, 12, 12)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNo)
                    .addComponent(jLabelComp)
                    .addComponent(jTextFieldComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelUF)
                        .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBairro)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCidade)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoCadastro)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanelDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonEditar, jButtonExcluir, jButtonNovoCadastro});

        jPanelDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFormattedTextFieldNo, jTextFieldRua});

        jPanelDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonSalvarEndereco, jComboBoxEnderecos});

        jTabbedPaneClientes.addTab("Dados pessoais", jPanelDadosPessoais);

        jPanelConsultaClientes.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNomeCon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNomeCon.setText("Nome:");

        jTextFieldPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nome", "CPF", "Email", "Telefone"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPaneCon.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanelConsultaClientesLayout = new javax.swing.GroupLayout(jPanelConsultaClientes);
        jPanelConsultaClientes.setLayout(jPanelConsultaClientesLayout);
        jPanelConsultaClientesLayout.setHorizontalGroup(
            jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneCon)
                    .addGroup(jPanelConsultaClientesLayout.createSequentialGroup()
                        .addComponent(jLabelNomeCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar)
                        .addGap(0, 343, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultaClientesLayout.setVerticalGroup(
            jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisar)
                    .addGroup(jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNomeCon)
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneCon, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneClientes.addTab("Consulta de clientes", jPanelConsultaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneClientes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jFormattedTextFieldCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCEPActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    private void jTextFieldCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
         //Se o campo pesquisar estiver em branco, lista todos os clientes
        if (jTextFieldPesquisa.getText().isBlank()) {
            //1?? passo: criar um objeto DAO para podermos utilizar seus m??todos
            ClienteDAO dao = new ClienteDAO();

            //2?? passo: criar uma lista de endere??os atrav??s do m??todo listar 
            //enderecos do DAO
            List<Cliente> lista = dao.listarClientes();

            //3?? passo: criar uma tabela do modelo padr??o. Para isso pegamos o modelo
            //do componente jTable da tela atrav??s do m??todo getModel() e convertemos
            //ele atrav??s de um casting para o modelo de tabela padr??o.
            DefaultTableModel tabela = (DefaultTableModel) jTableClientes.getModel();

            //4?? passo: setamos o n??mero de colunas de nossa tabela em zero para limpar 
            // e garantir que n??o existem nenhum dado pr?? existente.
            tabela.setNumRows(0);

            //5?? passo: precisamos colocar os itens da lista na tabela. Para cada objeto
            //do tipo Endereco na lista, n??s adicionamos um novo objeto com os atributos
            //do objeto endereco nos seus campos separados por v??rgula.
            for (Cliente clientes : lista) { //este ?? um exemplo de uso do for-each
                tabela.addRow(new Object[]{ //este Object ?? um vetor/array
                    clientes.getId(),
                    clientes.getNome(),
                    clientes.getCpf(),
                    clientes.getEmail(),
                    clientes.getTelefone(),});
            } 
        } else {
            //1?? passo: criar um objeto DAO para podermos utilizar seus m??todos
            ClienteDAO dao = new ClienteDAO();

            //2?? passo: criar uma lista de endere??os atrav??s do m??todo listar 
            //enderecos do DAO
            List<Cliente> lista = dao.buscarClientes(jTextFieldPesquisa.getText());

            //3?? passo: criar uma tabela do modelo padr??o. Para isso pegamos o modelo
            //do componente jTable da tela atrav??s do m??todo getModel() e convertemos
            //ele atrav??s de um casting para o modelo de tabela padr??o.
            DefaultTableModel tabela = (DefaultTableModel) jTableClientes.getModel();

            //4?? passo: setamos o n??mero de colunas de nossa tabela em zero para limpar 
            // e garantir que n??o existem nenhum dado pr?? existente.
            tabela.setNumRows(0);

            //5?? passo: precisamos colocar os itens da lista na tabela. Para cada objeto
            //do tipo Endereco na lista, n??s adicionamos um novo objeto com os atributos
            //do objeto endereco nos seus campos separados por v??rgula.
            for (Cliente clientes : lista) { //este ?? um exemplo de uso do for-each
                tabela.addRow(new Object[]{ //este Object ?? um vetor/array
                    clientes.getId(),
                    clientes.getNome(),
                    clientes.getCpf(),
                    clientes.getEmail(),
                    clientes.getTelefone(),});
            } 
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
     Cliente clientes = new Cliente();
                        clientes.setNome(jTextFieldNome.getText());
                        clientes.setCpf(jFormattedTextFieldCPF.getText());
                        clientes.setEmail(jTextFieldEmail.getText());
                        clientes.setTelefone(jFormattedTextFieldTel.getText());
                        clientes.setId(Integer.parseInt(jTextFieldId.getText()));
                        
                        ClienteDAO dao = new ClienteDAO();
                        dao.atualizarCliente(clientes);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
                        Cliente clientes = new Cliente();
                        clientes.setId(Integer.parseInt(jTextFieldId.getText()));
                        
                        ClienteDAO dao = new ClienteDAO();
                        dao.deletarCliete(clientes);     
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jFormattedTextFieldNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNoActionPerformed

    private void jButtonSalvarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEnderecoActionPerformed
        try {
            Enderecos endereco = new Enderecos();
            endereco.setCep(jFormattedTextFieldCEP.getText());
            endereco.setRua(jTextFieldRua.getText());
            endereco.setNumero(Integer.parseInt(jFormattedTextFieldNo.getText()));
            endereco.setComplemento(jTextFieldComp.getText());
            endereco.setBairro(jTextFieldBairro.getText());
            endereco.setCidade(jTextFieldCidade.getText());
            endereco.setUF(jComboBoxUF.getSelectedItem().toString());

            EnderecosDAO enderecoDAO = new EnderecosDAO();
            enderecoDAO.cadastrarEndereco(endereco);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButtonSalvarEnderecoActionPerformed

    private void jComboBoxEnderecosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxEnderecosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEnderecosFocusGained

    private void jButtonListarEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarEnderecosActionPerformed
        new ListarEnderecos().setVisible(true);
    }//GEN-LAST:event_jButtonListarEnderecosActionPerformed

    private void jButtonNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCadastroActionPerformed
                try {
                        Cliente clientes = new Cliente();
                        clientes.setNome(jTextFieldNome.getText());
                        clientes.setCpf(jFormattedTextFieldCPF.getText());
                        clientes.setEmail(jTextFieldEmail.getText());
                        clientes.setTelefone(jFormattedTextFieldTel.getText());
                        
                        ClienteDAO dao = new ClienteDAO();
                        dao.cadastrarCliente(clientes);
                        
                        //Essa parte s?? pode executar se o usu??rio n??o deixou o campo Rua em branco
                        if(!jTextFieldRua.getText().isBlank()){
                            Enderecos endereco = new Enderecos();
                            endereco.setCep(jFormattedTextFieldCEP.getText());
                            endereco.setRua(jTextFieldRua.getText());
                            endereco.setNumero(Integer.parseInt(jFormattedTextFieldNo.getText()));
                            endereco.setComplemento(jTextFieldComp.getText());
                            endereco.setBairro(jTextFieldBairro.getText());
                            endereco.setCidade(jTextFieldCidade.getText());
                            endereco.setUF(jComboBoxUF.getSelectedItem().toString());
                            //Pegar o endere??o que estamos cadastrando e salvar o
                            //Id do cliente como chave estrangeira
                            endereco.setClientes(clientes);

                            EnderecosDAO daoEnd = new EnderecosDAO();
                            daoEnd.cadastrarEndereco(endereco);
                        } 
                    } catch (Exception e) {
                    }

    }//GEN-LAST:event_jButtonNovoCadastroActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
       jTextFieldId.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0).toString());
       jTextFieldNome.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1).toString());
       jFormattedTextFieldCPF.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 2).toString());
       jTextFieldEmail.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 3).toString());
       jFormattedTextFieldTel.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 4).toString());
       
       jTabbedPaneClientes.setSelectedIndex(0);
       
       
      
      try {
            Connection conexao = ConnectionFactory.getConnection();
            //1?? passo: criar uma lista para armazenar os clientes
            List<String> lista = new ArrayList<>();
            
            //2?? passo: criar o comando sql que seleciona todos os itens da
            //tabela de endere??os
            String sql = "select id from tb_enderecos where id_cliente=?";
            
            //3?? passo: preparar o comando colocando na conexao que ser??
            //utilizada para execut??-lo no BD
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, jTextFieldId.getText());
            
            //4?? passo: quando usamos JDBC, o resultado de um comando select 
            //precisa ser armazenado em um objeto do tipo ResultSet
            ResultSet rs = comando.executeQuery();
            
            //5?? passo: criar um la??o de repeti????o para adicionar os itens do
            //ResultSet na lista criada no primeiro passo.
            while(rs.next()){ //Enquanto(while) conseguir percorrer o pr??ximo (next) item do ResultSet
                lista.add(rs.getString("id"));       
            }
            //6?? passo: ap??s a lista ser criada, agora eu retorno como resultado
            // do meu m??todo a lista pronta.
            
             DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(lista.toArray());
             jComboBoxEnderecos.setModel(defaultComboBox);
             
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
            

        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jPanelDadosPessoaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDadosPessoaisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelDadosPessoaisMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonListarEnderecos;
    private javax.swing.JButton jButtonNovoCadastro;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvarEndereco;
    private javax.swing.JComboBox<String> jComboBoxEnderecos;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldNo;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComp;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeCon;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanelCadastroClientes;
    private javax.swing.JPanel jPanelConsultaClientes;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JScrollPane jScrollPaneCon;
    private javax.swing.JTabbedPane jTabbedPaneClientes;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComp;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
