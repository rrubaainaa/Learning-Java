import java.util.*;
public class reverse_a_number{
    public static void reverse(int n){
        int temp=0;
        while(n>0){
            int r=n%10;
            temp=temp*10+r;
            n=n/10;
        }
        System.out.println(temp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }
}
