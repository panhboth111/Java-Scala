package OOP_1.Inheritance;

public class Multiple {
    public static void main(String[] args) {

    }
}
interface M1{
    void morning();
}
interface M2{
    void noon();
}
class Time implements M1,M2{
    @Override
    public void morning() {
        System.out.println("MOrninggggg");
    }

    @Override
    public void noon() {
        System.out.println("Noonnnnnnn");
    }
}
