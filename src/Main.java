//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    // Задание 1. Проверка числа на палиндром без преобразования в строку.
    public static boolean isPalindrome(int number) {
        // Отрицательные числа и ненулевые числа с нулём в конце
        // не являются палиндромами.
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Переворачиваем только половину цифр, чтобы избежать переполнения.
        while (number > reversedHalf) {
            reversedHalf = reversedHalf * 10 + number % 10;
            number /= 10;
        }

        // При нечётном количестве цифр исключаем среднюю цифру.
        return number == reversedHalf || number == reversedHalf / 10;
    }
}