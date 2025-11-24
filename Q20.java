class Q20 {
    public static void main(String[] args) {
        double a = 1, b = 5, c = 6;
        double d = b*b - 4*a*c;

        if(d > 0){
            System.out.println("Root1 = " + (-b + Math.sqrt(d))/(2*a));
            System.out.println("Root2 = " + (-b - Math.sqrt(d))/(2*a));
        }
        else if(d == 0){
            System.out.println("Root = " + (-b)/(2*a));
        }
        else{
            System.out.println("Imaginary roots");
        }
    }
}
