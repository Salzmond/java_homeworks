import java.util.Scanner;

public class Homework9November {
    public static void main(String[] args) {

        //Task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int someNum = scanner.nextInt();

        if (someNum == 0) {
            System.out.println("ошибок не обнаружено");
        }
        else {
            System.out.println("ERROR");
        }

        //Task 2

        Scanner roulette = new Scanner(System.in);
        System.out.println("Enter first number on the roulette wheel");
        int firstNumber = roulette.nextInt();
        System.out.println("Enter second number on the roulette wheel");
        int secondNumber = roulette.nextInt();

        if (firstNumber == 36 && secondNumber == 17) {
            System.out.println("Jackpot!");
        }
        else if (firstNumber== 36 || secondNumber == 17) {
            System.out.println("Small prize");
        }
        else {
            System.out.println("You lose!");
        }
    }
}
