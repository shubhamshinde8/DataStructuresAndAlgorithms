package Functions;

import java.util.Scanner;

public class CheckPrimeorNot {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        for (int i=2;i<=n;i++){
            isPrime(i);
        }
    }

    public static void isPrime(int n){

        boolean flag=true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if (flag==true){
            System.out.print(n+" ");
        }

    }
}
