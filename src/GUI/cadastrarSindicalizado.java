package GUI;

import DAO.DAODependente;
import DAO.DAOPesquisar;
import DAO.DAOSindicalizado;
import MODEL.Dependente;
import MODEL.Sindicalizado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import window.Window;

public class cadastrarSindicalizado extends javax.swing.JFrame {

    Sindicalizado sindicalizado = new Sindicalizado();
    formPesquisa pesquisa;
    private DAOSindicalizado daoSindicalizado = new DAOSindicalizado();
    private DAODependente daoDependente = new DAODependente();
    private DAOPesquisar daoPesquisar = new DAOPesquisar();
    window.Window w = new Window();
    int index, idMax;
    String nome;

    public cadastrarSindicalizado() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etapa2 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnProximo2 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        txtInstituicaoTrabalho = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCargoInstituicao = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        btnAlterar2 = new javax.swing.JButton();
        etapa3 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnConfirmar2 = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        btvoltar2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cbxCargoEletivo = new javax.swing.JComboBox();
        lblQual = new javax.swing.JLabel();
        txtCargoSindicato = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDataContrato = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDataAprovacao = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDependete = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar3 = new javax.swing.JButton();
        formDependente = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbxTipo = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNomeDependente = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtNascimentoDependente = new javax.swing.JFormattedTextField();
        cbxSexo = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSIAPE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeSindicalizado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomePai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxNacionalidade = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        cbxEstadoExpedidor = new javax.swing.JComboBox();
        btnProximo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        btnAlterar1 = new javax.swing.JButton();

        etapa2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        etapa2.setMinimumSize(new java.awt.Dimension(466, 384));
        etapa2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                etapa2WindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(472, 340));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CADASTRAR SINDICALIZADO");

        btnProximo2.setText("Próximo");
        btnProximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximo2ActionPerformed(evt);
            }
        });

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de contato: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel14.setText("Endereço:");

        jLabel16.setText("Bairro:");

        jLabel17.setText("Cidade:");

        jLabel18.setText("CEP:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        jLabel19.setText("Estado:");

        jLabel20.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel21.setText("Instituição em que trabalha:");

        jLabel22.setText("Cargo ou função na instituição:");

        jLabel15.setText("N°:");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(207, 207, 207)
                                .addComponent(jLabel15))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel18)
                                        .addGap(233, 233, 233))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtBairro)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(119, 119, 119))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(119, 119, 119))
                                            .addComponent(txtCidade)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(txtInstituicaoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCargoInstituicao))))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargoInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstituicaoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("ETAPA 2 DE 3");

        btnAlterar2.setText("Alterar Dados");
        btnAlterar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnCancelar1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVoltar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAlterar2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnProximo2))
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar2)
                    .addComponent(btnProximo2)
                    .addComponent(btnVoltar)
                    .addComponent(btnCancelar1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout etapa2Layout = new javax.swing.GroupLayout(etapa2.getContentPane());
        etapa2.getContentPane().setLayout(etapa2Layout);
        etapa2Layout.setHorizontalGroup(
            etapa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        etapa2Layout.setVerticalGroup(
            etapa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        etapa3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        etapa3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                etapa3WindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(525, 400));
        jPanel3.setRequestFocusEnabled(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CADASTRAR SINDICALIZADO");

        btnConfirmar2.setText("Finalizar");
        btnConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar2ActionPerformed(evt);
            }
        });

        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btvoltar2.setText("Voltar");
        btvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltar2ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("ETAPA 3 DE 3");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações contratuais:  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel24.setText("Já exerceu cargo eletivo no sindicato?");

        cbxCargoEletivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Sim", "Não" }));
        cbxCargoEletivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoEletivoActionPerformed(evt);
            }
        });

        lblQual.setText("Qual?");

        jLabel28.setText("Data do contrato:");

        try {
            txtDataContrato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataContratoFocusLost(evt);
            }
        });

        jLabel29.setText("Data da aprovação:");

        try {
            txtDataAprovacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAprovacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataAprovacaoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtDataContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataAprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxCargoEletivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQual)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel29))
                    .addComponent(txtCargoSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCargoEletivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataAprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dependente: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblDependete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo Dependente", "Data Nascimento", "Sexo"
            }
        ));
        tblDependete.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblDependete);

        btnAdicionar.setText("Adicionar Dependente");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Inativar Dependente");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAlterar3.setText("Alterar dados");
        btnAlterar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCancelar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btvoltar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmar2))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAlterar3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar2)
                    .addComponent(btnCancelar2)
                    .addComponent(btvoltar2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout etapa3Layout = new javax.swing.GroupLayout(etapa3.getContentPane());
        etapa3.getContentPane().setLayout(etapa3Layout);
        etapa3Layout.setHorizontalGroup(
            etapa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etapa3Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        etapa3Layout.setVerticalGroup(
            etapa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        formDependente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        formDependente.setBackground(new java.awt.Color(255, 255, 255));
        formDependente.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formDependenteWindowOpened(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("CADASTRAR DEPENDENTE");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Cônjuge", "Filho(a)", "Pai", "Mãe" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        jLabel27.setText("Nome:");

        jLabel31.setText("Tipo dependente:");

        jLabel32.setText("Data Nascimento:");

        try {
            txtNascimentoDependente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimentoDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoDependenteActionPerformed(evt);
            }
        });
        txtNascimentoDependente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNascimentoDependenteFocusLost(evt);
            }
        });

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Masculino", "Feminino" }));

        jLabel33.setText("Sexo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(txtNascimentoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(txtNomeDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNascimentoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOk.setText("Confirmar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnOk))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formDependenteLayout = new javax.swing.GroupLayout(formDependente.getContentPane());
        formDependente.getContentPane().setLayout(formDependenteLayout);
        formDependenteLayout.setHorizontalGroup(
            formDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDependenteLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formDependenteLayout.setVerticalGroup(
            formDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDependenteLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(489, 481));
        setName("etapa1"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(489, 481));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRAR SINDICALIZADO");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações pessoais: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SIAPE:");

        jLabel2.setText("Nome proponente:");

        jLabel4.setText("Nome do pai:");

        jLabel5.setText("Nome da mãe:");

        txtNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMaeActionPerformed(evt);
            }
        });

        jLabel6.setText("Naturalidade:");

        txtNaturalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaturalidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Nacionalidade:");

        cbxNacionalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Brasil", "Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Antilhas Neerlandesas", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man", "Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "Mayotte", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Checa", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Cristóvão e Neves", "São Marinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
        cbxNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNacionalidadeActionPerformed(evt);
            }
        });

        jLabel8.setText("Data de nascimento:");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascimentoFocusLost(evt);
            }
        });

        jLabel9.setText("Estado civil:");

        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Casado(a)", "Solteiro", "Viúvo(a)" }));

        jLabel10.setText("RG:");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel30.setText("Estado expedidor:");

        cbxEstadoExpedidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomePai)
                    .addComponent(txtNomeMae)
                    .addComponent(txtNomeSindicalizado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSIAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel30)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(jLabel11)
                                            .addComponent(cbxNacionalidade, 0, 1, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addComponent(cbxEstadoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSIAPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstadoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnSair.setText("Cancelar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("ETAPA 1 DE 3");

        btnAlterar1.setText("Alterar Dados");
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar1)
                    .addComponent(btnProximo)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize(510, 550);
        w.SetAligment(this, "Cadastrar Sindicalizado");
        
        if (formPesquisa.isVerificacao() == true) {
            txtSIAPE.setEnabled(false);
            btnAlterar1.setVisible(true);
            btnAlterar2.setVisible(true);
            btnAlterar3.setVisible(true);     
            btnConfirmar2.setVisible(false);
        } else {

            btnAlterar1.setVisible(false);
            btnAlterar2.setVisible(false);
            btnAlterar3.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMaeActionPerformed
   }//GEN-LAST:event_txtNomeMaeActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
//        if ((txtSIAPE.getText().equals(""))
//                || (txtNomeSindicalizado.getText().equals(""))
//                || (txtNomePai.getText().equals(""))
//                || (txtNomeMae.getText().equals(""))
//                || (cbxNacionalidade.getSelectedItem().equals("Selecione:"))
//                || (txtNaturalidade.getText().equals(""))
//                || (cbxEstadoCivil.getSelectedItem().toString().equals("Selecione:"))
//                || (txtDataNascimento.getText().equals("  /  /    "))
//                || (txtRG.getText().equals("  .   .   "))
//                || (txtCPF.getText().equals("   .   .   -  "))) {
//
//            JOptionPane.showMessageDialog(null, "Campo(s) em Branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
//
//        } else {
        etapa2.setVisible(true);
        this.dispose();
//        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnProximo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximo2ActionPerformed
//        if ((txtEndereco.getText().equals(""))
//                || (txtNumero.getText().equals(""))
//                || (txtBairro.getText().equals(""))
//                || (txtCidade.getText().equals(""))
//                || (txtCEP.getText().equals("     -   "))
//                || (cbxEstado.getSelectedItem().toString().equals("Selecione:"))
//                || (txtTelefone.getText().equals("(  )    -    "))
//                || (txtInstituicaoTrabalho.getText().equals(""))) {
//
//            JOptionPane.showMessageDialog(null, "Campo(s) em Branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
//        } else {
        etapa3.setVisible(true);
        etapa2.dispose();
//        }
    }//GEN-LAST:event_btnProximo2ActionPerformed

    private void btnConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar2ActionPerformed
        try {

            if (cbxCargoEletivo.getSelectedItem().toString().equals("Sim")) {
                if (txtCargoSindicato.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite seu cargo no sindicato!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (txtDataAprovacao.getText().equals("  /  /    ") || txtDataContrato.getText().equals("  /  /    ")
                    || cbxCargoEletivo.getSelectedItem().toString().equals("Selecione:")) {
                JOptionPane.showMessageDialog(null, "Campos em branco!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            } else {

                preencherSindicalizado();
                daoSindicalizado.inserir(sindicalizado);
                idMax = daoDependente.pesquisarMaxId();
                preencherDependente(idMax);

                JOptionPane.showMessageDialog(null, "Inserção feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                limpar();
                this.setVisible(true);
                etapa3.dispose();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro:" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmar2ActionPerformed

    private void etapa3WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_etapa3WindowOpened
        etapa3.setSize(600, 610);
        w.SetAligment(etapa3, "Cadastrar Sindicalizado");
        etapa3.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
        lblQual.setVisible(false);
        txtCargoSindicato.setVisible(false);
    }//GEN-LAST:event_etapa3WindowOpened

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void etapa2WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_etapa2WindowOpened
        etapa2.setSize(490, 455);
        w.SetAligment(etapa2, "Cadastrar Sindicalizado");
        etapa2.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_etapa2WindowOpened

    private void cbxCargoEletivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoEletivoActionPerformed
        if (cbxCargoEletivo.getSelectedItem().toString().equals("Não")) {
            lblQual.setVisible(false);
            txtCargoSindicato.setVisible(false);
        } else {
            lblQual.setVisible(true);
            txtCargoSindicato.setVisible(true);
        }
    }//GEN-LAST:event_cbxCargoEletivoActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        etapa2.dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        etapa3.dispose();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void cbxNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNacionalidadeActionPerformed

    private void txtNaturalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaturalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNaturalidadeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            index = tblDependete.getSelectedRow();
            System.out.println(index);
            if (index > -1) {
                JOptionPane.showConfirmDialog(null, "Essa açao removerá a linha selecionada, se desejar continuar clique em confirmar", "Atenção", JOptionPane.WARNING_MESSAGE);

                ((DefaultTableModel) tblDependete.getModel()).removeRow(index);

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um item a ser excluido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de Vínculos.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNascimentoDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoDependenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoDependenteActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (txtNomeDependente.getText().equals("") || cbxTipo.getSelectedItem().toString().equals("Selecione:")
                || txtNascimentoDependente.getText().equals("  /  /    ") || cbxSexo.getSelectedItem().toString().equals("Selecione:")) {
        }

        ((DefaultTableModel) tblDependete.getModel()).addRow(new String[]{txtNomeDependente.getText(), cbxTipo.getSelectedItem().toString(),
                    txtNascimentoDependente.getText(), cbxSexo.getSelectedItem().toString()});

        txtNomeDependente.setText(null);
        cbxTipo.setSelectedIndex(0);
        txtNascimentoDependente.setText(null);
        cbxSexo.setSelectedIndex(0);

    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        formDependente.setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formDependenteWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formDependenteWindowOpened
        formDependente.setSize(370, 270);
        w.SetAligment(formDependente, "Adicionar Dependente");

        formDependente.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_formDependenteWindowOpened

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        etapa2.dispose();
        this.setVisible(true);
        setSize(510, 550);
        this.setSize(510, 550);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltar2ActionPerformed
        etapa3.dispose();
        etapa2.setVisible(true);
        setSize(510, 550);
        this.setSize(510, 550);
    }//GEN-LAST:event_btvoltar2ActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        if (cbxTipo.getSelectedItem().equals("Mãe")) {
            cbxSexo.removeAllItems();
            cbxSexo.addItem("Feminino");
        } else if (cbxTipo.getSelectedItem().equals("Pai")) {
            cbxSexo.removeAllItems();
            cbxSexo.addItem("Masculino");
        } else {
            cbxSexo.removeAllItems();
            cbxSexo.addItem("Selecione:");
            cbxSexo.addItem("Feminino");
            cbxSexo.addItem("Masculino");
        }

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txtDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimentoFocusLost
        if(!txtDataNascimento.getText().equals("  /  /    ")){
        Date data = new Date();
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            data = sdf.parse(txtDataNascimento.getText().toString());
        } catch (ParseException ex) {
            Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (Integer.valueOf(txtDataNascimento.getText().substring(0, 2)) > 31
                || Integer.valueOf(txtDataNascimento.getText().substring(3, 5)) > 12) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtDataNascimento.setText(null);
        } else if (data.after(hoje)) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtDataNascimento.setText(null);

        }
    }
    }//GEN-LAST:event_txtDataNascimentoFocusLost

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
        try {
            preencherSindicalizado();

            daoPesquisar.alterarSindicalizado(sindicalizado, sindicalizado.getIdSindicalizado());
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu, a alteração não pode ser concluída!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnAlterar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar2ActionPerformed
        try {
            preencherSindicalizado();

            daoPesquisar.alterarSindicalizado(sindicalizado, sindicalizado.getIdSindicalizado());
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu, a alteração não pode ser concluída!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterar2ActionPerformed

    private void txtDataContratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataContratoFocusLost
        Date data = new Date();
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            data = sdf.parse(txtDataContrato.getText().toString());
        } catch (ParseException ex) {
            Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (Integer.valueOf(txtDataContrato.getText().substring(0, 2)) > 31
                || Integer.valueOf(txtDataContrato.getText().substring(3, 5)) > 12) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtDataContrato.setText(null);
        } else if (data.after(hoje)) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtDataContrato.setText(null);

        }

    }//GEN-LAST:event_txtDataContratoFocusLost

    private void txtDataAprovacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataAprovacaoFocusLost
        Date data = new Date();
        Date data2 = new Date();
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            data = sdf.parse(txtDataAprovacao.getText().toString());
            data2 = sdf.parse(txtDataContrato.getText().toString());
        } catch (ParseException ex) {
            Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

        }

        if ((Integer.valueOf(txtDataAprovacao.getText().substring(0, 2)) > 31
                || Integer.valueOf(txtDataNascimento.getText().substring(3, 5)) > 12)) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtDataAprovacao.setText(null);
        } else if (data.after(hoje) && data2.before(data)) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtDataAprovacao.setText(null);

        }

    }//GEN-LAST:event_txtDataAprovacaoFocusLost

    private void txtNascimentoDependenteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNascimentoDependenteFocusLost
        Date data = new Date();
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            data = sdf.parse(txtNascimentoDependente.getText().toString());

        } catch (ParseException ex) {
            Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

        }

        if ((Integer.valueOf(txtNascimentoDependente.getText().substring(0, 2)) > 31
                || Integer.valueOf(txtNascimentoDependente.getText().substring(3, 5)) > 12)) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtNascimentoDependente.setText(null);
        } else if (data.after(hoje)) {

            JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtNascimentoDependente.setText(null);

        }
    }//GEN-LAST:event_txtNascimentoDependenteFocusLost

    private void btnAlterar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar3ActionPerformed
        try {
            preencherSindicalizado();

            daoPesquisar.alterarSindicalizado(sindicalizado, sindicalizado.getIdSindicalizado());
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu, a alteração não pode ser concluída!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterar3ActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        formDependente.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(cadastrarSindicalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarSindicalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarSindicalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarSindicalizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new cadastrarSindicalizado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JButton btnAlterar2;
    private javax.swing.JButton btnAlterar3;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnConfirmar2;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnProximo2;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btvoltar2;
    private javax.swing.JComboBox cbxCargoEletivo;
    private javax.swing.JComboBox cbxEstado;
    private javax.swing.JComboBox cbxEstadoCivil;
    private javax.swing.JComboBox cbxEstadoExpedidor;
    private javax.swing.JComboBox cbxNacionalidade;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JComboBox cbxTipo;
    private javax.swing.JFrame etapa2;
    private javax.swing.JFrame etapa3;
    private javax.swing.JFrame formDependente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblQual;
    private javax.swing.JTable tblDependete;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCargoInstituicao;
    private javax.swing.JTextField txtCargoSindicato;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataAprovacao;
    private javax.swing.JFormattedTextField txtDataContrato;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInstituicaoTrabalho;
    private javax.swing.JFormattedTextField txtNascimentoDependente;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNomeDependente;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtNomeSindicalizado;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtSIAPE;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        txtSIAPE.setText(null);
        txtNomeSindicalizado.setText(null);
        txtNomePai.setText(null);
        txtNomeMae.setText(null);
        txtNaturalidade.setText(null);
        cbxNacionalidade.setSelectedIndex(0);
        txtDataNascimento.setText(null);
        cbxEstadoCivil.setSelectedIndex(0);
        txtRG.setText(null);
        cbxEstadoExpedidor.setSelectedIndex(0);
        txtCPF.setText(null);
        txtEndereco.setText(null);
        txtBairro.setText(null);
        txtNumero.setText(null);
        txtCEP.setText(null);
        txtCidade.setText(null);
        cbxEstado.setSelectedIndex(0);
        txtTelefone.setText(null);
        txtInstituicaoTrabalho.setText(null);
        txtCargoInstituicao.setText(null);
        txtCargoSindicato.setText(null);
        txtDataNascimento.setText(null);
        txtDataContrato.setText(null);
        txtDataAprovacao.setText(null);

    }

    private void preencherDependente(int idMax) {
        for (int x = 0; x < tblDependete.getRowCount(); x++) {
            Dependente dependente = new Dependente();
            dependente.setNomeDependente("" + ((DefaultTableModel) tblDependete.getModel()).getValueAt(x, 0));
            dependente.setTipoDependente("" + ((DefaultTableModel) tblDependete.getModel()).getValueAt(x, 1));
            dependente.setDataNascimento("" + ((DefaultTableModel) tblDependete.getModel()).getValueAt(x, 2));
            dependente.setSexo("" + ((DefaultTableModel) tblDependete.getModel()).getValueAt(x, 3));
            dependente.setIdSindicalizado(idMax);
            daoDependente.inserir(dependente);

        }

    }

    private void preencherSindicalizado() {
        sindicalizado.setNumeroMatricula(txtSIAPE.getText());
        sindicalizado.setNomeSindicalizado(txtNomeSindicalizado.getText());
        sindicalizado.setPaiSindicalizado(txtNomePai.getText());
        sindicalizado.setMaeSindicalizado(txtNomeMae.getText());
        sindicalizado.setNaturalidadeSindicalizado(txtNaturalidade.getText());
        sindicalizado.setNacionalidadeSindicalizado(cbxNacionalidade.getSelectedItem().toString());
        sindicalizado.setDataNascimento(txtDataNascimento.getText());
        sindicalizado.setEstadocivilSindicalizado(cbxEstadoCivil.getSelectedItem().toString());
        sindicalizado.setRGSindicalizado(txtRG.getText());
        sindicalizado.setCPFSindicalizado(txtCPF.getText());
        sindicalizado.setEstadoOrgaoExpedidor(cbxEstadoExpedidor.getSelectedItem().toString());
        sindicalizado.setEnderecoSindicalizado(txtEndereco.getText());
        sindicalizado.setBairroSindicalizado(txtBairro.getText());
        sindicalizado.setNumeroSindicalizado(txtNumero.getText());
        sindicalizado.setCEPSindicalizado(txtCEP.getText());
        sindicalizado.setCidadeSindicalizado(txtCidade.getText());
        sindicalizado.setEstadoSindicalizado(cbxEstado.getSelectedItem().toString());
        sindicalizado.setTelefoneSindicalizado(txtTelefone.getText());
        sindicalizado.setInstituicaoTrabalho(txtInstituicaoTrabalho.getText());
        sindicalizado.setCargoTrabalho(txtCargoInstituicao.getText());
        sindicalizado.setCargoSindicato(txtCargoSindicato.getText());
        sindicalizado.setCargoEletivoSindicalizado(cbxCargoEletivo.getSelectedItem().toString());
        sindicalizado.setDataContrato(txtDataContrato.getText());
        sindicalizado.setDataAprovacao(txtDataAprovacao.getText());
    }

    public void alterar(Sindicalizado sindicalizado) {
        this.sindicalizado = sindicalizado;

        System.out.println("Alterar: " + sindicalizado.getIdSindicalizado());

        txtSIAPE.setText(sindicalizado.getNumeroMatricula());
        txtNomeSindicalizado.setText(sindicalizado.getNomeSindicalizado());
        txtNomePai.setText(sindicalizado.getPaiSindicalizado());
        txtNomeMae.setText(sindicalizado.getMaeSindicalizado());
        txtNaturalidade.setText(sindicalizado.getNaturalidadeSindicalizado());
        cbxNacionalidade.setSelectedItem(sindicalizado.getNacionalidadeSindicalizado());
        txtDataNascimento.setText(sindicalizado.getDataNascimento());
        cbxEstadoCivil.setSelectedItem(sindicalizado.getEstadocivilSindicalizado());
        txtRG.setText(sindicalizado.getRGSindicalizado());
        System.out.println(sindicalizado.getEstadoOrgaoExpedidor());
        cbxEstadoExpedidor.setSelectedItem(sindicalizado.getEstadoOrgaoExpedidor());
        txtCPF.setText(sindicalizado.getCPFSindicalizado());
        txtEndereco.setText(sindicalizado.getEnderecoSindicalizado());
        txtNumero.setText(sindicalizado.getNumeroSindicalizado());
        txtBairro.setText(sindicalizado.getBairroSindicalizado());
        txtCidade.setText(sindicalizado.getCidadeSindicalizado());
        txtCEP.setText(sindicalizado.getCEPSindicalizado());
        cbxEstado.setSelectedItem(sindicalizado.getEstadoSindicalizado());
        txtTelefone.setText(sindicalizado.getTelefoneSindicalizado());
        txtInstituicaoTrabalho.setText(sindicalizado.getInstituicaoTrabalho());
        txtCargoInstituicao.setText(sindicalizado.getCargoTrabalho());
        cbxCargoEletivo.setSelectedItem(sindicalizado.getCargoEletivoSindicalizado());
        txtCargoSindicato.setText(sindicalizado.getCargoSindicato());
        txtDataContrato.setText(sindicalizado.getDataContrato());
        txtDataAprovacao.setText(sindicalizado.getDataAprovacao());
        
        for (int c =0; c<sindicalizado.getDependente().size(); c++){
        ((DefaultTableModel) tblDependete.getModel()).addRow(new String[]{((Dependente)sindicalizado.getDependente().get(c)).getNomeDependente(),((Dependente)sindicalizado.getDependente().get(c)).getTipoDependente(),
        ((Dependente)sindicalizado.getDependente().get(c)).getDataNascimento(), ((Dependente)sindicalizado.getDependente().get(c)).getSexo()});
        }       
    }
}
