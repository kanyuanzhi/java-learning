public class AbstractCaseDemo {
    public static void main(String[] args){
        Person_ p1 = new Student_("sss",18,98.5f);
        Person_ p2 = new Worker_("kkk", 36, 5032.22f);
        p1.say();
        p2.say();
        System.out.println(p1 instanceof Person_);
    }
}

abstract class Person_{
    private String name;
    private int age;
    public Person_(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void say(){
        System.out.println(this.getContent());
    }
    public abstract String getContent();
}

class Student_ extends Person_{
    private float score;
    public Student_(String name, int age, float score){
        super(name, age);
        this.score = score;
    }

    @Override
    public String getContent() {
        return "学生："+super.getName()+"->"+super.getAge()+"->"+this.score;
    }
}

class Worker_ extends Person_{
    private float salary;
    public Worker_(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String getContent() {
        return "工人："+super.getName()+"->"+super.getAge()+"->"+this.salary;
    }
}