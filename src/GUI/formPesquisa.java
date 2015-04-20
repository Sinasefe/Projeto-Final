package GUI;

import BD.ConexaoBD;
import DAO.*;
import MODEL.*;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import window.Window;

public class formPesquisa extends javax.swing.JFrame {

    window.Window w = new Window();
    private DAOSindicalizado daoSindicalizado = new DAOSindicalizado();
    private DAOPesquisar daoPesquisar = new DAOPesquisar();
    private DAOConvenio daoConvenio = new DAOConvenio();
    private DAOLancamento daoLancamento = new DAOLancamento();
    private DAOCategoria daoCategoria = new DAOCategoria();
    private Sindicalizado sindicalizado;
    private Convenio convenio;
    ArrayList convenios;
    ArrayList categoria;
    private Lancamento lancamento;
    private String idLancamento, idSindicalizado, idConvenio;
    private int index;
    double soma = 0;
    private String nomeSindicalizado;
    private ArrayList lista = new ArrayList();
    private ArrayList<String> listaIdLancamento = new ArrayList<String>();
    private static boolean verificacao;
    String somaa;

    public void setSoma() {
        this.soma = 0;
    }

    public static void setVerificacao(boolean verificacao) {
        formPesquisa.verificacao = verificacao;
    }

    public static boolean isVerificacao() {
        return verificacao;
    }

    public formPesquisa() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosSindicalizado = new javax.swing.JFrame();
        pnlDadosSindicalizado = new javax.swing.JPanel();
        btnConsultarNovoSindicalizado = new javax.swing.JButton();
        btnSairSindicalizado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPesquisarSindicalizado = new javax.swing.JTable();
        btnAlterarSindicalizado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnExcluirSindicalizado = new javax.swing.JButton();
        dadosLancamentoPorSindicalizado = new javax.swing.JFrame();
        pnlDadosLancamento = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPesquisarLancamentoSindicalizado = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSomaSindicalizado = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnAlterarLancamentoSindicalizado = new javax.swing.JButton();
        btnExcluirLancamentoSindicalizado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRelatorioSindicalizado = new javax.swing.JButton();
        btnConsultarNovoLancamentoSindicalizado = new javax.swing.JButton();
        btnSairLancamentoSindicalizado = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSindicalizadoSelecionado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDataIncialSindicalizado = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDataFinalSindicalizado = new javax.swing.JLabel();
        dadosConvenio = new javax.swing.JFrame();
        pnlDadosConvenio = new javax.swing.JPanel();
        btnSairConvenio = new javax.swing.JButton();
        btnConsultarNovoConvenio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPesquisarConvenio = new javax.swing.JTable();
        btnExcluirConvenio = new javax.swing.JButton();
        btnAlterarConvenio = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        frameSindicalizado = new javax.swing.JFrame();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSindicalizado = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dadosLancamentoPorConvenio = new javax.swing.JFrame();
        pnlDadosLancamento1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPesquisarLancamentoConvenio = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSomaConvenio = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnAlterarLancamentoConvenio = new javax.swing.JButton();
        btnExcluirLancamentoConvenio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnRelatorioConvenio = new javax.swing.JToggleButton();
        btnConsultarNovoLancamentoConvenio = new javax.swing.JButton();
        btnSairLancamentoConvenio = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtConvenioSelecionado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDataIncialConvenio = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDataFinalConvenio = new javax.swing.JLabel();
        dadosLancamentoPorPeriodo = new javax.swing.JFrame();
        pnlDadosLancamento2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPesquisarLancamentoPeriodo = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtSomaPeriodo = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        btnAlterarLancamentoPeriodo = new javax.swing.JButton();
        btnExcluirLancamentoPeriodo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnRelatorioPeriodo = new javax.swing.JButton();
        btnConsultarNovoLancamentoPeriodo = new javax.swing.JButton();
        btnSairLancamentoPeriodo = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDataIncialPeriodo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDataFinallPeriodo = new javax.swing.JLabel();
        pesquisar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxPesquisar = new javax.swing.JComboBox();
        pnlConvenio = new javax.swing.JPanel();
        lblConvenio = new javax.swing.JLabel();
        cbxConvenio = new javax.swing.JComboBox();
        pnlLancamento = new javax.swing.JPanel();
        lblPeriodo = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        txtData1 = new javax.swing.JFormattedTextField();
        lblData2 = new javax.swing.JLabel();
        txtData2 = new javax.swing.JFormattedTextField();
        cbSindicalizado = new javax.swing.JCheckBox();
        txtSindicalizado2 = new javax.swing.JTextField();
        btnPesquisarSindicalizado2 = new javax.swing.JButton();
        cbConvenio = new javax.swing.JCheckBox();
        cbxConvenio2 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnlSindicalizado = new javax.swing.JPanel();
        lblSindicalizado = new javax.swing.JLabel();
        txtSindicalizado = new javax.swing.JTextField();
        btnPesquisarSindicalizado = new javax.swing.JButton();

        dadosSindicalizado.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dadosSindicalizado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dadosSindicalizadoWindowOpened(evt);
            }
        });

        pnlDadosSindicalizado.setBackground(new java.awt.Color(255, 255, 255));

        btnConsultarNovoSindicalizado.setText("Consultar novo");
        btnConsultarNovoSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNovoSindicalizadoActionPerformed(evt);
            }
        });

        btnSairSindicalizado.setText("Sair");
        btnSairSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairSindicalizadoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblPesquisarSindicalizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SIAPE:", null},
                {"Nome do proponente:", null},
                {"Nome do pai:", null},
                {"Nome da mãe:", null},
                {"Naturalidade:", null},
                {"Nacionalidade:", null},
                {"Data de nascimento:", null},
                {"Estado civil:", null},
                {"RG:", null},
                {"Estado Expedidor", null},
                {"CPF:", null},
                {"Endereço:", null},
                {"N°:", null},
                {"Bairro:", null},
                {"Cidade:", null},
                {"CEP:", null},
                {"Estado:", null},
                {"Telefone:", null},
                {"Instituição em que trabalha:", null},
                {"Cargo ou função na instituição:", null},
                {"Já exerceu cargo eletivo em outro sindicato:", null},
                {"Cargo:", null},
                {"Dependente(s):", null},
                {"Data do contrato:", null},
                {"Data da aprovação:", null}
            },
            new String [] {
                "Dados do sindicalizado pesquisado:", ""
            }
        ));
        jScrollPane5.setViewportView(tblPesquisarSindicalizado);

        btnAlterarSindicalizado.setText("Alterar dados");
        btnAlterarSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSindicalizadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Ações:");

        btnExcluirSindicalizado.setText("Excluir sindicalizado");
        btnExcluirSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSindicalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExcluirSindicalizado)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarSindicalizado)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirSindicalizado)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout pnlDadosSindicalizadoLayout = new javax.swing.GroupLayout(pnlDadosSindicalizado);
        pnlDadosSindicalizado.setLayout(pnlDadosSindicalizadoLayout);
        pnlDadosSindicalizadoLayout.setHorizontalGroup(
            pnlDadosSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosSindicalizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosSindicalizadoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosSindicalizadoLayout.createSequentialGroup()
                        .addComponent(btnSairSindicalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultarNovoSindicalizado)))
                .addContainerGap())
        );
        pnlDadosSindicalizadoLayout.setVerticalGroup(
            pnlDadosSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosSindicalizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlDadosSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarNovoSindicalizado)
                    .addComponent(btnSairSindicalizado))
                .addContainerGap())
        );

        javax.swing.GroupLayout dadosSindicalizadoLayout = new javax.swing.GroupLayout(dadosSindicalizado.getContentPane());
        dadosSindicalizado.getContentPane().setLayout(dadosSindicalizadoLayout);
        dadosSindicalizadoLayout.setHorizontalGroup(
            dadosSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dadosSindicalizadoLayout.setVerticalGroup(
            dadosSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dadosLancamentoPorSindicalizado.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dadosLancamentoPorSindicalizado.setMinimumSize(new java.awt.Dimension(662, 379));
        dadosLancamentoPorSindicalizado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dadosLancamentoPorSindicalizadoWindowOpened(evt);
            }
        });

        pnlDadosLancamento.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lançamentos realizados: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblPesquisarLancamentoSindicalizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Convênio:", "Valor gasto:", "Data:", "Descrição:", "Funcionário:"
            }
        ));
        jScrollPane4.setViewportView(tblPesquisarLancamentoSindicalizado);

        jPanel11.setBackground(new java.awt.Color(245, 245, 251));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TOTAL:");

        txtSomaSindicalizado.setBackground(new java.awt.Color(204, 204, 255));
        txtSomaSindicalizado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSomaSindicalizado.setForeground(new java.awt.Color(0, 0, 153));
        txtSomaSindicalizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSomaSindicalizado.setText("SOMA");
        txtSomaSindicalizado.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 255)));
        txtSomaSindicalizado.setFocusTraversalPolicyProvider(true);
        txtSomaSindicalizado.setOpaque(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSomaSindicalizado, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(245, 245, 251));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAlterarLancamentoSindicalizado.setText("Alterar dados");
        btnAlterarLancamentoSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLancamentoSindicalizadoActionPerformed(evt);
            }
        });

        btnExcluirLancamentoSindicalizado.setText("Excluir lançamentos");
        btnExcluirLancamentoSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLancamentoSindicalizadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Ações:");

        btnRelatorioSindicalizado.setText("Gerar Relatório");
        btnRelatorioSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioSindicalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlterarLancamentoSindicalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirLancamentoSindicalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorioSindicalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnAlterarLancamentoSindicalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirLancamentoSindicalizado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorioSindicalizado)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnConsultarNovoLancamentoSindicalizado.setText("Consultar novo");
        btnConsultarNovoLancamentoSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNovoLancamentoSindicalizadoActionPerformed(evt);
            }
        });

        btnSairLancamentoSindicalizado.setText("Sair");
        btnSairLancamentoSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLancamentoSindicalizadoActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(245, 245, 251));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sindicalizado:");

        txtSindicalizadoSelecionado.setText("SINDICALIZADO SELECIONADO");
        txtSindicalizadoSelecionado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Período:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setText("de");

        txtDataIncialSindicalizado.setText("DATA INICIAL");
        txtDataIncialSindicalizado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel20.setText("até");

        txtDataFinalSindicalizado.setText("DATA FINAL");
        txtDataFinalSindicalizado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSindicalizadoSelecionado))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataIncialSindicalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataFinalSindicalizado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSindicalizadoSelecionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(txtDataIncialSindicalizado)
                    .addComponent(jLabel20)
                    .addComponent(txtDataFinalSindicalizado))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDadosLancamentoLayout = new javax.swing.GroupLayout(pnlDadosLancamento);
        pnlDadosLancamento.setLayout(pnlDadosLancamentoLayout);
        pnlDadosLancamentoLayout.setHorizontalGroup(
            pnlDadosLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLancamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLancamentoLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLancamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSairLancamentoSindicalizado)
                        .addGap(484, 484, 484)
                        .addComponent(btnConsultarNovoLancamentoSindicalizado)
                        .addGap(38, 38, 38))
                    .addGroup(pnlDadosLancamentoLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlDadosLancamentoLayout.setVerticalGroup(
            pnlDadosLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLancamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarNovoLancamentoSindicalizado)
                    .addComponent(btnSairLancamentoSindicalizado))
                .addContainerGap())
        );

        javax.swing.GroupLayout dadosLancamentoPorSindicalizadoLayout = new javax.swing.GroupLayout(dadosLancamentoPorSindicalizado.getContentPane());
        dadosLancamentoPorSindicalizado.getContentPane().setLayout(dadosLancamentoPorSindicalizadoLayout);
        dadosLancamentoPorSindicalizadoLayout.setHorizontalGroup(
            dadosLancamentoPorSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dadosLancamentoPorSindicalizadoLayout.setVerticalGroup(
            dadosLancamentoPorSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLancamentoPorSindicalizadoLayout.createSequentialGroup()
                .addComponent(pnlDadosLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dadosConvenio.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dadosConvenio.setMinimumSize(new java.awt.Dimension(500, 380));
        dadosConvenio.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dadosConvenioWindowOpened(evt);
            }
        });

        pnlDadosConvenio.setBackground(new java.awt.Color(255, 255, 255));

        btnSairConvenio.setText("Sair");
        btnSairConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairConvenioActionPerformed(evt);
            }
        });

        btnConsultarNovoConvenio.setText("Consultar novo");
        btnConsultarNovoConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNovoConvenioActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblPesquisarConvenio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CNPJ:", null},
                {"Categoria:", null},
                {"Razão Social:", null},
                {"Nome Fantasia:", null},
                {"Endereço:", null},
                {"N°:", null},
                {"Bairro:", null},
                {"Cidade:", null},
                {"CEP:", null},
                {"Estado:", null},
                {"Telefone:", null}
            },
            new String [] {
                "Dados do convênio pesquisado:", ""
            }
        ));
        jScrollPane3.setViewportView(tblPesquisarConvenio);

        btnExcluirConvenio.setText("Excluir convênio");
        btnExcluirConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConvenioActionPerformed(evt);
            }
        });

        btnAlterarConvenio.setText("Alterar dados");
        btnAlterarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarConvenioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ações:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExcluirConvenio, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnAlterarConvenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirConvenio))
        );

        javax.swing.GroupLayout pnlDadosConvenioLayout = new javax.swing.GroupLayout(pnlDadosConvenio);
        pnlDadosConvenio.setLayout(pnlDadosConvenioLayout);
        pnlDadosConvenioLayout.setHorizontalGroup(
            pnlDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosConvenioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosConvenioLayout.createSequentialGroup()
                        .addComponent(btnSairConvenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultarNovoConvenio)))
                .addContainerGap())
        );
        pnlDadosConvenioLayout.setVerticalGroup(
            pnlDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarNovoConvenio)
                    .addComponent(btnSairConvenio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dadosConvenioLayout = new javax.swing.GroupLayout(dadosConvenio.getContentPane());
        dadosConvenio.getContentPane().setLayout(dadosConvenioLayout);
        dadosConvenioLayout.setHorizontalGroup(
            dadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dadosConvenioLayout.setVerticalGroup(
            dadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frameSindicalizado.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frameSindicalizado.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                frameSindicalizadoWindowOpened(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(245, 245, 251));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSindicalizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SINDICALIZADO", "SIAPE", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
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

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout frameSindicalizadoLayout = new javax.swing.GroupLayout(frameSindicalizado.getContentPane());
        frameSindicalizado.getContentPane().setLayout(frameSindicalizadoLayout);
        frameSindicalizadoLayout.setHorizontalGroup(
            frameSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frameSindicalizadoLayout.setVerticalGroup(
            frameSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dadosLancamentoPorConvenio.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dadosLancamentoPorConvenio.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dadosLancamentoPorConvenioWindowOpened(evt);
            }
        });

        pnlDadosLancamento1.setBackground(new java.awt.Color(255, 255, 255));
        pnlDadosLancamento1.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lançamentos realizados: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblPesquisarLancamentoConvenio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sindicalizado:", "Valor gasto:", "Data:", "Descrição:", "Funcionário:"
            }
        ));
        tblPesquisarLancamentoConvenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPesquisarLancamentoConvenioMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblPesquisarLancamentoConvenio);

        jPanel14.setBackground(new java.awt.Color(245, 245, 251));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("TOTAL:");

        txtSomaConvenio.setBackground(new java.awt.Color(204, 204, 255));
        txtSomaConvenio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSomaConvenio.setForeground(new java.awt.Color(0, 0, 102));
        txtSomaConvenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSomaConvenio.setText("SOMA");
        txtSomaConvenio.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 153)));
        txtSomaConvenio.setOpaque(true);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSomaConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(245, 245, 251));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAlterarLancamentoConvenio.setText("Alterar dados");
        btnAlterarLancamentoConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLancamentoConvenioActionPerformed(evt);
            }
        });

        btnExcluirLancamentoConvenio.setText("Excluir lançamentos");
        btnExcluirLancamentoConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLancamentoConvenioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Ações:");

        btnRelatorioConvenio.setText("Gerar Relatório");
        btnRelatorioConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioConvenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarLancamentoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRelatorioConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirLancamentoConvenio)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarLancamentoConvenio)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirLancamentoConvenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorioConvenio))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnConsultarNovoLancamentoConvenio.setText("Consultar novo");
        btnConsultarNovoLancamentoConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNovoLancamentoConvenioActionPerformed(evt);
            }
        });

        btnSairLancamentoConvenio.setText("Sair");
        btnSairLancamentoConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLancamentoConvenioActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(245, 245, 251));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Convênio:");

        txtConvenioSelecionado.setText("CONVÊNIO SELECIONADO");
        txtConvenioSelecionado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Período:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("de");

        txtDataIncialConvenio.setText("DATA INICIAL");
        txtDataIncialConvenio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel21.setText("até");

        txtDataFinalConvenio.setText("DATA FINAL");
        txtDataFinalConvenio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConvenioSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataIncialConvenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataFinalConvenio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtConvenioSelecionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtDataIncialConvenio)
                    .addComponent(jLabel21)
                    .addComponent(txtDataFinalConvenio))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDadosLancamento1Layout = new javax.swing.GroupLayout(pnlDadosLancamento1);
        pnlDadosLancamento1.setLayout(pnlDadosLancamento1Layout);
        pnlDadosLancamento1Layout.setHorizontalGroup(
            pnlDadosLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLancamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLancamento1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLancamento1Layout.createSequentialGroup()
                        .addGroup(pnlDadosLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosLancamento1Layout.createSequentialGroup()
                                .addComponent(btnSairLancamentoConvenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultarNovoLancamentoConvenio))
                            .addGroup(pnlDadosLancamento1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        pnlDadosLancamento1Layout.setVerticalGroup(
            pnlDadosLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLancamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarNovoLancamentoConvenio)
                    .addComponent(btnSairLancamentoConvenio))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dadosLancamentoPorConvenioLayout = new javax.swing.GroupLayout(dadosLancamentoPorConvenio.getContentPane());
        dadosLancamentoPorConvenio.getContentPane().setLayout(dadosLancamentoPorConvenioLayout);
        dadosLancamentoPorConvenioLayout.setHorizontalGroup(
            dadosLancamentoPorConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosLancamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dadosLancamentoPorConvenioLayout.setVerticalGroup(
            dadosLancamentoPorConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosLancamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dadosLancamentoPorPeriodo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dadosLancamentoPorPeriodo.setMinimumSize(new java.awt.Dimension(653, 354));
        dadosLancamentoPorPeriodo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dadosLancamentoPorPeriodoWindowOpened(evt);
            }
        });

        pnlDadosLancamento2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lançamentos realizados: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblPesquisarLancamentoPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sindicalizado:", "Valor gasto:", "Convênio:", "Data:", "Descrição:", "Funcionário:"
            }
        ));
        jScrollPane7.setViewportView(tblPesquisarLancamentoPeriodo);

        jPanel17.setBackground(new java.awt.Color(245, 245, 251));
        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("TOTAL:");

        txtSomaPeriodo.setBackground(new java.awt.Color(204, 204, 255));
        txtSomaPeriodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSomaPeriodo.setForeground(new java.awt.Color(0, 0, 102));
        txtSomaPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSomaPeriodo.setText("SOMA");
        txtSomaPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 153)));
        txtSomaPeriodo.setOpaque(true);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomaPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSomaPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(245, 245, 251));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAlterarLancamentoPeriodo.setText("Alterar dados");
        btnAlterarLancamentoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLancamentoPeriodoActionPerformed(evt);
            }
        });

        btnExcluirLancamentoPeriodo.setText("Excluir lançamentos");
        btnExcluirLancamentoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLancamentoPeriodoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Ações:");

        btnRelatorioPeriodo.setText("Gerar Relatório");
        btnRelatorioPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarLancamentoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRelatorioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirLancamentoPeriodo)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarLancamentoPeriodo)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirLancamentoPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorioPeriodo))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnConsultarNovoLancamentoPeriodo.setText("Consultar novo");
        btnConsultarNovoLancamentoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarNovoLancamentoPeriodoActionPerformed(evt);
            }
        });

        btnSairLancamentoPeriodo.setText("Sair");
        btnSairLancamentoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLancamentoPeriodoActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(245, 245, 251));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Período:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setText("de");

        txtDataIncialPeriodo.setText("DATA INICIAL");
        txtDataIncialPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel23.setText("até");

        txtDataFinallPeriodo.setText("DATA FINAL");
        txtDataFinallPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataIncialPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataFinallPeriodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(txtDataIncialPeriodo)
                    .addComponent(jLabel23)
                    .addComponent(txtDataFinallPeriodo))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDadosLancamento2Layout = new javax.swing.GroupLayout(pnlDadosLancamento2);
        pnlDadosLancamento2.setLayout(pnlDadosLancamento2Layout);
        pnlDadosLancamento2Layout.setHorizontalGroup(
            pnlDadosLancamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLancamento2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLancamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDadosLancamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlDadosLancamento2Layout.createSequentialGroup()
                            .addComponent(btnSairLancamentoPeriodo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultarNovoLancamentoPeriodo))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosLancamento2Layout.setVerticalGroup(
            pnlDadosLancamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLancamento2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLancamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarNovoLancamentoPeriodo)
                    .addComponent(btnSairLancamentoPeriodo))
                .addContainerGap())
        );

        javax.swing.GroupLayout dadosLancamentoPorPeriodoLayout = new javax.swing.GroupLayout(dadosLancamentoPorPeriodo.getContentPane());
        dadosLancamentoPorPeriodo.getContentPane().setLayout(dadosLancamentoPorPeriodoLayout);
        dadosLancamentoPorPeriodoLayout.setHorizontalGroup(
            dadosLancamentoPorPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosLancamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dadosLancamentoPorPeriodoLayout.setVerticalGroup(
            dadosLancamentoPorPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLancamentoPorPeriodoLayout.createSequentialGroup()
                .addComponent(pnlDadosLancamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(347, 305));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        pesquisar.setMinimumSize(new java.awt.Dimension(0, 0));
        pesquisar.setPreferredSize(new java.awt.Dimension(347, 305));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PESQUISAR");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções de pesquisa: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setText("Consultar:");

        cbxPesquisar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Convenio", "Lançamento", "Sindicalizado" }));
        cbxPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pnlConvenio.setBackground(new java.awt.Color(255, 255, 255));
        pnlConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONVÊNIO: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N
        pnlConvenio.setName(""); // NOI18N

        lblConvenio.setText("Selecione o convênio: ");

        cbxConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", " " }));
        cbxConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConvenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConvenioLayout = new javax.swing.GroupLayout(pnlConvenio);
        pnlConvenio.setLayout(pnlConvenioLayout);
        pnlConvenioLayout.setHorizontalGroup(
            pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConvenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConvenioLayout.setVerticalGroup(
            pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvenioLayout.createSequentialGroup()
                .addGroup(pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConvenio)
                    .addComponent(cbxConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pnlLancamento.setBackground(new java.awt.Color(255, 255, 255));
        pnlLancamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LANÇAMENTO: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        lblPeriodo.setText("Período:");

        lblData1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblData1.setText("de");

        try {
            txtData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtData1FocusLost(evt);
            }
        });

        lblData2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblData2.setText("até");

        try {
            txtData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtData2FocusLost(evt);
            }
        });

        cbSindicalizado.setBackground(new java.awt.Color(255, 255, 255));
        cbSindicalizado.setText("Sindicalizado:");
        cbSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSindicalizadoActionPerformed(evt);
            }
        });

        btnPesquisarSindicalizado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/pesquisar 2.png"))); // NOI18N
        btnPesquisarSindicalizado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSindicalizado2ActionPerformed(evt);
            }
        });

        cbConvenio.setBackground(new java.awt.Color(255, 255, 255));
        cbConvenio.setText("Convenio:");
        cbConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConvenioActionPerformed(evt);
            }
        });

        cbxConvenio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:" }));
        cbxConvenio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxConvenio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLancamentoLayout = new javax.swing.GroupLayout(pnlLancamento);
        pnlLancamento.setLayout(pnlLancamentoLayout);
        pnlLancamentoLayout.setHorizontalGroup(
            pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLancamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(pnlLancamentoLayout.createSequentialGroup()
                        .addComponent(cbSindicalizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSindicalizado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarSindicalizado2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLancamentoLayout.createSequentialGroup()
                        .addGroup(pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLancamentoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPeriodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblData1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblData2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLancamentoLayout.createSequentialGroup()
                                .addComponent(cbConvenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxConvenio2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLancamentoLayout.setVerticalGroup(
            pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLancamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeriodo)
                    .addComponent(lblData1)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSindicalizado)
                        .addComponent(txtSindicalizado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarSindicalizado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConvenio)
                    .addComponent(cbxConvenio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSindicalizado.setBackground(new java.awt.Color(255, 255, 255));
        pnlSindicalizado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SINDICALIZADO: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        lblSindicalizado.setText("Digite um sindicalizado: ");

        txtSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSindicalizadoActionPerformed(evt);
            }
        });

        btnPesquisarSindicalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/pesquisar 2.png"))); // NOI18N
        btnPesquisarSindicalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSindicalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSindicalizadoLayout = new javax.swing.GroupLayout(pnlSindicalizado);
        pnlSindicalizado.setLayout(pnlSindicalizadoLayout);
        pnlSindicalizadoLayout.setHorizontalGroup(
            pnlSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSindicalizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSindicalizado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisarSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlSindicalizadoLayout.setVerticalGroup(
            pnlSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSindicalizadoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarSindicalizado)
                    .addGroup(pnlSindicalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSindicalizado)
                        .addComponent(txtSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pesquisarLayout = new javax.swing.GroupLayout(pesquisar);
        pesquisar.setLayout(pesquisarLayout);
        pesquisarLayout.setHorizontalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisarLayout.createSequentialGroup()
                        .addGroup(pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pesquisarLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pesquisarLayout.createSequentialGroup()
                        .addGroup(pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pesquisarLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar))
                            .addComponent(pnlLancamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSindicalizado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlConvenio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        pesquisarLayout.setVerticalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSindicalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize(360, 380);
        w.SetAligment(this, "Pesquisar Informações");
        setVerificacao(false);
        cbxPesquisar.setSelectedItem("Lançamento");
        txtSindicalizado2.setVisible(false);
        btnPesquisarSindicalizado2.setVisible(false);
        cbxConvenio2.setVisible(false);
        pnlConvenio.setVisible(false);
        pnlSindicalizado.setVisible(false);

        // Coloca os valores no combobox convênio
        cbxConvenio.removeAllItems();
        cbxConvenio.addItem("Selecione:");
        convenios = daoConvenio.pesquisarConvenio("*");

        for (int i = 0; i < convenios.size(); i++) {
            cbxConvenio.addItem(convenios.get(i).toString());
        }

        // Coloca os valores no combobox convênio2
        cbxConvenio2.removeAllItems();
        cbxConvenio2.addItem("Selecione:");
        convenios = daoConvenio.pesquisarConvenio("*");

        for (int i = 0; i < convenios.size(); i++) {
            cbxConvenio2.addItem(convenios.get(i).toString());
        }


    }//GEN-LAST:event_formWindowOpened

    private void cbxPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPesquisarActionPerformed
        if (cbxPesquisar.getSelectedIndex() == 0) {
            pnlConvenio.setVisible(true);
            pnlLancamento.setVisible(false);
            pnlSindicalizado.setVisible(false);

            this.setSize(410, 280);

        } else if (cbxPesquisar.getSelectedIndex() == 2) {
            pnlConvenio.setVisible(false);
            pnlLancamento.setVisible(false);
            pnlSindicalizado.setVisible(true);

            this.setSize(430, 280);


        } else if (cbxPesquisar.getSelectedIndex() == 1) {
            pnlConvenio.setVisible(false);
            pnlLancamento.setVisible(true);
            pnlSindicalizado.setVisible(false);

            this.setSize(360, 380);
        }
    }//GEN-LAST:event_cbxPesquisarActionPerformed

    private void btnPesquisarSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSindicalizadoActionPerformed
        if (txtSindicalizado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um sindicalizado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtSindicalizado.requestFocus();
        } else {
            DefaultTableModel tabela = daoSindicalizado.pesquisar(txtSindicalizado.getText());
            if (DAOSindicalizado.isVerificacao() == true) {
                JOptionPane.showMessageDialog(null, "Sindicalizado não encontrado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                txtSindicalizado.setText(null);
                txtSindicalizado.requestFocus();
            } else {
                frameSindicalizado.setVisible(true);
                tblSindicalizado.setModel(tabela);
            }
        }

    }//GEN-LAST:event_btnPesquisarSindicalizadoActionPerformed

    private void btnAlterarLancamentoSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLancamentoSindicalizadoActionPerformed
        int index = tblPesquisarLancamentoSindicalizado.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma lina da tabela", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            cadastrarLancamento tela = new cadastrarLancamento();
            tela.setLancamento(((Lancamento) lista.get(index)));

            tela.setarCamposAlteracao();
            setVerificacao(true);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarLancamentoSindicalizadoActionPerformed

    private void btnSairSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairSindicalizadoActionPerformed
        dadosSindicalizado.dispose();
    }//GEN-LAST:event_btnSairSindicalizadoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        if (cbxPesquisar.getSelectedIndex() == 0) {
            if (cbxConvenio.getSelectedItem().toString().equals("Selecione:")) {
                JOptionPane.showMessageDialog(null, "Selecione um convênio!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

            } else {
                this.dispose();
                dadosConvenio.setVisible(true);
                convenio = (daoPesquisar.pesquisarConvenio(cbxConvenio.getSelectedItem().toString()));

                DefaultTableModel model = (DefaultTableModel) tblPesquisarConvenio.getModel();

                model.setValueAt(convenio.getCNPJ(), 0, 1);
                model.setValueAt(convenio.getIdCategoria(), 1, 1);
                model.setValueAt(convenio.getRazaoSocial(), 2, 1);
                model.setValueAt(convenio.getNomeFantasia(), 3, 1);
                model.setValueAt(convenio.getEnderecoConvenio(), 4, 1);
                model.setValueAt(convenio.getNumeroConvenio(), 5, 1);
                model.setValueAt(convenio.getBairroConvenio(), 6, 1);
                model.setValueAt(convenio.getCidadeConvenio(), 7, 1);
                model.setValueAt(convenio.getCEPConvenio(), 8, 1);
                model.setValueAt(convenio.getEstadoConvenio(), 9, 1);
                model.setValueAt(convenio.getTelefoneConvenio(), 10, 1);

                dadosConvenio.setVisible(true);


            }

        } else if (cbxPesquisar.getSelectedIndex() == 1) {

            ((DefaultTableModel) tblPesquisarLancamentoPeriodo.getModel()).setRowCount(0);

            if (!cbSindicalizado.isSelected() && !cbConvenio.isSelected()) {//Pesquisar por data
                if (txtData1.getText().equals("  /  /    ") || txtData2.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Selecione um período.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    lista.clear();
                    lista = daoPesquisar.pesquisarLancamento(txtData1.getText(), txtData2.getText(), null, null);
                    if (DAOPesquisar.isVerificacao() == true) {
                        JOptionPane.showMessageDialog(null, "Não foram emcontrados valores para esse período.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                        txtData1.setValue(null);
                        txtData2.setValue(null);
                    } else {
                        DefaultTableModel model = (DefaultTableModel) tblPesquisarLancamentoPeriodo.getModel();
                        listaIdLancamento.clear();
                        for (Object e : lista) {
                            Lancamento lancamento = (Lancamento) e;
                            model.addRow(new String[]{lancamento.getSindicalizado().getNomeSindicalizado(),
                                        lancamento.getValorGasto(), lancamento.getConvenio().getNomeFantasia(),
                                        lancamento.getData(), lancamento.getDescricao(), lancamento.getUsuario().getFuncionario()});
                            listaIdLancamento.add(lancamento.getIdLancamento());
                        }
                        this.dispose();

                        txtDataIncialPeriodo.setText(txtData1.getText());
                        txtDataFinallPeriodo.setText(txtData2.getText());

                        somarPriodo();
                        dadosLancamentoPorPeriodo.setVisible(true);
                    }
                }
                //Acaba a primeira veificação
            } else if (cbSindicalizado.isSelected() && !cbConvenio.isSelected()) {//Pesquisa por sindicalizado
                ((DefaultTableModel) tblPesquisarLancamentoSindicalizado.getModel()).setRowCount(0);
                if (txtSindicalizado2.getText().equals("") || txtData1.getText().equals("  /  /    ") || txtData2.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Campos em Branco.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    //validar as datas 
                    lista.clear();
                    lista = daoPesquisar.pesquisarLancamento(txtData1.getText(), txtData2.getText(),
                            txtSindicalizado2.getText(), null);
                    if (DAOPesquisar.isVerificacao() == true) {
                        JOptionPane.showMessageDialog(null, "Não foram encontrados dados para essa pesquisa.\nTente outro sindicalizado e/ou data.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        DefaultTableModel model = (DefaultTableModel) tblPesquisarLancamentoSindicalizado.getModel();

                        listaIdLancamento.clear();
                        for (Object e : lista) {
                            @SuppressWarnings("LocalVariableHidesMemberVariable")
                            Lancamento lancamento = (Lancamento) e;
                            model.addRow(new String[]{lancamento.getConvenio().getNomeFantasia(),
                                        lancamento.getValorGasto(), lancamento.getData(),
                                        lancamento.getDescricao(), lancamento.getUsuario().getFuncionario()});
                            listaIdLancamento.add(lancamento.getIdLancamento());
                        }
                        this.dispose();
                        txtSindicalizadoSelecionado.setText(txtSindicalizado2.getText());
                        txtDataIncialSindicalizado.setText(txtData1.getText());
                        txtDataFinalSindicalizado.setText(txtData2.getText());

                        somarSindicalizado();
                        dadosLancamentoPorSindicalizado.setVisible(true);
                    }
                }
                //Acaba a seunda verificação

            } else if (!cbSindicalizado.isSelected() && cbConvenio.isSelected()) {//Pesquisa por convênio
                ((DefaultTableModel) tblPesquisarLancamentoConvenio.getModel()).setRowCount(0);
                if (cbxConvenio2.getSelectedIndex() == 0 || txtData1.getText().equals("  /  /    ") || txtData2.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Campos em Branco.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    // Validar as datas
                    lista.clear();
                    lista = daoPesquisar.pesquisarLancamento(txtData1.getText(), txtData2.getText(),
                            null, cbxConvenio2.getSelectedItem().toString());
                    DefaultTableModel model = (DefaultTableModel) tblPesquisarLancamentoConvenio.getModel();
                    listaIdLancamento.clear();
                    for (Object e : lista) {
                        Lancamento lancamento = (Lancamento) e;
                        model.addRow(new String[]{lancamento.getSindicalizado().getNomeSindicalizado(),
                                    lancamento.getValorGasto(), lancamento.getData(),
                                    lancamento.getDescricao(), lancamento.getUsuario().getFuncionario()});
                        listaIdLancamento.add(lancamento.getIdLancamento());
                    }
                    this.dispose();
                    txtConvenioSelecionado.setText(cbxConvenio2.getSelectedItem().toString());
                    txtDataIncialConvenio.setText(txtData1.getText());
                    txtDataFinalConvenio.setText(txtData2.getText());

                    somarConvenio();

                    dadosLancamentoPorConvenio.setVisible(true);
                }
                //Encerra a terceira veirificação
            } else if (cbSindicalizado.isSelected() && cbConvenio.isSelected()) {//Pesquisa por sindicalizado e convenio
                ((DefaultTableModel) tblPesquisarLancamentoSindicalizado.getModel()).setRowCount(0);
                if (txtData1.getText().equals("  /  /    ") || txtData2.getText().equals("  /  /    ") || txtSindicalizado2.getText().equals("") || cbxConvenio2.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Campos em Branco.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    // Validar as datas
                    lista.clear();
                    lista = daoPesquisar.pesquisarLancamento(txtData1.getText(), txtData2.getText(),
                            txtSindicalizado2.getText(), cbxConvenio2.getSelectedItem().toString());
                    if (DAOPesquisar.isVerificacao() == true) {
                        JOptionPane.showMessageDialog(null, "Sindicalizado não encontrado. Pesquise um sindicalizado.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        DefaultTableModel model = (DefaultTableModel) tblPesquisarLancamentoSindicalizado.getModel();

                        listaIdLancamento.clear();
                        for (Object e : lista) {
                            Lancamento lancamento = (Lancamento) e;
                            model.addRow(new String[]{lancamento.getConvenio().getNomeFantasia(),
                                        lancamento.getValorGasto(), lancamento.getData(),
                                        lancamento.getDescricao(), lancamento.getUsuario().getFuncionario()});
                            listaIdLancamento.add(lancamento.getIdLancamento());
                        }
                        txtSindicalizadoSelecionado.setText(txtSindicalizado2.getText());
                        txtDataIncialSindicalizado.setText(txtData1.getText());
                        txtDataFinalSindicalizado.setText(txtData2.getText());
                        somarSindicalizado();
                        dadosLancamentoPorSindicalizado.setVisible(true);
                    }
                }
                //Encerra a quarta verificação
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Opções de pesquisa não selecionadas!");
            }


        } else if (cbxPesquisar.getSelectedIndex() == 2) {

            if (txtSindicalizado.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um sindicalizado.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

            } else {
                sindicalizado = (daoPesquisar.pesquisarSindicalizado(txtSindicalizado.getText()));
                if (DAOPesquisar.isVerificacao() == true) {
                    JOptionPane.showMessageDialog(null, "Sindicalizado não encontrado. Pesquise um sindicalizado.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    this.dispose();
                    dadosSindicalizado.setVisible(true);
                    DefaultTableModel model = (DefaultTableModel) tblPesquisarSindicalizado.getModel();

                    model.setValueAt(sindicalizado.getNumeroMatricula(), 0, 1);
                    model.setValueAt(sindicalizado.getNomeSindicalizado(), 1, 1);
                    model.setValueAt(sindicalizado.getPaiSindicalizado(), 2, 1);
                    model.setValueAt(sindicalizado.getMaeSindicalizado(), 3, 1);
                    model.setValueAt(sindicalizado.getNaturalidadeSindicalizado(), 4, 1);
                    model.setValueAt(sindicalizado.getNacionalidadeSindicalizado(), 5, 1);
                    model.setValueAt(sindicalizado.getDataNascimento(), 6, 1);
                    model.setValueAt(sindicalizado.getEstadocivilSindicalizado(), 7, 1);
                    model.setValueAt(sindicalizado.getRGSindicalizado(), 8, 1);
                    model.setValueAt(sindicalizado.getEstadoOrgaoExpedidor(), 9, 1);
                    model.setValueAt(sindicalizado.getCPFSindicalizado(), 10, 1);
                    model.setValueAt(sindicalizado.getEnderecoSindicalizado(), 11, 1);
                    model.setValueAt(sindicalizado.getNumeroSindicalizado(), 12, 1);
                    model.setValueAt(sindicalizado.getBairroSindicalizado(), 13, 1);
                    model.setValueAt(sindicalizado.getCidadeSindicalizado(), 14, 1);
                    model.setValueAt(sindicalizado.getCEPSindicalizado(), 15, 1);
                    model.setValueAt(sindicalizado.getEstadoSindicalizado(), 16, 1);
                    model.setValueAt(sindicalizado.getTelefoneSindicalizado(), 17, 1);
                    model.setValueAt(sindicalizado.getInstituicaoTrabalho(), 18, 1);
                    model.setValueAt(sindicalizado.getCargoTrabalho(), 19, 1);
                    model.setValueAt(sindicalizado.getCargoEletivoSindicalizado(), 20, 1);
                    model.setValueAt(sindicalizado.getCargoSindicato(), 21, 1);
                    String dependente = "";
                    for (int c = 0; c < sindicalizado.getDependente().size(); c++) {
                        dependente += ((Dependente) sindicalizado.getDependente().get(c)).getNomeDependente() + ", ";
                    }
                    model.setValueAt(dependente, 22, 1);
                    model.setValueAt(sindicalizado.getDataContrato(), 23, 1);
                    model.setValueAt(sindicalizado.getDataAprovacao(), 24, 1);


                    dadosSindicalizado.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSindicalizadoActionPerformed
        dadosSindicalizado.dispose();
        cadastrarSindicalizado telaSindicalizado = new cadastrarSindicalizado();
        setVerificacao(true);
        telaSindicalizado.alterar(sindicalizado);
        telaSindicalizado.setVisible(true);
    }//GEN-LAST:event_btnAlterarSindicalizadoActionPerformed

    private void cbxConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxConvenioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        formPesquisa.this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarConvenioActionPerformed
        dadosConvenio.dispose();
        cadastrarConvenio telaConvenio = new cadastrarConvenio();
        setVerificacao(true);
        telaConvenio.alterar(convenio);
        telaConvenio.setVisible(true);
    }//GEN-LAST:event_btnAlterarConvenioActionPerformed

    private void btnConsultarNovoSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNovoSindicalizadoActionPerformed
        dadosSindicalizado.dispose();
        txtSindicalizado.setText(null);

        this.setVisible(true);

    }//GEN-LAST:event_btnConsultarNovoSindicalizadoActionPerformed

    private void btnConsultarNovoLancamentoSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNovoLancamentoSindicalizadoActionPerformed
        dadosLancamentoPorSindicalizado.dispose();
        this.setVisible(true);

        //Esconder e limpar os campos
        txtSindicalizado2.setText(null);
        txtSindicalizado2.setVisible(false);
        btnPesquisarSindicalizado2.setVisible(false);
        cbxConvenio2.setSelectedIndex(0);
        cbConvenio.setSelected(false);
        cbSindicalizado.setSelected(false);
        txtData1.setText(null);
        txtData2.setText(null);
    }//GEN-LAST:event_btnConsultarNovoLancamentoSindicalizadoActionPerformed

    private void btnConsultarNovoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNovoConvenioActionPerformed
        dadosConvenio.dispose();
        cbxConvenio.setSelectedIndex(0);
        this.setVisible(true);
    }//GEN-LAST:event_btnConsultarNovoConvenioActionPerformed

    private void btnSairLancamentoSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLancamentoSindicalizadoActionPerformed
        dadosLancamentoPorSindicalizado.dispose();
    }//GEN-LAST:event_btnSairLancamentoSindicalizadoActionPerformed

    private void btnSairConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairConvenioActionPerformed
        dadosConvenio.dispose();
    }//GEN-LAST:event_btnSairConvenioActionPerformed

    private void btnExcluirLancamentoSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLancamentoSindicalizadoActionPerformed

        try {
            index = tblPesquisarLancamentoSindicalizado.getSelectedRow();
            if (index > -1) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Essa ação removerá o lançamento selecionado, "
                        + "clique em confirmar para continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
                if (confirmacao == 0) {

                    idLancamento = listaIdLancamento.get(index);
                    System.out.println(idLancamento);
                    daoPesquisar.excluirLancamento(idLancamento);

                    ((DefaultTableModel) tblPesquisarLancamentoSindicalizado.getModel()).removeRow(index);
                    somarSindicalizado();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um item para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de vínculos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirLancamentoSindicalizadoActionPerformed

    private void btnExcluirSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSindicalizadoActionPerformed
        try {
            idSindicalizado = sindicalizado.getIdSindicalizado();
            System.out.println(idSindicalizado);
            daoSindicalizado.excluir(idSindicalizado);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso.", "MENSSAGEM", JOptionPane.INFORMATION_MESSAGE);
            dadosSindicalizado.dispose();

            txtSindicalizado.setText(null);

            this.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de vínculos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnExcluirSindicalizadoActionPerformed

    private void tblSindicalizadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSindicalizadoMousePressed
//        idSindicalizado = Integer.parseInt(tblSindicalizado.getValueAt(tblSindicalizado.getSelectedRow(), 0).toString());
        nomeSindicalizado = tblSindicalizado.getValueAt(tblSindicalizado.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_tblSindicalizadoMousePressed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        txtSindicalizado.setText(nomeSindicalizado);
        txtSindicalizado2.setText(nomeSindicalizado);
        frameSindicalizado.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void dadosSindicalizadoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dadosSindicalizadoWindowOpened
        dadosSindicalizado.setSize(585, 635);
        w.SetAligment(dadosSindicalizado, "Pesquisar Informações");
        dadosSindicalizado.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_dadosSindicalizadoWindowOpened

    private void dadosLancamentoPorSindicalizadoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dadosLancamentoPorSindicalizadoWindowOpened
        dadosLancamentoPorSindicalizado.setSize(670, 425);
        w.SetAligment(dadosLancamentoPorSindicalizado, "Pesquisar Informações");
        dadosLancamentoPorSindicalizado.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_dadosLancamentoPorSindicalizadoWindowOpened

    private void dadosConvenioWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dadosConvenioWindowOpened
        dadosConvenio.setSize(520, 387);
        w.SetAligment(dadosConvenio, "Pesquisar Informações");
        dadosConvenio.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_dadosConvenioWindowOpened

    private void frameSindicalizadoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameSindicalizadoWindowOpened
        frameSindicalizado.setSize(440, 274);
        w.SetAligment(frameSindicalizado, "Selecionar Sindicalizado");
        frameSindicalizado.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_frameSindicalizadoWindowOpened

    private void cbSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSindicalizadoActionPerformed
        if (cbSindicalizado.isSelected()) {
            txtSindicalizado2.setVisible(true);
            btnPesquisarSindicalizado2.setVisible(true);
        } else {
            txtSindicalizado2.setVisible(false);
            btnPesquisarSindicalizado2.setVisible(false);
        }
    }//GEN-LAST:event_cbSindicalizadoActionPerformed

    private void cbConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConvenioActionPerformed
        if (cbConvenio.isSelected()) {
            cbxConvenio2.setVisible(true);
        } else {
            cbxConvenio2.setVisible(false);
        }
    }//GEN-LAST:event_cbConvenioActionPerformed

    private void txtSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSindicalizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSindicalizadoActionPerformed

    private void btnPesquisarSindicalizado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSindicalizado2ActionPerformed
        if (txtSindicalizado2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um sindicalizado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            txtSindicalizado2.requestFocus();
        } else {
            DefaultTableModel tabela = daoSindicalizado.pesquisar(txtSindicalizado2.getText());
            if (DAOSindicalizado.isVerificacao() == true) {
                JOptionPane.showMessageDialog(null, "Sindicalizado não encontrado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                txtSindicalizado2.setText(null);
                txtSindicalizado2.requestFocus();
            } else {
                frameSindicalizado.setVisible(true);
                tblSindicalizado.setModel(tabela);
            }
        }
    }//GEN-LAST:event_btnPesquisarSindicalizado2ActionPerformed

    private void btnAlterarLancamentoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLancamentoConvenioActionPerformed

        int index = tblPesquisarLancamentoConvenio.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma lina da tabela", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            cadastrarLancamento tela = new cadastrarLancamento();
            tela.setLancamento(((Lancamento) lista.get(index)));

            tela.setarCamposAlteracao();
            setVerificacao(true);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarLancamentoConvenioActionPerformed

    private void btnExcluirLancamentoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLancamentoConvenioActionPerformed
        try {
            index = tblPesquisarLancamentoConvenio.getSelectedRow();
            if (index > -1) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Essa ação removerá o lançamento selecionado, "
                        + "clique em confirmar para continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
                if (confirmacao == 0) {

                    idLancamento = listaIdLancamento.get(index);
                    System.out.println(idLancamento);
                    daoPesquisar.excluirLancamento(idLancamento);

                    ((DefaultTableModel) tblPesquisarLancamentoConvenio.getModel()).removeRow(index);
                    somarConvenio();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um item para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de vínculos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirLancamentoConvenioActionPerformed

    private void btnConsultarNovoLancamentoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNovoLancamentoConvenioActionPerformed
        dadosLancamentoPorConvenio.dispose();
        this.setVisible(true);

        //Esconder e limpar os campos
        cbxConvenio2.setSelectedIndex(0);
        cbxConvenio2.setVisible(false);
        cbConvenio.setSelected(false);
        txtData1.setText(null);
        txtData2.setText(null);
    }//GEN-LAST:event_btnConsultarNovoLancamentoConvenioActionPerformed

    private void btnSairLancamentoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLancamentoConvenioActionPerformed
        dadosLancamentoPorConvenio.dispose();
    }//GEN-LAST:event_btnSairLancamentoConvenioActionPerformed

    private void dadosLancamentoPorConvenioWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dadosLancamentoPorConvenioWindowOpened
        dadosLancamentoPorConvenio.setSize(680, 400);
        w.SetAligment(dadosLancamentoPorConvenio, "Pesquisar Informações");
        dadosLancamentoPorConvenio.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_dadosLancamentoPorConvenioWindowOpened

    private void btnAlterarLancamentoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLancamentoPeriodoActionPerformed
        int index = tblPesquisarLancamentoPeriodo.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {

            cadastrarLancamento tela = new cadastrarLancamento();
            tela.setLancamento(((Lancamento) lista.get(index)));
            setVerificacao(true);
            tela.setarCamposAlteracao();
            dadosLancamentoPorPeriodo.dispose();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarLancamentoPeriodoActionPerformed

    private void btnExcluirLancamentoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLancamentoPeriodoActionPerformed
        try {
            index = tblPesquisarLancamentoPeriodo.getSelectedRow();
            if (index > -1) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Essa ação removerá o lançamento selecionado, "
                        + "clique em confirmar para continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
                if (confirmacao == 0) {

                    idLancamento = listaIdLancamento.get(index);
                    System.out.println(idLancamento);
                    daoPesquisar.excluirLancamento(idLancamento);

                    ((DefaultTableModel) tblPesquisarLancamentoPeriodo.getModel()).removeRow(index);
                    somarPriodo();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um item para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de vínculos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirLancamentoPeriodoActionPerformed

    private void btnConsultarNovoLancamentoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarNovoLancamentoPeriodoActionPerformed
        dadosLancamentoPorPeriodo.dispose();
        this.setVisible(true);

        //Esconder e limpar os campos
        txtData1.setValue(null);
        txtData2.setValue(null);
    }//GEN-LAST:event_btnConsultarNovoLancamentoPeriodoActionPerformed

    private void btnSairLancamentoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLancamentoPeriodoActionPerformed
        dadosLancamentoPorPeriodo.dispose();
    }//GEN-LAST:event_btnSairLancamentoPeriodoActionPerformed

    private void dadosLancamentoPorPeriodoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dadosLancamentoPorPeriodoWindowOpened
        dadosLancamentoPorPeriodo.setSize(660, 390);
        w.SetAligment(dadosLancamentoPorPeriodo, "Pesquisar Informações");
        dadosLancamentoPorPeriodo.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }//GEN-LAST:event_dadosLancamentoPorPeriodoWindowOpened

    private void cbxConvenio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxConvenio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxConvenio2ActionPerformed

    private void txtData1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtData1FocusLost
        if (!txtData1.getText().equals("  /  /    ")) {
            Date data = new Date();
            Date hoje = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                data = sdf.parse(txtData1.getText().toString());

            } catch (ParseException ex) {
                Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

            }

            if ((Integer.valueOf(txtData1.getText().substring(0, 2)) > 31
                    || Integer.valueOf(txtData1.getText().substring(3, 5)) > 12)) {
                txtData1.setValue(null);
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);

            } else if (data.after(hoje)) {
                txtData1.setValue(null);
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);


            }
        }
    }//GEN-LAST:event_txtData1FocusLost

    private void txtData2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtData2FocusLost
        if (txtData2.getText().equals("  /  /    ")) {
            Date data = new Date();
            Date data2 = new Date();
            Date hoje = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                data = sdf.parse(txtData1.getText().toString());
                data2 = sdf.parse(txtData2.getText().toString());
            } catch (ParseException ex) {
                Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

            }

            if ((Integer.valueOf(txtData2.getText().substring(0, 2)) > 31
                    || Integer.valueOf(txtData2.getText().substring(3, 5)) > 12)) {
                txtData2.setText(null);
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);

            } else {
                if (data2.after(hoje) || data2.before(data)) {
                    System.out.println("hoje" + hoje + "\ndata1" + data + "\ndata2" + data2);
                    txtData2.setText(null);
                    JOptionPane.showMessageDialog(null, "Digite uma data posterior a do contrato!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtData2FocusLost

    private void tblPesquisarLancamentoConvenioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesquisarLancamentoConvenioMousePressed
        System.out.println(tblPesquisarLancamentoConvenio.getSelectedRow());
    }//GEN-LAST:event_tblPesquisarLancamentoConvenioMousePressed

    private void btnRelatorioSindicalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioSindicalizadoActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/relatorioEspecificoSindicalizado.jasper");

        // mapa de parâmetros do relatório, não vimos ainda
        Map parametros = new HashMap();

        parametros.put("dataInicio", txtDataIncialSindicalizado.getText());
        parametros.put("dataFinal", txtDataFinalSindicalizado.getText());
        parametros.put("nome", txtSindicalizadoSelecionado.getText());

        try {
            // código para abrir o relatório
            relatorios.openReportPDFEspecificoSindicalizado(inputStream, parametros, new ConexaoBD().getConnection());

        } catch (JRException exc) {
            exc.printStackTrace();
        }

    }//GEN-LAST:event_btnRelatorioSindicalizadoActionPerformed

    private void btnRelatorioConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioConvenioActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/relatorioEspecificoConvenio.jasper");

        // mapa de parâmetros do relatório, não vimos ainda
        Map parametros = new HashMap();

        parametros.put("dataInicio", txtDataIncialConvenio.getText());
        parametros.put("dataFinal", txtDataFinalConvenio.getText());
        parametros.put("convenio", txtConvenioSelecionado.getText());

        try {
            // código para abrir o relatório
            relatorios.openReportPDFEspecificoConvenio(inputStream, parametros, new ConexaoBD().getConnection());

        } catch (JRException exc) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_btnRelatorioConvenioActionPerformed

    private void btnRelatorioPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioPeriodoActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/relatorioGeral.jasper");

        // mapa de parâmetros do relatório, não vimos ainda
        Map parametros = new HashMap();

        parametros.put("dataInicio", txtDataIncialSindicalizado.getText());
        parametros.put("dataFinal", txtDataFinalSindicalizado.getText());

        try {
            // código para abrir o relatório
            relatorios.openReportPDFEspecificoSindicalizado(inputStream, parametros, new ConexaoBD().getConnection());

        } catch (JRException exc) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_btnRelatorioPeriodoActionPerformed

    private void btnExcluirConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConvenioActionPerformed
        try {
            idConvenio = convenio.getIdConvenio();
            System.out.println(idConvenio);
            daoConvenio.excluir(idConvenio);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso.", "MENSSAGEM", JOptionPane.INFORMATION_MESSAGE);
            dadosConvenio.dispose();

            cbxConvenio.setSelectedIndex(0);

            this.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de vínculos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnExcluirConvenioActionPerformed

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
            java.util.logging.Logger.getLogger(formPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formPesquisa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarConvenio;
    private javax.swing.JButton btnAlterarLancamentoConvenio;
    private javax.swing.JButton btnAlterarLancamentoPeriodo;
    private javax.swing.JButton btnAlterarLancamentoSindicalizado;
    private javax.swing.JButton btnAlterarSindicalizado;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarNovoConvenio;
    private javax.swing.JButton btnConsultarNovoLancamentoConvenio;
    private javax.swing.JButton btnConsultarNovoLancamentoPeriodo;
    private javax.swing.JButton btnConsultarNovoLancamentoSindicalizado;
    private javax.swing.JButton btnConsultarNovoSindicalizado;
    private javax.swing.JButton btnExcluirConvenio;
    private javax.swing.JButton btnExcluirLancamentoConvenio;
    private javax.swing.JButton btnExcluirLancamentoPeriodo;
    private javax.swing.JButton btnExcluirLancamentoSindicalizado;
    private javax.swing.JButton btnExcluirSindicalizado;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarSindicalizado;
    private javax.swing.JButton btnPesquisarSindicalizado2;
    private javax.swing.JToggleButton btnRelatorioConvenio;
    private javax.swing.JButton btnRelatorioPeriodo;
    private javax.swing.JButton btnRelatorioSindicalizado;
    private javax.swing.JButton btnSairConvenio;
    private javax.swing.JButton btnSairLancamentoConvenio;
    private javax.swing.JButton btnSairLancamentoPeriodo;
    private javax.swing.JButton btnSairLancamentoSindicalizado;
    private javax.swing.JButton btnSairSindicalizado;
    private javax.swing.JCheckBox cbConvenio;
    private javax.swing.JCheckBox cbSindicalizado;
    private javax.swing.JComboBox cbxConvenio;
    private javax.swing.JComboBox cbxConvenio2;
    private javax.swing.JComboBox cbxPesquisar;
    private javax.swing.JFrame dadosConvenio;
    private javax.swing.JFrame dadosLancamentoPorConvenio;
    private javax.swing.JFrame dadosLancamentoPorPeriodo;
    private javax.swing.JFrame dadosLancamentoPorSindicalizado;
    private javax.swing.JFrame dadosSindicalizado;
    private javax.swing.JFrame frameSindicalizado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblConvenio;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblSindicalizado;
    private javax.swing.JPanel pesquisar;
    private javax.swing.JPanel pnlConvenio;
    private javax.swing.JPanel pnlDadosConvenio;
    private javax.swing.JPanel pnlDadosLancamento;
    private javax.swing.JPanel pnlDadosLancamento1;
    private javax.swing.JPanel pnlDadosLancamento2;
    private javax.swing.JPanel pnlDadosSindicalizado;
    private javax.swing.JPanel pnlLancamento;
    private javax.swing.JPanel pnlSindicalizado;
    private javax.swing.JTable tblPesquisarConvenio;
    private javax.swing.JTable tblPesquisarLancamentoConvenio;
    private javax.swing.JTable tblPesquisarLancamentoPeriodo;
    private javax.swing.JTable tblPesquisarLancamentoSindicalizado;
    private javax.swing.JTable tblPesquisarSindicalizado;
    private javax.swing.JTable tblSindicalizado;
    private javax.swing.JLabel txtConvenioSelecionado;
    private javax.swing.JFormattedTextField txtData1;
    private javax.swing.JFormattedTextField txtData2;
    private javax.swing.JLabel txtDataFinalConvenio;
    private javax.swing.JLabel txtDataFinalSindicalizado;
    private javax.swing.JLabel txtDataFinallPeriodo;
    private javax.swing.JLabel txtDataIncialConvenio;
    private javax.swing.JLabel txtDataIncialPeriodo;
    private javax.swing.JLabel txtDataIncialSindicalizado;
    private javax.swing.JTextField txtSindicalizado;
    private javax.swing.JTextField txtSindicalizado2;
    private javax.swing.JLabel txtSindicalizadoSelecionado;
    private javax.swing.JLabel txtSomaConvenio;
    private javax.swing.JLabel txtSomaPeriodo;
    private javax.swing.JLabel txtSomaSindicalizado;
    // End of variables declaration//GEN-END:variables

    private void somarSindicalizado() {
        somaa = null;
        soma = 0;
        for (int x = 0; x < tblPesquisarLancamentoSindicalizado.getRowCount(); x++) {

            somaa = (String) tblPesquisarLancamentoSindicalizado.getValueAt(x, 1);

            soma += Double.parseDouble(somaa);
        }
        somaa = "" + soma;

        txtSomaSindicalizado.setText("R$ " + somaa.replace(".", ","));
    }

    private void somarConvenio() {
        somaa = null;
        setSoma();
        for (int x = 0; x < tblPesquisarLancamentoConvenio.getRowCount(); x++) {

            somaa = (String) tblPesquisarLancamentoConvenio.getValueAt(x, 1);

            soma += Double.parseDouble(somaa);
        }
        somaa = "" + soma;
        txtSomaConvenio.setText("R$ " + somaa.replace(".", ","));
    }

    private void somarPriodo() {
        somaa = null;
        soma = 0d;
        txtSomaPeriodo.setText(null);
        for (int x = 0; x < tblPesquisarLancamentoPeriodo.getRowCount(); x++) {

            somaa = (String) tblPesquisarLancamentoPeriodo.getValueAt(x, 1);

            soma += Double.parseDouble(somaa);
        }
        somaa = "" + soma;
        txtSomaPeriodo.setText("R$ " + somaa.replace(".", ","));
    }
}
