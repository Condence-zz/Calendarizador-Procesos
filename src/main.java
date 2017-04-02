public class main{ 
    public static void main(String args[]){
        Calendarizador calendarizador = new Calendarizador();
        Memoria memoria = new Memoria();
        Tareas tareas = new Tareas();
        Procesos procesos = new Procesos();
        for (int i = 0; i < 10; i++) {
            System.out.println(tareas.getTarea(i).getEstado());
        }
    }
}