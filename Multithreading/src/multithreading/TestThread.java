package multithreading;

public class TestThread {

   public static void main(String args[]) {
      Multithreading R1 = new Multithreading( "Thread-1");
      R1.start();
      
      Multithreading R2 = new Multithreading( "Thread-2");
      R2.start();
   }   
}