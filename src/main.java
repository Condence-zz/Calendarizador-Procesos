/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coond
 */
public class main { 
    public static void main(String[] args) { 
        Calendarizador calendarizador = new Calendarizador();
        
        // Llenar la memoria con procesos
        calendarizador.inicializarBloquesMemoria();
        
        // Comenzar el procesado
        calendarizador.procesar();
        
        System.out.println("Lista de procesos:");
        
        for(Proceso proceso : calendarizador.getProcesos())
        {
            System.out.println(proceso.toString());
        }
    } 
}
