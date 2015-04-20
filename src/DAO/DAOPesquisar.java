package DAO;

import BD.ConexaoBD;
import MODEL.*;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPesquisar {

    DAODependente daoDependente = new DAODependente();
    int x = 0;
    public Connection conexao;
    private static String idConvenio;
    private static boolean verificacao = false;

    public static void setVerificacao(boolean verificacao) {
        DAOPesquisar.verificacao = verificacao;
    }

    public static boolean isVerificacao() {
        return verificacao;
    }

    public static void setIdConvenio(String idConvenio) {
        DAOPesquisar.idConvenio = idConvenio;
    }

    public static String getIdConvenio() {
        return idConvenio;
    }

    public DAOPesquisar() {
        this.conexao = (Connection) new ConexaoBD().getConnection();
    }

    public Convenio pesquisarConvenio(String nome) {
        Convenio convenio = new Convenio();

        try {
            String sql;
            sql = "SELECT categoriaconvenio.Descricao, convenios.idConvenio, convenios.CategoriaConvenio_idCategoria, convenios.CNPJ, convenios.razaoSocial, convenios.nomeFantasia, convenios.enderecoConvenio, convenios.numeroConvenio, convenios.bairroConvenio, convenios.cidadeConvenio, convenios.CEPConvenio, convenios.estadoConvenio, convenios.telefoneConvenio, convenios.emailConvenio FROM convenios INNER JOIN categoriaconvenio ON categoriaconvenio.idCategoria = convenios.CategoriaConvenio_idCategoria WHERE nomeFantasia = '" + nome + "';";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                convenio.setIdConvenio(rs.getString("convenios.idConvenio"));
                convenio.setIdCategoria(rs.getString("categoriaconvenio.Descricao"));
                convenio.setCNPJ(rs.getString("convenios.CNPJ"));
                convenio.setRazaoSocial(rs.getString("convenios.razaoSocial"));
                convenio.setNomeFantasia(rs.getString("convenios.nomeFantasia"));
                convenio.setEnderecoConvenio(rs.getString("convenios.enderecoConvenio"));
                convenio.setNumeroConvenio(rs.getString("convenios.numeroConvenio"));
                convenio.setBairroConvenio(rs.getString("convenios.bairroConvenio"));
                convenio.setCidadeConvenio(rs.getString("convenios.cidadeConvenio"));
                convenio.setCEPConvenio(rs.getString("convenios.CEPConvenio"));
                convenio.setEstadoConvenio(rs.getString("convenios.estadoConvenio"));
                convenio.setTelefoneConvenio(rs.getString("convenios.telefoneConvenio"));
                convenio.setEmailConvenio(rs.getString("convenios.emailConvenio"));


            }

            stmt.close();

            return (convenio);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void alterarConvenio(Convenio convenio, String idConvenio) {
        String sql = "UPDATE convenios SET "
                + " CNPJ = '" + convenio.getCNPJ() + "',"
                + " razaoSocial = '" + convenio.getRazaoSocial() + "',"
                + " nomeFantasia = '" + convenio.getNomeFantasia() + "',"
                + " enderecoConvenio = '" + convenio.getEnderecoConvenio() + "',"
                + " numeroConvenio = '" + convenio.getNumeroConvenio() + "',"
                + " bairroConvenio = '" + convenio.getBairroConvenio() + "',"
                + " cidadeConvenio = '" + convenio.getCidadeConvenio() + "', "
                + " CEPConvenio = '" + convenio.getCEPConvenio() + "', "
                + " estadoConvenio = '" + convenio.getEstadoConvenio() + "', "
                + " telefoneConvenio = '" + convenio.getTelefoneConvenio() + "', "
                + " emailConvenio = '" + convenio.getEmailConvenio() + "' "
                + " WHERE idConvenio = '" + Integer.parseInt(idConvenio) + "'";

        try {

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();


        } catch (SQLException u) {
            u.printStackTrace();
            throw new RuntimeException(u);
        }
    }

    public Sindicalizado pesquisarSindicalizado(String nome) {
        Sindicalizado sindicalizado = new Sindicalizado();

        try {
            String sql;

            sql = "SELECT * FROM sindicalizado WHERE nomeSindicalizado = '" + nome + "' ; ";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                sindicalizado.setIdSindicalizado(rs.getString(1));
                sindicalizado.setNumeroMatricula(rs.getString(3));
                sindicalizado.setNomeSindicalizado(rs.getString(2));
                sindicalizado.setPaiSindicalizado(rs.getString(4));
                sindicalizado.setMaeSindicalizado(rs.getString(5));
                sindicalizado.setNaturalidadeSindicalizado(rs.getString(6));
                sindicalizado.setNacionalidadeSindicalizado(rs.getString(7));
                sindicalizado.setDataNascimento(rs.getString(8));
                sindicalizado.setEstadocivilSindicalizado(rs.getString(9));
                sindicalizado.setRGSindicalizado(rs.getString(20));
                sindicalizado.setEstadoOrgaoExpedidor(rs.getString(21));
                sindicalizado.setCPFSindicalizado(rs.getString(19));
                sindicalizado.setEnderecoSindicalizado(rs.getString(10));
                sindicalizado.setNumeroSindicalizado(rs.getString(11));
                sindicalizado.setBairroSindicalizado(rs.getString(12));
                sindicalizado.setCidadeSindicalizado(rs.getString(13));
                sindicalizado.setCEPSindicalizado(rs.getString(14));
                sindicalizado.setEstadoSindicalizado(rs.getString(15));
                sindicalizado.setTelefoneSindicalizado(rs.getString(16));
                sindicalizado.setInstituicaoTrabalho(rs.getString(17));
                sindicalizado.setCargoTrabalho(rs.getString(18));
                sindicalizado.setCargoEletivoSindicalizado(rs.getString(22));
                sindicalizado.setCargoSindicato(rs.getString(23));
                sindicalizado.setDataContrato(rs.getString(24));
                sindicalizado.setDataAprovacao(rs.getString(25));
                setIdConvenio(sindicalizado.getIdSindicalizado());

                sindicalizado.setDependente(daoDependente.retornarDependentes(sindicalizado.getIdSindicalizado()));

            }

            setVerificacao(false);
            if (sindicalizado.getBairroSindicalizado() == null) {
                setVerificacao(true);
            }
            stmt.close();
            return (sindicalizado);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void alterarSindicalizado(Sindicalizado sindicalizado, String idSindicalizado) {
        String sql = "UPDATE sindicalizado SET "
                + "nomeSindicalizado = '" + sindicalizado.getNomeSindicalizado() + "', "
                + "numeroMatricula = '" + sindicalizado.getNumeroMatricula() + "', "
                + "paiSindicalizado = '" + sindicalizado.getPaiSindicalizado() + "', "
                + "maeSindicalizado = '" + sindicalizado.getMaeSindicalizado() + "', "
                + "naturalidadeSindicalizado = '" + sindicalizado.getNaturalidadeSindicalizado() + "', "
                + "nacionalidadeSindicalizado = '" + sindicalizado.getNacionalidadeSindicalizado() + "', "
                + "dataNascimento = '" + sindicalizado.getDataNascimento() + "', "
                + "estadocivilSindicalizado = '" + sindicalizado.getEstadocivilSindicalizado() + "', "
                + "enderecoSindicalizado = '" + sindicalizado.getEnderecoSindicalizado() + "', "
                + "numeroSindicalizado = '" + sindicalizado.getNumeroSindicalizado() + "', "
                + "bairroSindicalizado = '" + sindicalizado.getBairroSindicalizado() + "', "
                + "cidadeSindicalizado = '" + sindicalizado.getCidadeSindicalizado() + "', "
                + "CEPSindicalizado = '" + sindicalizado.getCEPSindicalizado() + "', "
                + "estadoSindicalizado = '" + sindicalizado.getEstadoSindicalizado() + "', "
                + "telefoneSindicalizado = '" + sindicalizado.getTelefoneSindicalizado() + "', "
                + "instituicaoTrabalho = '" + sindicalizado.getInstituicaoTrabalho() + "', "
                + "cargoTrabalho = '" + sindicalizado.getCargoTrabalho() + "', "
                + "CPFSindicalizado = '" + sindicalizado.getCPFSindicalizado() + "', "
                + "RGSindicalizado = '" + sindicalizado.getRGSindicalizado() + "', "
                + "estadoOrgaoExpedidor = '" + sindicalizado.getEstadoOrgaoExpedidor() + "', "
                + "cargoEletivoSindicalizado = '" + sindicalizado.getCargoEletivoSindicalizado() + "', "
                + "cargoSindicato = '" + sindicalizado.getCargoSindicato() + "', "
                + "dataContrato = '" + sindicalizado.getDataContrato() + "', "
                + "dataAprovacao = '" + sindicalizado.getDataAprovacao() + "' "
                + "WHERE idSindicalizado = " + Integer.parseInt(idSindicalizado) + "";

        try {

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
            stmt.close();


        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList pesquisarLancamento(String Data1, String Data2, String nomeSindicalizado, String convenioSelecionado) {

        ArrayList lista = new ArrayList();
        try {

            String sql;
            sql = "SELECT s.idSindicalizado, s.nomeSindicalizado, "
                    + "cc.idCategoria, cc.Descricao, "
                    + "c.idConvenio, c.nomeFantasia, "
                    + "l.idLancamento, l.valorGasto, l.dataLancamento, l.descricaoLancamento, "
                    + "f.idFuncionario, f.nomeFuncionario "
                    + "FROM lancamento l LEFT JOIN sindicalizado s ON l.Sindicalizado_idSindicalizado = s.idSindicalizado "
                    + "LEFT JOIN convenios c ON l.Convenios_idConvenio = c.idConvenio "
                    + "LEFT JOIN funcionarios f ON l.Funcionarios_idFuncionario = f.idFuncionario "
                    + "LEFT JOIN categoriaconvenio cc ON l.CategoriaConvenio_idCategoria = cc.idCategoria "
                    + "WHERE STR_TO_DATE (l.dataLancamento, '%d/%m/%Y') >= STR_TO_DATE ('" + Data1 + "', '%d/%m/%Y')"
                    + "AND STR_TO_DATE (l.dataLancamento, '%d/%m/%Y') <= STR_TO_DATE ('" + Data2 + "', '%d/%m/%Y')";

            if (nomeSindicalizado != null) {
                sql += " AND s.nomeSindicalizado = '" + nomeSindicalizado + "' ";
            }

            if (convenioSelecionado != null) {
                sql += " AND c.nomeFantasia = '" + convenioSelecionado + "' ";
            }


            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Lancamento lancamento = new Lancamento();
                Sindicalizado sindicalizado = new Sindicalizado();
                Convenio convenio = new Convenio();
                Usuario usuario = new Usuario();
                Categoria categoria = new Categoria();

                sindicalizado.setIdSindicalizado(rs.getString("idSindicalizado"));
                sindicalizado.setNomeSindicalizado(rs.getString("nomeSindicalizado"));

                convenio.setIdConvenio(rs.getString("idConvenio"));
                convenio.setNomeFantasia(rs.getString("nomeFantasia"));

                usuario.setIdusuario(rs.getString("idFuncionario"));
                usuario.setFuncionario(rs.getString("nomeFuncionario"));

                categoria.setIdCategoria("idCategoria");
                categoria.setTipoCategoria(rs.getString("Descricao"));

                lancamento.setIdSindicalizado(sindicalizado.getIdSindicalizado());
                lancamento.setIdCategoria(categoria.getIdCategoria());
                lancamento.setIdConvenio(convenio.getIdConvenio());
                lancamento.setIdLancamento(rs.getString("idLancamento"));
                lancamento.setValorGasto(rs.getString("valorGasto"));
                lancamento.setData(rs.getString("dataLancamento"));
                lancamento.setDescricao(rs.getString("descricaoLancamento"));
                lancamento.setIdFuncionario(usuario.getIdusuario());

                lancamento.setSindicalizado(sindicalizado);
                lancamento.setConvenio(convenio);
                lancamento.setUsuario(usuario);
                lancamento.setCategoria(categoria);

                lista.add(lancamento);
            }
            setVerificacao(false);
            if (lista.isEmpty()) {
                setVerificacao(true);
            }

            stmt.close();
            return (lista);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void alterarLancamento(Lancamento lancamento, String idLancamento) {
        String sql = "UPDATE lancamento SET "
                + "CategoriaConvenio_idCategoria = '" + Integer.parseInt(lancamento.getIdCategoria()) + "', "
                + "Sindicalizado_idSindicalizado = '" + Integer.parseInt(lancamento.getIdSindicalizado()) + "', "
                + "Convenios_idConvenio = '" + Integer.parseInt(lancamento.getIdConvenio()) + "', "
                + "Funcionarios_idFuncionario = '" + Integer.parseInt(lancamento.getIdFuncionario()) + "', "
                + "valorGasto = '" + lancamento.getValorGasto() + "', "
                + "dataLancamento = '" + lancamento.getData() + "', "
                + "descricaoLancamento = '" + lancamento.getDescricao() + "' "
                + "WHERE idLancamento = " + Integer.parseInt(idLancamento) + "";

        try {

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
            stmt.close();


        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void excluirLancamento(String idLancamento) {
        String sql = "DELETE FROM lancamento WHERE idLancamento = '" + idLancamento + "'";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
}
