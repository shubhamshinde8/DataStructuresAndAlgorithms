package Loops;

import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n= scanner.nextInt();

        System.out.println("Enter "+n+" Element : ");

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }

        evenOdd(a);

    }

    static void evenOdd(int a[]){

        int even_sum=0;
        int odd_sum=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even_sum=even_sum+a[i];
            }else{
                odd_sum=odd_sum+a[i];
            }
        }
        System.out.println(even_sum+" "+odd_sum);
    }
}
