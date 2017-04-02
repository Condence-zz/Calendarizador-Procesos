public class Tareas {
    public int Num, Tiempo, Tamano;
    public String Estado; 
    public Tareas tareas[]; 
    public Tareas(){
        tareas = new Tareas[25]; 
        tareas[0]=new Tareas(1,5,5760, "Inactivo"); 
        tareas[1]=new Tareas(2,4,4190, "Inactivo"); 
        tareas[2]=new Tareas(3,8,3290, "Inactivo");  
        tareas[3]=new Tareas(4,2,2030, "Inactivo");
        tareas[4]=new Tareas(5,2,2550, "Inactivo");
        tareas[5]=new Tareas(6,6,6990, "Inactivo");  
        tareas[6]=new Tareas(7,8,8940, "Inactivo"); 
        tareas[7]=new Tareas(8,10,740, "Inactivo"); 
        tareas[8]=new Tareas(9,7,3930, "Inactivo"); 
        tareas[9]=new Tareas(10,6,6890, "Inactivo");
        tareas[10]=new Tareas(11,5,6580, "Inactivo"); 
        tareas[11]=new Tareas(12,8,3820, "Inactivo");  
        tareas[12]=new Tareas(13,9,9140, "Inactivo"); 
        tareas[13]=new Tareas(14,10,420, "Inactivo");
        tareas[14]=new Tareas(15,10,220, "Inactivo"); 
        tareas[15]=new Tareas(16,7,7540, "Inactivo"); 
        tareas[16]=new Tareas(17,3,3210, "Inactivo"); 
        tareas[17]=new Tareas(18,1,1380, "Inactivo"); 
        tareas[18]=new Tareas(19,9,9350, "Inactivo");
        tareas[19]=new Tareas(20,3,3610, "Inactivo");
        tareas[20]=new Tareas(21,7,7540, "Inactivo");  
        tareas[21]=new Tareas(22,2,2710, "Inactivo"); 
        tareas[22]=new Tareas(23,8,8390, "Inactivo"); 
        tareas[23]=new Tareas(24,5,5950, "Inactivo");
        tareas[24]=new Tareas(25,10,760, "Inactivo"); 
    } 
    public Tareas(int Num, int Tiempo, int Tamano, String Estado) {
        this.Num = Num;
        this.Tiempo = Tiempo;
        this.Tamano = Tamano;
        this.Estado = Estado; 
    }
    public Tareas getTarea(int p){
        return tareas[p];
    }
    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    } 
    
}
