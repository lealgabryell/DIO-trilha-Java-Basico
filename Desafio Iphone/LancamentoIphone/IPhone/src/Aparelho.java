import java.util.Scanner;

public class Aparelho {
    public static Scanner sc = new Scanner(System.in);
    public static ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    public static AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    public static Navegador navegador = new Navegador();
    // Atributos
    private static String modelo;
    private static double tela;
    private static double camera;
    private static String processador;

    public static void main(String[] args) throws Exception {
        // Atributos do aparelho
        modelo = "Iphone 15";
        tela = 13.0;
        camera = 20.0;
        processador = "A15 Bionic";

        // menu
        System.out.println(
                "Bem-vindo ao " + modelo
                        + " \nQual funcao deseja utilizar?\n1)Reprodutor musical\n2)Aparelho telefonico\n3)Navegador\n4)Informacoes\n5)Desligar Iphone");
        int escolha = sc.nextInt();
        sc.nextLine();
        switch (escolha) {
            case 1: // se a escolha for 1
                System.out.println("Escolha a faixa, a playlist e o(a) artista (ENTER para confirmar): ");
                String musica = sc.nextLine();
                String playlist = sc.nextLine();
                String artista = sc.nextLine();
                reprodutorMusical.selecionarMusica(musica, playlist, artista);
                String esc = sc.nextLine();
                if (esc.equalsIgnoreCase("tocar")) {
                    reprodutorMusical.tocarMusica();
                } else if (esc.equalsIgnoreCase("pausar")) {
                    reprodutorMusical.pausarMusica();
                }
                break;
            case 2: // se a escolha for 2
                System.out.println(
                        "Voce esta recebendo uma ligacao de um numero desconhecido...\nDeseja atender ou recusar?");
                String resposta = sc.nextLine();
                if (resposta.equalsIgnoreCase("atender")) {
                    aparelhoTelefonico.atender();
                } else if (resposta.equalsIgnoreCase("recusar")) {
                    aparelhoTelefonico.recusar();
                }
                System.out.println("Deseja ligar para alguem? ");
                resposta = sc.nextLine();
                if (resposta.equalsIgnoreCase("sim")) {
                    System.out.println("Digite o numero que voce deseja discar: ");
                    String numero = sc.nextLine(); // recebe o numero para discagem
                    aparelhoTelefonico.discarNumero(numero);
                } else if (resposta.equalsIgnoreCase("nao")) {
                    break;
                }
                System.out.println("Deseja escutar o correio de voz? ");
                resposta = sc.nextLine();
                if (resposta.equalsIgnoreCase("sim")) {
                    aparelhoTelefonico.iniciarCorreioDeVoz();
                } else if (resposta.equalsIgnoreCase("nao")) {
                    break;
                }
                break;
            case 3: // se a escolha for 3
                navegador.abrirNavegador();
                System.out.println("Digite o nome da pagina que sera exibida: ");
                String nomeDaPagina = sc.nextLine();
                navegador.exibirPagina(nomeDaPagina);
                System.out.println("Deseja adicionar uma nova pagina?");

                //TODO: continuar daqui...


                break;
            case 4: // se a escolha for 4
                System.out.println(modelo + ", tela de " + tela + " polegadas, camera de " + camera
                        + " megapixels e processador " + processador);
                break;
            case 5:// se a escolha for 5
                System.out.println("Desligando o aparelho...");
                System.exit(0);
        }

    }
}
