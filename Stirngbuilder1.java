import java.util.*;

public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Arus");
        System.out.println(sb);
    //   char at index 3
        System.out.println(sb.charAt(3));

    //  set char at index
    sb.setCharAt(0,'R');
    System.out.println(sb);
    }
}
