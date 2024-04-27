import java.util.Scanner;

/**
 * task star
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputLine = scanner.nextLine();
        System.out.println("Введите номер слова для проверки на палиндром:");
        int wordNumber = scanner.nextInt();

        scanner.nextLine();


        String[] words = inputLine.split("\\s+");
        if (wordNumber <= 0 || wordNumber > words.length) {
            System.out.println("Ошибка: номер слова вне диапазона. В строке всего " + words.length + " слов.");
        } else {
            String selectedWord = words[wordNumber- 1];
            if (isPalindrome(selectedWord)) {
                System.out.println("Слово '" + selectedWord + "' является палиндромом.");
            } else {
                System.out.println("Слово '" + selectedWord + "' не является палиндромом.");
            }
        }

    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
