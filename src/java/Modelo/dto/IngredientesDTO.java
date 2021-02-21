
package Modelo.dto;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;


public class IngredientesDTO implements Serializable {
    
    private float codigo_ingredientes ;
    private float id_plato ;
    private String nombre ;
    private int cantidad ; 
    private float unidad_medida ;

    public IngredientesDTO(float codigo_ingredientes, float id_plato, String nombre, int cantidad, float unidad_medida) {
        this.codigo_ingredientes = codigo_ingredientes;
        this.id_plato = id_plato;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad_medida = unidad_medida;
    }

    public IngredientesDTO(float id_plato, String nombre, int cantidad, float unidad_medida) {
        this.id_plato = id_plato;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad_medida = unidad_medida;
    }

    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    public IngredientesDTO(){
        
    }
            
    public float getCodigo_ingredientes() {
        return codigo_ingredientes;
    }

    public void setCodigo_ingredientes(float codigo_ingredientes) {
        this.codigo_ingredientes = codigo_ingredientes;
    }

    public float getId_plato() {
        return id_plato;
    }

    public void setId_plato(float id_plato) {
        this.id_plato = id_plato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
