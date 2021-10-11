package day01;

import java.util.concurrent.locks.ReentrantLock;

public class WindowTest {

    public static void main(String[] args) {
        Windows windows = new Windows();

        new Thread(windows).start();
        new Thread(windows).start();
        new Thread(windows).start();
    }
}

class Windows implements Runnable{

    private int ticketCount = 100;

    private ReentrantLock lock = new ReentrantLock();

    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        synchronized (this){  // 同步代码块的方式解决
//            while (true){
//                if(ticketCount > 0){
//                    System.out.println(Thread.currentThread().getName()+"窗口售票，票号：" + ticketCount);
//                    ticketCount--;
//                }else{
//                    break;
//                }
//            }
//        }

//        show();

        lock.lock();
        try {
            while (true) {
                if (ticketCount > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口售票，票号：" + ticketCount);
                    ticketCount--;
                } else {
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

    // 同步方法的形式
//    public synchronized void show(){
//        while (true){
//            if(ticketCount > 0){
//                System.out.println(Thread.currentThread().getName()+"窗口售票，票号：" + ticketCount);
//                ticketCount--;
//            }else{
//                break;
//            }
//        }
//    }
}
