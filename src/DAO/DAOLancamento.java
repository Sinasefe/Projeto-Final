package DAO;

import BD.ConexaoBD;
import MODEL.Categoria;
import MODEL.Lancamento;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DAOLancamento {

    public Connection conexao;

    public DAOLancamento() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public void inserir(Lancamento lancamento) {
        String sql = "INSERT INTO lancamento(CategoriaConvenio_idCategoria, Sindicalizado_idSindicalizado,"
                + "Convenios_idConvenio, Funcionarios_idFuncionario, valorGasto, dataLancamento,"
                + "descricaoLancamento) VALUES(?,?,?,?,?,?,?);";

        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(lancamento.getIdCategoria()));
            stmt.setInt(2, Integer.parseInt(lancamento.getIdSindicalizado()));
            stmt.setInt(3, Integer.parseInt(lancamento.getIdConvenio()));
            stmt.setInt(4, Integer.parseInt(lancamento.getIdFuncionario()));
            stmt.setString(5, lancamento.getValorGasto());
            stmt.setString(6, lancamento.getData());
            stmt.setString(7, lancamento.getDescricao());



            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public DefaultTableModel pesquisar() {
        Lancamento lancamento = new Lancamento();
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"Sindicalizado", "Convenio", "Valor gasto", "Data", "Descrição", "Funcionario"});
        try {
            String sql;

            sql = "SELECT sindicalizado.idSindicalizado, sindicalizado.nomeSindicalizado,"
                    + "convenios.idConvenio,convenios.nomeFantasia,"
                    + "categoriaconvenio.idCategoria, categoriaconvenio.Descricao,"
                    + "funcionarios.idFuncionario, funcionarios.nomeFuncionario,"
                    + "lancamento.Sindicalizado_idSindicalizado,lancamento.Convenios_idConvenio,"
                    + "lancamento.CategoriaConvenio_idCategoria,lancamento.valorGasto, "
                    + "lancamento.Funcionarios_idFuncionario, lancamento.dataLancamento, "
                    + "lancamento.descricaoLancamento FROM lancamento LEFT JOIN sindicalizado ON sindicalizado.idSindicalizado = lancamento.Sindicalizado_idSindicalizado LEFT JOIN convenios  ON convenios.idConvenio = lancamento.Convenios_idConvenio LEFT Join funcionarios ON funcionarios.IdFuncionario = lancamento.Funcionarios_idFuncionario LEFT Join categoriaconvenio ON categoriaconvenio.idCategoria = lancamento.Convenios_idConvenio";

            java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                lancamento.setIdSindicalizado(rs.getString("sindicalizado.nomeSindicalizado"));
                lancamento.setIdCategoria(rs.getString("categoriaconvenio.Descricao"));
                lancamento.setIdConvenio(rs.getString("convenios.NomeFantasia"));
                lancamento.setIdFuncionario(rs.getString("funcionarios.nomeFuncionario"));
                lancamento.setData(rs.getString("lancamento.dataLancamento"));
                lancamento.setValorGasto(rs.getString("lancamento.valorGasto"));
                lancamento.setDescricao(rs.getString("lancamento.descricaoLancamento"));


                tabela.addRow(new String[]{lancamento.getIdSindicalizado(), lancamento.getIdConvenio(),
                            "R$ "+lancamento.getValorGasto().replace(".", ","), lancamento.getData(),
                            lancamento.getDescricao(), lancamento.getIdFuncionario()});
            }
            stmt.close();
            
            return (tabela);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
