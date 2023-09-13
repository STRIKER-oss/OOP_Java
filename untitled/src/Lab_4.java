import java.util.Arrays;
import java.util.Random;

class SD3 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        // Генерация массива с помощью метода random() класса Math
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }

        // Генерация массива с помощью класса Random
        Random rand = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }

        // Вывод исходных массивов на экран
        System.out.println("Исходный массив, сгенерированный с помощью метода random() класса Math:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Исходный массив, сгенерированный с помощью класса Random:");
        System.out.println(Arrays.toString(arr2));

        // Сортировка массивов
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Вывод отсортированных массивов на экран
        System.out.println("Отсортированный массив, сгенерированный с помощью метода random() класса Math:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Отсортированный массив, сгенерированный с помощью класса Random:");
        System.out.println(Arrays.toString(arr2));
    }
}
