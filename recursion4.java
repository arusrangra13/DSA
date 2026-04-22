// Print factorial of a number n
public class recursion{
    public static int calcfactorial(int n){
        if(n==1){
            return 1;
        }
       int fact_nm1 = calcfactorial(n-1);
       int fact_n = n * fact_nm1;
       return fact_n;
    }
    public static void main(String args[]){
        int n= 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}
