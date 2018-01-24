/**
 * @author majiabao on 2018/1/24.
 */
public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(" Start.");
        processCommand();
        System.out.println(" End.");
    }

    private void processCommand() {
        System.out.println("process");
    }

    @Override
    public String toString(){
        return this.command;
    }
}
