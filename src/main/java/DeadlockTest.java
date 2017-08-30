import com.nc.rnd.deadlock.ThreadImpl;

/**
 * Created by nirk0816 on 2/6/2017.
 */
public class DeadlockTest {

    public static void main(String args[])
    {
        Thread t1 = new Thread(new ThreadImpl());
        Thread t2 = new Thread(new ThreadImpl());
        Thread t3 = new Thread(new ThreadImpl());
        Thread t4 = new Thread(new ThreadImpl());
        Thread t5 = new Thread(new ThreadImpl());
        Thread t6 = new Thread(new ThreadImpl());
        Thread t7 = new Thread(new ThreadImpl());
        Thread t8 = new Thread(new ThreadImpl());
        Thread t9 = new Thread(new ThreadImpl());
        Thread t10 = new Thread(new ThreadImpl());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


    }

}
