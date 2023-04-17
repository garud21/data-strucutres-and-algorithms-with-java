import java.util.*;
public class first_occurence_in_array {
    /* find the element of an array at its first occurence using linear search*/
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ele,pos;
        System.out.println("enter elements to be searched for first occurence");
        ele=sc.nextInt();
        for(int i=0;i< arr.length;i++){
            if (arr[i]==ele){
                pos=i;
                System.out.println("element found at "+pos);
                break;
            }
            else if(i== arr.length){
                System.out.println("element not found !!");
            }

        }


    }
}
