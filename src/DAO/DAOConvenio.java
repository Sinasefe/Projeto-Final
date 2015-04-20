package DAO;

import BD.ConexaoBD;
import MODEL.Convenio;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DAOConvenio {

    private Connection conexao;
    private ArrayList idconvenio = null;

    public DAOConvenio() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public ArrayList getIdconvenio() {
        return idconvenio;
    }

    public void setIdconvenio(ArrayList idconvenio) {
        this.idconvenio = idconvenio;
    }

    public void inserir(Convenio convenio) {
        String sql = "INSERT INTO convenios(CategoriaConvenio_idCategoria,CNPJ,razaoSocial,nomeFantasia,"
                + "enderecoConvenio,numeroConvenio,bairroConvenio,cidadeConvenio,"
                + "CEPConvenio,estadoConvenio,telefoneConvenio,emailConvenio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(convenio.getIdCategoria()));
            stmt.setString(2, convenio.getCNPJ());
            stmt.setString(3, convenio.getRazaoSocial());
            stmt.setString(4, convenio.getNomeFantasia());
            stmt.setString(5, convenio.getEnderecoConvenio());
            stmt.setString(6, convenio.getNumeroConvenio());
            stmt.setString(7, convenio.getBairroConvenio());
            stmt.setString(8, convenio.getCidadeConvenio());
            stmt.setString(9, convenio.getCEPConvenio());
            stmt.setString(10, convenio.getEstadoConvenio());
            stmt.setString(11, convenio.getTelefoneConvenio());
            stmt.setString(12, convenio.getEmailConvenio());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     public void excluir(String id) {
        String sql = "DELETE FROM convenios WHERE idconvenio = '" + id + "'";
        String sql2 = "DELETE FROM lancamento WHERE Convenios_idConvenio = '"+id+"'";
        try {      
            
            java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.addBatch(sql);
            stmt.addBatch(sql2);
            stmt.executeBatch();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public DefaultTableModel pesquisar() {

        Convenio convenio = new Convenio();
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"Convênios existentes:"});
        try {
            String sql;
            sql = "SELECT * FROM convenios";

            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                convenio.setIdConvenio(rs.getString("idConvenio"));
                convenio.setIdCategoria(rs.getString("CategoriaConvenio_idCategoria"));
                convenio.setCNPJ(rs.getString("CNPJ"));
                convenio.setRazaoSocial(rs.getString("razaoSocial"));
                convenio.setNomeFantasia(rs.getString("nomeFantasia"));
                convenio.setEnderecoConvenio(rs.getString("enderecoConvenio"));
                convenio.setNumeroConvenio(rs.getString("numeroConvenio"));
                convenio.setBairroConvenio(rs.getString("bairroConvenio"));
                convenio.setCidadeConvenio(rs.getString("cidadeConvenio"));
                convenio.setCEPConvenio(rs.getString("CEPConvenio"));
                convenio.setEstadoConvenio(rs.getString("estadoConvenio"));
                convenio.setTelefoneConvenio(rs.getString("telefoneConvenio"));
                convenio.setEmailConvenio(rs.getString("emailConvenio"));


                tabela.addRow(new String[]{convenio.getNomeFantasia()});
            }
            stmt.close();
            return (tabela);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList pesquisarConvenio(String tipo) {
        Convenio convenio = new Convenio();
        ArrayList lista = new ArrayList();
        ArrayList lista1 = new ArrayList();
        String sql;
        try {
            if (tipo.equals("*")) {
                sql = "SELECT * FROM convenios ";
            } else {

                sql = "SELECT * FROM convenios WHERE CategoriaConvenio_idCategoria ='" + tipo + "';";
            }
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                convenio.setNomeFantasia(rs.getString("nomeFantasia"));
                convenio.setIdConvenio(rs.getString("idConvenio"));

                lista.add(convenio.getNomeFantasia());
                lista1.add(convenio.getIdCategoria());

            }
            stmt.close();
            setIdconvenio(lista1);
            return lista;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public int pesquisarId(String nome) {
        Convenio convenio = new Convenio();
        int id = 0;

        try {
            String sql;

            sql = "SELECT * FROM convenios WHERE nomeFantasia = '" + nome + "'";

            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                convenio.setIdConvenio(rs.getString("idConvenio"));


                id = Integer.parseInt(convenio.getIdConvenio());
            }
            stmt.close();
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public boolean pesquisarCNPJ(String cnpj) {
        boolean verificacao = false;
        String sql;

        try {

            sql = "SELECT * FROM convenios WHERE CNPJ = '" + cnpj + "'";
            

            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
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
}
