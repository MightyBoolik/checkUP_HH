public class Example {
    public static void main(String[] args) {
        int n = 4, m = 6;
        int cn1 = 199;
        int cn2 = 453;
        int cn3 = 220;
        int cn4 = 601;
        int[] sumOfDeposites = {cn1, cn2, cn3, cn4};
        int sum = 0;
        for (int i : sumOfDeposites)
            sum += i;
        System.out.println("Total sum is " + sum);
        int a = 199;
        int b = 453;
        if (a < b)
            System.out.printf("Between %d and %d, minimum is %d %n", a, b, a);
        int possibleMin = Math.min(a, b);
        System.out.printf("Minimum value of %d and %d using Math.max() is %d %n", a, b, possibleMin);
        int x = 220;
        int y = 601;
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

