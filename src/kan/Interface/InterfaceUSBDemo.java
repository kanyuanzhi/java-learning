package kan.Interface;

public class InterfaceUSBDemo {
    public static void main(String args[]) {
        Computer.plugin(new Flash());
        Computer.plugin(new Print());
    }
}

interface USB{
    public abstract void start();
    public abstract void end();
}

class Computer{
    public static void plugin(USB usb){
        usb.start();
        System.out.println("======USB设备工作======");
        usb.end();
    }
}

class Flash implements USB{
    public void start(){
        System.out.println("U盘开始工作");
    }
    public void end(){
        System.out.println("U盘结束工作");
    }
}

class Print implements USB{
    public void start(){
        System.out.println("打印机开始工作");
    }
    public void end(){
        System.out.println("打印机结束工作");
    }
}