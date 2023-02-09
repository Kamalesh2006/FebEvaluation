import java.util.Scanner;
import java.util.*;

/*
 * 1 2 3
    [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
 */
public class Assignment07 {
    public static void computeSubSets(List<Integer> input, List<List<Integer>> result){
        for(int i =0;i<input.size();i++){
            int size = result.size();
            for(int j =0;j<size;j++){
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(input.get(i));
                if(result.contains(temp)){
                    continue;
                }
                result.add(temp);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        System.out.println("Enter the size of the array: ");
        int size = sh.nextInt();
        for(int i =0;i<size;i++){
            input.add(sh.nextInt());
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        computeSubSets(input,result);
        System.out.println(result);
        sh.close();
    }
}
