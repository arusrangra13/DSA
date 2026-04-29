// print x^n(tack height = n)
public class recursion {
    public static int calcpower(int x, int n) {
        if (n == 0) {
            return 1;  //base case 1
        }
        if (x == 0) {  //base case 2
            return 0;
        }
        int xpownm1 = calcpower(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}
