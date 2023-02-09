import java.util.Scanner;

public class Assignment02 {
    static class Pair{
        int key;
        String value;
        Pair(int key, String value){
            this.key = key;
            this.value = value;
        }
        public String toString(){
            return key+" "+value;
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
            if(i<(size/2)){
                value = "-";
            }
            pairs[i]= new Pair(key, value);
        }
        
        //sorting the pairs array
        for(int i =0;i<size;i++){
            for(int j =0;j<size-i-1;j++){
                if(pairs[j].key < pairs[j+1].key){
                    Pair temp = pairs[j];
                    pairs[j]=pairs[j+1];
                    pairs[j+1]=temp;
                }
            }
        }
        String result ="";
        for(int i =0;i<size;i++){
            result = result + pairs[i].value+" ";
        }
        System.out.println(result);
        sh.close();
    }
}
