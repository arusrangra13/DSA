import java.util.*;

public class Stringbuilder {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Arus");
    sb.insert(3,'t');
    System.out.println(sb);

    // delete the extra t
    sb.delete(3,4);
    System.out.println(sb);
    }
}
