package GUI;

import DAO.DAOCategoria;
import DAO.DAOConvenio;
import DAO.DAOPesquisar;
import MODEL.Convenio;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import window.Window;

public class cadastrarConvenio extends javax.swing.JFrame {

    Convenio convenio = new Convenio();
    private DAOConvenio daoConvenio = new DAOConvenio();
    private DAOCategoria daoCategoria = new DAOCategoria();
    private DAOPesquisar daoPesquisar = new DAOPesquisar();
    ArrayList categoria = new ArrayList();
    int index;
    window.Window w = new Window();

    public cadastrarConvenio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        lblCategoria = new javax.swing.JLabel();
        cbxCategoriaConvenio = new javax.swing.JComboBox();
        lblRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lblNomeFantasia = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEnderecoConvenio = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumeroConvenio = new javax.swing.JFormattedTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairroConvenio = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidadeConvenio = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEPConvenio = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefoneConvenio = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmailConvenio = new javax.swing.JTextField();
        cbxEstadoConvenio = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConvenio = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 650));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CADASTRAR CONVÊNIO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblCNPJ.setText("CNPJ:");

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCNPJFocusLost(evt);
            }
        });

        lblCategoria.setText("Categoria:");

        cbxCategoriaConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:" }));

        lblRazaoSocial.setText("Razão Social:");

        lblNomeFantasia.setText("Nome Fantasia:");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("N°:");

        txtNumeroConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblBairro.setText("Bairro:");

        lblCidade.setText("Cidade:");

        txtCidadeConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeConvenioActionPerformed(evt);
            }
        });

        lblCEP.setText("CEP:");

        try {
            txtCEPConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEstado.setText("Estado:");

        lblTelefone.setText("Telefone:");

        try {
            txtTelefoneConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setText("E-mail:");

        txtEmailConvenio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailConvenioFocusLost(evt);
            }
        });

        cbxEstadoConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaoSocial)
                            .addComponent(txtNomeFantasia)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblEndereco)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtEnderecoConvenio))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumero)
                                    .addComponent(txtNumeroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblTelefone)
                                        .addGap(120, 120, 120))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtTelefoneConvenio)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addGap(0, 197, Short.MAX_VALUE))
                                    .addComponent(txtEmailConvenio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 175, Short.MAX_VALUE)
                                        .addComponent(lblEstado))
                                    .addComponent(txtBairroConvenio))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidade)
                                    .addComponent(txtCidadeConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(cbxCategoriaConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRazaoSocial)
                            .addComponent(lblNomeFantasia)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCEPConvenio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBairro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(cbxEstadoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCategoria)
                        .addGap(139, 139, 139))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNPJ)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoriaConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRazaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeFantasia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEPConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblConvenio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Convênios existentes:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConvenio);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Dados");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmar)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConfirmar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tblConvenio.setModel(daoConvenio.pesquisar());
        this.setSize(500, 650);
        w.SetAligment(this, "Cadastrar de Convênio");
        
        btnAlterar.setVisible(false);
        if (formPesquisa.isVerificacao() == true) {
            btnAlterar.setVisible(true);
            btnConfirmar.setVisible(false);
            txtCNPJ.setEnabled(false);
            formPesquisa.setVerificacao(false);
        } else {
            if (cadastrarCategoria.isVerificacao() == true) {
                cbxCategoriaConvenio.removeAllItems();
                cbxCategoriaConvenio.addItem(cadastrarCategoria.getTipo());
            } else {
                cbxCategoriaConvenio.removeAllItems();
                cbxCategoriaConvenio.addItem("Selecione:");
                categoria = daoCategoria.pesquisarCategoria();

                for (int i = 0; i < categoria.size(); i++) {
                    cbxCategoriaConvenio.addItem(categoria.get(i).toString());
                }
            }
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            if (!txtCNPJ.getText().equals("  .   .   /    -  ")) {

                if (daoConvenio.pesquisarCNPJ(txtCNPJ.getText()) == true) {
                    txtCNPJ.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "CNPJ já cadastrado!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    txtCNPJ.setBackground(Color.white);
                    txtCNPJ.setText(null);
                    txtCNPJ.requestFocus();


                } else {
                    if (!camposVazios()) {
                        preencherConvenio();
                        daoConvenio.inserir(convenio);
                        JOptionPane.showMessageDialog(null, "Inserção feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                        tblConvenio.setModel(daoConvenio.pesquisar());
                        limpar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Campo(s) em Branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cadastrarConvenio.this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNPJFocusLost
    }//GEN-LAST:event_txtCNPJFocusLost

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            this.convenio = convenio;
            preencherConvenio();
            
            daoPesquisar.alterarConvenio(convenio, String.valueOf(convenio.getIdConvenio()) );
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            tblConvenio.setModel(daoConvenio.pesquisar());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu, a alteração não pode ser concluída!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtEmailConvenioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailConvenioFocusLost
        if (!txtEmailConvenio.getText().equals("")) {

            //Set the email pattern string  
            Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

            //Match the given string with the pattern  
            Matcher m = p.matcher(txtEmailConvenio.getText());

            //check whether match is found   
            boolean matchFound = m.matches();

            if (!matchFound) {
                JOptionPane.showMessageDialog(null, "Email inválido.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                txtEmailConvenio.setText(null);
            }
        }

    }//GEN-LAST:event_txtEmailConvenioFocusLost

    private void txtCidadeConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeConvenioActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                new cadastrarConvenio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox cbxCategoriaConvenio;
    private javax.swing.JComboBox cbxEstadoConvenio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNomeFantasia;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblConvenio;
    private javax.swing.JTextField txtBairroConvenio;
    private javax.swing.JFormattedTextField txtCEPConvenio;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCidadeConvenio;
    private javax.swing.JTextField txtEmailConvenio;
    private javax.swing.JTextField txtEnderecoConvenio;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JFormattedTextField txtNumeroConvenio;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefoneConvenio;
    // End of variables declaration//GEN-END:variables

    private boolean camposVazios() {
        boolean verificacao = false;
        if ((txtNomeFantasia.getText().equals(""))
                || (txtBairroConvenio.getText().equals(""))
                || (cbxCategoriaConvenio.getSelectedItem().equals("Selecione:"))
                || (cbxEstadoConvenio.getSelectedItem().toString().equals("Selecione"))
                || (txtCEPConvenio.getText().equals("     -   "))
                || (txtBairroConvenio.getText().equals(""))
                || (txtCNPJ.getText().equals("  .   .   /    -  "))
                || (txtCidadeConvenio.getText().equals(""))
                || (txtEnderecoConvenio.getText().equals(""))
                || (txtNumeroConvenio.getText().equals(""))
                || (txtRazaoSocial.getText().equals(""))
                || (txtTelefoneConvenio.getText().equals("()    -    "))) {


            verificacao = true;
        }
        return (verificacao);
    }

    private void limpar() {
        txtCNPJ.setText(null);
        cbxCategoriaConvenio.setSelectedIndex(0);
        txtRazaoSocial.setText(null);
        txtNomeFantasia.setText(null);
        txtEnderecoConvenio.setText(null);
        txtNumeroConvenio.setText(null);
        txtBairroConvenio.setText(null);
        txtCidadeConvenio.setText(null);
        txtCEPConvenio.setText(null);
        cbxEstadoConvenio.setSelectedIndex(0);
        txtTelefoneConvenio.setText(null);
        txtEmailConvenio.setText(null);

        cbxCategoriaConvenio.removeAllItems();
        cbxCategoriaConvenio.addItem("Selecione:");
        categoria = daoCategoria.pesquisarCategoria();

        for (int i = 0; i < categoria.size(); i++) {
            cbxCategoriaConvenio.addItem(categoria.get(i).toString());
        }
    }

    private void preencherConvenio() {
        
        convenio.setIdCategoria("" + daoCategoria.pesquisarId(cbxCategoriaConvenio.getSelectedItem().toString()));
        convenio.setCNPJ(txtCNPJ.getText());
        convenio.setRazaoSocial(txtRazaoSocial.getText());
        convenio.setNomeFantasia(txtNomeFantasia.getText());
        convenio.setEnderecoConvenio(txtEnderecoConvenio.getText());
        convenio.setNumeroConvenio(txtNumeroConvenio.getText());
        convenio.setBairroConvenio(txtBairroConvenio.getText());
        convenio.setCidadeConvenio(txtCidadeConvenio.getText());
        convenio.setCEPConvenio(txtCEPConvenio.getText());
        convenio.setEstadoConvenio(cbxEstadoConvenio.getSelectedItem().toString());
        convenio.setTelefoneConvenio(txtTelefoneConvenio.getText());
        convenio.setEmailConvenio(txtEmailConvenio.getText());

    }

    public void alterar(Convenio convenio) {
        this.convenio = convenio;

        cbxCategoriaConvenio.removeAllItems();
        cbxCategoriaConvenio.addItem(convenio.getIdCategoria());
        txtCNPJ.setText(convenio.getCNPJ());
        txtRazaoSocial.setText(convenio.getRazaoSocial());
        txtNomeFantasia.setText(convenio.getNomeFantasia());
        txtEnderecoConvenio.setText(convenio.getEnderecoConvenio());
        txtNumeroConvenio.setText(convenio.getNumeroConvenio());
        txtBairroConvenio.setText(convenio.getBairroConvenio());
        txtCidadeConvenio.setText(convenio.getCidadeConvenio());
        txtCEPConvenio.setText(convenio.getCEPConvenio());
        cbxEstadoConvenio.setSelectedItem(convenio.getEstadoConvenio().toString());
        txtTelefoneConvenio.setText(convenio.getTelefoneConvenio());
        txtEmailConvenio.setText(convenio.getEmailConvenio());

    }
}
