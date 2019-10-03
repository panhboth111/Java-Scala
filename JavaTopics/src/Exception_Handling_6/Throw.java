package Exception_Handling_6;

public class Throw {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if(b==0){
            try{
                throw new ArithmeticException("Error");
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println(a/b);
    }
}

