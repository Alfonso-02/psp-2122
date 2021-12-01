package EjercicioAdivinaNumeros;

import java.io.ObjectInputStream;
import java.net.Socket;

public class HiloServidorAdivina extends Thread{
    ObjectInputStream fentrada;
    ObjectInputStream fsalida;
    Socket socket;
    int identificador;
    int intentos;

    public void HiloServidorAdivina(Socket s, ObjetoCompartido oc, int i){

    }

    public void Run(){

    }
}
