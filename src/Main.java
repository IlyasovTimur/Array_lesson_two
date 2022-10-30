public class Main {
    public static void main(String[] args) {
        System.out.println("Array_lesson_Two");
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Task 4/ «Иванов Иван» ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i != -1 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task3() {
        System.out.println("Task 3/ средняя сумма трат ");
        int[] arr = generateRandomArray();
        int sum = 0;
        int day = 30;
        for (int element: arr) {
            sum += element;
        }
        double averageSum = (double) sum/day;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", averageSum);
    }

    private static void task2() {
        System.out.println("Task 2/ найти минимальную и максимальную трату за день");
        int[] arr = generateRandomArray();
        int maxSum = Integer.MIN_VALUE;
        int minimalSum = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > maxSum) {
                maxSum = j;
            }
            if (j < minimalSum) {
                minimalSum = j;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.\n", minimalSum, maxSum);
    }

    private static void task1() {
        System.out.println("Task 1/ сумма всех выплат за месяц");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", sum);
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
         }
        return arr;
    }
}