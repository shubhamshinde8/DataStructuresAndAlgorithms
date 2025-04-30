package Arrays;

import java.util.Scanner;

public class PrintPaires {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element in Ascending order : ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        print_pairs(arr);
    }

    static void print_pairs(int a[]){

        for (int i=0;i<a.length;i++){
            int current=a[i];
            for (int j=i+1;j<a.length;j++){
                System.out.print("( "+current+" , "+a[j]+" ) ");
            }
            System.out.println();
        }
    }
}
