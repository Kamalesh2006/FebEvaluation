import java.util.Scanner;
public class Assignment09 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the pattern to form: ");
        int n = sh.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i<=n/2){
                    if(i%2==0 && j>=i && j< n-i ){
                        System.out.print(1+" ");
                    }
                    else if(j==0|| j==n-1)
                        System.out.print(1+" ");
                    else if( j%2==0 && i>=j)
                        System.out.print(1+" ");
                    else if(j%2==0 && i>=n-j)
                        System.out.print(1+" ");
                    else {
                        System.out.print(0+" ");
                    }
                }
                else{
                    if(i%2==0 && j<=i && j>=(n-1-i)){
                        System.out.print(1+" ");
                    }
                    else if(j==0|| j==n-1 || i==n-1)
                        System.out.print(1+" ");
                    else if(j%2==0 && i>=j && i<n-j)
                        System.out.print(1+" ");
                    else if(j%2==0 && i<j)
                        System.out.print(1+" ");
                    else {
                        System.out.print(0+" ");
                    }
                }
                
            }
            System.out.println();
        }
        sh.close();
    }
}
