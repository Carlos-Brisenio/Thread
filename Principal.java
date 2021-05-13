/*
   Programa realizado por: Garcia Briseno Jose Carlos
*/
public class Principal{
   public static void main(String args[]){
   
      int tam = 10;
      int vec[] = new int[tam];
      
      for(int i=0;i<vec.length;i++){
         vec[i] = (int)(Math.random()*10);
         System.out.printf("Vec[%d] = %d\n", i, vec[i]);
      }
      
      Hilo1 uno = new Hilo1();
      Hilo2 dos = new Hilo2();
      Hilo3 tres = new Hilo3();
      
      uno.run(vec);
      dos.run(vec);
      tres.run(vec);
      
      System.out.println("Programa Realizado por:\nGarcia Briseno Jose Carlos");

   }
}