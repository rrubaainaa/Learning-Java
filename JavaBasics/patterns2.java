import java.util.*;

public class patterns2{
    
    public static void left_half_pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void full_pyramid(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus_pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }

            for (int j=0;j<n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollow_box(int n){
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                if (i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        //left_half_pyramid(n);
        //full_pyramid(n);
        //rhombus_pattern(n);
        hollow_box(n);
    }
}

