public class Proceso {
    public int Num, Tiempo, Tamano;
    public String Estado; 
    
    public Proceso(){
        
    } 
    public Proceso(int Num, int Tiempo, int Tamano, String Estado) {
        this.Num = Num;
        this.Tiempo = Tiempo;
        this.Tamano = Tamano;
        this.Estado = Estado; 
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