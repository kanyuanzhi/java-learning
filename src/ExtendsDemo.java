import java.util.PrimitiveIterator;

public class ExtendsDemo {
    public static void main(String[] args) {
        /*Student a = new Student();
        a.setAge(18);
        a.setName("kan");
        a.setSchool("ustc");
        System.out.println(a.getName() + "--" + a.getAge()+"--"+a.getSchool());
        a.fun();*/
        Array aa = new Array(5);
        aa.add(3);
        aa.add(11);
        aa.add(8);
        aa.add(234);
        aa.add(4);
        aa.print();
        ReverseArray bb = new ReverseArray(5);
        bb.add(3);
        bb.add(11);
        bb.add(8);
        bb.add(234);
        bb.add(4);
        bb.print();
    }
}

class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void print(){
        System.out.println("People->print");
    }
    public void fun(){
        this.print();
    }
}

class Student extends People {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void print(){
        System.out.println("Student->print");
    }
}

class Array{
    private int[] temp;
    private int foot;
    //public Array(){}
    public Array(int len){
        if(len>0){
            this.temp = new int[len];
        }else {
            this.temp = new int[1];
        }
    }

    public boolean add(int i){
        if(this.foot < this.temp.length){
            this.temp[foot]=i;
            foot++;
            return true;
        }else {
            return false;
        }
    }

    public int[] getArray(){
        return this.temp;
    }

    public void print(){
        for (int i = 0; i<this.getArray().length; i++){
            System.out.println(this.getArray()[i]);
        }
    }
}

class ReverseArray extends Array{
    private int foot;
    public ReverseArray(int len){
        super(len);
        this.foot = len-1;
    }

//    public int[] getArray(){
//        int left = 0;
//        int right = super.getArray().length-1;
//        while (left<right){
//            int exchange;
//            exchange = super.getArray()[left];
//            super.getArray()[left] = super.getArray()[right];
//            super.getArray()[right] = exchange;
//            left++;
//            right--;
//        }
//        return super.getArray();
//    }

    public boolean add(int i){
        if(this.foot>=0){
            this.getArray()[this.foot] = i;
            this.foot--;
            return true;
        }else {
            return false;
        }
    }

    public void reverse(){  //一键反转
        int left = 0;
        int right = super.getArray().length-1;
        while (left<right){
            int exchange;
            exchange = super.getArray()[left];
            super.getArray()[left] = super.getArray()[right];
            super.getArray()[right] = exchange;
            left++;
            right--;
        }
    }
}
