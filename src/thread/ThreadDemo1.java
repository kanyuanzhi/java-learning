package thread;

public class ThreadDemo1 {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
        mt1.run();
        mt2.run();
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
