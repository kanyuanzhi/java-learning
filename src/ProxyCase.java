public class ProxyCase {
    public static void main(String args[]) {
        Network net0 = new Real();
        net0.browser();
        Network net = new Proxy(new Real());
        net.browser();
    }
}

interface Network{
    public abstract void browser();
}

class Real implements Network{
    public void browser(){
        System.out.println("上网浏览信息");
    }
}

class Proxy implements Network{
    private Network network;
    public Proxy(Network network){
        this.network = network;
    }

    public void check(){
        System.out.println("检查用户是否合法");
    }
     public void browser(){
        this.check();
        this.network.browser();
     }
}
