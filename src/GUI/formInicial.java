package GUI;

import BD.ConexaoBD;
import DAO.DAOSindicalizado;
import MODEL.relatorios;
import bsh.ParseException;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import window.Window;

public class formInicial extends javax.swing.JFrame {

    private DAOSindicalizado daoSindicalizado = new DAOSindicalizado();
    private String nomeSindicalizado;
    private boolean verificacao = false;
    window.Window w = new Window();

    public formInicial() {
        initComponents();

        //Deixa em tela cheia e por cima da barra de Tarefa
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d);
        this.setResizable(false);

        //Coloca Título
        setTitle("Sistema de Gerenciamento e Informatização do SINASEFE - Unidade Inconfidentes");

        //Seta o icone do JFRame
        setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameRelatorioGeral = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JFormattedTextField();
        btnGerar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        frameRelatorioGeral.setMinimumSize(new java.awt.Dimension(337, 169));
        frameRelatorioGeral.setPreferredSize(new java.awt.Dimension(307, 169));
        frameRelatorioGeral.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                frameRelatorioGeralWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Intervalo de Tempo"));

        jLabel2.setText("Período:      De");

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("até");

        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGerar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnGerar))
        );

        javax.swing.GroupLayout frameRelatorioGeralLayout = new javax.swing.GroupLayout(frameRelatorioGeral.getContentPane());
        frameRelatorioGeral.getContentPane().setLayout(frameRelatorioGeralLayout);
        frameRelatorioGeralLayout.setHorizontalGroup(
            frameRelatorioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameRelatorioGeralLayout.setVerticalGroup(
            frameRelatorioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/sinasefe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/cadastrar.jpg"))); // NOI18N
        jMenuItem7.setText("Cadastrar Sindicalizado");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/cadastrar.jpg"))); // NOI18N
        jMenuItem4.setText("Cadastrar Categoria de Convênio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/cadastrar.jpg"))); // NOI18N
        jMenuItem5.setText("Cadastrar Convênio");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/cadastrar.jpg"))); // NOI18N
        jMenuItem6.setText("Realizar Lançamento");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator1);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/pesquisar.png"))); // NOI18N
        jMenuItem9.setText("Pesquisar Informações");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);
        jMenu1.add(jSeparator2);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/sair.png"))); // NOI18N
        jMenuItem8.setText("Sair");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sessão");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/trocar_usuario.png"))); // NOI18N
        jMenuItem2.setText("Trocar Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/add_usuario.png"))); // NOI18N
        jMenuItem3.setText("Adicionar Usuário");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/relatorios.gif"))); // NOI18N
        jMenuItem10.setText("Geral");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/relatorios.gif"))); // NOI18N
        jMenuItem12.setText("Contra-Cheque");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ajuda");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icones/sobre.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("frame1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new cadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new cadastrarConvenio().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new cadastrarSindicalizado().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new cadastrarCategoria().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new cadastrarLancamento().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new formLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new formPesquisa().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        frameRelatorioGeral.setVisible(true);
        verificacao = true;

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        if (txtDataInicio.getValue() == null || txtDataFinal.getValue() == null) {
            JOptionPane.showMessageDialog(null, "Digite uma periodo!", "MENSSAGE", JOptionPane.INFORMATION_MESSAGE);

        } else {
            if (verificacao == true) {
                InputStream inputStream = getClass().getResourceAsStream("/relatorioGeral.jasper");

                // mapa de parâmetros do relatório, não vimos ainda
                Map parametros = new HashMap();

                parametros.put("dataInicio", txtDataInicio.getText());
                parametros.put("dataFinal", txtDataFinal.getText());

                try {
                    // código para abrir o relatório
                    relatorios.openReportPDFGeral(inputStream, parametros, new ConexaoBD().getConnection());

                } catch (JRException exc) {
                    exc.printStackTrace();
                }

            } else {
                InputStream inputStream = getClass().getResourceAsStream("/contraCheque.jasper");

                // mapa de parâmetros do relatório, não vimos ainda
                Map parametros = new HashMap();

                parametros.put("dataInicio", txtDataInicio.getText());
                parametros.put("dataFinal", txtDataFinal.getText());

                try {
                    // código para abrir o relatório
                    relatorios.openReportPDFContraCheque(inputStream, parametros, new ConexaoBD().getConnection());

                } catch (JRException exc) {
                    exc.printStackTrace();
                }
            }


            frameRelatorioGeral.setVisible(false);
            txtDataFinal.setValue(null);
            txtDataInicio.setValue(null);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Frame[] frames = getFrames();
        for (int i = 0; i < frames.length; i++) {
            frames[i].dispose();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void frameRelatorioGeralWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameRelatorioGeralWindowOpened
        w.SetAligment(frameRelatorioGeral, null);
        frameRelatorioGeral.setIconImage(new ImageIcon(getClass().getResource("/IMAGE/icon.png")).getImage());

    }//GEN-LAST:event_frameRelatorioGeralWindowOpened

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        frameRelatorioGeral.setVisible(true);
        verificacao = false;
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formInicial().setVisible(true);


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JFrame frameRelatorioGeral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicio;
    // End of variables declaration//GEN-END:variables

    public void data1() throws java.text.ParseException {
        if (!txtDataInicio.getText().equals("  /  /    ")) {
            Date data = new Date();
            Date hoje = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                data = sdf.parse(txtDataInicio.getText().toString());

            } catch (java.text.ParseException ex) {
                Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

            }

            if ((Integer.valueOf(txtDataInicio.getText().substring(0, 2)) > 31
                    || Integer.valueOf(txtDataInicio.getText().substring(3, 5)) > 12)) {
                txtDataInicio.setValue(null);
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);

            } else if (data.after(hoje)) {
                txtDataInicio.setValue(null);
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);


            }
        }

    }

    public boolean data2() throws java.text.ParseException {
        verificacao = false;
        if (!txtDataFinal.getText().equals("  /  /    ")) {
            Date data = new Date();
            Date hoje = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                data = sdf.parse(txtDataFinal.getText().toString());

            } catch (java.text.ParseException ex) {
                Logger.getLogger(cadastrarSindicalizado.class.getName()).log(Level.SEVERE, null, ex);

            }

            if ((Integer.valueOf(txtDataFinal.getText().substring(0, 2)) > 31
                    || Integer.valueOf(txtDataFinal.getText().substring(3, 5)) > 12)) {
                txtDataFinal.setValue(null);
                txtDataFinal.requestFocus();
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                verificacao = true;
            } else if (data.after(hoje)) {
                txtDataFinal.setValue(null);
                txtDataFinal.requestFocus();
                JOptionPane.showMessageDialog(null, "Digite uma data válida!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                verificacao = true;

            }
        }
        return verificacao;
    }
}
