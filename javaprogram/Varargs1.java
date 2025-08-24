/*Var-args
*   JDK1.0, Method Overloading => CompileTimePolymorphism
*   JDK1.4v => change in the no. of arguments new methods should be written
*   JDK1.5V => Single method can handle any no. of arguments (all should have same type
*               called Var-args(ellipse)*/
class Demo123{
    //Overloading methods........
//    public void sum(int a, int b){
//        System.out.println(a+b);
//    }
//    public void sum(int a, int b, int c){
//        System.out.println(a+b+c);
//    }
//    public void sum(int a){
//        System.out.println(a);
//    }

    // to avoid this- use it in the case of same type args
    //treated as array of inputs
    public void sum(int... x){  // sum(int[] x) treated as 1D array
        System.out.println("Var-args method");
        System.out.println(x);
        int total=0;
        for (int ele : x){
            total+=ele;
        }
        System.out.println("Sum : "+total);
    }
    public void sum(int x){     // it call for specially for one arg.
        System.out.println("Var-args with single arg.");
    }
//    public void sum(int[] x){       // error it is same sum(int... x)
//        System.out.println("Var-args with array of arg.");
//    }
    public void sum(String s, int ...x){    //overloading method
        int total=0;
        for (int ele:
             x) {
            total+=ele;
        }
        System.out.println(s+" : "+total);
    }
    public void sum(int y,String s, int... x){
        int total=1;
        for (int ele : x){
            total*=ele;
        }
        System.out.println(y+""+s+" :  "+total);
    }
    //2D array
    public void sum(int[]... x){  // sum(int[] x) treated as 1D array
        System.out.println();
        System.out.println("Var-args method of 2D array");
        System.out.println(x);

        for (int ele[] : x){
            for (int a :ele){
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}
public class Varargs1 {
    public static void main(String[] args){
        /* Concept of var-args*/
        Demo123 ref =new Demo123();
//        ref.sum(45,21);
//        ref.sum(365);
//        ref.sum(45,32,45,66);

        ref.sum(0,51,10,20);    //sum(int[]{0,51,10,20}
        ref.sum(5,6,6);         //sum(int[]{5,6,6}
        ref.sum(45);

        ref.sum("Sum",1,2,3,4,5,6,7,8,9,10);
        ref.sum(1,"Mult",1,1,2,3,4,5,6);

        ref.sum(new int[][]{{10,20,30,40},{50,60,70,80}});
    }
}
