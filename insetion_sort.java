import java.util.*;
public class insetion_sort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("sorting arrays using insertion sort : ");

        for (int i=1;i< arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for (j=i-1;j>=0;j--){
                if (arr[j]>temp){
                    arr[j+1]=arr[j];
                }
                else {
                    break;
                }

            }
            arr[j+1]=temp;
        }
        System.out.println("array after sorting is :: ");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
