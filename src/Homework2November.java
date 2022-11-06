import java.util.Scanner;

public class Homework2November {
    public static void main(String[] args) {

        //Задача 1

        int cookingTimeOfPotion = 5;
        double cookingTimeByAsterix = 3;
        double cookingTimeByObelix = cookingTimeByAsterix / 2;

        boolean canTheyGetAPotion = (cookingTimeByAsterix + cookingTimeByObelix > cookingTimeOfPotion);
        System.out.println(canTheyGetAPotion);

        //Задача 2

        Scanner num = new Scanner(System.in);
        for (; ;) {
        System.out.println("Enter num");
        int first;
        first = num.nextInt();

        int anyNum = first % 2;
        boolean evenOrOdd = (anyNum == 0);
        System.out.println(evenOrOdd); }

    }
}
