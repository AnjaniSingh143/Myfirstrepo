public class Operator_Practice{
    public static void main(String[] args){
         /*Ternarry operator */
         int a=140;
         int b=56;
         int c = (a>b)?a:b;
        
         int d=452;
         int e= (a<b)? ((a>d)?a:d):((b>d)?b:d);
            System.out.println(c);
            System.out.println(e);

            /*Switch cases */
        int num = 452523;
        switch(num){
            case 12: System.out.println("Case 1 is execute.");
                        break;
            case 452 : System.out.println("Case 2 is execute.");
                        break;
            case 242: System.out.println("Case 3 is execute.");
                        break;
            default : System.out.println("nO CASES match.");
        }
    }
}