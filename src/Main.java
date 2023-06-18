// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {


    /*
     * Exercise 3:
     * Bank Management System:
     * Create a Bank Management System which has the following components:
     * Person (which saves first, middle and last name, age and a "social security number")
     * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
     * Checking Account (should have a current value, methods for taking and depositing money)
     * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
     *
     * BONUS: Make the Banking System Interactive (No Solution provided!)
     *
     *
     */
     /*
     * Упражнение 3:
     * Система управления банком:
     * Создайте систему управления банком, которая имеет следующие компоненты:
     * Человек (который сохраняет имя, фамилию, возраст и "номер социального страхования")
     * Банк (сохраняет список клиентов и их расчетные счета, максимальную сумму овердрафта)
     * Расчетный счет (должен иметь текущее значение, методы снятия и внесения денег)
     * Открытие чекового счета должно осуществляться только через банк и требовать определенную сумму первоначального депозита.
     *
     * БОНУС: Сделать банковскую систему интерактивной (Решение не предоставляется!)
     *
     *
     */
    public static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {


        addPerson();


        System.out.println(personList.get(0).name + personList.get(0).lastName + personList.get(0).age + personList.get(0).PID);



    }


    public static void addPerson(){

        Scanner input = new Scanner(System.in);

        String nameInput = input.nextLine();
        String lastnameInput = input.nextLine();
        int ageInput = input.nextInt();
        int PIDInput = input.nextInt();


        personList.add(new Person(nameInput, lastnameInput, ageInput, PIDInput));
    }
}