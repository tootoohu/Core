package thread;

import org.junit.runner.RunWith;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable{

    private final ArrayBlockingQueue<Bread> queue;

    public Consumer(ArrayBlockingQueue<Bread> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            Consume();
        }
    }

    public void Consume(){
        try {
            Bread bread = queue.take();
            System.out.println(bread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
