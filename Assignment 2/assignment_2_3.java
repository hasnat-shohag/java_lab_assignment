import java.util.Scanner;
class MatProperties{
    public boolean isDiagonal(int n, int[][] arr){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i != j && arr[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSymmetric(int n, int[][] arr){

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
public class assignment_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of square matrix");
        int n; n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                int in;in = sc.nextInt();
                arr[i][j] = in;
            }
        }

        MatProperties myObj = new MatProperties();
        boolean flag1 = myObj.isDiagonal(n, arr);
        if(flag1)
        System.out.println("Given Matrix is Diagonal");
        else
        System.out.println("Given Matrix is not Diagonal");
        boolean flag2 = myObj.isSymmetric(n, arr);
        if(flag2)
        System.out.println("Given Matrix is Symmetric");
        else
        System.out.println("Given Matrix is not Symmetric");
    }
}
