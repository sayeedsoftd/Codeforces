package MyJavaProject.Codeforces;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt(); // number of magnets
        int[] m=new int[n]; // value of magnets
        int i,count=1;
        for (i=0;i<n;i++)
        {
            m[i]=sc.nextInt();

        }
        for (i=0;i<n-1;i++)
        {
           if (m[i]!=m[i+1])
           {
               count++;
           }
        }
        System.out.println(count);


    }
}
