CODE-1:

PROGRAM:
Write a program to return sum of specific number.
CODE:
import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] step1Array = generateStep1Array(inputArray);
        int[] step2Array = squareArray(step1Array);
        int finalResult = sumArray(step2Array);

        System.out.println(finalResult);
    }

    public static int[] generateStep1Array(int[] inputArray) {
        int[] result = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            result[i] = getDigitAtPosition(inputArray[i], i);
        }
        return result;
    }

    public static int getDigitAtPosition(int number, int position) {
        int divisor = (int) Math.pow(10, position);
        return (number / divisor) % 10;
    }

    public static int[] squareArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        return result;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

CODE-2:

PROGRAM:
Write a program to return sum of longest sequence
CODE:
import java.util.Scanner;

public class LongestPositiveSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input1 = scanner.nextInt();
        int[] input2 = new int[input1];
        
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
        
        int result = findLongestPositiveSequenceSum(input2);
        System.out.println(result);
    }

    public static int findLongestPositiveSequenceSum(int[] array) {
        int maxSum = -1;
        int currentSum = 0;
        int maxLength = 0;
        int currentLength = 0;

        for (int num : array) {
            if (num >= 0) {
                currentSum += num;
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxSum = currentSum;
                } else if (currentLength == maxLength) {
                    maxSum += currentSum;
                }
            } else {
                currentSum = 0;
                currentLength = 0;
            }
        }

        return maxLength > 0 ? maxSum : -1;
    }
}

CODE-3:

PROGRAM:
Write a program to return element from array by performing specified operation.
CODE:
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = performOperations(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] performOperations(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= max;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= max;
        }
        return arr;
    }
}
