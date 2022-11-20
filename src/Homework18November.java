import java.util.Scanner;

public class Homework18November {
    public static void main(String[] args) {

        //Task 1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            System.out.println("Я начинаю разбираться с циклами");
            num --;
        }
        //Task 2

        Scanner newScanner = new Scanner(System.in);
        String hi = newScanner.nextLine();
        int len = hi.length();
        while (len != 0) {
            System.out.println(hi.charAt(0));
            len --;
        }
    }
}

