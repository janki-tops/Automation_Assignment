
public class onethreadinterface {
	public static void main(String[] args)
    {
        System.out.println("Main thread is- "
                        + Thread.currentThread().getName());
        Thread t1 = new Thread(new onethreadinterface().new onethread());
        t1.start();
    }
 
    private class onethread implements Runnable {
 
        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                             + ", executing run() method!");
        }
    }

}
