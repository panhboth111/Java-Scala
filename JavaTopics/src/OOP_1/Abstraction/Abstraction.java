package OOP_1.Abstraction;

public class Abstraction {
    public static void main(String[] args) {

    }
}
abstract class AB{
    void greet(){
        System.out.println("Hellooooooo");
    }
    abstract void morning();
}
class AB2 extends AB{
    @Override
    void morning() {
        System.out.println("Good Morninggggg");
    }
}
