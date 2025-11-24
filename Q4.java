class Q4 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Logic 1
        int t = a; a = b; b = t;

        // Logic 2
        a = a + b;
        b = a - b;
        a = a - b;

        // Logic 3
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
