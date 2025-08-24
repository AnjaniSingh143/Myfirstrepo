class Main1 {
    public static void main(String[] args) {
        String s = "my name is shashank"; // Input string
        demo obj = new demo(); // Create an object of the demo class
        int res = obj.countCharacter(s); // Call the countCharacter method
        System.out.println("Number of characters (excluding spaces): " + res);
    }
}

class demo {
    public int countCharacter(String s) {
        // Remove spaces and return the length of the resulting string
        return s.replace(" ", "").length();
    }
}
