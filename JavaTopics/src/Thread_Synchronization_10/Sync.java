package Thread_Synchronization_10;

public class Sync {
    public static void main(String[] args) {
        OPT opt = new OPT();
        T1 t1 = new T1(opt);
        T2 t2 = new T2(opt);
        t1.start();
        t2.start();
    }
}
class OPT{
    int num;
    synchronized void increment(){
        num++;
    }
}
class T1 extends Thread{
    OPT obj;
    T1(OPT obj){
        this.obj = obj;
    }
    public void run() {
        for(int i = 1;i<=1000;i++){
            obj.increment();
            try {
                Thread.sleep(10);
            }catch (Exception e){

            }
        }
        System.out.println(obj.num);
    }
}
class T2 extends Thread{
    OPT obj;
    T2(OPT obj){
        this.obj = obj;
    }
    public void run() {
        for(int i = 1;i<=1000;i++){
            obj.increment();
            try {
                Thread.sleep(10);
            }catch (Exception e){

            }
        }
        System.out.println(obj.num);
    }
}
