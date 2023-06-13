import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(returnFloatNumber());

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        homeTask2(array,2,9);

        homeTask3(90, 3, array);

        checkStringNotEmpty();

    }

    public static float returnFloatNumber() {
        boolean checker = true;
        float result = 0;
        while (checker) {
            System.out.println("Введите дробное число");
            try {
                Scanner scanner = new Scanner(System.in);
                result = scanner.nextFloat();
                checker = false;
            } catch (Exception e) {
                System.out.println("Значение введено некорректно");
            }
        }
        return result;
    }

    public static void homeTask2(int[] intArray, int d, int k) {
        try {
            double catchedRes1 = intArray[k] / d;
            System.out.println("Результат деления " + k + " элемента массив на " + d + " равно " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя\n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В массиве должно быть не меньше " + (k + 1) + " элементов\n" + e);
        }
    }

    public static void homeTask3(int a, int b, int[] abc) {
        try {

            System.out.println(a / b);
            printSum(a, b);
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void checkStringNotEmpty() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите что-нибудь");
            String result = scanner.nextLine();
            try {
                if (result.isEmpty()) {
                    throw new Exception("Вы ввели пустую строчку");
                } else {
                    break;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        }
}