
package Modelo.dto;
import java.util.Date;




public class CartaDTO {
    int id_categoria ; 
    String categoria; 
    String tipo_comida; 
    Date vigencia; 

    public CartaDTO() {
    }

    public CartaDTO(int id_categoria, String categoria, Date vigencia) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
        this.vigencia = vigencia;
    }
    
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

 
    
}
