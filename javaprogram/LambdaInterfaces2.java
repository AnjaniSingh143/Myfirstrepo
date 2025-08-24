/*Lambda expression
*   ==> operator ===> (->)
* There are two parts of lambda expression
*   a. left part contains parameters
*           --> () is optional in case of single parameter
*           --> data types are optional
*   b. right part contain body or implementation
*           --> {} and return statement are optional in case of single statement
* Without Functional Interface we cannot write Lambda expression
* */
@FunctionalInterface
interface Sub{
    int sub(int a, int b);
}
@FunctionalInterface
interface Mult{
    int mult(int x);
}
public class LambdaInterfaces2 {
    public static void main(String... args){
        //lambda expression
        Sub s = (a,b) ->  a-b;   // if there is single line implementation
        System.out.println(s.sub(41,23));;

        Mult ref = x -> x*5;        // {} and () is optional if single parameter or statement
        System.out.println(ref.mult(80));
    }
}
