public class main{ 
    public static void main(String args[]){
        Calendarizador calendarizador = new Calendarizador();
        
        System.out.println("Tareas");

        for(Proceso proceso : calendarizador.getProcesos())
        {
            System.out.println(proceso.getEstado());
        }
        
        calendarizador.inicializarBloquesMemoria();
        
        System.out.println("Lista de procesos asignados a memoria");
        
        for(Memoria memoria : calendarizador.getBloquesMemoria())
        {
            System.out.println(memoria.proceso.getTiempo());
        }
        
        System.out.println("Lista ordenada de procesos asignados a memoria");
        
        for(Memoria memoria : calendarizador.getBloquesMemoriaOrdenados())
        {
            System.out.println(memoria.proceso.getTiempo());
        }
        
    }
}