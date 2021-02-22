/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.dto.CartaDTO;
import conexiones.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CartaDAO {
    
   private static final String SQL_READ="SELECT * FROM carta WHERE id_carta= ? ";
   private static final String SQL_INSERT = "INSERT INTO carta"
           +"(id_carta, categoria, tipo_comida, vigencia) VALUES(?, ?, ?, ?)";
   private static final String SQL_UPDATE="UPDATE car SET categoria = ?,tipo_comida= ?, vigencia = ?,  WHERE id_carta = ? ";
   private static final String SQL_READALL= "SELECT * FROM carta";
   
   
   
  private static final Conexion con= Conexion.getInstance();
  
  
      public CartaDTO readCorreo(CartaDTO filter){
      
      CartaDTO objRes=null;
     PreparedStatement psnt;
     

       try {
           psnt=con.getCnn().prepareStatement(SQL_READ);
           psnt.setDouble(1, filter.getId_carta());
           ResultSet rs= psnt.executeQuery();
           while (rs.next()){
                objRes= new CartaDTO(
                rs.getInt("id_carta"),
                rs.getString("categoria"),
                rs.getString("tipo_comida"),
                rs.getDate("vigencia")); 
 
          }
       } catch (SQLException ex) {
           Logger.getLogger(CartaDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           con.cerraConexion();
       }
       return objRes;
}
}
