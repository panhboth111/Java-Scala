package OOP_1.Class;

public class ClassDEMO {
    public static void main(String[] args) {

    }
}
class Person{
    //properties
    String name;
    int age;
    //parameterized constructor
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //methods
    void greet(){
        System.out.println("Hello!");
    }
    int numberAddingSkill(int a,int b){
        return a+b;
    }

}


