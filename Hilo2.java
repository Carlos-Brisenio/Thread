/*
   Programa realizado por: Garcia Briseno Jose Carlos
*/
public class Hilo2 extends Thread{

   public void run(int vec[]){
      int pow=0,suma=0;
      for(int i=0;i<vec.length;i++){
         pow=(int)Math.pow(vec[i],2);
         suma+=pow;
      }
      System.out.println("Hilo 2\nSuma cuadrada del vetor");
      System.out.printf("%d\n\n",suma);
    }
}