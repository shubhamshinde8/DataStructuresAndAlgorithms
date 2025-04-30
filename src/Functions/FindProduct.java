package Functions;

import java.util.Scanner;

public class FindProduct {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b=sc.nextInt();

        System.out.println(product_finder(a,b));
    }

    static int product_finder(int a,int b){
        return a*b;
    }
}
