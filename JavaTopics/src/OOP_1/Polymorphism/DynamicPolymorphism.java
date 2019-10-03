package OOP_1.Polymorphism;

public class DynamicPolymorphism {
    public static void main(String[] args) {

    }
}
class Dynamic{
    void greet(){
        System.out.println("Good morning");
    }
}
class Dynamic2 extends Dynamic{
    @Override
    void greet() {
        System.out.println("Good afternoon");
    }
}
