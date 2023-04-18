import java.util.Arrays;
import java.util.Scanner;

public class missing_number {
    /*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.*/
    public static void main(String[] args) {
        int temp = 0;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int n=arr[i];
            if (arr[i+1]!=(n+1)){
                System.out.println("the missing number is : "+(n+1));
                break;
            }
        }
    }
}
