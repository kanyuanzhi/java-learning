public class FactoryCase {
    public static void main(String args[]){
        Fruit f1 = Factory.getInstance("apple");
        f1.eat();
        Fruit f2 = Factory.getInstance("orange");
        f2.eat();
    }
}

interface Fruit{
    public abstract void eat();
}

class Apple implements Fruit{
    public void eat(){
        System.out.println("eat apples");
    }
}

class Orange implements Fruit{
    public void eat(){
        System.out.println("eat oranges");
    }
}

class Factory{
    public static Fruit getInstance(String className){
        Fruit f = null;
        if("apple".equals(className)){
            f = new Apple();
        }
        if ("orange".equals(className)){
            f = new Orange();
        }
        return f;
    }
}