🟢 Example 1: O(1) – Constant Time & Space
public class Example1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }
}

Explanation:

No loop ❌

Always same steps

Time Complexity: O(1)

Space Complexity: O(1)

🟡 Example 2: O(n) – Linear Time
public class Example2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}

Explanation:

Loop runs n times

Time Complexity: O(n)

Only one variable i

Space Complexity: O(1)

🔴 Example 3: O(n²) – Nested Loop
public class Example3 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

Explanation:

Loop inside loop ⚠️

Runs n × n times

Time Complexity: O(n²)

Space Complexity: O(1)

💾 Example 4: O(n) Space Complexity
public class Example4 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }
}

Explanation:

Array size depends on n

Time Complexity: O(n)

Space Complexity: O(n)
