package Computador;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Computador> modelos = new ArrayList<>();

        System.out.println("#### Cadastro de Computadores ####");

        for (int i = 1; i <= 3; i++) {
            Servidor s = new Servidor();
            s.cadastrarDados(sc);
            modelos.add(s);
        }

        for (int i = 1; i <= 3; i++) {
            Notebook n = new Notebook();
            n.cadastrarDados(sc);
            modelos.add(n);
        }

        for (int i = 1; i <= 3; i++) {
            Desktop d = new Desktop();
            d.cadastrarDados(sc);
            modelos.add(d);
        }

        System.out.println("\n#### Relatório ####");
        double total = 0.0;
        for (Computador c : modelos) {
            c.imprimirDados();
            total += c.calcularEstoque();
        }
        System.out.printf("Total em estoque: %.2f%n", total);

        sc.close();
    }
}