public class Tareas {
    public Proceso[] procesos; 
    public Tareas(){
        procesos = new Proceso[25]; 
        procesos[0]=new Proceso(1,5,5760, "Inactivo"); 
        procesos[1]=new Proceso(2,4,4190, "Inactivo"); 
        procesos[2]=new Proceso(3,8,3290, "Inactivo");  
        procesos[3]=new Proceso(4,2,2030, "Inactivo");
        procesos[4]=new Proceso(5,2,2550, "Inactivo");
        procesos[5]=new Proceso(6,6,6990, "Inactivo");  
        procesos[6]=new Proceso(7,8,8940, "Inactivo"); 
        procesos[7]=new Proceso(8,10,740, "Inactivo"); 
        procesos[8]=new Proceso(9,7,3930, "Inactivo"); 
        procesos[9]=new Proceso(10,6,6890, "Inactivo");
        procesos[10]=new Proceso(11,5,6580, "Inactivo"); 
        procesos[11]=new Proceso(12,8,3820, "Inactivo");  
        procesos[12]=new Proceso(13,9,9140, "Inactivo"); 
        procesos[13]=new Proceso(14,10,420, "Inactivo");
        procesos[14]=new Proceso(15,10,220, "Inactivo"); 
        procesos[15]=new Proceso(16,7,7540, "Inactivo"); 
        procesos[16]=new Proceso(17,3,3210, "Inactivo"); 
        procesos[17]=new Proceso(18,1,1380, "Inactivo"); 
        procesos[18]=new Proceso(19,9,9350, "Inactivo");
        procesos[19]=new Proceso(20,3,3610, "Inactivo");
        procesos[20]=new Proceso(21,7,7540, "Inactivo");  
        procesos[21]=new Proceso(22,2,2710, "Inactivo"); 
        procesos[22]=new Proceso(23,8,8390, "Inactivo"); 
        procesos[23]=new Proceso(24,5,5950, "Inactivo");
        procesos[24]=new Proceso(25,10,760, "Inactivo"); 
    } 
    
    public Proceso getProceso(int p){
        return procesos[p];
    }
}
