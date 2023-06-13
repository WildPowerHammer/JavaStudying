// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    //Переменные
    public  static Scanner INPUT = new Scanner(System.in);
    public static int UserInput;
    public static boolean win = false;
    public static void main(String[] args) {

        String[] Squares = new String[9];
        Squares[0] = "1";
        Squares[1] = "2";
        Squares[2] = "3";
        Squares[3] = "4";
        Squares[4] = "5";
        Squares[5] = "6";
        Squares[6] = "7";
        Squares[7] = "8";
        Squares[8] = "9";

        int turn = 0;
        String turnSimvol = null;

        //System.out.println("1|2|3");
        //System.out.println("4|5|6");
        //System.out.println("7|8|9");



        while (!win) {
            System.out.println(Squares[0]+ '|' + Squares[1] + '|' + Squares[2]);
            System.out.println(Squares[3]+ '|' + Squares[4] + '|' + Squares[5]);
            System.out.println(Squares[6]+ '|' + Squares[7] + '|' + Squares[8]);

            turn = getTurn(Squares, turn);



            if (Squares[0].equals(Squares[1]) && Squares[1].equals(Squares[2]) || Squares[3].equals(Squares[4]) && Squares[4].equals(Squares[5]) || Squares[6].equals(Squares[7]) && Squares[7].equals(Squares[8]) || Squares[0].equals(Squares[3]) && Squares[3].equals(Squares[6]) || Squares[1].equals(Squares[4]) && Squares[4].equals(Squares[7]) || Squares[2].equals(Squares[5]) && Squares[5].equals(Squares[8]) || Squares[0].equals(Squares[4]) && Squares[4].equals(Squares[8]) || Squares[2].equals(Squares[4]) && Squares[4].equals(Squares[6])){

            win = true;
            System.out.println(Squares[0]+ '|' + Squares[1] + '|' + Squares[2]);
            System.out.println(Squares[3]+ '|' + Squares[4] + '|' + Squares[5]);
            System.out.println(Squares[6]+ '|' + Squares[7] + '|' + Squares[8]);
            System.out.println("Поздравляю с победой");


            }

        }

        }







    //Основная логика
    private static int getTurn(String[] Squares, int turn) {
        String turnSimvol;
        UserInput= INPUT.nextInt() - 1;
        if (turn == 0){
            turnSimvol = "x";

            if (Squares[UserInput] != "O" && Squares[UserInput] != "x") {
                Squares[UserInput] = turnSimvol;
                 turn++;
            }
        } else if (turn == 1) {
            turnSimvol = "O";
            if (Squares[UserInput] != "O" && Squares[UserInput] != "x") {
                Squares[UserInput] = turnSimvol;
                turn--;
            }

        }
        return turn;
    }
}