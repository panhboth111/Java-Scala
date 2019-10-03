package OOP_1.Inheritance;

public class MultiLevel {
    public static void main(String[] args) {

    }
}
class MultiLevel1{
    int a = 10;
}
class MultiLevel2 extends MultiLevel1{
    int b = 20;
}
class MultiLevel3 extends MultiLevel2{
    int c = 30;
}
