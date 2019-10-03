package OOP_1.Encapsulation;

public class Encap {
    public static void main(String[] args) {
        Data acc1 = new Data();
        acc1.setMoney(1899.45f);
        System.out.println(acc1.getMoney());
    }
}
class Data{
    private float money;
    float getMoney(){
        return money;
    }
    void setMoney(float money){
        this.money = money;
    }

}
