package Computador;

public class Gabinete {
    private String tipo;
    private String marca;

    //Métodos construtores da classe Gabinete
    public Gabinete() {}
    public Gabinete(String tipo, String marca) {
        this.tipo = tipo; this.marca = marca;
    }
    //Método construtor para criar copia de objetos ja existentes
    public Gabinete(Gabinete copia) {
        this(copia.tipo, copia.marca);
    }

    //Get/Set
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    //Converter numero para texto
    @Override
    public String toString() {
        return String.format("%s %s", tipo, marca);
    }
}