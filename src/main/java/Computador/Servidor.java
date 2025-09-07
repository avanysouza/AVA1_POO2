package Computador;

import java.util.Scanner;

public class Servidor extends Computador {
    private Memoria memoria = new Memoria();
    private Armazenamento armazenamento = new Armazenamento();
    private Fonte fonte = new Fonte();
    private Gabinete gabinete = new Gabinete();

    //Métodos construtores da classe Servidor
    public Servidor() {}
    public Servidor(String marca) { super(marca); }
    public Servidor(String marca, double preco, int quantidade) { super(marca, preco, quantidade); }
    public Servidor(String marca, double preco, int quantidade,
                    Memoria memoria, Armazenamento armazenamento, Fonte fonte, Gabinete gabinete) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
        this.gabinete = gabinete;
    }

    //metodos imprimir, atualizar e entrada de dados
    @Override
    public void imprimirDados() {
        System.out.println(":: Servidor ::");
        System.out.printf("Marca: %s | Preço: %.2f | Quantidade: %d | Total: %.2f%n",
                getMarca(), getPreco(), getQuantidade(), calcularEstoque());
        System.out.println("Memória: " + memoria);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Fonte: " + fonte);
        System.out.println("Gabinete: " + gabinete);
    }

    @Override
    public void atualizarDados(String marca, double preco, int quantidade) {
        setMarca(marca);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    @Override
    public void cadastrarDados(Scanner sc) {
        System.out.println(":: Cadastro de Servidor ::");

        System.out.print("Marca: ");
        setMarca(sc.nextLine());

        System.out.print("Preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));

        System.out.print("Quantidade: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));

        // Memoria
        System.out.print("Número de slots de memória: ");
        memoria.setSlots(Integer.parseInt(sc.nextLine()));
        System.out.print("Tipo de memória: ");
        memoria.setTipo(sc.nextLine());
        System.out.print("Marca da memória: ");
        memoria.setMarca(sc.nextLine());
        System.out.print("Capacidade da memória (GB): ");
        memoria.setCapacidadeGB(Integer.parseInt(sc.nextLine()));

        // Armazenamento
        System.out.print("Número de HDs suportados: ");
        armazenamento.setQuantidadeDiscos(Integer.parseInt(sc.nextLine()));
        System.out.print("Tipo de HD: ");
        armazenamento.setTipo(sc.nextLine());
        System.out.print("Marca do HD: ");
        armazenamento.setMarca(sc.nextLine());
        System.out.print("Capacidade do HD (GB): ");
        armazenamento.setCapacidadeGB(Integer.parseInt(sc.nextLine()));

        // Fonte
        System.out.print("Tipo da fonte: ");
        fonte.setTipo(sc.nextLine());
        System.out.print("Marca da fonte: ");
        fonte.setMarca(sc.nextLine());
        System.out.print("Potência da fonte (W): ");
        fonte.setPotencia(Integer.parseInt(sc.nextLine()));

        // Gabinete
        System.out.print("Tipo do gabinete: ");
        gabinete.setTipo(sc.nextLine());
        System.out.print("Marca do gabinete: ");
        gabinete.setMarca(sc.nextLine());
    }
}
