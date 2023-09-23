
package examen2p2_alejandrocardona;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Artista extends Usuario implements Serializable {
    
    private String nombreArt;
    private ArrayList<Cancion> discografia;
    private ArrayList<Lanzamiento> albumes;

    public Artista(String nombreArt, ArrayList<Cancion> discografia, ArrayList<Lanzamiento> albumes, String username, String password, int edad) {
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

    public ArrayList<Lanzamiento> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Lanzamiento> albumes) {
        this.albumes = albumes;
    }
    
    public void addCancion(Cancion c){
        
        discografia.add(c);
        
    }
    public void addAlbum(Lanzamiento l){
        
        albumes.add(l);
        
    }
    @Override
    public void setEdad(int edad){
        
        if(edad >= 12){
            
            super.edad = edad;
            
        }
        else{
            
//            JOptionPane.showMessageDialog(null, "No se ha creado de manera exitosa");
            
        }
        
    }
    
}
