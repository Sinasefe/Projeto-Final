package DAO;

import BD.ConexaoBD;
import MODEL.Sindicalizado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DAOSindicalizado {

    private static boolean verificacao;

    public static boolean isVerificacao() {
        return verificacao;
    }

    public static void setVerificacao(boolean aVerificacao) {
        verificacao = aVerificacao;
    }
    public Connection conexao;

    public DAOSindicalizado() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public void inserir(Sindicalizado sindicalizado) {
        String sql = "INSERT INTO sindicalizado(nomeSindicalizado,numeroMatricula,paiSindicalizado,"
                + "maeSindicalizado,naturalidadeSindicalizado,nacionalidadeSindicalizado,dataNascimento,"
                + "estadocivilSindicalizado,enderecoSindicalizado,numeroSindicalizado,bairroSindicalizado,"
                + "cidadeSindicalizado,CEPSindicalizado,estadoSindicalizado,telefoneSindicalizado,instituicaoTrabalho,"
                + "cargoTrabalho,CPFSindicalizado,RGSindicalizado,estadoOrgaoExpedidor,"
                + "cargoEletivoSindicalizado,cargoSindicato,dataContrato,dataAprovacao)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, sindicalizado.getNomeSindicalizado());
            stmt.setString(2, sindicalizado.getNumeroMatricula());
            stmt.setString(3, sindicalizado.getPaiSindicalizado());
            stmt.setString(4, sindicalizado.getMaeSindicalizado());
            stmt.setString(5, sindicalizado.getNaturalidadeSindicalizado());
            stmt.setString(6, sindicalizado.getNacionalidadeSindicalizado());
            stmt.setString(7, sindicalizado.getDataNascimento());
            stmt.setString(8, sindicalizado.getEstadocivilSindicalizado());
            stmt.setString(9, sindicalizado.getEnderecoSindicalizado());
            stmt.setString(10, sindicalizado.getNumeroSindicalizado());
            stmt.setString(11, sindicalizado.getBairroSindicalizado());
            stmt.setString(12, sindicalizado.getCidadeSindicalizado());
            stmt.setString(13, sindicalizado.getCEPSindicalizado());
            stmt.setString(14, sindicalizado.getEstadoSindicalizado());
            stmt.setString(15, sindicalizado.getTelefoneSindicalizado());
            stmt.setString(16, sindicalizado.getInstituicaoTrabalho());
            stmt.setString(17, sindicalizado.getCargoTrabalho());
            stmt.setString(18, sindicalizado.getCPFSindicalizado());
            stmt.setString(19, sindicalizado.getRGSindicalizado());
            stmt.setString(20, sindicalizado.getEstadoOrgaoExpedidor());
            stmt.setString(21, sindicalizado.getCargoEletivoSindicalizado());
            stmt.setString(22, sindicalizado.getCargoSindicato());
            stmt.setString(23, sindicalizado.getDataContrato());
            stmt.setString(24, sindicalizado.getDataAprovacao());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void excluir(String id) {
        String sql = "DELETE FROM sindicalizado WHERE idSindicalizado = '" + id + "'";
        String sql2 = "DELETE FROM  lancamento WHERE Sindicalizado_idSindicalizado = '"+id+"'";
        try {      
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.addBatch(sql);
            stmt.addBatch(sql2);
            stmt.executeBatch();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public DefaultTableModel pesquisar(String nome) {
        verificacao = false;
        Sindicalizado sindicalizado = new Sindicalizado();
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"Sindicalizados existentes:", "SIAPE", "CPF"});
        try {
            String sql;

            sql = "SELECT * FROM sindicalizado WHERE nomeSindicalizado LIKE '" + nome + "%' ; ";
           

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                sindicalizado.setIdSindicalizado(rs.getString("idSindicalizado"));
                sindicalizado.setNomeSindicalizado((rs.getString("nomeSindicalizado")));
                sindicalizado.setCPFSindicalizado((rs.getString("CPFSindicalizado")));
                sindicalizado.setNumeroMatricula((rs.getString("numeroMatricula")));
                
                    tabela.addRow(new String[]{sindicalizado.getNomeSindicalizado(), sindicalizado.getNumeroMatricula(), sindicalizado.getCPFSindicalizado()});
            }
            
            stmt.close();
            
            if(tabela.getDataVector().isEmpty()){
                    setVerificacao(true);
                }
            
            return (tabela);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public int pesquisarId(String nome) {
        Sindicalizado sindicalizado = new Sindicalizado();
        int id = 0;

        try {
            String sql;

            sql = "SELECT * FROM sindicalizado WHERE nomeSindicalizado = '" + nome + "'";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                sindicalizado.setIdSindicalizado(rs.getString("idSindicalizado"));

                id = Integer.parseInt(sindicalizado.getIdSindicalizado());
            }
            stmt.close();
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public boolean pesquisarSIAPE(String siape) {
        boolean verificacao = false;
        String sql;

        try {

            sql = "SELECT * FROM sindicalizado WHERE numeroMatricula = '" + siape + "'";

            PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                verificacao = true;
            }

            stmt.close();

            return verificacao;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public int pesquisarMaxId() {
        Sindicalizado sindicalizado = new Sindicalizado();
        int id = 0;

        try {
            String sql;

            sql = "SELECT MAX(idSindicalizado) FROM sindicalizado";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                sindicalizado.setIdSindicalizado(rs.getString("idSindicalizado"));


                id = Integer.parseInt(sindicalizado.getIdSindicalizado());
            }
            stmt.close();
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
