import java.util.Scanner;

/*count each character in a string
* like , aaabccccdd ---> a3b1c4d2*/
class Countchar {
    public static String count(String a) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                count++;
            } else {
                sb.append(a.charAt(i - 1)).append(count);
                count=1;
            }
        }
        sb.append(a.charAt(a.length() - 1)).append(count);
        return sb.length() < a.length() ? sb.toString() : a;
    }
}




public class StringQuestion1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
//        Countchar.count(input);
        System.out.println(Countchar.count(input));

    }
}

