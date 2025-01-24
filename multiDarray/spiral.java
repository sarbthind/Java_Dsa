package multiDarray;
import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the vcalue of row and column ");
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rows = 0;
        int rowe = n - 1;
        int cols = 0;
        int cole = m - 1;
        while (rows <= rowe && cols <= cole) {
            for (int i = cols; i <= cole; i++) {
                System.out.print(arr[rows][i]);
            }
            rows++;
            for (int i = rows; i <= rowe; i++) {
                System.out.print(arr[i][cole]);
            }
            cole--;
            for (int i = cole; i >= cols; i--) {
                System.out.print(arr[rowe][i]);
            }
            rowe--;
            for (int i = rowe; i >= rows; i--) {
                System.out.print(arr[i][cols]);
            }
            cols++;

        }
        sc.close();
    }
}
