package Ejercicio2_1;

public class Main extends Thread{
    public static void main(String args[]){
        Hilo1 h=new Hilo1();
        Hilo2 h2=new Hilo2();
        boolean b=true;
        while(b){
            h.run();
            h2.run();
            try{
                sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
