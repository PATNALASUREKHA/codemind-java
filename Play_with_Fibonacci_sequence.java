import java.util.*;
public class Fib{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.print(Fibnoacci(i)+" ");
        }
        
    }
 public static  int Fibnoacci(int n){
       if(n==0){
           return 0;
       }
       else if(n==1){
           return 1;
       }
       else{
           return Fibnoacci(n-1)+Fibnoacci(n-2);
       }
   } 
}