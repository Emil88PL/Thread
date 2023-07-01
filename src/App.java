public class App {
    public static void main(String[] args) throws InterruptedException {
        
    
        // Create sublclass of Thread
        MyThread thread1 = new MyThread(); // 1 way

        //implement Runnable interface and pass instance as an argument to Thread() 
        MyRunnable runnable1 = new MyRunnable(); //
        Thread thread2 = new Thread(runnable1); // 2 way

        //thread1.setDaemon(true); //
  

        thread1.start(); 
       // thread1.join(3000);// next thread will start when thread1 is finished // or it will start 3s after first one if set
        thread2.start(); 


       // System.out.println(Thread.activeCount());
    }
}
