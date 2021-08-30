import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 4, m = 6;
        int cn1 = 13000;
        int cn2 = 30000;
        int cn3 = 22000;
        int cn4 = 60000;
        int[] sumOfDeposites = {cn1, cn2, cn3, cn4};
        int sum = 0;
        for (int i : sumOfDeposites)
            sum += i;
        System.out.println("Deposit for bonus is " + sum);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введите значения cn1 и cn2");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if (a < b) // вычисляем минимум 2 чисел
            System.out.printf("Between %d and %d, minimum is %d %n", a, b, a);
        int possibleMin = Math.min(a, b);
        System.out.printf("Minimum value of %d and %d using Math.max() is %d %n", a, b, possibleMin);
        System.out.println("Введите значения cn3 и cn4");
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        if (x < y) {
            System.out.printf("Between %d and %d, Minimum Number is %d %n", x, y, x);
        } else {
            System.out.printf("Between %d and %d, Minimum is %d %n", x, y, y);
        }
        int min1 = Math.min(x, y);
        System.out.printf("Minimum value of %d and %d using Math.min() is %d %n", x, y, min1);
        if (possibleMin < min1)
            System.out.printf("Between %d and %d, minimum is %d %n", possibleMin, min1, possibleMin);
        int maxPossibleValue = Math.min(possibleMin, min1);
        int bonusForEmployee = sum / maxPossibleValue;
        if (bonusForEmployee > m) {
            System.out.println("Maximum bonus for employers can be " + possibleMin);
        }
    }
}

