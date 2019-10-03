package superKeyword_3;

public class SuperMeth {
    public static void main(String[] args) {

    }
}
class SuperMeth1{
    void greet(){
        System.out.println("Hello");
    }
}
class SuperMeth2 extends SuperMeth1{
    @Override
    void greet() {
        System.out.println("Hi");
    }
    void combine(){
        super.greet();
        greet();
    }
}
