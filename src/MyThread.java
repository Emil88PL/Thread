public class MyThread extends Thread { // 1 way
    
    @Override
    public void run() {
        for (int i = 10; i > 0 ; i--) {
            System.out.println("Thread #1 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished");
    }
}
