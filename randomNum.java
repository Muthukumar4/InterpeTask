import java.util.Random;
import java.util.Scanner;

public class randomNum {
    public static void main(String[] args) {
        Random ranNum=new Random();
        Scanner sc=new Scanner(System.in);
        int randomNum=ranNum.nextInt(1,100);
        int guess;
       // System.out.println(ranNum);
        do {
            System.out.println("Guess the number 1-100:");
            guess = sc.nextInt();
            if (guess < randomNum) {
                System.out.println("Too low!! try again....");
            } else if (guess > randomNum) {
                System.out.println("Too high!! try again...");
            } else {
                System.out.println("Correct the number" + randomNum);
            }
        }
            while (guess!=randomNum);

    }
}
