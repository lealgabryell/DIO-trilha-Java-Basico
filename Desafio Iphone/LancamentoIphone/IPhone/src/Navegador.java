public class Navegador extends Aparelho {
    String nomeDaPagina;

    public void setNomeDaPagina(String nomeDaPagina){
        this.nomeDaPagina = nomeDaPagina;
    }
    public String getNomeDaPagina(){
        return nomeDaPagina;
    }
    public void abrirNavegador(){
        System.out.println("Abrindo navegador...");
    }
    public void exibirPagina(){
        System.out.println("A pagina " + getNomeDaPagina() + " esta sendo exibida!");
    }

    public void adicionarNovaPagina(){
        System.out.println("Nova aba adionada...");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina...");
    }
}
