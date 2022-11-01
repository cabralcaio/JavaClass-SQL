package entidades;

public class Artesao {
    public Integer idArtesao;
    private String nome;
    private String sobrenome;
    private String senioridade;
    private String especialidade;
    private Produtos idProdutos;

    public Artesao(Integer idArtesao, String nome, String sobrenome, String senioridade, String especialidade, Produtos idProdutos) {
        this.idArtesao = idArtesao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senioridade = senioridade;
        this.especialidade = especialidade;
        this.idProdutos = idProdutos;
    }

    public Integer getIdArtesao() {
        return idArtesao;
    }

    public void setIdArtesao(Integer idArtesao) {
        this.idArtesao = idArtesao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Produtos getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(Produtos idProdutos) {
        this.idProdutos = idProdutos;
    }

    public void produzir (Integer idProdutos, Integer tempoProducao, Integer idArtesao) {
        System.out.printf("O produto %d está sendo produzido pelo %d e vai demorar %d", idProdutos, idArtesao, tempoProducao);
    }

}

