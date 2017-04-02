import java.util.Arrays;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;

public class Calendarizador {
    
    private Proceso[] procesos = Tareas.getProcesos();
    private Memoria[] bloquesMemoria = new Memoria[10];
    
    public void inicializarBloquesMemoria()
    {
        for (int i=0;i<10;i++)
        {
            if (procesos[i].getEstado().equals(Constantes.INACTIVO))
            {
                bloquesMemoria[i] = new Memoria(i, procesos[i]);
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
}