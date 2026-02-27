public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

   
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "Jogo: " + nome + " | Gênero: " + genero + " | Preço: R$ " + String.format("%.2f", preco);
    }
}
