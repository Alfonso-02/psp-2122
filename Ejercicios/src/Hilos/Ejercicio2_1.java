package Hilos;

public class Ejercicio2_1 extends Thread{
    public void run(){
        System.out.println("TIC");
    }

    public void run2(){
        System.out.println("TAC");
    }

    public static void main(String args[]) {
        Ejercicio2_1 h1=new Ejercicio2_1();
        Ejercicio2_1 h2=new Ejercicio2_1();
        boolean b = true;
        while(b=true){
            h1.run();
            h2.run2();
            try {
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
