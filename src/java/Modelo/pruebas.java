/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.DAO.CartaDAO;
import Modelo.DAO.ClienteDAO;
import Modelo.dto.CartaDTO;
import Modelo.dto.ClienteDTO;

/**
 *
 * @author user
 */
public class pruebas {
    public static void main(String[] args) {
        
        ClienteDAO ob = new ClienteDAO(); 
        ClienteDTO dto = new ClienteDTO(); 
        
        
        dto.setId_cliente(45060);
        System.out.println(ob.readCliente(dto).toString());
    }
}
