import java.util.Arrays;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;

public class Calendarizador {
    
    private Proceso[] procesos = Tareas.getProcesos();
    private Memoria[] bloquesMemoria;
    
    public void inicializarBloquesMemoria()
    {
        int tamanos[] = {9500, 7000, 4500, 8500, 3000, 9000, 1000, 5500, 1500, 500};
        bloquesMemoria = new Memoria[10];
        
        for (int i=0;i<bloquesMemoria.length;i++)
        {
            bloquesMemoria[i] = new Memoria(i, tamanos[i], null);
            
            for (Proceso proceso : procesos) {
                if (tieneEstado(proceso, Constantes.INACTIVO) && cabeEnBloque(proceso, bloquesMemoria[i])) {
                    bloquesMemoria[i].setProceso(proceso);
                    break;
                }
            }
        }
    }
  
    public void cambiarEstado(int i, String estado){
        Tareas.getProceso(i).setEstado(estado);
    }
    
    public Proceso[] getProcesos()
    {
        return procesos;
    }
    
    public Memoria[] getBloquesMemoria()
    {
        return bloquesMemoria;
    }
    
        public Memoria[] getBloquesMemoriaOrdenados()
    {
        List<Memoria> listaMemoriaOrdenada = Arrays.asList(bloquesMemoria);
        Collections.sort(listaMemoriaOrdenada, comparing((t) -> t.proceso.Tiempo));
        return listaMemoriaOrdenada.toArray(bloquesMemoria);
    }
      
    private boolean tieneEstado(Proceso proceso, String estado)
    {
        return proceso.getEstado().equals(estado);
    }    
        
    private boolean cabeEnBloque(Proceso proceso, Memoria bloqueMemoria)
    {
        return bloqueMemoria.getTamano() >= proceso.getTamano();
    }
}