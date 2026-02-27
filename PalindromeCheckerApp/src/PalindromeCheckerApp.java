import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters into Queue and Stack
        for(int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));   // Enqueue
            stack.push(word.charAt(i));  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        for(int i = 0; i < word.length(); i++) {

            char qChar = queue.remove();  // FIFO
            char sChar = stack.pop();     // LIFO

            if(qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}