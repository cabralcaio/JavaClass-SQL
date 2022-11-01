package entidades;

public class Carrinho {
    public Integer idCarrinho;
    private Boolean pagamentoAprovado;
    private String formaPagamento;
    private String dataCompra;
    private Double desconto;
    private Cliente idCliente;
    private Produtos idProdutos;

    Carrinho(Integer idCarrinho, Boolean pagamentoAprovado, String formaPagamento, String dataCompra, Double desconto, Cliente idCliente, Produtos idProdutos){
        this.idCarrinho = idCarrinho;
        this.pagamentoAprovado = pagamentoAprovado;
        this.formaPagamento = formaPagamento;
        this.dataCompra = dataCompra;
        this.desconto = desconto;
        this.idCliente = idCliente;
        this.idProdutos =  idProdutos;
    }

    public Integer getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Integer idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Boolean getPagamentoAprovado() {
        return pagamentoAprovado;
    }

    public void setPagamentoAprovado(Boolean pagamentoAprovado) {
        this.pagamentoAprovado = pagamentoAprovado;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Produtos getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(Produtos idProdutos) {
        this.idProdutos = idProdutos;
    }

    public void iniciaProducao(boolean pagamentoAprovado) {
        if (pagamentoAprovado) {
            System.out.println("Produção iniciada");
        } else {
            System.out.println("Pagamento não aprovado. Aguarde para iniciar a produção do produto");
        }
    }
}
