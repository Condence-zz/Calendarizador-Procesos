public class Calendarizador {
    Tareas tareas = new Tareas();
    public void cambiarEstado(int i, String estado){
        tareas.getProceso(i).setEstado(estado);
    }
}