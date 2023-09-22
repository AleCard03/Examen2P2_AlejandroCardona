
package examen2p2_alejandrocardona;

public class Lanzamiento {
    
    private String titulo, date;
    private int likes;

    public Lanzamiento(String titulo, String date, int likes) {
        this.titulo = titulo;
        this.date = date;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    
    
}
