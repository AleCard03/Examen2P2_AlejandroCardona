
package examen2p2_alejandrocardona;

import java.util.ArrayList;

public class Artista extends Usuario {
    
    private String nombreArt;
    private ArrayList<Cancion> discografia;
    private ArrayList<ListaReproduccion> albumes;

    public Artista(String nombreArt, ArrayList<Cancion> discografia, ArrayList<ListaReproduccion> albumes, String username, String password, int edad) {
        super(username, password, edad);
        this.nombreArt = nombreArt;
        this.discografia = discografia;
        this.albumes = albumes;
    }

    public Artista(String nombreArt, String username, String password, int edad) {
        super(username, password, edad);
        this.nombreArt = nombreArt;
        discografia = new ArrayList();
        albumes = new ArrayList();
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public ArrayList<Cancion> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(ArrayList<Cancion> discografia) {
        this.discografia = discografia;
    }

    public ArrayList<ListaReproduccion> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<ListaReproduccion> albumes) {
        this.albumes = albumes;
    }
    
    public void addCancion(Cancion c){
        
        discografia.add(c);
        
    }
    public void addAlbum(ListaReproduccion l){
        
        albumes.add(l);
        
    }
    
}
