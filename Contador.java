import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = terminal.nextInt();

        try {
            contar(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro número.");
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = numeroDois - numeroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
