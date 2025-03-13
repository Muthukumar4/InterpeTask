import java.util.Random;
import java.util.Scanner;

public class stonepaperscior {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] rps={"rock","paper","scisor"};
      //  String commove=rps[new Random().nextInt(rps.length)];
       // System.out.println(commove);
        String playermo;
        int rerun;
       // System.out.println("Computer Move: "+commove);
        do {
            System.out.println("Enter your move 'rock' or 'paper' or ''scisor: ");
            playermo= sc.nextLine();
            String commove=rps[new Random().nextInt(rps.length)];

            System.out.println("Computer Move: "+commove);
            if (commove.equalsIgnoreCase("rock")) {
                if (playermo.equalsIgnoreCase("rock")) {
                    System.out.println("Match die-----");
                } else if (playermo.equalsIgnoreCase("paper")) {
                    System.out.println("you won!!!!!!!!!!!!1");
                } else {
                    System.out.println("computer won the match________________");
                }
            } else if (commove.equalsIgnoreCase("paper")) {
                if (playermo.equalsIgnoreCase("paper")) {
                    System.out.println("Match tie");
                } else if (playermo.equalsIgnoreCase("scisor")) {
                    System.out.println("you won the match");
                } else {
                    System.out.println("computer won!!!!!");
                }
            } else {
                if (playermo.equalsIgnoreCase("scisor")) {
                    System.out.println("Match tie");
                } else if (playermo.equalsIgnoreCase("rock")) {
                    System.out.println("you won!!!!");
                } else {
                    System.out.println("computer won!!!!");
                }
            }


            System.out.println("Want to continue-1 & exit-0 :");
            rerun= sc.nextInt();sc.nextLine();
        }while (rerun==1);

    }
}
