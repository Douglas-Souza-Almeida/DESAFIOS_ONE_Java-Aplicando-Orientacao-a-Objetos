package models;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curti() {
        this.totalCurtidas++;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void reproduz () {
        this.totalReproducoes++;
    }
}
