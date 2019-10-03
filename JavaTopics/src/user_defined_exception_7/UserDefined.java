package user_defined_exception_7;

public class UserDefined {
    public static void main(String[] args) {
        try{
            throw new MyExc("Error :(");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyExc extends Exception{
    MyExc(String s){
        super(s);
    }
}