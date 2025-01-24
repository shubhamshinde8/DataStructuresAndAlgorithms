package Loops;

import java.util.Scanner;

public class ExtractUniqueDigitAndCheckPrim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        int unique_digit=0;

        while (n>0){
            unique_digit=n%10;

            int a=0;
            for(int i=2;i<unique_digit;i++){
                if(unique_digit%i==0){
                    a=1;
                    break;
                }
            }

            if (a==0){
                System.out.println(unique_digit);
            }

            n/=10;
        }
    }
}
