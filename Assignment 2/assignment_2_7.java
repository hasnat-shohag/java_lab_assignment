import java.util.Scanner;
class operator{
    public void checkOperator(char ch){
        if(ch == '1'){
            System.out.println("Citycell");
        }
        else if(ch == '5'){
            System.out.println("Teletalk");
        }
        else if(ch == '7' || ch == '3'){
            System.out.println("Grameenphone");
        }
        else if(ch == '6' || ch =='8'){
            System.out.println("Robi");
        }
        else{
            System.out.println("Banglalink");
        }
    }
}
public class assignment_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operator myObj = new operator();
        String number = sc.nextLine();
        String s = "13456789";
        String helper = "+8801";

        int len = number.length();
        if (len == 14 || len == 11) {
            if (len == 14) {
                int cnt = 0;
                for (int i = 0; i < 5; i++) {
                    if (number.charAt(i) == helper.charAt(i)) {
                        cnt++;
                    }
                }
                if (cnt == 5) {
                    int f = 0;
                    for (int i = 0; i < 8; i++) {
                        if (number.charAt(5) == s.charAt(i)) {
                            f = 1;
                            myObj.checkOperator(number.charAt(5));
                            System.out.println("A bangladeshi number");
                            break;                    }
                    }
                    if (f == 0){
                        System.out.println("It is not a bangladeshi number");
                    }
                } 
                else {
                    System.out.println("It is not a bangladeshi number");
                }
            } 
            else {
                int cnt = 0;
                for (int i = 0; i < 2; i++) {
                    if (number.charAt(i) == helper.charAt(i+3)) {
                        cnt++;
                    }
                }
                if (cnt == 2) {
                    int f = 0;
                    for (int i = 0; i < 8; i++) {
                        if (number.charAt(2) == s.charAt(i)) {
                            f = 1;
                            myObj.checkOperator(number.charAt(2));
                            System.out.println("A bangladeshi number");
                            break;
                        }
                    }
                    if (f == 0){
                        System.out.println("It is not a bangladeshi number");
                    }
                } 
                else {
                    System.out.println("It is not a bangladeshi number");
                }
            }
        } 
        else {
            System.out.println("It is not a bangladeshi number");
        }
    }
}
