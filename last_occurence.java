import java.util.Scanner;
/* find the element of an array at its last occurence using linear search*/
public class last_occurence {
    public static void main(String[] args) {

    int [] arr = new int[5];
    Scanner sc =new Scanner(System.in);
    for(int i=0;i< arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int ele,pos=-1;
    System.out.println("enter elements to be searched for last occurence");
    ele=sc.nextInt();
    for (int i=arr.length-1;i>=0;i++){
        if (arr[i]==ele){
            pos=i+1;
            System.out.println("element found at : "+pos);
            break;
        }else if(pos==-1){
            System.out.println("element not found");
        }
    }
}

    /* find the element of an array at its last occurence using linear search*/


}
