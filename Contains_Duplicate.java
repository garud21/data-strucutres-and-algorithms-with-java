import java.util.Scanner;
/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


problem originally taken from dsa sheet from apna college
leet code problem number :- 217
*/
public class Contains_Duplicate {
    public static void main(String[] args) {
        int temp = 0;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean b=isduplicate(arr);
        System.out.println(b);

    }
    public static boolean isduplicate(int[] arr){
        int ctr=0;
        for (int i=0;i< arr.length-1;i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    ctr=1;
                }else {
                    ctr=0;
                }
            }
        }
        if (ctr==1){
            return true;
        }else {
            return false;
        }
    }
}
