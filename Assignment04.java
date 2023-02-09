import java.util.*;
public class Assignment04 {
    public static String permutePassword(String[] users, String loginAttempt,int index,String createLogin){
        if(loginAttempt.isEmpty()){
            return "null";
        }
        if(index==loginAttempt.length()){
            return createLogin;
        }
        for(int i =0;i<users.length;i++){
            String tempPass = users[i];
            if(index+tempPass.length()>loginAttempt.length())
                continue;
            String partOfLoginAttempt = loginAttempt.substring(index,index+tempPass.length());
            if(tempPass.equals(partOfLoginAttempt)){
                String attempt = createLogin+" "+partOfLoginAttempt;
                String result = permutePassword(users, loginAttempt, index+tempPass.length(),attempt);
                if(!result.equals("null")){
                    return result;
                }
            }
        }
        return "null";
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the total number of test cases: ");
        int testCase = sh.nextInt();
        while(testCase>0){
            System.out.println("Enter the number of users with passwords: ");
            int userWithpassword = sh.nextInt();
            System.out.println("Enter "+userWithpassword+" space seperated passwords");
            String[] users = new String[userWithpassword];
            for(int i =0;i<userWithpassword;i++){
                users[i]=sh.next();
            }
            System.out.println("Enter the login Attempt string");
            String loginAttempt = sh.next();
            String result = permutePassword(users, loginAttempt,0,"");
            if(result.equals("null")){
                System.out.println("WRONG PASSWORD");
            }
            else{
                System.out.println(result);
            }
            testCase--;
        }
        sh.close();
    }
}
