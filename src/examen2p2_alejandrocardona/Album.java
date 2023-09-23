
package examen2p2_alejandrocardona;

import java.util.ArrayList;

public class Album extends Lanzamiento{
    
    private ArrayList<Cancion> canciones;
    private int cantCanciones;

    public Album(String titulo, String date, int likes) {
        super(titulo, date, likes);
        this.canciones = new ArrayList();
        cantCanciones = canciones.size();
    }
    
    public void addCancion(Cancion c){
        
        canciones.add(c);
        
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
    
}
