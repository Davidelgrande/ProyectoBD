/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.DAO.CartaDAO;
import Modelo.dto.CartaDTO;

/**
 *
 * @author user
 */
public class pruebas {
    public static void main(String[] args) {
        
        CartaDAO ob = new CartaDAO(); 
        CartaDTO dto = new CartaDTO(); 
        
        
        dto.setId_carta(1);
        System.out.println(ob.readCorreo(dto).toString());
    }
}
