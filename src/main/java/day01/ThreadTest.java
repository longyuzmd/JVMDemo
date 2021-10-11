package day01;

import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();

        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        new Thread(threadDemo2).start();

        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        FutureTask futureTask = new FutureTask(threadDemo3);
        new Thread(futureTask).start();

        System.out.println(futureTask.get());

        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(threadDemo2);
        service.shutdown();
    }
}

/**
 * 多线程创建的四种方式
 * 方式一：继承Thread
 */
class ThreadDemo1 extends Thread{

    @Override
    public void run() {
        System.out.println("线程执行中。。。。。");
    }
}

/**
 * 方式二：实现Runnable
 */
class ThreadDemo2 implements Runnable{

    public void run() {
        System.out.println("线程执行中。。。。。");
    }
}

/**
 * 方式三：实现Callable接口 FuntureTask()
 */
class ThreadDemo3 implements Callable<Integer>{

    public Integer call() throws Exception {
        return 0;
    }
}

