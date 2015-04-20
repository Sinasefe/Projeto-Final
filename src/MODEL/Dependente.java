package MODEL;
public class Dependente {
    private int idDependentes;
    private String tipoDependente;
    private int idSindicalizado;
    private String nomeDependente;
    private String dataNascimento;
    private String sexo;

    public Dependente() {
    }

    public void setIdDependentes(int idDependentes) {
        this.idDependentes = idDependentes;
    }

    public int getIdDependentes() {
        return idDependentes;
    }
    
    
    /**
     * @return the tipoDependente
     */
    public String getTipoDependente() {
        return tipoDependente;
    }

    /**
     * @param tipoDependente the tipoDependente to set
     */
    public void setTipoDependente(String tipoDependente) {
        this.tipoDependente = tipoDependente;
    }

    /**
     * @return the idSindicalizado
     */
    public int getIdSindicalizado() {
        return idSindicalizado;
    }

    /**
     * @param idSindicalizado the idSindicalizado to set
     */
    public void setIdSindicalizado(int idSindicalizado) {
        this.idSindicalizado = idSindicalizado;
    }

    /**
     * @return the nomeDependente
     */
    public String getNomeDependente() {
        return nomeDependente;
    }

    /**
     * @param nomeDependente the nomeDependente to set
     */
    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
}
