import java.util.Scanner;

public class _1_minutes_to_day_years {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int minutes;
        minutes = sc.nextInt();
        int years = minutes/(365*24*60);
        int temp = minutes % (365*24*60);
        int days = temp / (60*24);
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
}
