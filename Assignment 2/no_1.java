import java.util.Scanner;

class classifyChar {
    public int count(char ch) {

            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch  == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return 1;
            }
            else if((ch >= 'a' && ch <= 'z') || (ch>='A' && ch <= 'Z')){
                return 2;
            }
            else if(ch >='0' && ch <= '9'){
                return 3;
            }
            else{
                return 4;
            }
        
    }
}

public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        classifyChar myObj = new classifyChar();
        int len = s.length();
        int vn=0,cn=0,nn=0,sn=0;
        for(int i = 0; i < len; i++){
            int p = myObj.count(s.charAt(i));
            if(p == 1){
                vn++;
            }
            else if(p == 2){
                cn++;
            }
            else if(p == 3){
                nn++;
            }
            else if(p == 4){
                sn++;
            }
        }
        System.out.println("Vowel No = "+vn+"\nConsonent No = "+cn+"\nNatural No = "+nn+"\nSpecial No = "+sn);
    }
}
