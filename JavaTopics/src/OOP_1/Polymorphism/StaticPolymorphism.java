package OOP_1.Polymorphism;

public class StaticPolymorphism {
    public static void main(String[] args) {

    }
}
class Addition{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    String add(String a,int b){
        return Integer.toString(b) + a;
    }
    String add(int a,String b){
        return Integer.toString(a) + b;
    }
}
