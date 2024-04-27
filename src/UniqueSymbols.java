import java.util.Scanner;

/**
 * Task 4
 */
public class UniqueSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки:");
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String thirdLine = scanner.nextLine();

        String result = findUniqueWord(firstLine, secondLine, thirdLine);
        if (result != null) {
            System.out.println("Первое слово с уникальными символами: " + result);
        } else {
            System.out.println("Слово с уникальными символами не найдено.");
        }
    }

    private static String findUniqueWord(String firstLine, String secondLine, String thirdLine) {
        String[] allWords = (firstLine + " " + secondLine + " " + thirdLine).split("\\s+");
        for (String word : allWords) {
            if (isUnique(word)) {
                return word;
            }
        }
        return null;
    }

    private static boolean isUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
