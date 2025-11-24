class Q15 {
    public static void main(String[] args) {

        int a[] = {5, 2, 8, 1, 3};
        
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++) {
            int x = a[i];

            if(x < s1) {
                s2 = s1;
                s1 = x;
            } 
            else if(x < s2 && x != s1) {
                s2 = x;
            }
        }

        System.out.println("Second smallest = " + s2);
    }
}
