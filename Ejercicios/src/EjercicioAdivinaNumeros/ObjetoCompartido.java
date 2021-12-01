package EjercicioAdivinaNumeros;

public class ObjetoCompartido {
    int numero;
    boolean acabo;
    int ganador;

    public ObjetoCompartido(int n){
        this.numero=n;
    }

    public boolean seAcabo(){
        return acabo;
    }

    public int getGanador(){
        return ganador;
    }

    public void nuevaJugada(int a, int b){

    }
}
