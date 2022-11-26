import java.util.Arrays;

public class Homework25November {
    public static void main(String[] args) {
         //Task 1

        int[] array = new int[100];
        for (int i = 1; i < 99; i++) {

            array [i] = 10;
        }

        System.out.println(Arrays.toString(array));

        //Task 2

        int[] arrayNew = new int[10];
        int[] two = new int[100];
        int sizeArrayNew = arrayNew.length;
        int sizeTwo = two.length;
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            arrayNew[0] = 111;
            arrayNew[i] = 111 * i + 111;
        }
        System.arraycopy(arrayNew,0,two,0,arrayNew.length);

        while (sizeArrayNew < sizeTwo) {
            System.arraycopy(two,0,two,sizeArrayNew,Math.min(sizeTwo-sizeArrayNew,sizeArrayNew));
            sizeArrayNew *= 2;
        }
        for (int num : two) {
            sum = sum + num;
        }

        System.out.println(Arrays.toString(arrayNew));
        System.out.println(Arrays.toString(two));
        System.out.println("Sum all of num in array Two is " + sum);

    }
}
