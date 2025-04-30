package Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();


        int pow=0;
        int ans = 0;

        while (n>0){

            int last_digit=n%10;
            ans=ans+(last_digit* powerOftwo(2,pow));
            pow++;
            n/=10;
        }

        System.out.println(ans);


    }
    static int powerOftwo(int x,int y){


        int result=1;
        for (int i=1;i<=y;i++){

            result=result*x;
        }

        return result;

    }
}
