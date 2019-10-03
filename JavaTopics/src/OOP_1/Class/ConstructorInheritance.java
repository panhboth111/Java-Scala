package OOP_1.Class;

public class ConstructorInheritance {
    public static void main(String[] args) {

    }
}
class Inh{
    int a;
    int b;
    int c;
    Inh(int a, int b){
        this.a = a;
        this.b = b;
    }
    Inh(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class Inh2 extends Inh{
    int x;
    int y;
    Inh2(int x,int y){
        super(10,20);
        this.x = x;
        this.y = y;
    }
}
