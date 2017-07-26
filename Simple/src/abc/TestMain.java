package abc;

public class TestMain
{
    public static void main(String[] args) {
   
        Thread t1 = new Thread(new TryCatchFinallyTest());
        Thread t2 = new Thread(new TryCatchFinallyTest());
        Thread t3 = new Thread(new TryCatchFinallyTest());
        t1.start();
        t2.start();
        t3.start();
        Runtime.runFinalizersOnExit(true);
        {
        try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    
    }
}