package Exception_Handling_6;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("always executes");
        }
    }
}

