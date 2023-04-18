import java.util.*;
/*without recursion */
public class binary_search {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ele, index = 0, counter = 0;
        System.out.println("enter element to be searched for : ");
        ele = sc.nextInt();
        binary(arr,ele);
    }
    public static void binary(int[]arr,int ele){
        int start=0,last= arr.length-1;
        int mid;
        while (last>=start){
            mid=(start+last)/2;
            if (arr[mid]==ele){
                System.out.println("element found at index : "+mid);
                break;
            }
            else if (ele>arr[mid]){
                start=mid+1;
            }
            else if (ele<arr[mid]){
                last=mid-1;
            }else {
                System.out.println("element not found please input correct element !!!!");
            }
        }
    }
}
