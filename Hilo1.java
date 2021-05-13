/*
   Programa realizado por: Garcia Briseno Jose Carlos
*/
public class Hilo1 extends Thread{

   public void run(int vec[]){
      int suma=0;
      for(int i=0;i<vec.length;i++){
         suma+=vec[i];
      }
      System.out.println("\nHilo 1\nSuma del vetor");
      System.out.printf("%d\n\n",suma);
    }
}