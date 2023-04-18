import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {

        int [] arr = new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ele,index=0,counter=0;
        System.out.println("enter element to be searched for : ");
        ele= sc.nextInt();
        for (int i=0;i< arr.length;i++){
            if (arr[i]==ele) {
                System.out.println("element found at : " + (i+1));
                return;
            }

        }
        System.out.println("element not found ");
    }

}
