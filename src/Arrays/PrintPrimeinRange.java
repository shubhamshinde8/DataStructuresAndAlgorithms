package Arrays;

import java.util.Scanner;

public class PrintPrimeinRange {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            print(i);
        }

    }
    static void print(int n){
        int a=0;
        for(int i=2;i<n;i++){
            if (n%i==0){
                a=1;
                break;
            }
        }
        if(a==0){
            System.out.print(n+" ");
        }
    }


}
