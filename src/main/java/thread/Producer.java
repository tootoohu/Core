package thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable{

    private final ArrayBlockingQueue<Bread> queue;

    public Producer(ArrayBlockingQueue<Bread> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            produce();
        }

    }

    public void produce(){
        Bread bread = new Bread(Math.random());
        try {
            //* put()方法是如果容器满了的话就会把当前线程挂起
            queue.put(bread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
