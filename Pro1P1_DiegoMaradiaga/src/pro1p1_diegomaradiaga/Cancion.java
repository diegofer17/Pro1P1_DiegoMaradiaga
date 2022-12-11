package pro1p1_diegomaradiaga;

import java.util.ArrayList;

public class Cancion {

    private String cancion;
    private String album;
    private String artista;
    private int duracion;
    private int lanzamiento;

    public Cancion() {

    }

    public Cancion(String cancion, String album, String artista, int duracion, int lanzamiento) {
        this.cancion = cancion;
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
        this.lanzamiento = lanzamiento;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "cancion=" + cancion + ", album=" + album + ", artista=" + artista + ", duracion=" + duracion + ", lanzamiento=" + lanzamiento + '}';
    }

}
