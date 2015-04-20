package DAO;

import BD.ConexaoBD;
import MODEL.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DAOCategoria {

    public Connection conexao;

    public DAOCategoria() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public void inserir(Categoria categoria) {
        String sql = "INSERT INTO categoriaconvenio(idcategoria, descricao) VALUES(?,?);";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, categoria.getIdCategoria());
            stmt.setString(2, categoria.getTipoCategoria());

            stmt.execute(sql);
            stmt.close();
        } catch (SQLException u) {
            u.printStackTrace();
        }
    }

    public DefaultTableModel pesquisar() {
        Categoria categoria = new Categoria();
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"Categoria existentes:", ""});
        try {
            String sql;

            sql = "SELECT * FROM categoriaconvenio";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                categoria.setIdCategoria(rs.getString("idCategoria"));
                categoria.setTipoCategoria(rs.getString("Descricao"));

                tabela.addRow(new String[]{categoria.getTipoCategoria()});
            }
            stmt.close();
            return (tabela);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList pesquisarCategoria() {
        Categoria categoria = new Categoria();
        ArrayList lista = new ArrayList();

        try {
            String sql;

            sql = "SELECT * FROM categoriaconvenio";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                categoria.setIdCategoria(rs.getString("idCategoria"));
                categoria.setTipoCategoria(rs.getString("Descricao"));

                lista.add(categoria.getTipoCategoria());

            }
            stmt.close();
            return lista;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public int pesquisarId(String descricao) {
        Categoria categoria = new Categoria();
        int id = 0;

        try {
            String sql;

            sql = "SELECT * FROM categoriaconvenio WHERE Descricao = '" + descricao + "'";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                categoria.setIdCategoria(rs.getString("idCategoria"));
                categoria.setTipoCategoria(rs.getString("Descricao"));

                id = Integer.parseInt(categoria.getIdCategoria().toString());

            }
            stmt.close();
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public boolean pesquisarDescicao(String descricao) {
        boolean verificacao = false;
        String sql;

        try {

            sql = "SELECT * FROM categoriaconvenio WHERE Descricao= '" + descricao + "'";

            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) conexao.prepareStatement(sql);
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
