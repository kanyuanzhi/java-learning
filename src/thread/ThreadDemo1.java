package thread;

import java.security.spec.ECField;
import java.util.TreeMap;

public class ThreadDemo1 {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
//        mt1.run();
//        mt2.run();
//        mt1.start();
//        mt2.start();
        MyRunnable mr1 = new MyRunnable("C");
        MyRunnable mr2 = new MyRunnable("D");
        Thread t1 = new Thread(mr1, "CC");
        Thread t2 = new Thread(mr2, "DD");
/*
        t2.start();
        System.out.println(t2.getPriority());
        for (int i = 0; i < 10; i++) {
        if (i > 2) {
        try {
        t1.join();
        } catch (Exception e) {

        }
        }
        if (i > 4) {
        try {
        t1.sleep(1000);
        } catch (Exception e) {
        }
        }
        System.out.println("main运行,i=" + i + "次");
        }
        */
//        MyDaemon md = new MyDaemon();
//        Thread t = new Thread(md);
//        t.setDaemon(true);
//        t.start();
        MyRunnable2 mrr = new MyRunnable2();
        Thread tt1 = new Thread(mrr,"tt1");
        Thread tt2 = new Thread(mrr,"tt2");
        Thread tt3 = new Thread(mrr,"tt3");
        tt1.start();
        tt2.start();
        tt3.start();
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name + "运行,i=" + i + "次");
        }
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "运行,i=" + i + "次");
        }
    }
}

class MyRunnable2 implements Runnable {
    private String name = "";
    private int ticket = 5;

    public MyRunnable2() {
    }

    public MyRunnable2(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this){
                if(ticket>0){
                    try {
                        Thread.sleep(300);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票" + ticket--);
                }
            }


        }
    }
}

class MyDaemon implements Runnable {
    private static int COUNT = 0;

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + COUNT++);
        }
    }
}