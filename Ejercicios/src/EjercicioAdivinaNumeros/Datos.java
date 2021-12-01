package EjercicioAdivinaNumeros;

public class Datos {
    String cadena;
    int intentos;
    int identificador;
    boolean gana;
    boolean juega;

    public Datos(String c, int in, int id){
        this.cadena=c;
        this.intentos=in;
        this.identificador=id;
    }

    public Datos(){

    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isGana() {
        return gana;
    }

    public void setGana(boolean gana) {
        this.gana = gana;
    }

    public boolean isJuega() {
        return juega;
    }

    public void setJuega(boolean juega) {
        this.juega = juega;
    }
}
