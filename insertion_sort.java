import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // INSERTION SORT
        for (int i=1;i< arr.length;i++){
            int temp =arr[i];
            int j=i-1;
            while (j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
