import java.util.Scanner;

public class LoginDemo {
    public static void main(String args[]) {
        Operate oper = new Operate(new Input().getInput());
        System.out.println(oper.login());
    }
}

class Input{
    private String username = null;
    private String password = null;

    public Input(){
        System.out.println("username:");
        Scanner sc = new Scanner(System.in);
        this.username = sc.next();
        System.out.println("password:");
        this.password = sc.next();
        sc.close();
    }

    public String[] getInput(){
        String[] input = {this.username,this.password};
        return input;
    }

}

class Check {
    private String username = "kan";
    private String password = "123";

    public boolean validate(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
}

class Operate{
    private String info[];

    public Operate(String info[]){
        this.setInfo(info);
    }

    public String login(){
        Check check = new Check();
        String username = this.getInfo()[0];
        String password = this.getInfo()[1];
        String str = null;
        if (check.validate(username, password)){
            str = "welcome "+username;
        }else {
            str = "WRONG!";
        }
        return str;
    }

    private void setInfo(String info[]){
        this.info = info;
    }
    private String[] getInfo(){
        return this.info;
    }
}
