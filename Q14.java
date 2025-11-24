class Q14 {
    public static void main(String[] args) {
        int a[] = {3, 8, 2, 9, 1};
        int key = 9;

        boolean found = false;
        for (int x : a)
            if (x == key) found = true;

        System.out.println(found ? "Found" : "Not found");
    }
}
