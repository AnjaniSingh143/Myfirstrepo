public class SnipetQuestions {
    public static void main(String... args) {
        int[] ia = {1, 3, 5, 7, 9};
        for (int x : ia) {
            for (int i = 0; i < 3; i++) {
                if (x > 4 && x<8){
                    continue;
                }
                System.out.print(""+x);
                if(i==1){
                    break;
                }
                continue;
            }
            continue;
        }
    }
}
