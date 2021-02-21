
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
import Modelo.dto.PlatoDTO;

public class PlatoDAO {
    
     private static final String SQL_INSERT = "INSERT INTO plato"
            + "(id_plato, codigo ,nombre , descripcion , ruta_imagen, precio , receta)VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM plato WHERE id_plato= ?";
    private static final String SQL_UPDATE = "UPDATE plato SET codigo = ?, nombre = ? ,und_pro = ?, descripcion = ? , ruta_imagen = ? , precio = ? ,receta = ? WHERE id_producto = ?";
    private static final String SQL_READ = "SELECT *FROM plato WHERE id_plato = ?";
    private static final String SQL_READALL = "SELECT *FROM plato"; 
    
    private static final Conexion con = Conexion.getInstance ();
    
    public boolean create(PlatoDTO c) {
        try {
            PreparedStatement ps;
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setFloat(1, c.getId_plato());
            ps.setFloat(2, c.getCodigo());
            ps.setString(3, c.getNombre());         
            ps.setBinaryStream(4, c.getRuta_imagen());
            ps.setFloat(5, c.getPrecio());
            ps.setString(6, c.getReceta());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CerrarConexion();
        }
        return false;
    }
    
     public List<PlatoDTO> readAll() {
        List<PlatoDTO> lst = null;
        PreparedStatement psnt;
        try {
            psnt = con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs = psnt.executeQuery();
            lst = new ArrayList<>();
            while (rs.next()) {
                PlatoDTO obj = new PlatoDTO(
                        rs.getFloat("id_plato"),
                        rs.getFloat("codigo"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getBinaryStream("ruta_imagen"),
                        rs.getFloat("precio"),
                        rs.getString("receta")
                        
                        
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
     public boolean delete(PlatoDTO item) {

        PreparedStatement ps;
        try {
            ps = con.getCnn().prepareStatement(SQL_DELETE);
            ps.setFloat(1, item.getId_plato());
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
     
    public boolean update(PlatoDTO item) {

        PreparedStatement ps;
        try {
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setFloat(2, item.getCodigo());
            ps.setString(3, item.getNombre());         
            ps.setBinaryStream(4, item.getRuta_imagen());
            ps.setFloat(5, item.getPrecio());
            ps.setString(6, item.getReceta());
           
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

   public PlatoDTO read(PlatoDTO filter) {
        PlatoDTO objRes = null;
        PreparedStatement psnt;
        try {
            psnt = con.getCnn().prepareStatement(SQL_READ);
            psnt.setFloat(1, filter.getId_plato());
            ResultSet rs = psnt.executeQuery();
            while (rs.next()) {
                objRes = new PlatoDTO(
                       rs.getFloat("id_plato"),
                        rs.getFloat("codigo"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getBinaryStream("ruta_imagen"),
                        rs.getFloat("precio"),
                        rs.getString("receta")
                        
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
