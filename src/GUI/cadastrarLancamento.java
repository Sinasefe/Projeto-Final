package GUI;

import DAO.DAOCategoria;
import DAO.DAOConvenio;
import DAO.DAOLancamento;
import DAO.DAOPesquisar;
import DAO.DAOSindicalizado;
import MODEL.Categoria;
import MODEL.Convenio;
import MODEL.Lancamento;
import MODEL.Sindicalizado;
import MODEL.Usuario;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import window.Window;

public class cadastrarLancamento extends javax.swing.JFrame {

    window.Window w = new Window();
    private DAOCategoria daoCategoria = new DAOCategoria();
    private DAOPesquisar daoPesquisar = new DAOPesquisar();
    private DAOLancamento daoLancamento = new DAOLancamento();
    private DAOConvenio daoConvenio = new DAOConvenio();
    private DAOSindicalizado daoSindicalizado = new DAOSindicalizado();
    private Categoria mCategoria = new Categoria();
    private Sindicalizado sindicalizado = new Sindicalizado();
    private Usuario usuario;
    private Lancamento lancamento = new Lancamento();
    private Convenio mConvenio = new Convenio();
    public String nomeSindicalizado;
    ArrayList categoria = new ArrayList();
    ArrayList convenio = new ArrayList();
    int idCategoria, idConvenio, idSindicalizado, x;
    boolean verificacao;
    String valor;
    double gasto;
    DecimalFormat df = new DecimalFormat("#,###.00");

    public Lancamento getLancamento() {
        return lancamento;
    }

    public void setLancamento(Lancamento lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * Creates new form cadastrarLancamento
     */
    public cadastrarLancamento() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formSindicalizado = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSindicalizado = new javax.swing.JTable();
        btnOK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSindicalizado = new javax.swing.JTextField();
        btnPesquisarSindicalizado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxConvenio = new javax.swing.JComboBox();
        cbxCategoriaConvenio = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtValorGasto = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        cbxDataAtual = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFuncionario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLancamento = new javax.swing.JTable();

        formSindicalizado.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        formSindicalizado.setMinimumSize(new java.awt.Dimension(395, 250));
        formSindicalizado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formSindicalizadoWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(245, 245, 251));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSindicalizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SINDICALIZADO", "SIAPE", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSindicalizado.setRequestFocusEnabled(false);
        tblSindicalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSindicalizadoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblSindicalizado);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formSindicalizadoLayout = new javax.swing.GroupLayout(formSindicalizado.getContentPane());
        formSindicalizado.getContentPane().setLayout(formSindicalizadoLayout);
        formSindicalizadoLayout.setHorizontalGroup(
            formSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        formSindicalizadoLayout.setVerticalGroup(
            formSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(457, 462));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(535, 430));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REALIZAR LANÇAMENTO");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setText("Sindicalizado:");

        btnPesquisarSindicalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/pesquisar 2.png"))); // NOI18N
        btnPesquisarSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSindicalizadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Convênio:");

        cbxConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:" }));

        cbxCategoriaConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:" }));
        cbxCategoriaConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaConvenioActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor gasto: ");

        txtValorGasto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel8.setText("R$");

        jLabel6.setText("Data:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFocusLost(evt);
            }
        });

        cbxDataAtual.setBackground(new java.awt.Color(255, 255, 255));
        cbxDataAtual.setText("Usar data atual");
        cbxDataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataAtualActionPerformed(evt);
            }
        });

        jLabel7.setText("Descrição:");

        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyReleased(evt);
            }
        });

        jLabel9.setText("Funionário: ");

        txtFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Categoria:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValorGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDescricao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisarSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(cbxDataAtual)
                            .addComponent(jLabel3)
                            .addComponent(txtFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxCategoriaConvenio, 0, 166, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbxConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarSindicalizado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCategoriaConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDataAtual))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAlterar.setText("Alterar Dados");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tblLancamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6"
            }
        ));
        jScrollPane3.setViewportView(tblLancamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar))
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirmar)
                            .addComponent(btnAlterar))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataAtualActionPerformed
        if (cbxDataAtual.isSelected() == true) {

            txtData.enable(false);
            GregorianCalendar calendar = new GregorianCalendar();

            int dia = calendar.get(Calendar.DATE);
            int mes = calendar.get(Calendar.MONTH) + 1;
            int ano = calendar.get(Calendar.YEAR);

            if ((dia >= 0 && dia < 10) && (mes >= 0 && mes < 10)) {
                txtData.setText("" + 0 + dia + "/" + 0 + mes + "/" + ano);
            } else if ((dia >= 0 && dia < 10) && mes >= 10) {
                txtData.setText("" + 0 + dia + "/" + mes + "/" + ano);
            } else if (dia >= 10 && (mes >= 0 && mes < 10)) {
                txtData.setText(dia + "/" + 0 + mes + "/" + ano);
            } else {
                txtData.setText(dia + "/" + mes + "/" + ano);
            }
        } else {
            txtData.enable(true);
            txtData.setText(null);

        }
    }//GEN-LAST:event_cbxDataAtualActionPerformed

    private void btnPesquisarSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSindicalizadoActionPerformed
        if (txtSindicalizado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um sindicalizado.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtSindicalizado.requestFocus();
        } else {
            DefaultTableModel tabela = daoSindicalizado.pesquisar(txtSindicalizado.getText());
            if (DAOSindicalizado.isVerificacao() == true) {
                JOptionPane.showMessageDialog(null, "Sindicalizado não cadastrado!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                txtSindicalizado.setText(null);
                txtSindicalizado.requestFocus();
            } else {
                formSindicalizado.setVisible(true);
                tblSindicalizado.setModel(tabela);
            }
        }
    }//GEN-LAST:event_btnPesquisarSindicalizadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        verificacao = false;
        this.setSize(740, 480);
        w.SetAligment(this, "Realizar Lançamento");
        tblLancamento.setModel(daoLancamento.pesquisar());

        btnAlterar.setVisible(false);
        txtFuncionario.setText(formLogin.nomeUsuario());
        txtSindicalizado.setEnabled(true);
        btnPesquisarSindicalizado.setEnabled(true);
        if (formPesquisa.isVerificacao() == true) {
            btnAlterar.setVisible(true);
            btnConfirmar.setVisible(false);

        } else {
            caregarCampos();
            verificacao = true;

        }
    }//GEN-LAST:event_formWindowOpened

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        txtSindicalizado.setText(nomeSindicalizado);
        formSindicalizado.dispose();

    }//GEN-LAST:event_btnOKActionPerformed

    private void tblSindicalizadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSindicalizadoMousePressed
        nomeSindicalizado = tblSindicalizado.getValueAt(tblSindicalizado.getSelectedRow(), 0).toString();

    }//GEN-LAST:event_tblSindicalizadoMousePressed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        try {
            if (txtFuncionario.getText() == null) {

                JOptionPane.showMessageDialog(null, "Você deve estar logado para realizar um cadastro!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

            } else if (!camposVazios()) {
                preencherLancamento();
                daoLancamento.inserir(lancamento);
                JOptionPane.showMessageDialog(null, "Inserção feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                tblLancamento.setModel(daoLancamento.pesquisar());
                txtData.setEnabled(true);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Campo(s) em Branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxCategoriaConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaConvenioActionPerformed
        if (verificacao == true) {

            idConvenio = daoCategoria.pesquisarId(cbxCategoriaConvenio.getSelectedItem().toString());

            cbxConvenio.removeAllItems();
            cbxConvenio.addItem("Selecione:");
            convenio = daoConvenio.pesquisarConvenio("" + idConvenio);

            for (int i = 0; i < convenio.size(); i++) {
                cbxConvenio.addItem(convenio.get(i).toString());
            }
        }
    }//GEN-LAST:event_cbxCategoriaConvenioActionPerformed

    private void formSindicalizadoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formSindicalizadoWindowOpened
        formSindicalizado.setSize(440, 280);
        w.SetAligment(formSindicalizado, "Selecionar Sindicalizado");
    }//GEN-LAST:event_formSindicalizadoWindowOpened

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyReleased
        txtDescricao.setText(txtDescricao.getText().toUpperCase());
    }//GEN-LAST:event_txtDescricaoKeyReleased

    private void txtDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusLost
        if (!txtData.getText().equals("  /  /    ")) {
            Date data = new Date();
            Date hoje = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                data = sdf.parse(txtData.getText().toString());
            } catch (ParseException ex) {
                Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (Integer.valueOf(txtData.getText().substring(0, 2)) > 31
                    || Integer.valueOf(txtData.getText().substring(3, 5)) > 12) {


                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                txtData.setText(null);
            } else if (data.after(hoje)) {

                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                txtData.setText(null);

            }
        }

    }//GEN-LAST:event_txtDataFocusLost

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            this.lancamento = lancamento;
            preencherLancamento();
            daoPesquisar.alterarLancamento(lancamento, lancamento.getIdLancamento());
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            tblLancamento.setModel(daoLancamento.pesquisar());
            txtData.setEnabled(true);

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Um erro ocorreu, a alteração não pode ser concluída!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
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
            java.util.logging.Logger.getLogger(cadastrarLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new cadastrarLancamento().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPesquisarSindicalizado;
    private javax.swing.JComboBox cbxCategoriaConvenio;
    private javax.swing.JComboBox cbxConvenio;
    private javax.swing.JCheckBox cbxDataAtual;
    private javax.swing.JFrame formSindicalizado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblLancamento;
    private javax.swing.JTable tblSindicalizado;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JLabel txtFuncionario;
    private javax.swing.JTextField txtSindicalizado;
    private javax.swing.JFormattedTextField txtValorGasto;
    // End of variables declaration//GEN-END:variables

    private boolean camposVazios() {
        boolean verificacao = false;
        if ((txtSindicalizado.getText().equals(""))
                || (cbxConvenio.getSelectedItem().toString().equals("Selecione:"))
                || (cbxCategoriaConvenio.getSelectedItem().equals("Selecione:"))
                || (txtValorGasto.getText().equals(""))
                || (txtData.getText().equals("  /  /    "))
                || (txtDescricao.getText().equals(""))) {

            verificacao = true;
        }
        return (verificacao);
    }

    private void limpar() {
        txtSindicalizado.setText(null);
        cbxCategoriaConvenio.setSelectedIndex(0);
        cbxConvenio.setSelectedIndex(0);
        cbxDataAtual.setSelected(false);
        txtData.setText(null);
        txtDescricao.setText(null);
        txtValorGasto.setText(null);
    }

    private void preencherLancamento() {
        if (txtValorGasto.getText().contains(",") == false) {
            valor = txtValorGasto.getText().replace(",", ".");
            gasto = Double.parseDouble(valor);
            valor = (df.format(gasto)).replace(",", ".");
        } else {
            valor = txtValorGasto.getText().replace(",", ".");
        }

        lancamento.setIdSindicalizado("" + daoSindicalizado.pesquisarId(txtSindicalizado.getText()));
        lancamento.setIdCategoria("" + daoCategoria.pesquisarId(cbxCategoriaConvenio.getSelectedItem().toString()));
        lancamento.setIdConvenio("" + daoConvenio.pesquisarId(cbxConvenio.getSelectedItem().toString()));
        lancamento.setValorGasto(valor);
        lancamento.setData(txtData.getText());
        lancamento.setDescricao(txtDescricao.getText());
        lancamento.setIdFuncionario("" + formLogin.getIdUsuario());
    }

    public void alterar(Lancamento lancamento) {
        this.lancamento = lancamento;

        cbxConvenio.setSelectedItem(lancamento.getIdConvenio());
        txtValorGasto.setText(lancamento.getValorGasto());
        txtData.setText(lancamento.getData());
        txtDescricao.setText(lancamento.getDescricao());
    }

    void setarCamposAlteracao() {
        txtSindicalizado.setText(lancamento.getSindicalizado().getNomeSindicalizado());

        cbxCategoriaConvenio.removeAllItems();
        cbxCategoriaConvenio.addItem((lancamento.getCategoria().getTipoCategoria()).toString());
        
        cbxConvenio.removeAllItems();
        cbxConvenio.addItem((lancamento.getConvenio().getNomeFantasia()).toString());


        txtValorGasto.setText(lancamento.getValorGasto().replace(".", ","));
        txtData.setText(lancamento.getData());
        txtDescricao.setText(lancamento.getDescricao());
        txtFuncionario.setText("" + formLogin.getIdUsuario());
    }

    public void caregarCampos() {
        cbxCategoriaConvenio.removeAllItems();
        cbxCategoriaConvenio.addItem("Selecione:");
        categoria = daoCategoria.pesquisarCategoria();

        for (int i = 0; i < categoria.size(); i++) {
            cbxCategoriaConvenio.addItem(categoria.get(i).toString());
        }
    }

    private void carregarConvenio() {

        idConvenio = daoCategoria.pesquisarId(cbxCategoriaConvenio.getSelectedItem().toString());

        cbxConvenio.removeAllItems();
        cbxConvenio.addItem("Selecione:");
        convenio = daoConvenio.pesquisarConvenio("" + idConvenio);

        for (int i = 0; i < convenio.size(); i++) {
            cbxConvenio.addItem(convenio.get(i).toString());
        }

    }
}
