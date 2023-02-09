import java.util.Scanner;
import java.util.*;
public class Assignment08 {
    public static void insertionSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int element =arr[i];
            int insert =i;;
            for(int j=i-1;j>=0;j--){
                if(element<arr[j]){
                    arr[j+1]=arr[j];
                    insert--;
                }
                else{
                    break;
                }
                
            }
            //System.out.println(Arrays.toString(arr));
            arr[insert]=element;

            
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sh.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sh.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        sh.close();
    }
}
