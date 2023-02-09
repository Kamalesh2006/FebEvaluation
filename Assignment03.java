import java.util.Scanner;
import java.util.*;
public class Assignment03 {
    /**
     * 
     * @param expenditure
     * @param d denotes the number of trailing days after which bank will send notification according to expense. 
     * @return
     */
    public static int notifyCustomer(int[] expenditure, int day){
        int notification = 0;
        int sum = 0;
        int[] tempArr = new int[day];
        for(int i =day;i<expenditure.length;i++){
            System.arraycopy(expenditure, i-day, tempArr, 0, day);
            Arrays.sort(tempArr);
            sum = sum + expenditure[i];
            double median =0;
            if(day%2==0){
                double temp = (tempArr[day/2]+tempArr[(day/2)-1]);
                median = temp/2;
            }
            else{
                median = tempArr[day/2];
            }
            System.out.println(expenditure[i]+" "+median);
            if(expenditure[i]>=(2*median))
                notification++;   
            
        }
        return notification;
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the expenditure array ");
        int size = sh.nextInt();
        int[] expenditure = new int[size];
        for(int i =0;i<size;i++){
            expenditure[i]=sh.nextInt();
        }
        System.out.println("Enter the trailing days: ");
        int day = sh.nextInt();
        int notification = notifyCustomer(expenditure, day);
        System.out.println("The customer will receive notification for "+ notification+" times.");
        sh.close();
    }
}
