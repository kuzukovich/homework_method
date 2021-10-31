package sky.pro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        // write your code here
        //task 1
        printYear(2019);
        //task 2
        printVersionApp(2020, 1);
        // task 3
        System.out.println("Потребуется дней: " + getTimeDelivery(90));
        //task 4
        searchDuplicates("aabccddefgghiijjkk");
        //task 5
        reverseArray(new int[]{3, 2, 1, 6, 5});
        //task 6
        int [] arr=generateRandomArray();
        double sum= calculateTotalSum(generateRandomArray());
        double averageAmount= calculateAverageSum(sum,arr);
        printAverageSum(averageAmount);
    }

    public static void printYear(int year) {
        // write your code here
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printVersionApp(int year, int clientOC) {
        // write your code here
        int currentYear = LocalDate.now().getYear();
        boolean isNeededLite = year >= currentYear;
        boolean isАndroid = clientOC == 1;
        if (isАndroid) {
            if (isNeededLite) {
                System.out.println("Установите lite-версию приложения для Аndroid по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Аndroid по ссылке.");

            }
        } else {
            if (isNeededLite) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");

            }
        }
    }

    public static int getTimeDelivery(int deliveryDistance) {
        int timeDelivery = 1;
        if (deliveryDistance < 20) {
            timeDelivery = timeDelivery;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            timeDelivery = timeDelivery + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            timeDelivery = timeDelivery + 2;
        }
        return timeDelivery;
    }

    public static void searchDuplicates(String body) {
        int timeDelivery = 1;
        char[] letters = body.toCharArray();
        char previousLetter = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == previousLetter) {
                System.out.println("Найден дубль по символу " + letter);
                return;
            }
            previousLetter = letter;
        }
        System.out.println("Дублей не найдено");
    }

    public static void reverseArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        double sum = 0;
        int maxSum = 0;
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        return arr;
    }

     static double calculateTotalSum(int[] arr) {
         double sum = 0;
                  for (int i = 0; i < arr.length; i++) {
                          sum += arr[i];
         }
         return sum;
              }
    static double calculateAverageSum(double sum,int[] arr) {
        double averageAmount = sum / arr.length;
                return averageAmount;
    }
    static void printAverageSum(double averageAmount) {
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
    }
}







