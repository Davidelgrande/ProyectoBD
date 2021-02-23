
package Modelo.dto;


public class AdminDTO {
    int id_administrador; 
    int nombre_administrador; 

    public AdminDTO(int id_administrador, int nombre_administrador) {
        this.id_administrador = id_administrador;
        this.nombre_administrador = nombre_administrador;
    }

    @Override
    public String toString() {
        return "AdminDTO{" + "id_administrador=" + id_administrador + ", nombre_administrador=" + nombre_administrador + '}';
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public int getNombre_administrador() {
        return nombre_administrador;
    }

    public void setNombre_administrador(int nombre_administrador) {
        this.nombre_administrador = nombre_administrador;
    }
    
    
}
