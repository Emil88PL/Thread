public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("First");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority()); 

        System.out.println(Thread.currentThread().isAlive());


    }
}
