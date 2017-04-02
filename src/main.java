import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
public class main{ 
    public static void main(String args[]){ 
        Tareas pr =new Tareas();
        Memoria me =new Memoria();
        int terminado=0;
        int asignados=0;
        int count=0;
        int i=0;
        int tarea=0;
        List<Tareas> listProcess = new ArrayList<Tareas>();
        while(true){
            if (tarea==25) { break; }
            if (terminado==10) { 
                Collections.sort(listProcess, comparing(Tareas::getTiempo));
                break;
            }
            if(count <= 10) {
                if((pr.getTarea(i).getEstado() == "Inactivo") || (pr.getTarea(i).getEstado() == "Espera")){
                    if(pr.getTarea(i).getTamano() <= me.getMemoria(count).getTamano()){  
                        System.out.println("PROCESO: "+pr.getTarea(i).getNum()+ " ASIGNADO.");
                        count++;
                        i++;
                        asignados++;
                        terminado++;
                        listProcess.add(pr);
                    } else {
                        System.out.println("PROCESO: "+pr.getTarea(i).getNum()+ " ESPERA");  
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }
        for(Tareas proceso : listProcess) {
            System.out.println(proceso.Tiempo);
        }
    }
}