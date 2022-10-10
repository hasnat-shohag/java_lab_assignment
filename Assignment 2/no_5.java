import java.util.Scanner;
class MatProperties{
    public boolean isScalar(int n, int[][] arr){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if((i != j && arr[i][j] != 0) ||  (i == j && i+1<n && arr[i][j] != arr[i+1][j+1])){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSkewSymmetric(int n, int[][] arr){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] != (-1 * arr[j][i])){
                    return false;
                }
            }
        }
        return true;
    }
}
public class no_5 {
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
        boolean flag1 = myObj.isScalar(n, arr);
        if(flag1)
        System.out.println("Given Matrix is Scaler");
        else
        System.out.println("Given Matrix is not Scaler");




        System.out.println("Enter the row size of square matrix");
        int m; m = sc.nextInt();

        int[][] arr2 = new int[m][m];
        for(int i = 0; i<m; i++){
            for(int j = 0; j < m; j++){
                int in;in = sc.nextInt();
                arr2[i][j] = in;
            }
        }

        boolean flag2 = myObj.isSkewSymmetric(m, arr2);
        if(flag2)
        System.out.println("Given Matrix is SkewSymmetric");
        else
        System.out.println("Given Matrix is not Skewsymmetric");
    }    
}
