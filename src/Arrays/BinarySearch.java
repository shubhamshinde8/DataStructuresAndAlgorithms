package Arrays;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element in Ascending order : ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter Element To Search : ");
        int x=sc.nextInt();

        System.out.println(search_in_binary(arr,x));
    }
    static int search_in_binary(int a[],int x){

        int start=0;
        int end=a.length-1;
        while (start<=end){
            int mid=(start+end)/2;

            if (a[mid]==x){
                return mid;
            }
            if (a[mid]<x){
                start=mid+1;
            }else{
                start=mid-1;
            }
        }
        return -1;
    }
}
