class ArrayPractice4{
    public static void main(String[] args){
        // declaration of array
        int[] a = {10,52,52,42,62,41,13};
        int[] b = new int[] {424,62,4121,45,145,125,15};
        int[][] marks = new int[][]{{12,42,65},{45,52,62},{42,96,45}};

        //enhaced for loop OR for-each loop----
        for(int elem : a){
            System.out.println(elem);
        }
        for (int i : b) {
            System.out.println(i);
        }
        for(int m[] : marks){
            for(int p : m){
                System.out.print(p+" ");
            }
            System.out.println();
        }


        // Concept of anonimous array
        display(new int[]{10,20,30,40,50}); //we can't use this array other than line no. 24

    }
    static void display(int[] arr){
        for(int ele : arr){
            System.out.println(ele);

        }
    }
}
