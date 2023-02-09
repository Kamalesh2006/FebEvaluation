import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Assignment01{
    public static void chooseIceCream(int[] prices, int target,List<int[]> result){
        int start=0;
        int end = prices.length-1;
        int sum = 0;
        
        while(start<end){
            int[] resultIndices = new int[2];
            sum = prices[start]+prices[end];
            if(sum>target){
                end--;
            }
            else if(sum<target){
                start++;
            }
            else{
                
                resultIndices[0]=start;
                resultIndices[1]=end;
                result.add(resultIndices);
                start++;

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Prices Array: ");
        Scanner sh = new Scanner(System.in);
        int size = sh.nextInt();
        int[] prices = new int[size];
        for(int i =0;i<size;i++){
            prices[i]=sh.nextInt();
        }
        System.out.println("Enter the amount they have: ");
        int amount = sh.nextInt();

        Arrays.sort(prices);

        List<int[]> result = new ArrayList<>();
        chooseIceCream(prices, amount,result);

        if(result.size()==0)
            System.out.println("There isn't any two flavors that will cost all of the money!!");
        else {
            for(int[] arr: result){
                System.out.println("The two flavours that cost "+prices[arr[0]]+"rs and "+prices[arr[1]]+"rs can be bought using the amount "+amount+"rs");
            }
        }
        sh.close();
    }
}