class DatatypesPractices {
    public static void main(String[] args) {
        int a =1;
        float b = 2f;
        double c = 3;
        long l = 5l;
        byte d = 127;
        System.out.println(c/b);
        System.out.println(b/a);
        
        System.out.println(c/a);
        System.out.println(a/d);
        System.out.println(a/b);
        
        //Prolem 1:Convert Fahrenheit into Celcius
        float Fehren = 212.0f;
        float Celcius = (Fehren - 32.0f) * (5f/9);
        System.out.println(Celcius);

        // Problem 2 : Convert inches to meter
        int inch = 1000;
        float meter = inch / 39.37f;
        System.out.println(meter);

        
        


    }
}