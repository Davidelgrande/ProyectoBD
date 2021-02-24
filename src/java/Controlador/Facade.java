
package Controlador;

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

    public List<ClienteDTO> listarCliente() {
        List<ClienteDTO> lst = null;
        ClienteDAO dao= new ClienteDAO();
        lst = dao.readAll();
        return lst;
    }

    public ClienteDTO verCliente(ClienteDTO item) {
        ClienteDTO dto;
        ClienteDAO dao = new ClienteDAO();
        dto = dao.read(item);
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

    public boolean eliminarCliente(ClienteDTO elim) {

        ClienteDAO dao = new ClienteDAO();
        return dao.delete(elim);

    }
    
    
     public boolean crearEncargado(EncargadoDTO objP) {
        boolean rta = false;
        if (objP != null) {
            EncargadoDAO dao = new EncargadoDAO();
            rta = dao.create(objP);
        }
        return rta;
    }

    public List<EncargadoDTO> listarEncargado() {
        List<EncargadoDTO> lst = null;
        EncargadoDAO dao = new EncargadoDAO();
        lst = dao.readAll();
        return lst;
    }

    public EncargadoDTO verProducto(ProductoDTO item) {
        ProductoDTO dto;
        ProductoDAO dao = new ProductoDAO();
        dto = dao.read(item);
        return dto;

    }

    public boolean actualizarProducto(ProductoDTO actual) {
        boolean rta = false;
        if (actual != null) {
            ProductoDAO dao = new ProductoDAO();
            rta = dao.update(actual);
        }
        return rta;

    }

    public boolean eliminarProducto(ProductoDTO elim) {

        ProductoDAO dao = new ProductoDAO();
        return dao.delete(elim);

    }
    
}