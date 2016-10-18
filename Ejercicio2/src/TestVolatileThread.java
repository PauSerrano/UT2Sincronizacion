
public class TestVolatileThread extends Thread {
	volatile boolean  keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated."+count);
    }
}
