class Q8 {
    public static void main(String[] args) {
        int a = 20, b = 13, diff = 0;

        while (a != b) {
            if (a > b) { a--; diff++; }
            else       { b--; diff++; }
        }
        System.out.println("Difference = " + diff);
    }
}
