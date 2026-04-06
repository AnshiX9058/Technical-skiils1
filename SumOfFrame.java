package p1;
import java.util.Scanner;
public class SumOfFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println("Sum of frame elements = " + sum);
    }
}
