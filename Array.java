import java.io.*;
import java.util.*;
class Array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] a_name=new int[n];
        System.out.println("Enter array ");
        for(int i=0;i<n;i++)
        {
            a_name[i]=sc.nextInt();
        }
        System.out.println("Enter X");
        int x=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(a_name[i]==x)
            System.out.println(i);
            
         
        }

    }
}