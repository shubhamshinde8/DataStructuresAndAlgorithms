package Arrays;

import java.util.Scanner;

public class PrintSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element in Ascending order : ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printsumArray(arr);
    }
    static void printsumArray(int a[]){

        for (int i=0;i<a.length;i++){

            int start=i;
            for (int j=i;j<a.length;j++){

                int end=j;

                for (int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
