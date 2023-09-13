class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        // цикл for
        for (int i = 0; i < arr.length; i++) {
            sumFor += arr[i];
        }
        System.out.println("Сумма элементов массива (for): " + sumFor);

        // цикл while
        int i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива (while): " + sumWhile);

        // цикл do while
        i = 0;
        do {
            sumDoWhile += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Сумма элементов массива (do while): " + sumDoWhile);
    }
}