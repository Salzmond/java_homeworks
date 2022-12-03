import java.util.Scanner;

public class Homework28November {
    public static void main(String[] args) {
        int num = getNum();
        int firstNum = getFirstNum(num);
        System.out.println("First number is " + firstNum);
        int secondNum = getSecondNum(num);
        System.out.println("Second number is " + secondNum);
        int thirdNum = getThirdNum(num);
        System.out.println("Third number is " + thirdNum);
    }

    public static void printRequest() {
        System.out.println("Enter a number");
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        printRequest();
        return scanner.nextInt();
    }

    public static int getFirstNum(int a) {
        return a / 100;
    }

    public static int getSecondNum(int a) {
        return a / 10 % 10;
    }

    public static int getThirdNum(int a) {
        return a % 10;
    }

}
