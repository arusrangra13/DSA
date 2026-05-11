public class recursion {
    public static int calclog(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calclog(x, n / 2) * calclog(x, n / 2);
        } else { // n is odd
            return calclog(x, n / 2) * calclog(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calclog(x, n);
        System.out.println(ans);
    }
}
