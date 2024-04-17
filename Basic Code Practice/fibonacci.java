public class fibonacci {
    // 0 1 1 2 3 5 8 13
    public static void main(String[] args) {
        int a = 0, b = 1, c = 1;
        while (a <= 50) {
            System.out.print(a + " "); 
            a = b + c;
            b = c;
            c = a;
        }
    }
}
