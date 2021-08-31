import java.util.Scanner;

public class Lala {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arrayN = new int[N];
        int total = 0;

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = scan.nextInt();
            total += arrayN[i];
        }

        int up, down = 1, bonus = total / M;
        up = bonus + 1;

        if (bonus == 0) {
            System.out.println(bonus);
        } else {
            while (down + 1 < up) {
                int count1 = 0;
                for (int i = 0; i < arrayN.length; i++) {
                    count1 += (arrayN[i] / bonus);
                }
                if (count1 < M) {
                    up = bonus;
                    bonus -= (up - down) / 2;
                } else {
                    down = bonus;
                    bonus += (up - down) / 2;
                }
            }
            System.out.println(down);
        }
    }
}
