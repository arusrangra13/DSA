
import java.util.*;
  public class FirstClass{
    public static void main (String args[]){
      for (int i =1;i<=4;i++){
        System.out.println("****");
      }
    }
  }


import java.util.*;
public class FirstClass{
  public static void main(String args[]){
    int n = 4;
    int m= 5;
    // outer loop
    for(int i = 1;i<=n;i++){
      // innerloop
      for(int j =1;j<=m;j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
  }


// find the factorial of a number
import java.util.*;
public class Functions{
   public static void printfactorial(int n){
      //loop
      int factorial = 1;
      for(int i=n;i>=1;i--){
        factorial = factorial *i;
      }
      System.out.println(factorial);
      return;
   }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printfactorial(n);
      
    }

}

