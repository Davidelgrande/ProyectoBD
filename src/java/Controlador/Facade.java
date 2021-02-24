
package Controlador;

import Modelo.DAO.AdminDAO;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.DAO.CartaDAO;
import Modelo.dao.IngredientesDAO;
import Modelo.DAO.ClienteDAO;
import Modelo.DAO.EncargadoDAO;
import Modelo.DAO.FacturaDAO;
import Modelo.dao.PlatoDAO;
import Modelo.dao.loginDAO;
import Modelo.dao.RegionDAO;
import Modelo.dao.ProveedorDAO;
import Modelo.dao.loginDAO;
import Modelo.dto.AdminDTO;
import Modelo.dto.CartaDTO;
import Modelo.dto.ClienteDTO;
import Modelo.dto.EncargadoDTO;
import Modelo.dto.FacturaDTO;
import Modelo.dto.IngredientesDTO;
import Modelo.dto.PlatoDTO;
import Modelo.dto.RegionDTO;
import Modelo.dto.loginDTO;
import Modelo.dto.ProveedorDTO;

public class Facade {
    
     public boolean crearPlato(PlatoDTO objP) {
        boolean rta = false;
        if (objP != null) {
            PlatoDAO dao = new PlatoDAO();
            rta = dao.create(objP);
        }
        return rta;
    }

    public List<PlatoDTO> listarPlatos() {
        List<PlatoDTO> lst = null;
        PlatoDAO dao = new PlatoDAO();
        lst = dao.readAll();
        return lst;
    }

    public PlatoDTO verPlato(PlatoDTO item) {
        PlatoDTO dto;
        PlatoDAO dao = new PlatoDAO();
        dto = dao.read(item);
        return dto;

    }

    public boolean actualizarPlato(PlatoDTO actual) {
        boolean rta = false;
        if (actual != null) {
            PlatoDAO dao = new PlatoDAO();
            rta = dao.update(actual);
        }
        return rta;

    }

    public boolean eliminarPalto(PlatoDTO elim) {

        PlatoDAO dao = new PlatoDAO();
        return dao.delete(elim);

    }
    

     public boolean crearCliente(ClienteDTO objP) {
        boolean rta = false;
        if (objP != null) {
            ClienteDAO dao = new ClienteDAO();
            rta = dao.create(objP);
        }
        return rta;
    }

  

    public ClienteDTO verCliente(ClienteDTO item) {
        ClienteDTO dto;
        ClienteDAO dao = new ClienteDAO();
        dto = dao.readCliente(item);
        return dto;

    }

    public boolean actualizarCliente(ClienteDTO actual) {
        boolean rta = false;
        if (actual != null) {
            ClienteDAO dao = new ClienteDAO();
            rta = dao.update(actual);
        }
        return rta;

    }


    
    
     public boolean crearEncargado(EncargadoDTO objP) {
        boolean rta = false;
        if (objP != null) {
            EncargadoDAO dao = new EncargadoDAO();
            rta = dao.create(objP);
        }
        return rta;
    }



    public EncargadoDTO verProducto(EncargadoDTO item) {
        EncargadoDTO dto;
        EncargadoDAO dao = new EncargadoDAO();
        dto = dao.readCliente(item);
        return dto;

    }

    public boolean actualizarProducto(EncargadoDTO actual) {
        boolean rta = false;
        if (actual != null) {
            EncargadoDAO dao = new EncargadoDAO();
            rta = dao.update(actual);
        }
        return rta;

    }

  
     public boolean crearAdministrador(AdminDTO objP) {
        boolean rta = false;
        if (objP != null) {
            AdminDAO dao = new AdminDAO();
            rta = dao.create(objP);
        }
        return rta;
    }



    public AdminDTO verProducto(AdminDTO item) {
        AdminDTO dto;
        AdminDAO dao = new AdminDAO();
        dto = dao.readCliente(item);
        return dto;

    }

    public boolean actualizarProducto(AdminDTO actual) {
        boolean rta = false;
        if (actual != null) {
            AdminDAO dao = new AdminDAO();
            rta = dao.update(actual);
        }
        return rta;

    }


     public boolean crearLogin(loginDTO objP) {
        boolean rta = false;
        if (objP != null) {
            loginDAO dao = new loginDAO();
            rta = dao.create(objP);
        }
        return rta;
    }

    

    public loginDTO verLogin(loginDTO item) {
        loginDTO dto;
        loginDAO dao = new loginDAO();
        dto = dao.read(item);
        return dto;

    }

    public boolean actualizarLogin(loginDTO actual) {
        boolean rta = false;
        if (actual != null) {
            loginDAO dao = new loginDAO();
            rta = dao.update(actual);
        }
        return rta;

    }

    public boolean eliminarEncargado (loginDTO elim) {

        loginDAO dao = new  loginDAO();
        return dao.delete(elim);

    }
    
       public loginDTO validarLogin(loginDTO objVal){
        loginDTO usu;
        loginDAO dao= new loginDAO();
        usu=dao.validarLogin(objVal);
        return usu;
    }
     public String asegurarClave(String clave){
        try {
            MessageDigest sha256 =MessageDigest.getInstance("SHA-256");
            sha256.update(clave.getBytes("UTF-8"));
             clave=String.format("%064x", new BigInteger(1,sha256.digest()));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MiLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MiLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    return clave;
     } 
}