
package Modelo.dao;

import conexiones.Conexion;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.dto.IngredientesDTO;


public class IngredientesDAO {
    
    private static final String SQL_INSERT = "INSERT INTO Ingredientes"
            + "(codigo_ingredientes,id_plato ,nombre , cantidad ,unidad_medida )VALUES(?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM plato WHERE codigo_ingredientes= ?";
    private static final String SQL_UPDATE = "UPDATE Ingredientes SET  id_plato = ? ,nombre = ?, cantidad= ? , unidad_medida= ?  WHERE codigo_ingredientes = ?";
    private static final String SQL_READ = "SELECT *FROM Ingredientes WHERE codigo_ingredientes = ?";
    private static final String SQL_READALL = "SELECT *FROM Ingredientes "; 
    
      private static final Conexion con = Conexion.getInstance ();
    
    public boolean create(IngredientesDTO c) {
        try {
            PreparedStatement ps;
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1, c.getCodigo_ingredientes());
            ps.setInt(2, c.getId_plato());
            ps.setString(3, c.getNombre());         
            ps.setInt(4, c.getCantidad());
            ps.setFloat(5, c.getUnidad_medida());
            
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CerrarConexion();
        }
        return false;
    }
    
     public List<IngredientesDTO> readAll() {
        List<IngredientesDTO> lst = null;
        PreparedStatement psnt;
        try {
            psnt = con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs = psnt.executeQuery();
            lst = new ArrayList<>();
            while (rs.next()) {
                IngredientesDTO obj = new IngredientesDTO(
                        rs.getInt("codigo_ingredientes"),
                        rs.getInt("id_plato"),
                        rs.getString("nombre"),
                        rs.getInt("cantidad"),                       
                        rs.getFloat("unidad_medida")
            
                );
                lst.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CerrarConexion();
        }
        return lst;
    }
     public boolean delete(IngredientesDTO item) {

        PreparedStatement ps;
        try {
            ps = con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getCodigo_ingredientes());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            throw new Error(ex.getMessage());
        } finally {
            con.CerrarConexion();
        }
        return false;
    }
     
    public boolean update(IngredientesDTO item) {

        PreparedStatement ps;
        try {
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setInt(1, item.getCodigo_ingredientes());
            ps.setInt(2, item.getId_plato());
            ps.setString(3, item.getNombre());         
            ps.setInt(4, item.getCantidad());
            ps.setFloat(5, item.getUnidad_medida());
           
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            throw new Error(ex.getMessage());
        } finally {
            con.CerrarConexion();
        }
        return false;
    }  

   public IngredientesDTO read(IngredientesDTO filter) {
        IngredientesDTO objRes = null;
        PreparedStatement psnt;
        try {
            psnt = con.getCnn().prepareStatement(SQL_READ);
            psnt.setFloat(1, filter.getCodigo_ingredientes());
            ResultSet rs = psnt.executeQuery();
            while (rs.next()) {
                objRes = new IngredientesDTO(
                        rs.getInt("codigo_ingredientes"),
                        rs.getInt("id_plato"),
                        rs.getString("nombre"),
                        rs.getInt("cantidad"),                       
                        rs.getFloat("unidad_medida")
                       
                        
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CerrarConexion();
        }
        return objRes;
    }  
    
    
    
    
    
    
}
