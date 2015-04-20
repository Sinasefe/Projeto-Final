package DAO;

import BD.ConexaoBD;
import MODEL.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOLogin {

    public Connection conexao;

    public DAOLogin() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public Usuario pesquisar(String nome) {
        Usuario usario = new Usuario();
        String senha = null;
        try {
            String sql;

            sql = "SELECT * FROM funcionarios WHERE nomeFuncionario = '" + nome + "'";

            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
               usario.setIdusuario(rs.getString("idFuncionario"));
               usario.setFuncionario(rs.getString("nomeFuncionario"));
               usario.setSenha(rs.getString("senhaFuncionario"));
                
            }
            stmt.close();
            return usario;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
