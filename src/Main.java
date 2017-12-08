public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.tell();
        Person pp = new Person();
        pp.setAge(-2);
        pp.setName("qweqwe");
        pp.tell();
        Person ppp = new Person("hjfsiodf",45);
        ppp.tell();
        Person.setCity("B城");
        p.tell();
        pp.tell();
        ppp.tell();
//        System.out.println(p.compare(pp));
//        String qq = "hello";
//        System.out.println(qq=="hello");

    }
}

class Person {
    private String name="";
    private int age;
    private static String city = "A城";

    private static int count;

    public Person(){
        count++;
        this.name = "Person-"+count;
        System.out.println("这是第"+ count +"个对象");
    }

    public Person(String name, int age){
        this();
        this.setName(name);
        this.setAge(age);
    }

    public static void setCity(String c){
        city = c;
    }

    public static String getCity(){
        return city;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tell() {
        System.out.println(this.getName() + ":" + this.getAge()+":"+city);

    }

    public boolean compare(Person p){
        Person p1 = this;
        Person p2 = p;
        if (p1==p2){
            return true;
        }if(p1.getAge() == p2.getAge() && p1.getName().equals(p2.getName())){
            return true;
        }else {
            return false;
        }
    }
}

