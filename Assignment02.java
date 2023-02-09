import java.util.Scanner;
import java.util.*;

public class Assignment02 {
    static class Pair{
        int key;
        String value;
        Pair(int key, String value){
            this.key = key;
            this.value = value;
        }

    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the input array: ");
        int size = sh.nextInt();
        Pair[] pairs = new Pair[size];
        for(int i =0;i<size;i++){
            int key = sh.nextInt();
            String value = sh.next();
            pairs[0]= new Pair(key, value);
        }
        String result ="";
        //sorting the pairs array
        for(int i =0;i<size;i++){
            for(int j =0;j<size-i+1;j++){
                if(pairs[j].key > pairs[j+1].key){
                    Pair temp = pairs[j];
                    pairs[j]=pairs[j-1];
                    pairs[j-1]=temp;
                }
                result = pairs[size-i].value+" "+result;
            }
        }
        System.out.println(result);
        sh.close();
    }
}
