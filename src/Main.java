import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        for (int i = 0; i < A.length()/2; i++) {
            if(A.charAt(i)!=A.charAt(A.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome==true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}