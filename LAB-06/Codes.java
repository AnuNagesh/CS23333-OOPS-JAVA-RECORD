CODE-1:
CODE :
import java.util.Scanner;

public class StringProcessor {
    public static String processString(String input) {
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            char char1 = word.charAt(0);
            char char2 = word.charAt(1);

            if (char1 == char2) {
                output.append(Character.toUpperCase(char1));
            } else {
                int pos1 = char1 - 'a';
                int pos2 = char2 - 'a';
                int difference = Math.abs(pos1 - pos2);
                char resultChar = (char) ('a' + difference);
                output.append(Character.toUpperCase(resultChar));
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String processedInput = input.split("//")[0].replaceAll("\\s+", "");
        String result = processString(processedInput);

        System.out.println(result);

        scanner.close();
    }
}

CODE-2:

import java.util.Scanner;

public class StringProcessor {
    public static String processStrings(String input1, String input2) {
        String combined = input1 + input2;
        combined = combined.replaceAll("\\s+", "");

        boolean[] seen = new boolean[26];
        StringBuilder uniqueChars = new StringBuilder();

        for (char c : combined.toCharArray()) {
            int index = c - 'a';

            if (!seen[index]) {
                seen[index] = true;
                uniqueChars.append(c);
            }
        }

        char[] resultArray = uniqueChars.toString().toCharArray();
        java.util.Arrays.sort(resultArray);

        for (int i = 0; i < resultArray.length / 2; i++) {
            char temp = resultArray[i];
            resultArray[i] = resultArray[resultArray.length - 1 - i];
            resultArray[resultArray.length - 1 - i] = temp;
        }

        String result = new String(resultArray);

        return result.isEmpty() ? "null" : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String 1  result = processStrings(input1, input2);

        System.out.println(result);

        scanner.close();
    }
}

CODE-3:

import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        int input2 = scanner.nextInt();

        String[] words = input1.split(" ");

        int firstIndex = input2 % 101;
        int secondIndex = input2 / 101;

        String processedFirstWord = processWord(words[firstIndex]);
        String processedSecondWord = processWord(words[secondIndex]);

        System.out.println(processedFirstWord + " " + processedSecondWord);
    }

    private static String processWord(String word) {
        int len = word.length();
        int mid = len / 2;

        String middleToBegin;
        String middleToEnd;

        if (len % 2 == 0) {
            middleToBegin = new StringBuilder(word.substring(0, mid)).reverse().toString();
            middleToEnd = word.substring(mid);
        } else {
            middleToBegin = new StringBuilder(word.substring(0, mid + 1)).reverse().toString();
            middleToEnd = word.substring(mid);
        }

        return middleToBegin + middleToEnd;
    }
}  
