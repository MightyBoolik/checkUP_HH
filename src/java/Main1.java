/*public class Main {

    public static void main(String[] args) {
        int n = 4, m = 6;
        int cn1 = 199;
        int cn2 = 453;
        int cn3 = 220;
        int cn4 = 601;
        int[] mas1 = new int[]{};
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = i + 1;
            //Arrays.sort(mas1);
            System.out.println(mas1[i]);

        }
        int index = linearSearch(new int[]{}, 200);
        print(200, index);
    }

    public static int linearSearch(int mas1[], int elementToSearch) {

        for (int index = 0; index < mas1.length; index++) {
            if (mas1[index] == elementToSearch)
                return index;
        }
        return -1;

    }

    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }

    }

}*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*public class Main1
{

    public static void main(String[] args) {
        int n = 4, m = 6;
        int cn1 = 199;
        int cn2 = 453;
        int cn3 = 220;
        int cn4 = 601;
        int[] nums = new int[453];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) ((Math.random() * 100) + 1);
            System.out.print(nums[i] + " , ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("What number would you like to search for?");
        num = input.nextInt();
        boolean found = false;
        int i; // create this
        for (i = 0; i < nums.length; i++)  // and remove int from for loop
        {
            if (num == nums[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("That number was found at index " + i);
        } else {
            System.out.println("That number was not found.");
        }
    }}
*/

