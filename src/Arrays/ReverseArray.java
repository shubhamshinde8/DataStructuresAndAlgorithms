package Arrays;

import java.util.Scanner;

public class ReverseArray {

    static int[] reverseArrayitSelf(int a[]){

        int i=0;
        int j=a.length-1;
        while (i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }

    static int[] reverseArraywithCreatingnewArray(int a[]){

        int arr[]=new int[a.length];
        int x=0;
        for (int i=a.length-1;i>=0;i--){
            arr[x]=a[i];
            x++;
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int ans[]=reverseArrayitSelf(a);
        for (int val:ans){
            System.out.print(val+" ");
        }
    }
}
