package entidades;

public class Produtos {
    public Integer idProdutos;
    private String produto;
    private Integer tempoProducao;
    private String materiaPrima;
    private Double preco;
    private Integer quantidade;

    public Produtos(Integer idProdutos, String produto, Integer tempoProducao, String materiaPrima, Double preco, Integer quantidade) {
        this.idProdutos = idProdutos;
        this.produto = produto;
        this.tempoProducao = tempoProducao;
        this.materiaPrima = materiaPrima;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(Integer idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getTempoProducao() {
        return tempoProducao;
    }

    public void setTempoProducao(Integer tempoProducao) {
        this.tempoProducao = tempoProducao;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void totalProdutos (Integer quantidade, Double preco) {
        double total = preco * quantidade;
        System.out.println("O valor total dos produtos é: " + total);
    }

}



