import java.util.Scanner;

public class Assignment05 {
    public static void palindromeFinder(String input, int[] indexArr){
        
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the String s");
        String input = sh.next();
        System.out.println("Enter the no of days ");
        int q = sh.nextInt();
        while(q>0){
            int[] indexArr = new int[2];
            System.out.println("Enter the l index ");
            indexArr[0]= sh.nextInt();
            System.out.println("Enter the r index");
            indexArr[1]= sh.nextInt();
            palindromeFinder(input, indexArr);
            q--;
        }
        sh.close();
    }
}
