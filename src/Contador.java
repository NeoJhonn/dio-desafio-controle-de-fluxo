import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Contador {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = tec.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = tec.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // imprimir os números
        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número "+ i);
        }
    }
}