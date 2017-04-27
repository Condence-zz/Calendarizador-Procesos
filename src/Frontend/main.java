/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend; 

import Backend.Calendarizador;
import Backend.Proceso;

public class main { 
    public static void main(String[] args) {
        // FrontEnd
       
        Interfaz calendarizadorUI = new Interfaz();
        calendarizadorUI.setVisible(true);
        //¨
        calendarizadorUI.setLocationRelativeTo(null);
        Calendarizador calendarizador = new Calendarizador();
        // BackEnd
        calendarizador.inicializarBloquesMemoria(); 
        calendarizador.procesar();  
          Calendarizador cal = new Calendarizador();
        int progress = cal.getProcesosTotalesTerminados();
        System.out.println(progress);
        
     
    }
    
}
