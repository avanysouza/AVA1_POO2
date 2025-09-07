package Computador;

import java.util.Scanner;

//Instanciar objetos
public abstract class Computador {
    private String marca;
    private double preco;
    private int quantidade;

    // Métodos construtores da classe Computador
    public Computador() {}
    public Computador(String marca) { this.marca = marca; }
    public Computador(String marca, double preco) { this.marca = marca; this.preco = preco; }
    public Computador(String marca, double preco, int quantidade) {
        this.marca = marca; this.preco = preco; this.quantidade = quantidade;
    }
    public Computador(Computador copia) {
        this.marca = copia.marca;
        this.preco = copia.preco;
        this.quantidade = copia.quantidade;
    }


    // Get/Set
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    // Métodos
    public double calcularEstoque() { return preco * quantidade; }

    // Métodos imprimir, cadastrar e entrada de dados
    public abstract void imprimirDados();
    public abstract void atualizarDados(String marca, double preco, int quantidade);
    public abstract void cadastrarDados(Scanner sc);
}