public class App {
    public static void main(String[] args) throws InterruptedException {
        
                                                    // Have to change to JDK 14 or JDK 17 as JDK 20 threading did not work!!!!!!!! 
     //   System.out.println(Thread.activeCount());  // No idea why Thread.activeCount doesn't count correctly with out that line
        //Thread.currentThread().setName("First thread");
        //System.out.println(Thread.currentThread().getName());

     //   Thread.currentThread().setPriority(1);
        // System.out.println(Thread.currentThread().getPriority()); 

        // System.out.println(Thread.currentThread().isAlive());

        MyThread thread2 = new MyThread();
        
       // thread2.setDaemon(true); 
       // System.out.println(thread2.isDaemon());
        thread2.start(); // start Thread not run method from the MyThread

        // System.out.println(thread2.isAlive());
        // thread2.setName("Second thread");
        // System.out.println(thread2.getName());
      //   thread2.setPriority(6);
         //System.out.println(thread2.getPriority()); // inherited from parent

        System.out.println(Thread.activeCount());
    }
}
