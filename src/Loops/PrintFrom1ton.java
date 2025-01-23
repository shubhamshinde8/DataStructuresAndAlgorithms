package Loops;

import java.util.Scanner;

public class PrintFrom1ton {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=scanner.nextInt();
        int i=1;
        while (i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
