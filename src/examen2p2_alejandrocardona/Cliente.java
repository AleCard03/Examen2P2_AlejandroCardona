
package examen2p2_alejandrocardona;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Usuario implements Serializable{
    
    private ArrayList<Cancion> faves;
    private ArrayList<ListaReproduccion> playlists;
    private ArrayList<ListaReproduccion> likedPlaylists;

    public Cliente(String username, String password, int edad) {
        super(username, password, edad);
    }
    
    @Override
    public void setEdad(int edad){
        
        if(edad >= 12){
            
            super.edad = edad;
            
        }
        else{
            
            super.edad = 0;
            
//            JOptionPane.showMessageDialog(null, "No se ha creado de manera exitosa");
            
        }
        
    }
    
}
