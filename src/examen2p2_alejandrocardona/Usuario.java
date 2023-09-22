
package examen2p2_alejandrocardona;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private String username, password;
    public int edad;

    public Usuario(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        setEdad(edad);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
    
    
}
