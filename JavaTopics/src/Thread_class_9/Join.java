package Thread_class_9;

public class Join {
    public static void main(String[] args) {
        J1 t1 = new J1();
        J1 t2 = new J1();
        J1 t3 = new J1();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){

        }
        try{
            t2.join();
        }catch (Exception e){

        }
        t3.start();
    }
}
class J1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{Thread.sleep(1000);}catch (Exception e){}
            System.out.println(i);
        }
    }
}
