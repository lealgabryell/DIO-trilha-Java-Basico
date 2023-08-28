import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // To do: Importar scannner
        // Exibir as mensagens para os usuarios
        // Obter pelo Scanner os valores digitados no terminal
        // Exibir mensagem de conta criada

        // Por: Gabryell Leal Rocha

        // Criando um objeto para receber input
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------Bem vindo ao Banco DIO------------------------------" +
                "\nPor favor, siga as instruções e digite ENTER para avancar");
        System.out.println("Insira nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Insira o numero da sua conta");
        int numero = sc.nextInt();
        System.out.println("Insira a agencia (***-**): ");
        String ag = sc.next();
        System.out.println("Informe seu saldo: ");
        float saldo = sc.nextFloat();
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",
                nome, ag, numero, saldo);
    }
}
