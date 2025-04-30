package Loops;

import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        int cnt=0;
        while (n>0){
            cnt++;
            n/=10;
        }

        System.out.println(cnt);
    }
}
