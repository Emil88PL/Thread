public class App {
    public static void main(String[] args) throws InterruptedException {
        
    
        
        MyThread thread1 = new MyThread(); // 1 way

        MyRunnable runnable1 = new MyRunnable(); //
        Thread thread2 = new Thread(runnable1); // 2 way

  

        thread1.start(); 
       // thread1.join(3000);// next thread will start when thread1 is finished // or it will start 3s after first one if set
        thread2.start(); 


       // System.out.println(Thread.activeCount());
    }
}
