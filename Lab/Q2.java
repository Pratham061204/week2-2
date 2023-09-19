package week2.Lab;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        GuessGame g1=new GuessGame();
        g1.startGame();
    }
}
class Player{
    int number;
    public void guess(int num){
        number=num;
        }

    public int getNumber() {
        return number;
    }
}

class GuessGame{
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();
    private int targetno;
    public void startGame(){
        Random random=new Random();

        targetno=random.nextInt(10);
        System.out.println("Target no is "+targetno);
        Scanner sc=new Scanner(System.in);
        System.out.println("Player 1 guessed ");
        int a=sc.nextInt();
        p1.guess(a);
        System.out.println(p1.getNumber());
        System.out.println("Player 2 guessed ");
        int b=sc.nextInt();
        p2.guess(b);
        System.out.println(p2.getNumber());
        System.out.println("Player 3 guessed ");
        int c=sc.nextInt();
        p3.guess(c);
        System.out.println(p3.getNumber());

        if(p1.getNumber()==targetno){
            System.out.println("Player 1 got it right ");
        }
        else {
            System.out.println("Please Try again "+p1.getClass().getName()+" 1");
        }
        if(p2.getNumber()==targetno){
            System.out.println("Player 2 got it right ");
        }
        else {
            System.out.println("Please Try again "+p2.getClass().getName()+" 2");
        }
        if(p3.getNumber()==targetno){
            System.out.println("Player 3 got it right ");
        }
        else {
            System.out.println("Please Try again "+p3.getClass().getName()+" 3");
        }

}
}
