
package examen2p2_alejandrocardona;

import java.util.ArrayList;

public class Cliente extends Usuario{
    
    private ArrayList<Cancion> faves;
    private ArrayList<ListaReproduccion> playlists;
    private ArrayList<ListaReproduccion> likedPlaylists;

    public Cliente(String username, String password, int edad) {
        super(username, password, edad);
    }
    
    
    
}
