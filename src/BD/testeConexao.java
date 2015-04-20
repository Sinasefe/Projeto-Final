package BD;

import BD.ConexaoBD;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class testeConexao {

    public static void main(String[] args) throws SQLException, IOException {
        Connection conexao = new ConexaoBD().getConnection();
        conexao.close();
    }
}
