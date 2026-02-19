//simple example first
import java.util.*;
public class Arrays {
public static void main(String args[]){
    int[] marks = new int[3];
    marks[0] = 67;//phy
    marks[1] = 70;//chem
    marks[2] = 60;//math
    System.out.println();

    for(int i=0;i< marks.length;i++){
        System.out.println(marks[i]);
    }
}
    
}


//print null value
import java.util.*;
public class Arrays {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
  
   

    for(int i=0;i<size;i++){
        System.out.println(numbers[i]);
    }
}
    
}

//Giving input in arrays
import java.util.*;
public class Arrays {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
  //input
   for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
   }
   //output
    for(int i=0;i<size;i++){
        System.out.println(numbers[i]);
    }
}
    
}
