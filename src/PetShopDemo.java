import java.util.ArrayList;

public class PetShopDemo {
    public static void main(String[] args){
        Pet c1 = new Cat("cat1","orange", 3);
        Pet c2 = new Cat("cat2","white", 4);
        Pet d1 = new Cat("dog1","yellow", 3);
        Pet d2 = new Cat("dog2","blue", 6);
        Pet d3 = new Cat("dog3","red", 8);

        PetShop ps = new PetShop();
        ps.add(c1);
        ps.add(c2);
        ps.add(d1);
        ps.add(d2);
        ps.add(d3);
        ps.search("o");
    }
}

interface Pet{
    public abstract String getName();
    public abstract String getColor();
    public abstract int getAge();
    public abstract String getInfo();
}

class Cat implements Pet{
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age){
        this.setName(name);
        this.setColor(color);
        this.setAge(age);
    }

    @Override
    public String getInfo() {
        return this.getName()+"--"+this.getColor()+"--"+this.getAge();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog implements Pet{
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age){
        this.setName(name);
        this.setColor(color);
        this.setAge(age);
    }

    @Override
    public String getInfo() {
        return this.getName()+"--"+this.getColor()+"--"+this.getAge();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PetShop{
    private ArrayList<Pet> pets = new ArrayList<Pet>();

//    private Pet[] pets;
//    private int foot;
//    public PetShop(int len){
//        if (len >0){
//            this.pets = new Pet[len];
//        }else {
//            this.pets = new Pet[1];
//        }
//    }
//
//    public boolean add(Pet pet){
//        if(this.foot < this.pets.length){
//            this.pets[foot] = pet;
//            this.foot++;
//            return true;
//        }else {
//            return false;
//        }
//    }

    public void add(Pet pet){
        this.pets.add(pet);
    }

    public ArrayList<Pet> search(String keywords){
        ArrayList<Pet> result = new ArrayList<Pet>();
        for (int i = 0; i<this.pets.size(); i++){
            Pet temp = this.pets.get(i);
            if (temp!=null){
                if(temp.getName().indexOf(keywords)!=-1||temp.getColor().indexOf(keywords)!=-1){
                    result.add(temp);
                }
            }
        }
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i).getInfo());
        }
        return result;
    }
}