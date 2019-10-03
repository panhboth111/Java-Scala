package superKeyword_3;

public class SuperVar {
    public static void main(String[] args) {

    }
}
class SuperVar1{
    int a = 10;
}
class SuperVar2 extends SuperVar1{
    int a = 20;
    void print(){
        System.out.println("Parent: "+super.a);
        System.out.println("Child: "+a);
    }
}
