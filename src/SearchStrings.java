import java.util.Scanner;

/**
 * Task1
 */

public class SearchStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки:");
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        String shortestString = strings[0];
        String longestString = strings[0];

        for (String str : strings) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        System.out.println("Самая короткая строка:\"" + shortestString + "\" с длиной- " + shortestString.length());
        System.out.println("Самая длинная строка:\"" + longestString + "\" с длиной- " + longestString.length());

    }
}
