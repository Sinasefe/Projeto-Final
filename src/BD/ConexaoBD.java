package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/sinasefe"; 
        String login = "root";
        String senha = "vertrigo";
        try {
            Connection conexao = DriverManager.getConnection(url,login,senha);
            return conexao;
        } catch (SQLException e) {
            System.out.printf("Não foi possivel estabelecer conexão com a base de dados.\n");
            return null;
        }
    }
    
    public static Connection getConnection(String url, String usuario, String senha) throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    public static Connection getSCAConnection() throws SQLException {
        return getConnection("jdbc:mysql://localhost/sinasefe", "root", "vertrigo");
    }
    
}
