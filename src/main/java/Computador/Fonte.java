package Computador;

public class Fonte {
    private String tipo;
    private String marca;
    private int potencia;

    //Métodos construtores da classe Fonte
    public Fonte() {}
    public Fonte(String tipo, String marca, int potencia) {
        this.tipo = tipo; this.marca = marca; this.potencia = potencia;
    }
    //Método construtor para criar copia de objetos ja existentes
    public Fonte(Fonte copia) {
        this(copia.tipo, copia.marca, copia.potencia);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getPotencia() { return potencia; }
    public void setPotencia(int potenciaW) { this.potencia = potencia; }

    //Converter numero para texto
    @Override
    public String toString() {
        return String.format("%s %s %dW", tipo, marca, potencia);
    }
}