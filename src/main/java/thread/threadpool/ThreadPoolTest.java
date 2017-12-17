package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by HL on 17/12/2.
 */
public class ThreadPoolTest {

    public static void main(String[] args){

     // FixedThreadPool(5);
        CachedThreadPool();
    }

    public static void FixedThreadPool(int size){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(size);
        for (int i = 0;i<20;i++){

            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void CachedThreadPool(){
        ExecutorService newCachedThread= Executors.newCachedThreadPool();//创建一个缓冲线程池
        for (int i=0;i<20;i++){
            newCachedThread.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                }
            });
        }


    }
}
