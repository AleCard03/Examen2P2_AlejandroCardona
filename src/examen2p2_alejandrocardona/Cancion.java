
package examen2p2_alejandrocardona;

public class Cancion {
    
    private String nombre;
    private double duracion;
    Lanzamiento lan;

    public Cancion(String nombre, double duracion, Lanzamiento lan) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.lan = lan;
    }

    public Cancion(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.lan = null;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Lanzamiento getLan() {
        return lan;
    }

    public void setLan(Lanzamiento lan) {
        this.lan = lan;
    }
    
     
    
}
