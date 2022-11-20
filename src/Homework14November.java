import java.util.Scanner;

public class Homework14November {
    public static void main(String[] args) {

        //Task 1.1
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        boolean answer = (stroka.length() > 10);
        System.out.println(answer);

        //Task 1.2


        Scanner newScanner = new Scanner(System.in);
        String newTask = newScanner.nextLine();
        int len = newTask.length();
        newTask = newTask.toLowerCase();
        boolean sameChar = (newTask.charAt(0) == (newTask.charAt(len - 1)));
        System.out.println(sameChar);

        //There ist EqualIgnoreCase, but I dont know how to use it =(

        //Task 2

        Scanner onlyScanner = new Scanner(System.in);
        String secondTask = onlyScanner.nextLine();
        secondTask = secondTask.replaceAll("(.)(.)", "$2$1");
        System.out.println(secondTask);

    }


}






