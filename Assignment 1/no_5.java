// Write a program to read a name as a string given in the single line and separate the name into three parts:
// First Name, Middle Name, Last Name. Then print the three parts of the name in three different lines.
import java.util.Scanner;

public class no_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Full Name: ");
        String s = sc.nextLine();

        String[] res = new String[5];
        for(int i = 0; i<5; i++){
            res[i] = "";
        }
        int idx = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                idx++;
                continue;
            } 
            
            res[idx] += s.charAt(i);
        }
        System.out.println("First Name: "+res[0]+"\nMiddle Name: "+res[1]+"\nLast Name: "+ res[2]);



        // int len = s.length();
        // String fn="",mn="",ln="";
        // int space=0;
        // int nos = 0;
        // count the parts of the name
        // for(int i = 0; i<len; i++){
        //     if(s.charAt(i) == ' ')nos++;
        // }
        
    //     if(nos == 2){
    //         for(int i = 0; i<len; i++){
    //             if(s.charAt(i)==' '){
    //                 space = i;
    //                 break;
    //             }
    //             fn += s.charAt(i);
    //         }
    //         for(int i = space+1; i<len; i++){
    //             if(s.charAt(i)==' '){
    //                 space = i;
    //                 break;
    //             }
    //             mn += s.charAt(i);
    //         }
    //         for(int i = space+1; i<len; i++){
    //             ln += s.charAt(i);
    //         }
    //         System.out.println("First Name: "+fn);
    //         System.out.println("Middle Name: "+mn);
    //         System.out.println("Last Name: "+ln);
    //     }
    //     else{
    //         for(int i = 0; i<len; i++){
    //             if(s.charAt(i)==' '){
    //                 space = i;
    //                 break;
    //             }
    //             fn += s.charAt(i);
    //         }
            
    //         for(int i = space+1; i<len; i++){
    //             ln += s.charAt(i);
    //         }
    //         System.out.println("First Name: "+fn);
    //         System.out.println("Middle Name: "+mn);
    //         System.out.println("Last Name: "+ln);
    //     }
    }
}
