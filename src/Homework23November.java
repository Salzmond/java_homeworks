import java.util.Scanner;

public class Homework23November {
    public static void main(String[] args) {

        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num more than 2");
        int number = scanner.nextInt();


        for (int i = number - 1; i < number; i--) {
            if (number % i == 0) {
                System.out.println("The largest divisor of your num is " + i);
                break;
            }
        }

        //Task 2

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Desired duration of your deposit in years");
        double years = newScanner.nextDouble();
        double[] deposit = new double[(int) (years + 1)];
        System.out.println("Your start money");
        deposit[0] = newScanner.nextDouble();
        System.out.println("Deposit interest");
        double percent = newScanner.nextDouble();

        double newPercent = percent / 100;


        for (int j = 2; j <= years; j++) {

            deposit[1] = deposit[0] * newPercent + deposit[0];

            deposit[j] = deposit[j - 1] * newPercent + deposit[j - 1];
        }
        //System.out.println(Arrays.toString(deposit));
        int endDeposit = (int) deposit[(int) years];
        System.out.println("Your deposit after " + (int) years + " years is " + endDeposit);
    }
}








