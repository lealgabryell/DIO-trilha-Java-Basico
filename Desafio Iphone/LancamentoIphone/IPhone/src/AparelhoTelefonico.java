public class AparelhoTelefonico extends Aparelho {
    // atributos
    String numero;

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    public void discarNumero(String numero) {
        aparelhoTelefonico.setNumero(numero); // define o numero a ser discado
        System.out.println("\nDiscando " + aparelhoTelefonico.getNumero());
    }

    public void atender(){
        System.out.println("\nAtendeu!");
    }
    public void recusar(){
        System.out.println("\nRecusou!");
    }
    public void iniciarCorreioDeVoz(){
        System.err.println("\nMostrando mensagens do correio de voz...");
    }
}
