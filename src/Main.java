// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    //Переменные
    public static boolean Break = false;
    public  static Scanner INPUT = new Scanner(System.in);
    public  static  Scanner INANSWER = new Scanner(System.in);
    public static int UserInput;

    public static void main(String[] args) {


        char[] Squares = new char[9];

        int turn = 0;

        for(int i=0; i<9; i++){
            Squares[i]= (char) (i + 49);
        }


        while (!Break) {

            System.out.println(Squares[0]+ "|" + Squares[1] + "|" + Squares[2]);
            System.out.println(Squares[3]+ "|" + Squares[4] + "|" + Squares[5]);
            System.out.println(Squares[6]+ "|" + Squares[7] + "|" + Squares[8]);

            turn = getTurn(Squares, turn);


            if      (Squares[0] != '1' && Squares[1] != '2' && Squares[2] != '3'
                    && Squares[3] != '4' && Squares[4] != '5' && Squares[5] != '6'
                    && Squares[6] != '7' && Squares[7] != '8' && Squares[8] != '9'){

                End(Squares);

            }

            if      (Squares[0]  == (Squares[1]) && Squares[1] == (Squares[2])
                    || Squares[3] == (Squares[4]) && Squares[4] == (Squares[5])
                    || Squares[6] == (Squares[7]) && Squares[7] == (Squares[8])
                    || Squares[0] == (Squares[3]) && Squares[3] == (Squares[6])
                    || Squares[1] == (Squares[4]) && Squares[4] == (Squares[7])
                    || Squares[2] == (Squares[5]) && Squares[5] == (Squares[8])
                    || Squares[0] == (Squares[4]) && Squares[4] == (Squares[8])
                    || Squares[2] == (Squares[4]) && Squares[4] == (Squares[6])) {

                    System.out.println("Поздравляю с победой");
                    End(Squares);

            }

        }

    }

    private static void End(char[] Squares) {
        String UserAnswer;
        System.out.println(Squares[0]+ "|" + Squares[1] + "|" + Squares[2]);
        System.out.println(Squares[3]+ "|" + Squares[4] + "|" + Squares[5]);
        System.out.println(Squares[6]+ "|" + Squares[7] + "|" + Squares[8]);
        System.out.println("Начать заново?");

        UserAnswer = INANSWER.nextLine();
        if (UserAnswer.equalsIgnoreCase("да")){
            for(int i=0; i<9; i++){
                Squares[i]= (char) (i + 49);
            }
        }
        else {
            Break = true;
        }

    }

    //Основная логика
    private static int getTurn(char[] Squares, int turn) {
        char turnSimvol;
        UserInput= INPUT.nextInt() - 1;
        if (turn == 0){
            turnSimvol = 'x';

            if (Squares[UserInput] != 'O' && Squares[UserInput] != 'x') {
                Squares[UserInput] = turnSimvol;
                 turn++;
            }
        } else if (turn == 1) {
            turnSimvol = 'O';
            if (Squares[UserInput] != 'O' && Squares[UserInput] != 'x') {
                Squares[UserInput] = turnSimvol;
                turn--;
            }

        }
        return turn;
    }
}