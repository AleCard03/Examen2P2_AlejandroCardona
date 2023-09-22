
package examen2p2_alejandrocardona;

public class Single extends Lanzamiento{
    
    Cancion c;

    public Single(String titulo, String date, int likes) {
        super(titulo, date, likes);
        
    }

    public Cancion getC() {
        return c;
    }

    public void setC(Cancion c) {
        this.c = c;
    }
    
    
    
    
}
