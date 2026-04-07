//print numbers 5 to 1
public class recursion {
    public static void printnumb(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumb(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        printnumb(n);
    }
}
