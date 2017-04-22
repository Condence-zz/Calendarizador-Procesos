import java.util.ArrayList;
import java.util.Collections;
public class Tareas { 
    private static Proceso[] procesos;
    private static ArrayList procesosOrdenados = new ArrayList<Proceso>();
    public static Proceso[] getProcesos() {
        if (procesos == null) {
            procesos = new Proceso[25]; 
            procesosOrdenados.add(new Proceso(1,5,5760, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(2,4,4190, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(3,8,3290, Constantes.INACTIVO)); 
            procesosOrdenados.add(new Proceso(4,2,2030, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(5,2,2550, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(6,6,6990, Constantes.INACTIVO)); 
            procesosOrdenados.add(new Proceso(7,8,8940, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(8,10,740, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(9,7,3930, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(10,6,6890, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(11,5,6580, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(12,8,3820, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(13,9,9140, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(14,10,420, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(15,10,220, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(16,7,7540, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(17,3,3210, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(18,1,1380, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(19,9,9350, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(20,3,3610, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(21,7,7540, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(22,2,2710, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(23,8,8390, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(24,5,5950, Constantes.INACTIVO));
            procesosOrdenados.add(new Proceso(25,10,760, Constantes.INACTIVO));
            
            Collections.sort(procesosOrdenados, Proceso.OrdTiempo);
            procesos = (Proceso[]) procesosOrdenados.toArray();
        } 
        return procesos;
    } 
    public static Proceso getProceso(int p) {
        return procesos[p];
    }
}