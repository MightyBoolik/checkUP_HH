import java.util.Arrays;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        //Создаем объект Scanner для считывания чисел, введенных пользователем
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = input.nextInt();
        int M = input.nextInt();

        // Создаем массив введенного пользователем размера
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i] + " ");
            //Arrays.sort(array);
        }
        System.out.println("Введите элемент для бинарного поиска: ");
        int item = input.nextInt();
        int first = 0;
        int last = N - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);

    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }

}

