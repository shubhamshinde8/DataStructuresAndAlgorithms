package Arrays;

import java.util.Scanner;

public class LiniearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Key : ");
        int key=sc.nextInt();

        System.out.println(linear_search(a,key));

    }
    static int linear_search(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
