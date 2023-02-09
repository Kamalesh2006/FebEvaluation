import java.util.Scanner;
import java.util.*;
public class Assignment10 {
    public static void findPairs(int[] arr,int k, List<int[]> result){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum%k==0){
                    int[] indexArr= new int[]{arr[i],arr[j]};
                    result.add(indexArr);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the input array :");
        int size = sh.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sh.nextInt();
        }
        System.out.println("Enter the k value");
        int k = sh.nextInt();
        List<int[]> result = new ArrayList<>();
        findPairs(arr,k,result);
        for(int[] items: result){
            System.out.println(Arrays.toString(items));
        }
        sh.close();
    }
}
