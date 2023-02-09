import java.util.Scanner;

public class Assignment05 {
    public static void palindromeFinder(String input, int left, int right){
        char[] hash = new char[26];
        for(int i = left; i<right;i++){
            int index = input.charAt(i)-97;
            //since the given input consist only of lower case alphabets
            hash[index]++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the String s");
        String input = sh.next();
        System.out.println("Enter the no of days ");
        int q = sh.nextInt();
        while(q>0){
            System.out.println("Enter the l index ");
            int left = sh.nextInt();
            System.out.println("Enter the r index");
            int right = sh.nextInt();
            palindromeFinder(input, left, right);
            q--;
        }
        sh.close();
    }
}
