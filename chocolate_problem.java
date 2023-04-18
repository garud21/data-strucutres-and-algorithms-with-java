import java.util.Arrays;
import java.util.Scanner;
/*Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
Output: Minimum Difference is 2
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
Output: Minimum Difference is 6 */

public class chocolate_problem {
    public static void main(String[] args) {
        int temp = 0;
        int x;Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        x=sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m;
        System.out.println("enter total number of students : ");
        m=sc.nextInt();
        Arrays.sort(arr);
        min_diff_for_chocolate(arr,m,x);

    }
    public static void min_diff_for_chocolate(int []arr,int m,int x){
        int diff,min_diff=Integer.MAX_VALUE;
        for (int i=0;i+m-1<x;i++){
            diff=arr[i+m-1]-arr[i];
            if (diff<min_diff){
                min_diff=diff;
            }
        }
        System.out.println(min_diff);


    }
}
