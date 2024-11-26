import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int c = r.nextInt(0,100);
        int guess = 0;
        int a=0;
        while (a!=c) {
            System.out.println("Guess a number between 0 to 100");
             a = sc.nextInt();
            if (a == c) {
                System.out.println("Yes you guessed it right");
            } else if (a > c) {
                System.out.println("Try something smaller value");
            } else if (a<c) {
                System.out.println("Try something bigger value");

            } else if (a>100) {
                System.out.println("Try Something between 0 and 100");
            }
            guess++;

        }
        System.out.println("It took "+guess+" attempts to guess the answer");
    }
}

