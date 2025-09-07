package Computador;

public class PlacaVideo {
    private int numeroPlacas;
    private String marca;

    //Métodos construtores da classe PlacaVideo
    public PlacaVideo() {}
    public PlacaVideo(int quantidade, String marca) {
        this.numeroPlacas = quantidade; this.marca = marca;
    }
    //Métodos construtor para criar copia de objetos ja existentes
    public PlacaVideo(PlacaVideo copia) {
        this(copia.numeroPlacas, copia.marca);
    }

    //Get/Set
    public int getQuantidadePlacas(int i) { return numeroPlacas; }
    public void setQuantidadePlacas(int quantidade) { this.numeroPlacas = quantidade; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    //Converter numero para texto
    @Override
    public String toString() {
        return String.format("%dx %s", numeroPlacas, marca);
    }


}

