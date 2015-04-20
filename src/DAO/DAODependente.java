package DAO;

import BD.ConexaoBD;
import MODEL.Dependente;
import MODEL.Sindicalizado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DAODependente {

    public Connection conexao;

    public DAODependente() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public void inserir(Dependente dependente) {
        String sql = "INSERT INTO dependente(tipoDependente, Sindicalizado_idSindicalizado,"
                + "nomeDependente,sexoDependente,dataNascimento) VALUES(?,?,?,?,?);";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, dependente.getTipoDependente());
            stmt.setInt(2, dependente.getIdSindicalizado());
            stmt.setString(3, dependente.getNomeDependente());
            stmt.setString(4, dependente.getSexo());
            stmt.setString(5, dependente.getDataNascimento());

            stmt.execute();
            stmt.close();

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

            rs.next();
            id = rs.getInt(1);

            stmt.close();
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public DefaultTableModel pesquisar() {
        Dependente dependente = new Dependente();
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"Dependentes existentes:"});
        try {
            String sql;

            sql = "SELECT * FROM dependente";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                dependente.setTipoDependente((rs.getString("tipoDependente")));
                dependente.setIdSindicalizado(rs.getInt("Sindicalizado_idSindicalizado"));
                dependente.setNomeDependente(rs.getString("nomeDependente"));

                tabela.addRow(new String[]{dependente.getNomeDependente(), "" + dependente.getIdSindicalizado()});
            }
            stmt.close();
            return (tabela);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList retornarDependentes(String idSindicalizado) {
        ArrayList listaDependente = new ArrayList();
        try {
            String sql;

            sql = "SELECT * FROM dependente WHERE Sindicalizado_idSindicalizado = '" + idSindicalizado + "' ; ";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Dependente dependente = new Dependente();
                dependente.setIdDependentes(rs.getInt("idDependente"));
                dependente.setNomeDependente(rs.getString("nomeDependente"));
                dependente.setIdSindicalizado(rs.getInt("Sindicalizado_idSindicalizado"));
                dependente.setDataNascimento(rs.getString("dataNascimento"));
                dependente.setTipoDependente(rs.getString("tipoDependente"));
                dependente.setSexo(rs.getString("sexoDependente"));
                listaDependente.add(dependente);
            }
            stmt.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return (listaDependente);
    }
}
