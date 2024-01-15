package MyJavaProject.Codeforces;

import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,count=0;
        for (i=0;i<n;i++)
        {
           a[i]=sc.nextInt();

        }
        for (i=0;i<n;i++)
        {

            count=count+a[i];
        }
        if (count==0)
        {
            System.out.println("EASY");
        }
        else if (count!=0)
        {
            System.out.println("HARD");
        }
    }
}
