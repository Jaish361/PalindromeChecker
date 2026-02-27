import java.util.Scanner;
public class PalindromeCheckerApp {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a string");
    String word = sc.nextLine();
    String reversed = "";

    //reverse kro loop use krke
    for(int i=word.length() - 1 ; i>=0; i--){
        reversed += word.charAt(i);
    }
    if (word.equals(reversed)) {
        System.out.println(word + " is a Palindrome.");
    } else {
        System.out.println(word + " is NOT a Palindrome.");
    }

    sc.close();
}
}