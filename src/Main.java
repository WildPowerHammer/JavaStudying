// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    //Переменные
    public static int score = 0;
    public static int NumOfQuestion;
    public static String UserAnswer = null;
    public static void main(String[] args) {


        //Вопросы
        String[] questions = new String[5];
        questions[0] = "Вопрос 1";
        questions[1] = "Вопрос 2";
        questions[2] = "Вопрос 3";
        questions[3] = "Вопрос 4";
        questions[4] = "Вопрос 5";



        //Ответы
        String[] answers = new String[5];
        answers[0] = "Ответ 1";
        answers[1] = "Ответ 2";
        answers[2] = "Ответ 3";
        answers[3] = "Ответ 4";
        answers[4] = "Ответ 5";

        //Сканер
        Scanner INPUT = new Scanner(System.in);


        //Переменная для обозначения победы
        //String YesNo = "не";

        //Вызов
        while (true){
            orator(questions, answers, INPUT);
            if (NumOfQuestion == 5 && score < 5){
                System.out.println("Ваш счет: " + score);
                System.out.println("Вы не набрали нужное количество баллов");
                break;
            }
            else {
                System.out.println("Вы хотите продолжить?");
                UserAnswer = INPUT.nextLine();
                if (UserAnswer.toLowerCase().equals("да")){
                    NumOfQuestion = 0;
                    score = 0;
                }
                else {
                    break;
                }

            }
        }


    }

    //Почти всё
    public static void orator(String[] questions, String[] answers, Scanner INPUT){
       while (NumOfQuestion != 5){
         System.out.println("Внимание! Вопрос: " + questions[NumOfQuestion] + " Ваш ответ: ");
         //Ввод и вызов определения победы
         UserAnswer = INPUT.nextLine();
         String YesNo = WinOrNo(answers);

         NumOfQuestion++;

         System.out.println("Ответ " + YesNo + "верный.");
         System.out.println("Ваш счет: " + score);
       }




    }
    //Метод для определения победил ты или нет
    private static String WinOrNo(String[] answers) {
        String YesNo;
        if (UserAnswer.toLowerCase().equals(answers[NumOfQuestion].toLowerCase())){
           YesNo = " ";
           score++;
         }

        else {
            YesNo = "не";
        }
        return YesNo;

    }


}