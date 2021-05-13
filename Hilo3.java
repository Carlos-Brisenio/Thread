public class Hilo3 extends Thread{

   public void run(int vec[]){
      int media=0,suma=0;
      for(int i=0;i<vec.length;i++){
         suma+=vec[i];
      }
      media=suma/10;
      System.out.println("Hilo 3\nMedia del vetor");
      System.out.printf("%d\n\n",media);
    }
}