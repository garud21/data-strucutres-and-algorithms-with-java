import java.util.Scanner;
/* reversing the given array */
public class REVERSE_THE_ARRAY {
    public static void main(String[] args) {

        int [] arr = new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("reversing the array : ");
        reverse(arr);

    }
    public static void reverse(int []arr) {
        int i = 0, k = arr.length - 1, temp = 0;
        while (k > i) {
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
        for (int m = 0; m < arr.length; m++) {
            System.out.println(arr[m]);
        }
    }
}
