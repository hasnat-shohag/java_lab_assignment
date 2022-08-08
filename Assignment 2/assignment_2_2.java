

import java.util.Scanner;


class CountCharFrequency{
    public void countDisplayCharFrequency(String s){
        int freq[] = new int[256];
        for(int i=0;i<256;i++){
            freq[i] = 0;
        }
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i<123; i++){
            if(freq[i] != 0){
                System.out.println("Number of Occurance of "+(char)i+" is = "+freq[i]);
            }
        }
    }
}
public class assignment_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CountCharFrequency myObj = new CountCharFrequency();
        myObj.countDisplayCharFrequency(s);
    }
}
