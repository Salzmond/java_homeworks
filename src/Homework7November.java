import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework7November {
    public static void main(String[] args) {

        //Task 1

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNum = num.nextInt();
        System.out.println("Enter the second number");
        int secondNum = num.nextInt();
        System.out.println("first number + second number = " + (firstNum + secondNum));
        System.out.println("first number - second number = " + (firstNum - secondNum));
        System.out.println("first number / second number = " + firstNum / secondNum);
        System.out.println("first number % second number = " + firstNum % secondNum);


        //Task 2

        Scanner anyNum = new Scanner(System.in);
        System.out.println("Enter a number");
        int yourNum = anyNum.nextInt();

        int firstNumber = yourNum / 100;
        int secondNumber = yourNum / 10 % 10;
        int thirdNumber = yourNum % 10;
        System.out.println("First number is " + firstNumber);
        System.out.println("Second number is " + secondNumber);
        System.out.println("Third number is " + thirdNumber);


    }
}
