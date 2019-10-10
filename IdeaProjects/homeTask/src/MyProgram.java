import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class MyProgram {
    static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    static void show_arr(int n, int[] [] arr) {
        for(int i=0;i<n;++i) {
            for(int j=0;j<n;++j) {
                out.print(arr[i] [j] + " ");
            }
            out.println();
        }
    }

    static void arr_init_random(int n, int[] [] arr) {
        Random rnd = new Random();
        for(int i=0;i<n;++i) {
            for(int j=0;j<n;++j) {
                arr[i] [j] = rnd.nextInt(100);
            }
        }
    }

    static void arr_init(int k, int n, int[][] arr) {
        for(int i = 0; i < k; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    static int arr_sum(int k, int n, int[][] arr) {
        int globalSum=0;
        for(int i = 0; i < k; ++i) {
            int sum = 0;
            for(int j = 0; j < n; ++j) {
                sum += arr[i][j];
            }
            out.println("String " + i + " = " + sum);
            globalSum += sum;
        }
        return globalSum;
    }

    public static void main(String[] args) {
        int k = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[k][n];
        arr_init(k, n, arr);
        int globalSum = arr_sum(k, n, arr);
        out.println(globalSum);
        int[][] arr2 = new int[globalSum][globalSum];
        arr_init_random(globalSum, arr2);
        show_arr(globalSum, arr2);
    }
}
