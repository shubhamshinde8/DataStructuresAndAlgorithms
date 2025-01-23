package Loops;

import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N  : ");
        int n=scanner.nextInt();
        int sum=0;
        int i=0;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
