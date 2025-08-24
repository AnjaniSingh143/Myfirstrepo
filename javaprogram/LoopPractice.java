public class LoopPractice{
    public static void main(String[] args){
        /*Pattern 1 */
//        System.out.println("Pattern 1:");
//        int n = 5;
//        for(int i =0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if (i==0 || i==4 || j==0 || j==4) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//                // System.out.print(" ");
//            }
//            System.out.println();
//        }
//        /*Pattern 2 */
        System.out.println("Pattern 2:\n");

//        int c = 9;
//        for(int i =0; i<c; i++){
//            for(int j=0; j<c; j++){
//                if (i==0 || i==c-1 || i==c/2 || j==0 || j==c-1 || j==c/2) {
//                    System.out.print("*");
//
//                }
//                else{
//                    System.out.print(" ");
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        /*Pattern 3*/
        int c=9;
        for(int i=0; i<c; i++){
            for(int j=0; j<c; j++){
                if(i==2 || i==5 || j==2 || j==5 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");

            }
            System.out.println();
        }
//




        /*Pattern 4 */
        System.out.println("Pattern 3:\n");

        for(int i =0; i<c; i++){
            for(int j=0; j<c; j++){
                if ((i==0 && j>0 && j<c-1) || i==c/2 || (j==0 && i>0)  || (j==c-1 && i>0)  ) {
                    System.out.print("*");


                }
                // if (i==0 & j==0 || i==0 & j==c/2) {
                //     System.out.print(" ");

                // }


                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
//
//        /*Pattern 5 */
//        System.out.println("Pattern 4:\n");
//        int p=9;
//        for (int i = 0; i < p; i++) {
//            for (int j = 0; j < p; j++) {
//                if ((i==0 && j<p/2) || (i==p/2 && j<p/2) || (i==p-1 && j<p/2) || j==0 || (j==p/2 && i!=0 && i!=p-1 && i!=p/2)) {
//
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

    }
}