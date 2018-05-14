/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author ALAKA
 */
public class Multithreading implements Runnable {

   private Thread t;
   private String threadName;
   
   
   public Multithreading( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
/*override run( ) method available in Thread class. 
   This method provides an entry point for the thread and you 
   will put your complete business logic inside this method*/
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

