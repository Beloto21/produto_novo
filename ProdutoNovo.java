import java.time.LocalDate; 
import java.time.temporal.ChronoUnit; 

public class Main {
    public static void main(String[] args) {
        // cria um novo objeto produto 
        Produto produto = new Produto("Produto Exemplo", 10.0, 11.0, LocalDate.now());
        
        // exibe informaçoes do produto no console
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço de Custo: " + produto.getPrecoCusto());
        System.out.println("Preço de Venda: " + produto.getPrecoVenda());
    }
}

// classe produto que representa um produto com varias propriedades
class Produto {
    private String nome; 
    private double precoCusto; 
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade; 

    // construtor que inicializa todas as propriedades do produto
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // construtor que inicializa nome, preço de custo, preço de venda e data de fabricaçao,
    // e define a data de validade como um mes apos a data de fabricaçao
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }

    // construtor que inicializa nome e preço de custo, calcula o preço de venda como 10% a mais
    // e define a data de fabricaçao como a data atual, e a data de validade como um mes apos
    public Produto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10; 
        this.dataFabricacao = LocalDate.now(); 
        this.dataValidade = this.dataFabricacao.plus(1, ChronoUnit.MONTHS); 
    }

    // metodos getters para acessar as propriedades do produto
    public String getNome() { return nome; }
    public double getPrecoCusto() { return precoCusto; }
    public double getPrecoVenda() { return precoVenda; }
    public LocalDate getDataFabricacao() { return dataFabricacao; }
    public LocalDate getDataValidade() { return dataValidade; }
}
