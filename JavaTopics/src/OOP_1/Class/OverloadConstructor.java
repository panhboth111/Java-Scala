package OOP_1.Class;

public class OverloadConstructor {
    public static void main(String[] args) {
        Overload Obj1 = new Overload("name1");
        Overload Obj2 = new Overload("name2",19);
        Overload Obj3 = new Overload(19,"name3");
    }
}
class Overload{
    String name;
    int age;
    Overload(String name){
        this.name = name;
    }
    Overload(String name, int age){
        this.name = name;
        this.age = age;
    }
    Overload(int age,String name){
        this.name = name;
        this.age = age;
    }
}
