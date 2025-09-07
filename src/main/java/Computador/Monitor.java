package Computador;

public class Monitor {
    private String tipo;
    private String marca;
    private int resolucao;

    public Monitor() {}
    public Monitor(String tipo, String marca, int resolucao) {
        this.tipo = tipo; this.marca = marca; this.resolucao = resolucao;
    }
    public Monitor(Monitor outro) {
        this(outro.tipo, outro.marca, outro.resolucao);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getResolucao() { return resolucao; }
    public void setResolucao(int resolucao) { this.resolucao = resolucao; }

    @Override
    public String toString() {
        return String.format("%s %s %dp", tipo, marca, resolucao);
    }
}

