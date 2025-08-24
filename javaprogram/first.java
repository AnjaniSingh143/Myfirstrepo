public class first{
    public static void main(String[] args){
        // System.out.println("Hello!");
        // System.out.printf(args[0]+"anj");
        // System.out.printf(args[1]);
    
    // INCREMENTATION & DECREMENTATION
    int a = 5;
    int ad = 8;
    int b;
    b= a++;
    int c= ++ad;
    System.out.println(a);;;;;  //no problem with multiple colom
    System.out.println(b);
    System.out.println(c);

    // Operators problem
    int p=10;
    int q=10;
    int r = 30;
    if (p<=q && p<=r) {
            System.out.println(p+" is the least value.");
    }
    else if (q<=p && q<=r) {
        System.out.println(q+" is the least value.");
    }
    else{
        System.out.println(r+" is the least value.");
    }
    }
}
