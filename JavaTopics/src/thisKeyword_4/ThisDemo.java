package thisKeyword_4;

public class ThisDemo {
    public static void main(String[] args) {

    }
}
class Person{
    String name;
    int age;

    Person newPerson(){
        return this;
    }
    void displayProperties(Person obj){
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
    void callDisplay(){
        this.displayProperties(this);
    }
}
