import java.util.Scanner;
/*Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
also print the sum of each sub-array

LEET CODE PROBLEM NUMBER 53 (QUESTION TAKEN FROM DSA SHEET FROM APNA COLLEGE

*/
public class sub_arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int temp=0,sum=0;
        int largest=Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("printing the sub-arrays of the array : ");
        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++) {
            for (int k=i;k<j;k++){
                System.out.print(arr[k]);
                sum=sum+arr[k];

            }
                System.out.println();
                System.out.println("the sum of this sub-array is : "+sum);
                System.out.println();
                System.out.println();
                temp++;
                if (sum>largest){
                    largest=sum;
                }
                sum=0;

            }
        }
        System.out.println("total number of sub-arrays is : "+temp);
        System.out.println("largest sum is : "+largest);
    }
}
