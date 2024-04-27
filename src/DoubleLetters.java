import java.util.Scanner;

/**
 * Task 5
 */
public class DoubleLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputstring = scanner.nextLine();

        String doubledString = doubleLetters(inputstring);
        System.out.println("Дублированная строка: " + doubledString);
    }

    private static String doubleLetters(String inputstring) {
        StringBuilder doubled = new StringBuilder();
        for (char c : inputstring.toCharArray()) {
            doubled.append(c).append(c);
        }
        return doubled.toString();
    }

}
