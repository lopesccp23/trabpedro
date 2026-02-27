package main.java.com.academia.model;

public class Jogo {
    private String nome;
    private String genero;
    
    public Jogo() {
    }
    public Jogo(String nome, String genero, int plano) {
        this.nome = nome;
        this.genero = genero;
        this.plano = plano;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    }  
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jogo jogo = (Jogo) o;

        if (plano != jogo.plano) return false;
        if (nome != null ? !nome.equals(jogo.nome) : jogo.nome != null) return false;
        return genero != null ? genero.equals(jogo.genero) : jogo.genero == null;
    }
    
    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (genero != null ? genero.hashCode() : 0)
        return result;
    }
}
