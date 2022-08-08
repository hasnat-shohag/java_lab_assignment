import java.util.Scanner;
class palindromes{
    public boolean checkPalindromes(int n){
        String s = "";

        while(n > 0){
            int p = n % 10;
            s += (char)p;
            n /= 10;
        }
        int len = s.length();
        for(int i = 0,j=len-1; i<len/2; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
public class assignment_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        palindromes myObj = new palindromes();
        boolean flag = myObj.checkPalindromes(n);
        if (flag){
            System.out.println(n + " is Palindrome");
        }else{
            System.out.println(n + " is not Palindrome");
        }
    }
}
