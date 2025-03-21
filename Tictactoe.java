import java.util.*;
public class Tictactoe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;
        char player='X';
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                board[i][j]=' ';

            }

        }
        while (gameOver == false) {
            Boardprint(board);
            System.out.println(player+"Enter the move");
            int row= sc.nextInt();
            int col= sc.nextInt();
            if(board[row][col]==' ') {
                board[row][col] = player;

                if (haswon(board, player)) {
                    System.out.println("Congrats " + player + " won the match");
                    System.out.println("-----------------------");
                    Boardprint(board);
                    gameOver=true;
                } else if (drawn(board)) {
                    System.out.println("ohhh nooo!!!!!!");
                    System.out.println("Match drawn!!-----Better luck next time");
                    Boardprint(board);
                    gameOver=true;
                } else {
                    player = (player == 'X' ? 'O' : 'X');
                }
            }
            else {
                System.out.println("Harray pakal!!! Invalid move!:Please try again ");
            }


        }

    }
    public static void Boardprint(char[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static boolean haswon(char[][] arr,char player){
        boolean bin=false;
        for (int i = 0; i < arr.length ; i++) {
           if(arr[i][0]==player && arr[i][1]==player && arr[i][2]==player){
               bin=true;
           }
        }
        for (int j = 0; j < arr.length ; j++) {
            if(arr[0][j]==player && arr[1][j]==player && arr[2][j]==player){
                bin=true;
            }
        }
        if(arr[0][0]==player && arr[1][1]==player && arr[2][2]==player){
            bin=true;
        }
        if(arr[0][2]==player && arr[1][1]==player && arr[2][0]==player){
            bin=true;
        }
        return bin;
    }
    public static boolean drawn(char[][] arr){
        boolean full=true;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] == ' ') {
                    full=false;
                    break;
                }

            }

        }
        return full;

    }
}
