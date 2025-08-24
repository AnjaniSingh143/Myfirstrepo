//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class UKG2 {
//
//    private static final int MOD = 1000000007;
//
//    // Function to calculate the power of 2 modulo MOD
//    private static long powerOfTwo(int exponent) {
//        long result = 1;
//        long base = 2;
//        while (exponent > 0) {
//            if ((exponent & 1) == 1) {
//                result = (result * base) % MOD;
//            }
//            base = (base * base) % MOD;
//            exponent >>= 1;
//        }
//        return result;
//    }
//
//    // Main function to calculate the number of good subsequences
//    private static int countGoodSubsequences(String word) {
//        // Frequency map to count character occurrences
//        Map<Character, Integer> frequency = new HashMap<>();
//        for (char c : word.toCharArray()) {
//            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
//        }
//
//        // Calculate the total number of subsequences
//        long totalSubsequences = 1; // Start with the empty subsequence
//        for (int freq : frequency.values()) {
//            totalSubsequences = (totalSubsequences * (powerOfTwo(freq))) % MOD;
//        }
//
//        // Subtract 1 to exclude the empty subsequence
//        totalSubsequences = (totalSubsequences - 1 + MOD) % MOD;
//
//        return (int) totalSubsequences;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String word = scanner.nextLine();
//
//        int result = countGoodSubsequences(word);
//        System.out.println("The number of good subsequences is: " + result);
//}
//}
