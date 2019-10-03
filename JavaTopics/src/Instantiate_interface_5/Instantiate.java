package Instantiate_interface_5;

public class Instantiate {
    public static void main(String[] args) {
        INF obj = new INF() {
            @Override
            public void greet() {
                System.out.println("Hellooooooooo");
            }
        };
    }
}
interface INF{
    void greet();
}