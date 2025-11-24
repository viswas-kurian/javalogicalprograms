class Q17 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{2,1,1}};
        
        for(int i=0;i<2;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] + " ");
                sum += a[i][j];
            }
            System.out.println("| " + sum);
        }

        System.out.println("-----------");

        System.out.println((a[0][0]+a[1][0]) + " " +
                           (a[0][1]+a[1][1]) + " " +
                           (a[0][2]+a[1][2]));
    }
}
