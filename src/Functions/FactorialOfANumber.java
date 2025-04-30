package Functions;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n  : ");
        int n=sc.nextInt();
        System.out.println("Enter r  : ");
        int r=sc.nextInt();


        System.out.println(findNcr(n,r));
    }
    static int factorial(int n){

        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }

        return fact;
    }

    static int findNcr(int n,int r){

        int nfact=factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);
        return nfact/(rfact*nrfact);
    }
}
