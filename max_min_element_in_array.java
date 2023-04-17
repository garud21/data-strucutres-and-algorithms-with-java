import java.util.*;

public class max_min_element_in_array {
    public static void main(String[] args) {

        int [] arr = new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int i;
        for (i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int minimum=Integer.MAX_VALUE;
        for (i=0;i< arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println("largest value of array is ; "+largest);
        System.out.println("Smallest value of array is ; "+minimum);
    }
}
