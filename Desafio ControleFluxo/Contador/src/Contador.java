import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int p1 = sc.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int p2 = sc.nextInt();

        try {
            contar(p1, p2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if (p1 > p2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = p2 - p1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
