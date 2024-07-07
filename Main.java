/**
 * q1
 */
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean check =false;
        for(int i=0;i<n;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<n;j++){
                if(j==i) continue;
                if(j<=i) leftsum+=arr[j];
                else rightsum+=arr[j];
            }
            if(leftsum==rightsum){
                check=true;
                break;
            }
        }
        System.out.print(check);
    }
    
}