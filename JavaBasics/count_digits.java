import java.util.*;
public class count_digits {
    public static void countdig(int n){
        int count=0;
        while(n!= 0){
            n/=10;
            count++;
        }

        System.out.println("Number of digits: "+count);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countdig(n);
    }
}

