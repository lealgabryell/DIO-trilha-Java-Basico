public class ReprodutorMusical extends Aparelho {
    private String musica;
    private String playlist;
    private String artista;

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getMusica() {
        return musica;
    }

    public String getPlaylist() {
        return playlist;
    }

    public String getArtista() {
        return artista;
    }

    public void tocarMusica() {
        System.out.println("A musica " + getMusica() + " da playlist " + getPlaylist() + " por " + getArtista()
                + " esta tocando agora...");
    }

    public void pausarMusica() {
        System.out.println("A musica " + getMusica() + " da playlist " + getPlaylist() + " por " + getArtista()
                + " foi pausada...");
    }

    public void selecionarMusica(String musica, String playlist, String artista) {
        reprodutorMusical.setMusica(musica);
        reprodutorMusical.setPlaylist(playlist);
        reprodutorMusical.setArtista(artista);
        System.out.println("Voce escolheu a faixa " + reprodutorMusical.getMusica() +
                " da playlist "
                + reprodutorMusical.getPlaylist() + " pelo artista " +
                reprodutorMusical.getArtista()
                + " deseja tocar ou pausar?");
    }
}
