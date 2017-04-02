public class Memoria {
    public int Bloque, Tamano, Proceso, Tiempo; 
    public boolean used;  
    public Memoria memoria[]; 
    public Memoria() {
        memoria = new Memoria[10];  
        memoria[0]=new Memoria(1,9500,7, 0);
        memoria[1]=new Memoria(2,7000,10, 0); 
        memoria[2]=new Memoria(3,4500,0, 0); 
        memoria[3]=new Memoria(4,8500,4, 0);  
        memoria[4]=new Memoria(5,3000,5, 0);
        memoria[5]=new Memoria(6,9000,6, 0);
        memoria[6]=new Memoria(7,1000,8, 0);  
        memoria[7]=new Memoria(8,5500,9, 0); 
        memoria[8]=new Memoria(9,1500,14, 0); 
        memoria[9]=new Memoria(10,500,15, 0);
    } 
    public Memoria(int Bloque, int Tamano, int Proceso, int Tiempo) {
        this.Bloque = Bloque;
        this.Tamano = Tamano;
        this.Proceso = Proceso;
        this.Tiempo = Tiempo; 
    }  
    public Memoria getMemoria(int p){
        return memoria[p];
    } 
    public int getBloque() {
        return Bloque;
    } 
    public void setBloque(int Bloque) {
        this.Bloque = Bloque;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    } 
    public int getProceso() {
        return Proceso;
    } 
    public void setProceso(int Proceso) {
        this.Proceso = Proceso;
    } 
    public int getTiempo() {
        return Tiempo;
    } 
    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }   
}
