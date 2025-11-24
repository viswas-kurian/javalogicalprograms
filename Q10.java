class Q10 {
    public static void main(String[] args) {
        int n = 17, i = 2;
        boolean prime = true;

        while (i <= n/2) {
            if (n % i == 0) prime = false;
            i++;
        }

        if (prime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
