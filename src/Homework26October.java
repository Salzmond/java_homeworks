public class Homework26October {
    public static void main(String[] args) {

    //Задача 1 Вариант решения 1
    int a = 5;
    a = (a * 3 + 3) / 2;
    System.out.println(a);

    //Задача 1 Вариант решения 2
    int b = 5;
    b = b * 3;
    b = b + 3;
    b = b / 2;
    System.out.println(b);

    //Задача 1 Вариант решения 3
    int c = 5;
    c *= 3;
    c += 3;
    c /= 2;
    System.out.println(c);


    //Задача 2 Вариант решения 1
    int N = 3;
    int K = 14;
    System.out.println(K % N);

    //Задача 2 Вариант решения 2
    int schoolchildren = 3;
    int applesInTheBasket = 14;
    int theRestOfTheApplesInTheBasket = (applesInTheBasket % schoolchildren);
    System.out.println(theRestOfTheApplesInTheBasket);
}
}
