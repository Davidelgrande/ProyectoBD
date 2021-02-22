
package Modelo.dto;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;


public class IngredientesDTO implements Serializable {
    
    private int codigo_ingredientes ;
    private int id_plato ;
    private String nombre ;
    private int cantidad ; 
    private float unidad_medida ;

    public IngredientesDTO(int codigo_ingredientes, int id_plato, String nombre, int cantidad, float unidad_medida) {
        this.codigo_ingredientes = codigo_ingredientes;
        this.id_plato = id_plato;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad_medida = unidad_medida;
    }

    public IngredientesDTO(int id_plato, String nombre, int cantidad, float unidad_medida) {
        this.id_plato = id_plato;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad_medida = unidad_medida;
    }

    public int getCodigo_ingredientes() {
        return codigo_ingredientes;
    }

    public void setCodigo_ingredientes(int codigo_ingredientes) {
        this.codigo_ingredientes = codigo_ingredientes;
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(float unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    
    
    
    @Override
    public String toString(){
       return "codigo ingredites : " + codigo_ingredientes + "\nid plato : " + id_plato +"\nnombre : " + nombre 
               +"\n cantidad : "+ cantidad + "\nunidad medida : " +unidad_medida ;
    }
    
    @Override
    public boolean equals (Object obj ){
      if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } 
        if (getClass() != obj.getClass()) {
            return false;
        } 
        final IngredientesDTO other = (IngredientesDTO) obj ; 
        if(this.codigo_ingredientes != other.codigo_ingredientes)
        {
            return false ;  
        }
        if (this.id_plato != other.id_plato){
            return false ; 
        }
        if (!Objects.equals(this.nombre,other.nombre)){
            return false ; 
        }
        if (this.cantidad != other.cantidad ){
            return false ;
        }
        if(this.unidad_medida != other.codigo_ingredientes){
            return false ;
  
        }    
      return true ;  
    }
    
     
    
}
