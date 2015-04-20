package MODEL;

public class Lancamento {

    private String idLancamento;
    private String idSindicalizado;
    private String idConvenio;
    private String idCategoria;
    private String valorGasto;
    private String data;
    private String descricao;
    private String idFuncionario;
    
    private Sindicalizado sindicalizado;
    private Convenio convenio;
    private Usuario usuario;
    private Categoria categoria;
    
    

    /**
     * @return the idLancamento
     */
    public String getIdLancamento() {
        return idLancamento;
    }

    /**
     * @param idLancamento the idLancamento to set
     */
    public void setIdLancamento(String idLancamento) {
        this.idLancamento = idLancamento;
    }

    /**
     * @return the idSindicalizado
     */
    public String getIdSindicalizado() {
        return idSindicalizado;
    }

    /**
     * @param idSindicalizado the idSindicalizado to set
     */
    public void setIdSindicalizado(String idSindicalizado) {
        this.idSindicalizado = idSindicalizado;
    }

    /**
     * @return the idConvenio
     */
    public String getIdConvenio() {
        return idConvenio;
    }

    /**
     * @param idConvenio the idConvenio to set
     */
    public void setIdConvenio(String idConvenio) {
        this.idConvenio = idConvenio;
    }

    /**
     * @return the idCategoria
     */
    public String getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the idFuncionario
     */
    public String getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the valorGasto
     */
    public String getValorGasto() {
        return valorGasto;
    }

    /**
     * @param valorGasto the valorGasto to set
     */
    public void setValorGasto(String valorGasto) {
        this.valorGasto = valorGasto;
    }

    /**
     * @return the sindicalizado
     */
    public Sindicalizado getSindicalizado() {
        return sindicalizado;
    }

    /**
     * @param sindicalizado the sindicalizado to set
     */
    public void setSindicalizado(Sindicalizado sindicalizado) {
        this.sindicalizado = sindicalizado;
    }

    /**
     * @return the convenio
     */
    public Convenio getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
