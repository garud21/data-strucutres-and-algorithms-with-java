import java.util.Scanner;
/* arranging arrays in ascending as well as descending order */
public class bubble_sort {
    public static void main(String[] args) {
int temp=0;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("arranging array in ascending order : ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("arranging array in descending order : ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
