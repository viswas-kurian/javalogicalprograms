class Q12 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0, fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
            sum += (double)i / fact;
        }
        System.out.println(sum);
    }
}
