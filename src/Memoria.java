public class Memoria {
    
    public int bloque;
    public Proceso proceso;

    public Memoria() {

    } 
    public Memoria(int bloque, Proceso proceso) {
        this.bloque = bloque;
        this.proceso = proceso;
    }  
    
    public int getBloque() {
        return bloque;
    } 
    public void setBloque(int Bloque) {
        this.bloque = Bloque;
    }
}
