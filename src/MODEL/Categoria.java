package MODEL;
public class Categoria {
    private String tipoCategoria;
    private String idCategoria;
    private boolean verificacao;

    public Categoria() {
    }

    /**
     * @return the tipoCategoria
     */
    public String getTipoCategoria() {
        return tipoCategoria;
    }

    /**
     * @param tipoCategoria the tipoCategoria to set
     */
    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
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
     * @return the verificacao
     */
    public boolean isVerificacao() {
        return verificacao;
    }

    /**
     * @param verificacao the verificacao to set
     */
    public void setVerificacao(boolean verificacao) {
        this.verificacao = verificacao;
    }

    
    
}
