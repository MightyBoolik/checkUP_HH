import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {
            System.out.println("Input number of deposits and managers");
            int N = scnr.nextInt();
            int M = scnr.nextInt();
            System.out.println("");
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
            int[] sumOfDeposites = {a, b, x, y};
            int sum = 0;
            for (int i : sumOfDeposites)
                sum += i;
            System.out.println("Total deposit for bonus is " + sum);
            int min1 = Math.min(x, y);
            System.out.printf("Minimum value of %d and %d using Math.min() is %d %n", x, y, min1);
            if (possibleMin > min1)
                System.out.printf("Between %d and %d, minimum is %d %n", possibleMin, min1, possibleMin);
            int maxPossibleValue = Math.min(possibleMin, min1);
            int bonusForEmployee = sum / maxPossibleValue;
            if (bonusForEmployee > M) {
                System.out.println(possibleMin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scnr.close();
        }
    }
}



