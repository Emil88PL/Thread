public class App {
    public static void main(String[] args) throws InterruptedException {
        
    
        
        MyThread thread1 = new MyThread(); // 1 way

        MyRunnable runnable1 = new MyRunnable(); //
        Thread thread2 = new Thread(runnable1); // 2 way




        thread1.start(); 
        thread2.start(); 


        System.out.println(Thread.activeCount());
    }
}
