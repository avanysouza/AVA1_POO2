package Computador;

import java.util.Scanner;

//Instanciar objetos
public class Notebook extends Computador {
    private Memoria memoria = new Memoria();
    private Armazenamento armazenamento = new Armazenamento();
    private Fonte fonte = new Fonte();
    private Monitor monitor = new Monitor();

    // Métodos construtores
    public Notebook() {}
    public Notebook(String marca) { super(marca); }
    public Notebook(String marca, double preco, int quantidade) { super(marca, preco, quantidade); }
    public Notebook(String marca, double preco, int quantidade,
                    Memoria memoria, Armazenamento armazenamento, Fonte fonte, Monitor monitor) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
        this.monitor = monitor;
    }
    public Notebook(Notebook copia) {
        super(copia.getMarca(), copia.getPreco(), copia.getQuantidade());
        this.memoria = new Memoria(copia.memoria);
        this.armazenamento = new Armazenamento(copia.armazenamento);
        this.fonte = new Fonte(copia.fonte);
        this.monitor = new Monitor(copia.monitor);
    }

    // Métodos
    @Override
    public void imprimirDados() {
        System.out.println(":: Notebook ::");
        System.out.printf("Marca: %s | Preço: %.2f | Quantidade: %d | Total: %.2f%n",
                getMarca(), getPreco(), getQuantidade(), calcularEstoque());
        System.out.println("Memória: " + memoria);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Fonte: " + fonte);
        System.out.println("Monitor: " + monitor);
    }

    @Override
    public void atualizarDados(String marca, double preco, int quantidade) {
        setMarca(marca);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    @Override
    public void cadastrarDados(Scanner sc) {
        System.out.println("Cadastro de Notebook");

        // Dados principais
        System.out.print("Marca: ");
        setMarca(sc.nextLine());
        System.out.print("Preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.print("Quantidade: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));

        // Dados da Memória
        System.out.print("Tipo da Memória: ");
        memoria.setTipo(sc.nextLine());
        System.out.print("Marca da Memória: ");
        memoria.setMarca(sc.nextLine());
        System.out.print("Número de Slots de Memória: ");
        memoria.setNumeroSlots(Integer.parseInt(sc.nextLine()));

        // Dados do HD/armazenamento
        System.out.print("Tipo do HD: ");
        armazenamento.setTipo(sc.nextLine());
        System.out.print("Marca do HD: ");
        armazenamento.setMarca(sc.nextLine());
        System.out.print("Capacidade do HD (GB): ");
        armazenamento.setCapacidade(Integer.parseInt(sc.nextLine()));

        // Dados do Monitor
        System.out.print("Tipo do Monitor: ");
        monitor.setTipo(sc.nextLine());
        System.out.print("Marca do Monitor: ");
        monitor.setMarca(sc.nextLine());
        System.out.print("Resolução do Monitor (px): ");
        monitor.setResolucao(Integer.parseInt(sc.nextLine()));

        // Dados da Fonte
        System.out.print("Tipo da Fonte: ");
        fonte.setTipo(sc.nextLine());
        System.out.print("Marca da Fonte: ");
        fonte.setMarca(sc.nextLine());
        System.out.print("Potência da Fonte (W): ");
        fonte.setPotencia(Integer.parseInt(sc.nextLine()));
    }

}