public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("First");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority()); 

        System.out.println(Thread.currentThread().isAlive());

        for ( int i = 3; i > 0; i-- ) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Done!");
    }
}
