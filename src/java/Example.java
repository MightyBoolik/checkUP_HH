import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int cn1 = 13000;
        int cn2 = 15000;
        int cn3 = 49000;
        int cn4 = 60100;
        int[] sumOfDeposites = {cn1, cn2, cn3, cn4};
        int sum = 0;
        for (int i : sumOfDeposites)
            sum += i;
        System.out.println("Total deposit for bonus is " + sum);
        try {
            System.out.println("Введите колличество счетов и менеджеров через пробел");
            int n = scnr.nextInt();
            int m = scnr.nextInt();
            System.out.println("Введите суммы на корпоративных счетах (один счёт - одна строка)");
            int a = scnr.nextInt();
            int b = scnr.nextInt();
            int x = scnr.nextInt();
            int y = scnr.nextInt();
            if (b > a) // вычисляем минимум 2 чисел
                System.out.printf("Between %d and %d, minimum is %d %n", a, b, a);
            int possibleMin = Math.min(a, b);
            System.out.printf("Minimum value of %d and %d using Math.min() is %d %n", a, b, possibleMin);
            if (y > x) {
                System.out.printf("Between %d and %d, Minimum Number is %d %n", x, y, x);
            } else {
                System.out.printf("Between %d and %d, Minimum is %d %n", x, y, y);
            }
            int min1 = Math.min(x, y);
            System.out.printf("Minimum value of %d and %d using Math.min() is %d %n", x, y, min1);
            if (possibleMin > min1)
                System.out.printf("Between %d and %d, minimum is %d %n", possibleMin, min1, possibleMin);
            int maxPossibleValue = Math.min(possibleMin, min1);
            int bonusForEmployee = sum / maxPossibleValue;
            if (bonusForEmployee > m) {
                System.out.println("Maximum bonus for employers can be " + possibleMin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scnr.close();
        }
    }
}

