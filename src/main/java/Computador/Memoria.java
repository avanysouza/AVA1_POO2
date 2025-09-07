package Computador;

public class Memoria {
    private int slots;
    private String tipo;
    private String marca;
    private int capacidadeGB;

    //Métodos construtores da classe Memoria
    public Memoria() {}
    public Memoria(int slots, String tipo, String marca, int capacidadeGB) {
        this.slots = slots; this.tipo = tipo; this.marca = marca; this.capacidadeGB = capacidadeGB;
    }

    //Métodos construtor para criar copia de objetos ja existentes
    public Memoria(Memoria copia) {
        this(copia.slots, copia.tipo, copia.marca, copia.capacidadeGB);
    }

    //Get/Set
    public int getSlots() { return slots; }
    public void setSlots(int slots) { this.slots = slots; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getCapacidadeGB() { return capacidadeGB; }
    public void setCapacidadeGB(int capacidadeGB) { this.capacidadeGB = capacidadeGB; }

    //Converter numero para texto
    @Override
    public String toString() {
        return String.format("%d slots %s %s %dGB", slots, tipo, marca, capacidadeGB);
    }

    public void setNumeroSlots(int quantidadeSlots) {
        this.slots = quantidadeSlots;
    }
}