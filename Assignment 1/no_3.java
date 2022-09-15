// Write a program that displays the following table. Cast floating point numbers into integers.
// a    b   pow(a,b)
// 1    2   1
// 2    3   8
// .    .   .
// .    .   .
import java.lang.Math;
import java.util.Scanner;

public class no_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("a   b   pow(a,b)");
        while(sc.hasNextLine()){
            Double a,b,c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = Math.pow(a,b);
            int res = c.intValue();
            System.out.println("pow("+a.intValue()+","+b.intValue()+") = "+res);
        }
    }
}
