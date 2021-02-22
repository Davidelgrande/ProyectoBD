
package Modelo.dto;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;

public class PlatoDTO implements Serializable {
    
    private int id_plato ;
    private int codigo ;
    private String nombre ;
    private String descipcion ;
    private InputStream ruta_imagen ; 
    private float precio ;
    private String receta ; 

    public PlatoDTO(int id_plato, int codigo, String nombre, String descipcion, InputStream ruta_imagen, float precio, String receta) {
        this.id_plato = id_plato;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.ruta_imagen = ruta_imagen;
        this.precio = precio;
        this.receta = receta;
    }

    public PlatoDTO(int codigo, String nombre, String descipcion, InputStream ruta_imagen, float precio, String receta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.ruta_imagen = ruta_imagen;
        this.precio = precio;
        this.receta = receta;
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public InputStream getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(InputStream ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

  
    
    
    @Override
    public String toString(){
       return "id plato : " + id_plato +  "\ncodigo : " + codigo + "\nnombre :" + nombre +"\ndescripcion:"+ descipcion +
               "\n imagen : "+ ruta_imagen + "\nprecio :" + precio;
    }
    
    @Override
   public boolean equals(Object obj ){
         if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlatoDTO other = (PlatoDTO) obj ;
        if(this.id_plato != other.id_plato){
            return false ; 
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
         if (!Objects.equals(this.descipcion, other.descipcion)) {
            return false;
        }
         if (this.ruta_imagen!= other.ruta_imagen) {
            return false;
        }
         if (this.precio != other.precio) {
            return false;
        }
         if (!Objects.equals(this.receta, other.receta)) {
            return false;
        }

       return true ;
       
   } 
    

}
