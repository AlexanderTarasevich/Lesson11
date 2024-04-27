import java.util.Scanner;

/**
 * task3
 */
public class AverageLengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        int totalLength = 0;

        System.out.println("Введите три строки:");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
            totalLength += strings[i].length();
        }

        int averageLength = totalLength / strings.length;

        System.out.println("Строки с длиной меньше средней:\"" + averageLength + "\":");
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println(str + " - длина: " + str.length());
            }
        }
    }
}
