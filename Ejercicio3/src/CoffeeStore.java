
public class CoffeeStore {
	    private String lastClient;
	    private int soldCoffees;
	     
	    private void someLongRunningProcess() throws InterruptedException {
	        Thread.sleep(3000);
	    }
	    //solucionado
	    public synchronized void buyCoffee(String client) throws InterruptedException {
	        someLongRunningProcess();
	        lastClient = client;
	        soldCoffees++;
	        System.out.println(client + " bought some coffee");
	    }
	    //prueba commit
	    public int countSoldCoffees() {return soldCoffees;}
	     
	    public String getLastClient() {return lastClient;}
}
