import java.util.Scanner;

class palindromes {
    public boolean checkPalindromes(int n) {
        String s = "";

        while (n > 0) {
            int p = n % 10;
            s += (char) p;
            n /= 10;
        }
        int len = s.length();
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

public class no_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        palindromes myObj = new palindromes();
        boolean flag = myObj.checkPalindromes(n);
        if (flag) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is not Palindrome");
        }

        System.out.println("\nEnter the range :");
        int low,high;
        low = sc.nextInt();
        high = sc.nextInt();

        System.out.println("Palindrome numbers in this range : ");
        for (int i = low; i < high; i++) {
            if (myObj.checkPalindromes(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
