package DAO;

import BD.ConexaoBD;
import MODEL.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DAOUsuario {

    public Connection conexao;

    public DAOUsuario() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO funcionarios(idFuncionario, nomeFuncionario, senhaFuncionario) VALUES(?,?,?);";
        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getIdusuario());
            stmt.setString(2, usuario.getFuncionario());
            stmt.setString(3, usuario.getSenha());


            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public DefaultTableModel pesquisar() {
        Usuario usuario = new Usuario();
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"Usuários já existentes:"});
        try {
            String sql;
            sql = "SELECT * FROM funcionarios";
            
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                usuario.setIdusuario(rs.getString("idFuncionario"));
                usuario.setFuncionario(rs.getString("nomeFuncionario"));
                usuario.setSenha(rs.getString("senhaFuncionario"));

                tabela.addRow(new String[]{usuario.getFuncionario()});
            }
            stmt.close();
            return (tabela);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
