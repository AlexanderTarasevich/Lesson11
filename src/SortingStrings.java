import java.util.Scanner;

/**
 * task 2
 */
public class SortingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        System.out.println("Введите три строки:");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
