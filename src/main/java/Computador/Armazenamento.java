package Computador;

public class Armazenamento {
    private String tipo;
    private String marca;
    private int capacidadeGB;
    private int quantidadeDiscos;

    //Métodos construtores da classe Armazenamento
    public Armazenamento() {}
    public Armazenamento(String tipo, String marca, int capacidadeGB, int quantidadeDiscos) {
        this.tipo = tipo; this.marca = marca; this.capacidadeGB = capacidadeGB; this.quantidadeDiscos = quantidadeDiscos;
    }
    //Método construtor para criar copia de objetos ja existentes
    public Armazenamento(Armazenamento copia) {
        this(copia.tipo, copia.marca, copia.capacidadeGB, copia.quantidadeDiscos);
    }

    //Get/Set
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getCapacidadeGB() { return capacidadeGB; }
    public void setCapacidadeGB(int capacidadeGB) { this.capacidadeGB = capacidadeGB; }
    public int getQuantidadeDiscos() { return quantidadeDiscos; }
    public void setQuantidadeDiscos(int quantidadeDiscos) { this.quantidadeDiscos = quantidadeDiscos; }

    //Converter numero para texto
    @Override
    public String toString() {
        return String.format("%s %s %dGB (x%d)", tipo, marca, capacidadeGB, quantidadeDiscos);
    }

    public void setCapacidade(int capacidade) {
        this.capacidadeGB = capacidade;
    }
}