package Interfaces;

public class interfaces {
    public static void main(String[] args) {

    }
}
interface Person{
    void displaySkill();
    default void walk(){
        System.out.println("I can walk");
    }
}
class SoccerPlayer implements Person{
    @Override
    public void displaySkill() {
        System.out.println("I can play soccer");
    }
}